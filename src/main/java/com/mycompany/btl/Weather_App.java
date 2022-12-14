
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
//    public int idx = 0 
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
        lb_temperature_min = new javax.swing.JLabel();
        lb_temperature_feels = new javax.swing.JLabel();
        lb_temperature_max = new javax.swing.JLabel();
        lb_sea_level = new javax.swing.JLabel();
        lb_humidity = new javax.swing.JLabel();
        lb_clouds = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("D??? b??o th???i ti???t");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("T??n th??nh ph???: ");

        lb_temperature.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_temperature.setText("Nhi???t ?????:");

        lb_country.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_country.setText("?????t n?????c:");

        lb_wind.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_wind.setText("T???c ????? gi??:");

        lb_weather.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_weather.setText("Th???i ti???t:");

        lb_date.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_date.setText("Ng??y:");

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
        jLabel2.setText("D??? B??O TH???I TI???T");
        jLabel2.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("TH??NG TIN");

        lb_city.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_city.setText("Th??nh ph???:");

        lb_temperature_min.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_temperature_min.setText("Nhi???t ????? th???p nh???t:");

        lb_temperature_feels.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_temperature_feels.setText("Nhi???t ????? c???m nh???n ???????c:");

        lb_temperature_max.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_temperature_max.setText("Nhi???t ????? cao nh???t:");

        lb_sea_level.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_sea_level.setText("M???c n?????c:");

        lb_humidity.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_humidity.setText("????? ???m:");

        lb_clouds.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_clouds.setText("M??y:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(540, 540, 540)
                        .addComponent(bt_find, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel2)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lb_country)
                            .addGap(257, 257, 257)
                            .addComponent(lb_city))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lb_temperature)
                                .addComponent(lb_temperature_min)
                                .addComponent(lb_temperature_max)
                                .addComponent(lb_temperature_feels))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lb_weather)
                                .addComponent(lb_wind)
                                .addComponent(lb_sea_level))))
                    .addGap(143, 143, 143)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lb_humidity)
                        .addComponent(lb_clouds))
                    .addContainerGap(356, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
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
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(60, 60, 60)
                                    .addComponent(lb_date))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addContainerGap(519, Short.MAX_VALUE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lb_date))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_country)
                    .addComponent(lb_city)
                    .addComponent(lb_humidity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_temperature)
                    .addComponent(lb_wind)
                    .addComponent(lb_clouds))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_weather)
                    .addComponent(lb_temperature_min))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_temperature_max)
                    .addComponent(lb_sea_level))
                .addGap(18, 18, 18)
                .addComponent(lb_temperature_feels)
                .addGap(26, 26, 26))
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
    public javax.swing.JLabel lb_clouds;
    public javax.swing.JLabel lb_country;
    public javax.swing.JLabel lb_date;
    public javax.swing.JLabel lb_humidity;
    public javax.swing.JLabel lb_sea_level;
    public javax.swing.JLabel lb_temperature;
    public javax.swing.JLabel lb_temperature_feels;
    public javax.swing.JLabel lb_temperature_max;
    public javax.swing.JLabel lb_temperature_min;
    public javax.swing.JLabel lb_weather;
    public javax.swing.JLabel lb_wind;
    private javax.swing.JButton next;
    private javax.swing.JButton pre;
    // End of variables declaration//GEN-END:variables
}
