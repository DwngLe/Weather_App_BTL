
package com.mycompany.btl;

import com.mycompany.btl.*;
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

    public JButton getBt_next() {
        return next;
    }

    public JButton getBt_pre() {
        return pre;
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

    public JLabel getLb_city() {
        return lb_city;
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
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lb_temperature = new javax.swing.JLabel();
        lb_country = new javax.swing.JLabel();
        lb_wind = new javax.swing.JLabel();
        lb_weather = new javax.swing.JLabel();
        lb_date = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        bt_find = new javax.swing.JButton();
        next = new javax.swing.JButton();
        pre = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lb_city = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dự báo thời tiết");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Tên thành phố: ");

        lb_temperature.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_temperature.setText("Nhiệt độ:");

        lb_country.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_country.setText("Đất nước:");

        lb_wind.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_wind.setText("Tốc độ gió:");

        lb_weather.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_weather.setText("Thời tiết:");

        lb_date.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_date.setText("Ngày:");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        bt_find.setText("FIND");
        bt_find.setBorder(null);
        bt_find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_findActionPerformed(evt);
            }
        });

        next.setText("NEXT");
        next.setBorder(null);

        pre.setText("PRE");
        pre.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("DỰ BÁO THỜI TIẾT");
        jLabel2.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("THÔNG TIN");

        lb_city.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_city.setText("Thành phố:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_date)
                            .addComponent(lb_temperature)
                            .addComponent(lb_wind)
                            .addComponent(lb_weather)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_country)
                                .addGap(257, 257, 257)
                                .addComponent(lb_city))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(144, 144, 144)
                            .addComponent(pre, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(540, 540, 540)
                        .addComponent(bt_find, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel2)))
                .addGap(0, 64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_find, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pre, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_country)
                    .addComponent(lb_city))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_temperature)
                .addGap(12, 12, 12)
                .addComponent(lb_wind)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_weather)
                .addGap(18, 18, 18)
                .addComponent(lb_date)
                .addGap(38, 38, 38))
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
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JLabel lb_city;
    public javax.swing.JLabel lb_country;
    public javax.swing.JLabel lb_date;
    public javax.swing.JLabel lb_temperature;
    public javax.swing.JLabel lb_weather;
    public javax.swing.JLabel lb_wind;
    private javax.swing.JButton next;
    private javax.swing.JButton pre;
    // End of variables declaration//GEN-END:variables
}
