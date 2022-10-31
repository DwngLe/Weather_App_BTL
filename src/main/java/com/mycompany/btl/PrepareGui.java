package com.mycompany.btl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.naming.spi.DirStateFactory;
import javax.swing.JFrame;

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

//        weather.getBtn_next().setActionCommand("next");
//        weather.getBtn_next().addActionListener(new ButtonClick());
//
//        weather.getBtn_pre().setActionCommand("pre");
//        weather.getBtn_pre().addActionListener(new ButtonClick());
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

        weather.lb_country.setText(city);
        weather.lb_temperature.setText(nhietDo);
        weather.lb_date.setText(date);
        weather.lb_wind.setText(winSpeed);
    }

    public class ButtonClick implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String command = ae.getActionCommand();
            if (command.equals("find")) {
                find();
                idx = 0;
            } else if (command.equals("next")) {
                idx = idx == 39 ? idx : idx + 1;
            } else if (command.equals("pre")) {
                idx = idx == 0 ? idx : idx - 1;
            }
            show();
        }

        public void find() {
            System.out.println(weather.jTextField1.getText());
            result = API.getJsonData((String) weather.jTextField1.getText());
        }
    }
}
