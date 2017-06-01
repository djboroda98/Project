/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kursovaya;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Роман
 */
public class Gym {
    
    public void Gym(){
        JFrame frame = new JFrame("ETU8");
        frame.setSize(700,550);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font font = new Font("Verdana", Font.PLAIN, 14);
        JLabel label1 = new JLabel("<html><p align='left'>Добро пожаловать <br> в Спорт Зал</p></html>"); 
        label1.setFont(new Font("Arial", Font.PLAIN, 30));
        label1.setForeground(Color.BLUE);
        JLabel label2 = new JLabel(new ImageIcon("myimage/_MG_2978.jpg"));
        JLabel label3 = new JLabel("<html><p align='left'>Понедельник: с 8:00 - 23:00<br> " +
                "Вторник: с 8:00 - 23:00 <br>" + "Среда: с 8:00 - 23:00 <br>" + 
                "Четверг: с 8:00 - 23:00 <br> " + "Пятница: с 8:00 - 23:00 <br>" +
                "Суббота: с 10:00 - 23:00 <br>"+ "Воскресенье: с 10:00 - 23:00 <br></p></html> ");
        label3.setFont(font);
        label3.setHorizontalTextPosition(JLabel.LEFT);
//        label1.setAlignmentX(JComponent.LEFT_ALIGNMENT);
//        label2.setAlignmentX(JComponent.LEFT_ALIGNMENT);
//        label3.setAlignmentX(JComponent.LEFT_ALIGNMENT);
        JRadioButton radioButton1 = new JRadioButton("Записаться");
        radioButton1.setActionCommand("Записаться");
        radioButton1.setSelected(false);
        radioButton1.setAlignmentX(JComponent.RIGHT_ALIGNMENT);
        radioButton1.setFont(font);
        
        JRadioButton radioButton2 = new JRadioButton("Отписаться");
        radioButton2.setActionCommand("Отписаться");
        radioButton2.setSelected(false);
        radioButton2.setAlignmentX(JComponent.WHEN_FOCUSED);
        radioButton2.setFont(font);
        
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        
        JButton button1 = new JButton("Сохранить");
        JButton button2 = new JButton("Отмена");
         button1.setFont(font);
         button2.setFont(font);
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        
        
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel1.add(label2);
        panel1.add(label1);
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel2.add(radioButton1);
        panel2.add(new JPanel());
        panel2.add(radioButton2);
        panel3.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel3.setBorder(new TitledBorder("Режим Работы: "));
        panel3.add(label3);
        panel4.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel4.add(button1);
        panel4.add(new JPanel());
        panel4.add(button2);
        Box mainBox = Box.createVerticalBox();
        mainBox.setBackground(Color.WHITE);
        mainBox.setBorder(new EmptyBorder(12,12,12,12));
//        mainBox.add(label2);
//        mainBox.add(label1);
        mainBox.add(panel1);
        mainBox.add(Box.createVerticalStrut(12));
        mainBox.add(panel2);
        mainBox.add(Box.createVerticalStrut(12));
        mainBox.add(panel3);
        mainBox.add(Box.createVerticalStrut(12));
        mainBox.add(panel4);
        mainBox.add(Box.createVerticalStrut(12));
        
        frame.setContentPane(new JScrollPane(mainBox));
        frame.setVisible(true);
        
        
        
         button1.addActionListener(new ActionListener(){
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
        
         button2.addActionListener(new ActionListener(){
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
    }
    
}
