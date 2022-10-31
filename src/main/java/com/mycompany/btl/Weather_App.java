
package com.mycompany.btl;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Weather_App extends javax.swing.JFrame {
//    public Weather_App weather;
//    public JsonResult result;
//    public ArrayList<Weather> listResult;
//    public int idx = 0; 
//    
    
    public Weather_App() {
        initComponents();
    }

    public JButton getBt_find() {
        return bt_find;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public JTextField getjTextField1() {
        return jTextField1;
    }

    public JLabel getLb_country() {
        return lb_country;
    }

    public JLabel getLb_date() {
        return lb_date;
    }

    public JLabel getLb_temperature() {
        return lb_temperature;
    }

    public JLabel getLb_weather() {
        return lb_weather;
    }

    public JLabel getLb_wind() {
        return lb_wind;
    }
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lb_temperature = new javax.swing.JLabel();
        lb_country = new javax.swing.JLabel();
        lb_wind = new javax.swing.JLabel();
        lb_weather = new javax.swing.JLabel();
        lb_date = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        bt_find = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tên thành phố: ");

        lb_temperature.setText("Nhiệt độ:");

        lb_country.setText("Đất nước:");

        lb_wind.setText("Tốc độ gió");

        lb_weather.setText("Thời tiết");

        lb_date.setText("Ngày:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        bt_find.setText("Tìm");
        bt_find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_findActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_date)
                    .addComponent(lb_country)
                    .addComponent(lb_temperature)
                    .addComponent(lb_wind)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(bt_find))
                    .addComponent(lb_weather))
                .addContainerGap(236, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_find))
                .addGap(31, 31, 31)
                .addComponent(lb_country)
                .addGap(26, 26, 26)
                .addComponent(lb_temperature)
                .addGap(18, 18, 18)
                .addComponent(lb_wind)
                .addGap(18, 18, 18)
                .addComponent(lb_weather)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_date)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void bt_findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_findActionPerformed
        // TODO add your handling code here:
        show();
    }//GEN-LAST:event_bt_findActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Weather_App().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton bt_find;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JLabel lb_country;
    public javax.swing.JLabel lb_date;
    public javax.swing.JLabel lb_temperature;
    public javax.swing.JLabel lb_weather;
    public javax.swing.JLabel lb_wind;
    // End of variables declaration//GEN-END:variables
}
