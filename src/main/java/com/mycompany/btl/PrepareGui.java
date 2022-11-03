package com.mycompany.btl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.naming.spi.DirStateFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PrepareGui {

    public Weather_App weather;
    public JsonResult result;
    public ArrayList<Weather> listResult;
    public int idx = 0;

    public PrepareGui() {
        weather = new Weather_App();
        prepare();
    }

    public Weather_App getWeather() {
        return weather;
    }

    private void prepare() {
        weather.getBt_find().setActionCommand("find");
        weather.getBt_find().addActionListener(new ButtonClick());

        weather.getBt_next().setActionCommand("next");
        weather.getBt_next().addActionListener(new ButtonClick());

        weather.getBt_pre().setActionCommand("pre");
        weather.getBt_pre().addActionListener(new ButtonClick());
    }

    public void show() {
        result = API.getJsonData((String) weather.jTextField1.getText());
        String date = " Ngày: " + result.getList()[idx].getDt_txt();
        String city = " Thành phố: " + result.getCity().getName();
        String nation = " Quốc gia: " + result.getCity().getCountry();
        String weath = " Thời tiết: " + result.getList()[idx].getWeather()[0].getDescription();
        String nhietDo = " Nhiệt độ: " + result.getList()[idx].getMain().getTemp() + " độ C";
//        String apXuat = " Ap xuất: " + result.getList()[idx].getMain().getPresure();
//        String doAm = " Độ ẩm: " + result.getList()[idx].getMain().getHumidity();
        String winSpeed = " Tốc độ gió: " + result.getList()[idx].getWind().getSpeed();
//        String clouds = " Mây: " + result.getList()[idx].getClouds().getAll() + "%";

        weather.lb_country.setText(nation);
        weather.lb_temperature.setText(nhietDo);
        weather.lb_date.setText(date);
        weather.lb_wind.setText(winSpeed);
        weather.lb_weather.setText(weath);
        weather.lb_city.setText(city);
    }

    public class ButtonClick implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String command = ae.getActionCommand();
            if (command.equals("find")) {
                find();
                if(result==null){
                JOptionPane.showMessageDialog(weather, "Không tìm thấy thành phố");
            }
                idx = 0;
            } else if (command.equals("next")) {
               if(idx == 39){
                   idx = idx;
                   JOptionPane.showMessageDialog(weather, "Không có thông tin mới hơn");
               }else{
                   idx++;
               }
            } else if (command.equals("pre")) {
                if (idx == 0) {
                    idx = idx;
                    JOptionPane.showMessageDialog(weather, "Không có thông tin cũ hơn");
                } else {
                    idx = idx - 1;
                }

            }
            show();
        }

        public void find() {
           
            result = API.getJsonData((String) weather.jTextField1.getText());
            
        }
    }
}
