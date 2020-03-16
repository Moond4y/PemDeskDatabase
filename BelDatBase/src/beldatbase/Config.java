/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beldatbase;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import static java.util.logging.Logger.global;
import javax.swing.JFrame;
import jdk.nashorn.internal.objects.Global;

/**
 *
 * @author wasp
 */
public class Config extends javax.swing.JPanel {

    /**
     * Creates new form Config
     * @throws java.io.IOException
     */
    public Config() throws IOException {
        initComponents();
        Properties p = new Properties();
        try {
            p.load(new FileInputStream("conf.ini"));
            jLabel1.setText(p.getProperty("user"));
            JFrame frame = new JFrame();
            frame.getContentPane().setBackground((Color)Color.class.getField(p.getProperty("bgcolor")).get(null));
        }catch (IOException | NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
            System.err.println(e.getMessage());
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

        jLabel1 = new javax.swing.JLabel();

        jLabel1.setText("username");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel1)
                .addContainerGap(159, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel1)
                .addContainerGap(155, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
