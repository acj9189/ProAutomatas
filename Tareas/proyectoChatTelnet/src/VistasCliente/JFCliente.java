/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasCliente;

import Controladores.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.util.concurrent.locks.*;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Andrés
 */
public class JFCliente extends javax.swing.JFrame {

    /**
     * Creates new form JFCliente
     */
    private hiloEscucharYEnviarMensajes HiloMensajes;
    private Socket socketConeccion;
    private JFCliente inCliente;
    private String nombreUsuario;

    static PrintWriter theOut;
    static BufferedReader theIn;
    private int cont = 0;

    private boolean seleUsuEnviar = false;
    private String usuAEnviar = "";

    private DefaultListModel modelo = new DefaultListModel();
    private DefaultListModel modelo2 = new DefaultListModel();
    
    private static Semaphore semaforo = new Semaphore(1);
    
    DefaultListModel modeloMensajes = new DefaultListModel();
    
    private LinkedList<String> ListaIDMensaje;

    public JFCliente() {
        initComponents();
        this.inCliente = this;
        this.ListaIDMensaje = new LinkedList<>();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtName = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        txtPort = new javax.swing.JTextField();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLstMensajesEnviados = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLstUsuariosConectados = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        label5 = new java.awt.Label();
        txtHost = new javax.swing.JTextField();
        btnEnviarMensaje = new javax.swing.JButton();
        btnConectarce = new javax.swing.JButton();
        txtEnviarMensaje = new javax.swing.JTextField();
        label6 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setText("Cliente");

        txtPort.setText("1107");
        txtPort.setName("txtPort"); // NOI18N

        label2.setText("Ingrese el Puerto");

        label3.setText("Ingrese el Host");

        label4.setText("Mensajes Enviados y Recibidos");

        jLstMensajesEnviados.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jLstMensajesEnviadosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jLstMensajesEnviados);

