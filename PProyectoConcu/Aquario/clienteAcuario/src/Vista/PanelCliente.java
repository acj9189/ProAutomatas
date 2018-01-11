/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import static Controlador.GestorCliente.listaPeces;
import Modelo.Pez;

/**
 *
 * @author Danii
 */
public class PanelCliente extends javax.swing.JPanel {

    private ImageIcon background;
    private boolean paint;

    /**
     * Creates new form PanelCliente
     */
    public PanelCliente() {
        initComponents();
    }

    public void definirFondo(int sentido) {
        if (sentido == 0) {
            setBackground(new ImageIcon(getClass().getResource("/Vista/Images/B0.png")));
        } else {
            setBackground(new ImageIcon(getClass().getResource("/Vista/Images/B1.png")));
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        if (isPaint()) {
            if (getBackground() != null) {
                g.drawImage(getBackgroundP().getImage(), 0, 0, 1366, 768, this);
            }
            for (Pez pez : listaPeces) {
                g.drawImage(pez.getImagen(), pez.getX() - 100, pez.getY() - 180, this);
            }
        }
        repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @return the background
     */
    public ImageIcon getBackgroundP() {
        return background;
    }

    /**
     * @param background the background to set
     */
    public void setBackground(ImageIcon background) {
        this.background = background;
    }

    /**
     * @return the paint
     */
    public boolean isPaint() {
        return paint;
    }

    /**
     * @param paint the paint to set
     */
    public void setPaint(boolean paint) {
        this.paint = paint;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
