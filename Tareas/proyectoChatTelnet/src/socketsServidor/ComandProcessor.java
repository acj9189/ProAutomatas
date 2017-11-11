/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketsServidor;

import static socketsServidor.SocketListener.clients;

/**
 *
 * @author santiguzman
 */
public class ComandProcessor {

    private SocketController socket;

    public ComandProcessor() {
    }

    public ComandProcessor(SocketController socket) {
        this.socket = socket;
    }

    public boolean writeText(String name, String text) {
        for (SocketController client : clients) {
            if (client.getName().equalsIgnoreCase(name)) {
                client.listMsg.put(socket.getIdMessage(), text);
                client.writeText("MSG " + text);
                return true;
            }
        }
        return false;
    }

    public void removeMessage(String idMessage) {
        for (SocketController client : clients) {
            if (client.listMsg.containsKey(idMessage)) {
                client.listMsg.remove(idMessage);
            }
        }
    }

    public boolean checkName(String name) {
        try {
            for (SocketController socket : clients) {
                if (socket.getName().equalsIgnoreCase(name)) {
                    return false;
                }
            }
        } catch (Exception e) {
            System.err.println("Error " + e);
        }
        return true;
    }

    public boolean writeTextAll(SocketController sender, String text) {
        System.out.println(clients.size());
        if (clients.size() > 1) {
            String idMessage = socket.getIdMessage();
            for (SocketController client : clients) {
                if (sender != client) {
                    client.listMsg.put(idMessage, text);
                    client.writeText("MSG " + socket.getName() + "-> " + text);
                }
            }
            return true;
        }
        return false;
    }
    
    public int getNumofUsers() {
        return clients.size();
    }

    public boolean remove(SocketController remove) {
        return clients.remove(remove);
    }

    public String responseCommand(SocketController sender, String aCommand) {
        aCommand = aCommand.trim().toUpperCase();
        String response = "200 COMANDO INVALIDO";
        System.out.println(aCommand);
        if (aCommand.startsWith("SENDALL ")) {
            
            if (writeTextAll(sender, aCommand.substring(8))) {
                response = "103 MENSAJE ENVIADO A TODOS CON EXITO";
            } else {
                response = "203 MENSAJE NO ENVIADO A TODOS";
            }
        } else if (aCommand.equals("NUMOFUSERS")) {
            response = "105 NUMERO DE USUARIOS:" + this.getNumofUsers();
        } else if (aCommand.equals("GETUSERS")) {
            response = "106 LISTA DE USUARIOS:";
            for (SocketController socket : clients) {
                response += socket.getId() + " " + socket.getName() + ";";
            }
            response = response.substring(0, response.length() - 1);
        } else if (aCommand.startsWith("SEND ")) {
            String userName = aCommand.substring(5).substring(0, aCommand.substring(5).indexOf(" "));
            String msg = aCommand.substring(5 + userName.length());
            if (writeText(userName, socket.getName() + "->" + msg)) {
                response = "102 MENSAJE ENVIADO CON EXITO";
            } else {
                response = "202 MENSAJE SIN ENVIAR";
            }
        } else if (aCommand.startsWith("REMOVEMSG ")) {
            String idMessage = aCommand.substring(10);
            if (Integer.parseInt(idMessage.substring(0, 3)) == socket.getId()) {
                removeMessage(idMessage);
                response = "104 MENSAJE BORRADO CON EXITO";
            }else{
                response = "204 MENSAJE NO FUE BORRADO YA QUE NO TIENE PERMISO PARA ESTA OPERACION";
            }

        }

        return response;
    }

}