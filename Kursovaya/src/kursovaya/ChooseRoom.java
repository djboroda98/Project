/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kursovaya;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



import layout.TableLayout;

public class ChooseRoom extends Room implements ActionListener {
 
    private JButton[] button;
 private JFrame[] dialog;
 private final double d = 1.3;
 private JPanel panelRoom;
public  void ChooseRoom(int k, JPanel panel) {
    
    
        panel.setOpaque(true);
        panel.setBackground(Color.WHITE);
        
        TableLayout tableLayout = new TableLayout(new double[][]{
            {d*50,d*50,d*50,d*50,d*15,d*35,d*30,d*20,d*20,d*30,d*50,d*50,d*50,d*50,d*50}, 
            {d*50,d*20,d*30,d*35,d*10,d*20,d*20,d*10,d*20,d*20}});
        
        panel.setLayout(tableLayout);
        panel.setMaximumSize(new Dimension(600,235));
        
        HashMap<String, Component> hash = new HashMap<>();
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 10; j++) {
                final String name = i + "-" + j;
                final JButton jButton = new JButton(name);
                panel.add(jButton, i + "," + j);
                hash.put(name, jButton);

            }
        }
        for(int i=0;i<15;i++)
            for(int j=0;j<10;j++)
        {
             panel.remove(hash.get(i+ "-" +j));
        }
        
        Font font = new Font("Verdana", Font.PLAIN, 12);
        button = new JButton[12];
        dialog = new JFrame[12];
        panelRoom = new JPanel();
        
        
        for(int i=0;i<12;i++){
            button[i] = new JButton(""+ k);
            button[i].setFont(font);
            button[i].setOpaque(true);
            button[i].setBackground(Color.GREEN);
            button[i].setForeground(Color.BLACK);
            button[i].addActionListener((ActionListener) this);
            dialog[i] = new JFrame( "Комната №"+ k );
            dialog[i].dispose();
            k++;
        }
            
        
        panel.add(new JButton(), "0,0,0,3");
        panel.add(button[0], "1,0,1,2"); 
        panel.add(button[1], "2,0,2,1");
        panel.add(new JButton("↑"), "2,2,2,2");
        panel.add(button[2], "3,0,3,1");
        panel.add(new JButton("↑"), "3,2,3,2");
        panel.add(button[3], "4,0,5,2");
        panel.add(button[4], "6,0,7,2");
        panel.add(button[5], "8,0,9,1");
        panel.add(new JButton("↑"), "8,2,9,2");
        panel.add(button[6], "10,0,10,1");
        panel.add(new JButton("↑"), "10,2,10,2");
        panel.add(button[7], "11,0,11,2");
        panel.add(new JButton("Душ"), "12,1,13,2");
        panel.add(button[8], "0,4,1,6");
        panel.add(button[9], "0,7,1,9");
        panel.add(new JButton("↓"), "2,4,2,9");
        panel.add(new JButton(), "3,5,3,6");
        panel.add(new JButton(), "3,7,3,9");
        panel.add(new JButton("Х"), "6,4,6,5");
        panel.add(new JButton("Х"), "6,6,6,7");
        panel.add(new JButton("Х"), "9,4,9,7");
        panel.add(new JButton("→Выход"), "6,8,9,9");
        panel.add(new JButton("Кухня"), "10,4,11,9");
        panel.add(new JButton("↓"), "12,4,12,5");
        panel.add(button[10], "12,6,12,9");
        panel.add(button[11], "13,4,13,9");

        
    }

   

 @Override
     public void actionPerformed(ActionEvent e) {
         Object source = e.getSource();   
         for(int i = 0; i < 12;i++){
             if(source == button[i]){
                    // dialog[i].removeAll();
                     panelRoom.removeAll();
                     dialog[i].setSize(500,500);
                     dialog[i].setLocationRelativeTo(null);
                     dialog[i].setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                     dialog[i].setVisible(true);
                     dialog[i].setLayout(new BorderLayout(0,0));
                     panelRoom = new JPanel();
                     Room room = new Room();
                     room.Room(panelRoom);
                     dialog[i].add(panelRoom);
                     dialog[i].pack();
//                     if (!(toggleButton.isEnabled())){
//                         button[i].setBackground(Color.RED);
                     }
             }
                     
     }
} 
   