        jLstUsuariosConectados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLstUsuariosConectadosKeyPressed(evt);
            }
        });
        jLstUsuariosConectados.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jLstUsuariosConectadosValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jLstUsuariosConectados);

        jLabel1.setText("Lista de Conectados");

        label5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label5.setText("Enviar");

        txtHost.setText("localhost");
        txtHost.setName("txtHost"); // NOI18N

        btnEnviarMensaje.setText("Enviar Mensaje");
        btnEnviarMensaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnviarMensajeMouseClicked(evt);
            }
        });

        btnConectarce.setText("Conectarce");
        btnConectarce.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConectarceMouseClicked(evt);
            }
        });

        label6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label6.setText("UserName");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEnviarMensaje)
                        .addContainerGap(597, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHost, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnConectarce)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtEnviarMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnConectarce)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEnviarMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEnviarMensaje)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConectarceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConectarceMouseClicked

        try {

            String ip = this.getTxtHost().getText();
            int puerto = Integer.valueOf(this.getTxtPort().getText());
            this.setNombreUsuario(this.getTxtName().getText());

            if (this.getCont() == 0) {
                this.setSocketConeccion(new Socket(ip, puerto));
                this.setTheOut(new PrintWriter(this.getSocketConeccion().getOutputStream(), true));
                this.setTheIn(new BufferedReader(new InputStreamReader(this.getSocketConeccion().getInputStream(), "UTF-8")));

            }
            if (this.getCont() < 3) {
                String ResEs = this.getTheIn().readLine();
                String command = "REGISTER " + this.getNombreUsuario();
                escribirsocket(command);
                this.setCont(this.getCont() + 1);
                String Res = leersocket();

                if (Res.startsWith("100")) {
                    JOptionPane.showMessageDialog(this, "Usted se ha conectado con exito al servidor");
                    

                    // this.getTheOut().println("NUMOFUSERS");
//                    String res = this.getTheIn().readLine();
//                    System.out.println(Res );
                    //  this.semaphoreLectura.acquire();
//                        this.setHiLoClientes(new hiloEscucharClientes(this.theOut, this.theIn, this.jLstUsuariosConectados, this));
//                        this.setHiLoClientes(new hiloEscucharClientes(this.theOut, this.theIn, this.jLstUsuariosConectados));
                    /*this.HiLoClientes = new hiloEscucharClientes(this.jLstUsuariosConectados);
                    this.Hilo = new Thread(this.getHiLoClientes());
                    this.Hilo.start();*/
                    this.HiloMensajes = new hiloEscucharYEnviarMensajes(this.jLstMensajesEnviados,this.jLstUsuariosConectados, this.modeloMensajes, this.ListaIDMensaje);
                    this.HiloMensajes.iniciar();
                    escribirsocket("GETUSERS");
                    this.getTxtName().setEditable(false);
                    this.getBtnConectarce().setEnabled(false);
                } else {
                    if (this.getCont() == 3) {
                        JOptionPane.showMessageDialog(this, "El numero maximo de intentos para el nombre de usuario es 3");
                        this.getTxtName().setText("");
                        this.setSocketConeccion(null);
                        this.setCont(0);
                        this.setNombreUsuario("");
                        this.setTheIn(null);
                        this.setTheOut(null);
                    } else {
                        JOptionPane.showMessageDialog(this, "Porfavor Ingrece un nuevo nombre de usuario que el que escribio ya existe");
                        this.getTxtName().setText("");
                    }
                }
            }

        } catch (IOException ex) {
            Logger.getLogger(JFCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnConectarceMouseClicked

    private void btnEnviarMensajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMensajeMouseClicked
        String Mensaje = this.getTxtEnviarMensaje().getText();
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(null, "Desea a enviar a todos los usuarios conectados ?", "Warning", dialogButton);
        if (dialogResult == JOptionPane.YES_OPTION) {
            sendAll(Mensaje);
           // ElementoEnviado(Mensaje);
            
        } else {
            //J
            if(this.getUsuAEnviar().equals("")){
                JOptionPane.showMessageDialog(this, "Debe seleccionar al usuario que quiere enviarle el mensaje");
            }
            else{
                sendPersonal(Mensaje, this.getUsuAEnviar());
               // ElementoEnviado(Mensaje);
            }
            
        }
    }//GEN-LAST:event_btnEnviarMensajeMouseClicked

    private void jLstUsuariosConectadosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLstUsuariosConectadosKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLstUsuariosConectadosKeyPressed

    private void jLstUsuariosConectadosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jLstUsuariosConectadosValueChanged

        this.setUsuAEnviar(this.getjLstUsuariosConectados().getSelectedValue());
        if (!this.usuAEnviar.equals(this.nombreUsuario)) {
            this.setSeleUsuEnviar(true);
        } else {
            this.setUsuAEnviar("");

        }
    }//GEN-LAST:event_jLstUsuariosConectadosValueChanged

    private void jLstMensajesEnviadosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jLstMensajesEnviadosValueChanged

        String mensajeCompletoAEliminar = this.getjLstMensajesEnviados().getSelectedValue();
        int Posicion = this.jLstMensajesEnviados.getSelectedIndex();
        String NOmbreUsuCom = mensajeCompletoAEliminar.substring(4, 4 + this.nombreUsuario.length());
        if(NOmbreUsuCom.equals(this.nombreUsuario)){
            eliminarMensaje(mensajeCompletoAEliminar, Posicion);
        }
        else{
            JOptionPane.showMessageDialog(this, "No se puede eliminar un Mensaje que no haya sido enviado por mi");
        }
        
    }//GEN-LAST:event_jLstMensajesEnviadosValueChanged

    private void eliminarMensaje(String MensajeCompletoSinSeparar, int pos) {
        
        String ID = this.ListaIDMensaje.get(pos);
        String Comando = "REMOVEMSG "+ ID ;
        escribirsocket(Comando);

    }

    private void sendAll(String Mensaje) {

//            this.Hilo.stop();
        String Comando = "SENDALL " + Mensaje;
        escribirsocket(Comando);
//        String res = leersocket();
//        if (res.startsWith("103")){
//            JOptionPane.showMessageDialog(this, "Mensaje enviado con exito");
//            this.getModelo().addElement(Mensaje);
//            this.getjLstMensajesEnviados().setModel(getModelo());
//            //this.jLstMensajesEnviados.add(this, "->: " + Mensaje);   
//        } else {
//            if (res.startsWith("203")) {
//                JOptionPane.showMessageDialog(this, "Mensaje No se envio  ");
//            }
//        }

    }

    private void sendPersonal(String Mensaje, String Destinatario) {
        String Comando = "SEND " + Destinatario + " " + Mensaje;
//            this.getTheOut().println("SEND " + Destinatario + " " + Mensaje);
        escribirsocket(Comando);
//            String res = this.getTheIn().readLine();
//        String res = leersocket();
//        if (res.startsWith("102")) {
//            JOptionPane.showMessageDialog(this, "Mensaje enviado con exito al usuario " + Destinatario);
////                this.getjLstMensajesEnviados().add(this, Destinatario + "->: " + Mensaje);
//            this.modelo2.addElement(Destinatario + "->: " + Mensaje);
//            this.jLstMensajesEnviados.setModel(this.modelo2);
//        } else {
//            JOptionPane.showConfirmDialog(this, "Mensaje No se envio  ");
//        }

    }
    
    private void ElementoEnviado(String datos){
        
        if (!modeloMensajes.contains(datos)) {
            datos = datos.toUpperCase();
            this.modeloMensajes.addElement("MIO: "+ this.nombreUsuario +"-> "+ datos);
            this.ListaIDMensaje.add("Aquii deberia de estar el id que se genereo para el enviar a todos...");
            this.jLstMensajesEnviados.setModel(this.modeloMensajes);
        }
        
//        this.jLstMensajesEnviados.
    
    
    }

    /**
     * @param args the command line arguments
     */
    public static void escribirsocket(String Comando) {
//        try {
//            semaforo.acquire();
            theOut.println(Comando);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(JFCliente.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    public static String leersocket() {
        String a = "";
        try {
            a = theIn.readLine();
//            semaforo.release();
            return a;
        } catch (IOException ex) {
            Logger.getLogger(JFCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConectarce;
    private javax.swing.JButton btnEnviarMensaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jLstMensajesEnviados;
    private javax.swing.JList<String> jLstUsuariosConectados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private javax.swing.JTextField txtEnviarMensaje;
    private javax.swing.JTextField txtHost;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPort;
    // End of variables declaration//GEN-END:variables

   
    /**
     * @return the socketConeccion
     */
    public Socket getSocketConeccion() {
        return socketConeccion;
    }

    /**
     * @param socketConeccion the socketConeccion to set
     */
    public void setSocketConeccion(Socket socketConeccion) {
        this.socketConeccion = socketConeccion;
    }

    /**
     * @return the inCliente
     */
    public JFCliente getInCliente() {
        return inCliente;
    }

    /**
     * @param inCliente the inCliente to set
     */
    public void setInCliente(JFCliente inCliente) {
        this.inCliente = inCliente;
    }

    /**
     * @return the nombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * @param nombreUsuario the nombreUsuario to set
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * @return the theOut
     */
    public PrintWriter getTheOut() {
        return theOut;
    }

    /**
     * @param theOut the theOut to set
     */
    public void setTheOut(PrintWriter theOut) {
        this.theOut = theOut;
    }

    /**
     * @return the theIn
     */
    public BufferedReader getTheIn() {
        return theIn;
    }

    /**
     * @param theIn the theIn to set
     */
    public void setTheIn(BufferedReader theIn) {
        this.theIn = theIn;
    }

    /**
     * @return the cont
     */
    public int getCont() {
        return cont;
    }

    /**
     * @param cont the cont to set
     */
    public void setCont(int cont) {
        this.cont = cont;
    }

    /**
     * @return the seleUsuEnviar
     */
    public boolean isSeleUsuEnviar() {
        return seleUsuEnviar;
    }

    /**
     * @param seleUsuEnviar the seleUsuEnviar to set
     */
    public void setSeleUsuEnviar(boolean seleUsuEnviar) {
        this.seleUsuEnviar = seleUsuEnviar;
    }

    /**
     * @return the usuAEnviar
     */
    public String getUsuAEnviar() {
        return usuAEnviar;
    }

    /**
     * @param usuAEnviar the usuAEnviar to set
     */
    public void setUsuAEnviar(String usuAEnviar) {
        this.usuAEnviar = usuAEnviar;
    }

    /**
     * @return the btnConectarce
     */
    public javax.swing.JButton getBtnConectarce() {
        return btnConectarce;
    }

    /**
     * @param btnConectarce the btnConectarce to set
     */
    public void setBtnConectarce(javax.swing.JButton btnConectarce) {
        this.btnConectarce = btnConectarce;
    }

    /**
     * @return the btnEnviarMensaje
     */
    public javax.swing.JButton getBtnEnviarMensaje() {
        return btnEnviarMensaje;
    }

    /**
     * @param btnEnviarMensaje the btnEnviarMensaje to set
     */
    public void setBtnEnviarMensaje(javax.swing.JButton btnEnviarMensaje) {
        this.btnEnviarMensaje = btnEnviarMensaje;
    }

    /**
     * @return the jLabel1
     */
    public javax.swing.JLabel getjLabel1() {
        return jLabel1;
    }

    /**
     * @param jLabel1 the jLabel1 to set
     */
    public void setjLabel1(javax.swing.JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    /**
     * @return the jList1
     */
    public javax.swing.JList<String> getjList1() {
        return getjLstMensajesEnviados();
    }

    /**
     * @param jList1 the jList1 to set
     */
    public void setjList1(javax.swing.JList<String> jList1) {
        this.setjLstMensajesEnviados(jList1);
    }

    /**
     * @return the jLstUsuariosConectados
     */
    public javax.swing.JList<String> getjLstUsuariosConectados() {
        return jLstUsuariosConectados;
    }

    /**
     * @param jLstUsuariosConectados the jLstUsuariosConectados to set
     */
    public void setjLstUsuariosConectados(javax.swing.JList<String> jLstUsuariosConectados) {
        this.jLstUsuariosConectados = jLstUsuariosConectados;
    }

    /**
     * @return the jScrollPane1
     */
    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    /**
     * @param jScrollPane1 the jScrollPane1 to set
     */
    public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    /**
     * @return the jScrollPane2
     */
    public javax.swing.JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    /**
     * @param jScrollPane2 the jScrollPane2 to set
     */
    public void setjScrollPane2(javax.swing.JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    /**
     * @return the label1
     */
    public java.awt.Label getLabel1() {
        return label1;
    }

    /**
     * @param label1 the label1 to set
     */
    public void setLabel1(java.awt.Label label1) {
        this.label1 = label1;
    }

    /**
     * @return the label2
     */
    public java.awt.Label getLabel2() {
        return label2;
    }

    /**
     * @param label2 the label2 to set
     */
    public void setLabel2(java.awt.Label label2) {
        this.label2 = label2;
    }

    /**
     * @return the label3
     */
    public java.awt.Label getLabel3() {
        return label3;
    }

    /**
     * @param label3 the label3 to set
     */
    public void setLabel3(java.awt.Label label3) {
        this.label3 = label3;
    }

    /**
     * @return the label4
     */
    public java.awt.Label getLabel4() {
        return label4;
    }

    /**
     * @param label4 the label4 to set
     */
    public void setLabel4(java.awt.Label label4) {
        this.label4 = label4;
    }

    /**
     * @return the label5
     */
    public java.awt.Label getLabel5() {
        return label5;
    }

    /**
     * @param label5 the label5 to set
     */
    public void setLabel5(java.awt.Label label5) {
        this.label5 = label5;
    }

    /**
     * @return the label6
     */
    public java.awt.Label getLabel6() {
        return label6;
    }

    /**
     * @param label6 the label6 to set
     */
    public void setLabel6(java.awt.Label label6) {
        this.label6 = label6;
    }

    /**
     * @return the txtEnviarMensaje
     */
    public javax.swing.JTextField getTxtEnviarMensaje() {
        return txtEnviarMensaje;
    }

    /**
     * @param txtEnviarMensaje the txtEnviarMensaje to set
     */
    public void setTxtEnviarMensaje(javax.swing.JTextField txtEnviarMensaje) {
        this.txtEnviarMensaje = txtEnviarMensaje;
    }

    /**
     * @return the txtHost
     */
    public javax.swing.JTextField getTxtHost() {
        return txtHost;
    }

    /**
     * @param txtHost the txtHost to set
     */
    public void setTxtHost(javax.swing.JTextField txtHost) {
        this.txtHost = txtHost;
    }

    /**
     * @return the txtName
     */
    public javax.swing.JTextField getTxtName() {
        return txtName;
    }

    /**
     * @param txtName the txtName to set
     */
    public void setTxtName(javax.swing.JTextField txtName) {
        this.txtName = txtName;
    }

    /**
     * @return the txtPort
     */
    public javax.swing.JTextField getTxtPort() {
        return txtPort;
    }

    /**
     * @param txtPort the txtPort to set
     */
    public void setTxtPort(javax.swing.JTextField txtPort) {
        this.txtPort = txtPort;
    }

    /**
     * @return the HiloMensajes
     */
    public hiloEscucharYEnviarMensajes getHiloMensajes() {
        return HiloMensajes;
    }

    /**
     * @param HiloMensajes the HiloMensajes to set
     */
    public void setHiloMensajes(hiloEscucharYEnviarMensajes HiloMensajes) {
        this.HiloMensajes = HiloMensajes;
    }

    /**
     * @return the modelo
     */
    public DefaultListModel getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(DefaultListModel modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the jLstMensajesEnviados
     */
    public javax.swing.JList<String> getjLstMensajesEnviados() {
        return jLstMensajesEnviados;
    }

    /**
     * @param jLstMensajesEnviados the jLstMensajesEnviados to set
     */
    public void setjLstMensajesEnviados(javax.swing.JList<String> jLstMensajesEnviados) {
        this.jLstMensajesEnviados = jLstMensajesEnviados;
    }
}
