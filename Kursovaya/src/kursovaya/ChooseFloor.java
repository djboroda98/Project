/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kursovaya;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import javafx.beans.binding.Bindings;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JTextField;

/**
 *
 * @author Роман
 */
public class ChooseFloor {
    
    public static  void ChooseFloor(){
        JFrame frame = new JFrame("ETU8");
        frame.setSize(900, 550);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
      
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
//        ChooseRoom chooseRoom = new ChooseRoom();
        Font font = new Font("Verdana", Font.PLAIN, 24);
        
        JPanel panelForButton = new JPanel();
        JPanel panelUp = new JPanel();
        panelUp.setBackground(Color.WHITE);
        panelUp.setLayout(new GridLayout(0,3,0,5));
        JButton button1 = new JButton(new ImageIcon("64px/arrow-up.png"));
        JButton button2 = new JButton(new ImageIcon("64px/arrow-down.png"));
        JTextField textField = new JTextField("1",5);
        textField.setFont(font);
        textField.setHorizontalAlignment(0);
        
        panelForButton.setLayout(new GridLayout(0,1,0,5));
        panelForButton.setOpaque(true);
        panelForButton.setBackground(Color.WHITE);
        panelForButton.add(setEmptyPanel());
        panelForButton.add(setEmptyPanel());
        panelForButton.add(setEmptyPanel());
        panelForButton.add(button1);
        panelForButton.add(textField);
        panelForButton.add(button2);
        JLabel label = new JLabel(); 
        label.setText("Этаж №" + "1");
        label.setFont(font);
        label.setForeground(Color.BLUE);
        panelUp.add(setEmptyPanel());
        panelUp.add(setEmptyPanel());
        panelUp.add(setEmptyPanel());
        panelUp.add(setEmptyPanel());
        panelUp.add(label);
        panelUp.add(setEmptyPanel());
        panelUp.add(setEmptyPanel());
        
        HashMap<String, Component> hash = new HashMap<>();
        int t=1;
        for (int i = 0; i < 8; i++) {
                
                final String name = ""+i;
                final JPanel jPanel = new JPanel();
                ChooseRoom chooseRoom = new ChooseRoom();
                chooseRoom.ChooseRoom(t, jPanel);
                hash.put(name, jPanel);
                 t=t+12;
            
        }
        JPanel panelWest = new JPanel();
        panelWest.setLayout(new  GridLayout(0,4,0,5) );
        panelWest.add(setEmptyPanel());
        panelWest.add(setEmptyPanel());
        panelWest.add(setEmptyPanel());
        panelWest.add(setEmptyPanel());
        
        JPanel panelCenter = new JPanel();
        panelCenter.add(hash.get("0"));
        panelCenter.setBackground(Color.WHITE);
        
        HashMap<String, Component> hash2 = new HashMap<>();
        hash2.put("1", panelCenter );
        hash2.put("2", panelUp);
        
        JPanel panelDown = new JPanel();
        JButton buttonLeft = new JButton(new ImageIcon("64px/arrow-left.png"));
        panelDown.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelDown.setBackground(Color.WHITE);
        panelDown.add(buttonLeft);
        
        
        
        mainPanel.add(panelCenter, BorderLayout.CENTER);
        mainPanel.add(panelForButton, BorderLayout.EAST);
        mainPanel.add(panelUp,BorderLayout.NORTH);
        mainPanel.add(panelWest, BorderLayout.WEST);
        mainPanel.add(panelDown, BorderLayout.SOUTH);
        
        frame.setContentPane(mainPanel);
        frame.pack();
        
        
        
        button1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                
                int up =0; 
                if(!(textField.getText().isEmpty()))
                  up = Integer.parseInt(textField.getText());
                
                if((up < 8) &&( up > 0)){
                up++;
                textField.removeAll();
                textField.setText(""+(up));
                label.removeAll();
                label.setText("Этаж №" + up);
                panelUp.removeAll();
                panelUp.add(setEmptyPanel());
                panelUp.add(setEmptyPanel());
                panelUp.add(setEmptyPanel());
                panelUp.add(setEmptyPanel());
                panelUp.add(label);
                panelUp.add(setEmptyPanel());
                panelUp.add(setEmptyPanel());
                mainPanel.remove(hash2.get("2"));
                mainPanel.add(panelUp,BorderLayout.NORTH);
                
                panelCenter.removeAll();
                panelCenter.setVisible(false);
                panelCenter.add(hash.get(""+(up-1)));
                
                mainPanel.remove(hash2.get("1"));
                mainPanel.add(panelCenter, BorderLayout.CENTER);
                panelCenter.setVisible(true);
                }
                
            }
        });
        
        button2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int down = 0; 
                if(!(textField.getText().isEmpty()))
                 down = Integer.parseInt(textField.getText());
                
                if((down > 1)&&(down < 9)){
                down--;
                textField.removeAll();
                textField.setText(""+(down));
                label.removeAll();
                label.setText("Этаж №" + down);
//                label.setFont(font);
//                label.setForeground(Color.BLUE);
                panelUp.removeAll();
                panelUp.add(setEmptyPanel());
                panelUp.add(setEmptyPanel());
                panelUp.add(setEmptyPanel());
                panelUp.add(setEmptyPanel());
                panelUp.add(label);
                panelUp.add(setEmptyPanel());
                panelUp.add(setEmptyPanel());
                mainPanel.remove(hash2.get("2"));
                mainPanel.add(panelUp,BorderLayout.NORTH);
                
                
                
                panelCenter.removeAll();
                panelCenter.setVisible(false);
                panelCenter.add(hash.get(""+(down-1)));
                
                mainPanel.remove(hash2.get("1"));
                mainPanel.add(panelCenter, BorderLayout.CENTER);
                panelCenter.setVisible(true);
                }
                
            }
        });
        
        buttonLeft.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                frame.setVisible(false);
                SwingUtilities.invokeLater(new Runnable() {
               @Override
               public void run() {
//                
               Hotel hotel = new Hotel();
               hotel.Hotel();
               
                   
                }
            
        });
                
            }
        });
        
        textField.addKeyListener(new KeyAdapter() {
            @Override
        public void keyTyped(KeyEvent e) {
         char c = e.getKeyChar();
         if ( ((c < '0') || (c > '9')) ) {
             e.consume(); 
             }
   }
        
        @Override
        public void keyPressed(KeyEvent e) {
				
        int key = e.getKeyCode();
		        
        if (key == KeyEvent.VK_ENTER) {
             
          int search =0; 
          if(!(textField.getText().isEmpty()))
            search = Integer.parseInt(textField.getText());
               
                if((search < 9) && (search > 0)){
                textField.removeAll();
                textField.setText(""+(search));
                label.removeAll();
                label.setText("Этаж №" + search);
                panelUp.removeAll();
                panelUp.add(setEmptyPanel());
                panelUp.add(setEmptyPanel());
                panelUp.add(setEmptyPanel());
                panelUp.add(setEmptyPanel());
                panelUp.add(label);
                panelUp.add(setEmptyPanel());
                panelUp.add(setEmptyPanel());
                mainPanel.remove(hash2.get("2"));
                mainPanel.add(panelUp,BorderLayout.NORTH);
                
                panelCenter.removeAll();
                panelCenter.setVisible(false);
                panelCenter.add(hash.get(""+(search-1)));
                
                mainPanel.remove(hash2.get("1"));
                mainPanel.add(panelCenter, BorderLayout.CENTER);
                panelCenter.setVisible(true);
                }

        }
     }
});
    }
    
    
    
    
    public static JPanel setEmptyPanel (){
        JPanel panel = new JPanel();
        panel.setOpaque(true);
        panel.setBackground(Color.WHITE);
        return panel;  
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                ChooseFloor chooseFloor = new ChooseFloor();
                chooseFloor.ChooseFloor();

            }

        });
    }
}


