package com.mycompany.btl;

import java.awt.FlowLayout;
import java.awt.TextArea;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class frame extends JFrame {

    private JsonResult result;
    private ArrayList<Weather> listResult;
    private int idx = 0;
    JTextArea textArea = new JTextArea(5, 20);
    JScrollPane scrollPane = new JScrollPane(textArea);
//    textArea.setEditable (false); 

    frame() {
        this.setVisible(true);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.add(textArea);
//        textArea.setText((String) result.getList()[0].getDt_txt());.
        String date = result.getList()[0].getDt_txt();
        System.out.println(date);
    }
}
