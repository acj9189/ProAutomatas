/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectochat_clienteservidor.Vista;

import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import proyectochat_clienteservidor.Modelo.Agente;
import static proyectochat_clienteservidor.Modelo.Agente.name;

/**
 *
 * @author Danii
 */
public class frameClienteServidor extends javax.swing.JFrame {

    /**
     * Creates new form frameClienteServidor
     */
    private Agente agente;

    public frameClienteServidor() {
        initComponents();
        try {
            this.direccionIP.setText(InetAddress.getLocalHost().getHostAddress());
        } catch (Exception e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        direccionIP = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtHostClient = new javax.swing.JTextField();
        txtPortClient = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPort = new javax.swing.JTextField();
        btnConectarce1 = new javax.swing.JButton();
        btnConectarce = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLstUsuariosConectados = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        label4 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLstMensajes = new javax.swing.JList<>();
        label5 = new java.awt.Label();
        txtEnviarMensaje = new javax.swing.JTextField();
        btnEnviarMensaje = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Direccion IP:");

        jLabel2.setText("Direccion del cliente:");

        txtHostClient.setText("localhost");
        txtHostClient.setName("txtHostClient"); // NOI18N

        txtPortClient.setText("1107");
        txtPortClient.setName("txtPortClient"); // NOI18N

        jLabel3.setText("Puerto del cliente:");

        jLabel5.setText("Username:");

        jLabel6.setText("Puerto:");

        btnConectarce1.setText("Registrar");
        btnConectarce1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConectarce1MouseClicked(evt);
            }
        });
        btnConectarce1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarce1ActionPerformed(evt);
            }
        });

        btnConectarce.setText("Conectarce");
        btnConectarce.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConectarceMouseClicked(evt);
            }
        });
        btnConectarce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarceActionPerformed(evt);
            }
        });

        jLstUsuariosConectados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLstUsuariosConectadosMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLstUsuariosConectadosMouseReleased(evt);
            }
        });
        jLstUsuariosConectados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLstUsuariosConectadosKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jLstUsuariosConectadosKeyReleased(evt);
            }
        });
        jLstUsuariosConectados.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jLstUsuariosConectadosValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jLstUsuariosConectados);

        jLabel1.setText("Lista de Conectados");

        label4.setText("Mensajes Enviados y Recibidos");

        jLstMensajes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLstMensajesMouseClicked(evt);
            }
        });
        jLstMensajes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jLstMensajesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jLstMensajes);

        label5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label5.setText("Enviar");

        btnEnviarMensaje.setText("Enviar Mensaje");
        btnEnviarMensaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnviarMensajeMouseClicked(evt);
            }
        });
        btnEnviarMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarMensajeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnEnviarMensaje)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnConectarce1)
                                        .addGap(119, 119, 119)
                                        .addComponent(btnConectarce))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(direccionIP, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(31, 31, 31)
                                                .addComponent(jLabel6))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPortClient, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtHostClient, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel3)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEnviarMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(5, 5, 5))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(direccionIP, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHostClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPortClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnConectarce1)
                            .addComponent(btnConectarce))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(txtEnviarMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEnviarMensaje)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConectarce1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConectarce1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConectarce1MouseClicked

    private void btnConectarce1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarce1ActionPerformed
        if (!this.txtName.getText().equals("") && !this.txtPort.getText().equals("")) {
            this.agente = new Agente(Integer.parseInt(this.txtPort.getText()), this.txtName.getText());
        }
    }//GEN-LAST:event_btnConectarce1ActionPerformed

    private void btnConectarceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConectarceMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConectarceMouseClicked

    private void btnConectarceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarceActionPerformed
        if (!this.txtHostClient.getText().equals("") && !this.txtPortClient.getText().equals("")) {
            try {
                Socket client = new Socket(this.txtHostClient.getText(), Integer.parseInt(this.txtPortClient.getText()));
                PrintWriter theOut = new PrintWriter(client.getOutputStream(), true);
                theOut.println("Connect "+this.txtName.getText()+"*"+this.direccionIP.getText()+"-"+this.txtPort.getText());
                theOut.println("Name:"+name);
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_btnConectarceActionPerformed

    private void jLstUsuariosConectadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLstUsuariosConectadosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLstUsuariosConectadosMouseClicked

    private void jLstUsuariosConectadosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLstUsuariosConectadosMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLstUsuariosConectadosMouseReleased

    private void jLstUsuariosConectadosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLstUsuariosConectadosKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLstUsuariosConectadosKeyPressed

    private void jLstUsuariosConectadosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLstUsuariosConectadosKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLstUsuariosConectadosKeyReleased

    private void jLstUsuariosConectadosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jLstUsuariosConectadosValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jLstUsuariosConectadosValueChanged

    private void jLstMensajesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLstMensajesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLstMensajesMouseClicked

    private void jLstMensajesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jLstMensajesValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jLstMensajesValueChanged

    private void btnEnviarMensajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMensajeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnviarMensajeMouseClicked

    private void btnEnviarMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarMensajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnviarMensajeActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frameClienteServidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameClienteServidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameClienteServidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameClienteServidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameClienteServidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConectarce;
    private javax.swing.JButton btnConectarce1;
    private javax.swing.JButton btnEnviarMensaje;
    private javax.swing.JLabel direccionIP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jLstMensajes;
    private javax.swing.JList<String> jLstUsuariosConectados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private javax.swing.JTextField txtEnviarMensaje;
    private javax.swing.JTextField txtHostClient;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPort;
    private javax.swing.JTextField txtPortClient;
    // End of variables declaration//GEN-END:variables
}