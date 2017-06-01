/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kursovaya;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Роман
 */
public class Profile {
    
    public void Profile() throws IOException{
        JFrame frame = new JFrame("ETU8");
        frame.setSize(700,550);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Box box1 = Box.createHorizontalBox();
        JLabel label1 = new JLabel("Имя:");
        JLabel label1A = new JLabel("<Имя>");
        box1.add(label1);
        box1.add(Box.createHorizontalStrut(10));
        box1.add(label1A);
        
        Box box2 = Box.createHorizontalBox();
        JLabel label2 = new JLabel("Фамилия:");
        JLabel label2A = new JLabel("<Фамилия>");
        box2.add(label2);
        box2.add(Box.createHorizontalStrut(10));
        box2.add(label2A);
        
        Box box3 = Box.createHorizontalBox();
        JLabel label3 = new JLabel("Отчество:");
        JLabel label3A = new JLabel("<Отчество>");
        box3.add(label3);
        box3.add(Box.createHorizontalStrut(10));
        box3.add(label3A);
        
        Box box4 = Box.createHorizontalBox();
        JLabel label4 = new JLabel("E-mail:");
        JLabel label4A = new JLabel("<E-mail>");
        box4.add(label4);
        box4.add(Box.createHorizontalStrut(10));
        box4.add(label4A);
        
        Box box5 = Box.createHorizontalBox();
        JLabel label5 = new JLabel("Пол:");
        JLabel label5A = new JLabel("<Пол>");
        box5.add(label5);
        box5.add(Box.createHorizontalStrut(10));
        box5.add(label5A);
        
        Box box6 = Box.createHorizontalBox();
        JLabel label6 = new JLabel("Дата рождения:");
        JLabel label6A = new JLabel("<Дата рождения>");
        box6.add(label6);
        box6.add(Box.createHorizontalStrut(10));
        box6.add(label6A);
        
        Box box7 = Box.createHorizontalBox();
        JLabel label7 = new JLabel("Факультет:");
        JLabel label7A = new JLabel("<Факультет>");
        box7.add(label7);
        box7.add(Box.createHorizontalStrut(10));
        box7.add(label7A);
        
        Box box8 = Box.createHorizontalBox();
        JLabel label8 = new JLabel("Курс:");
        JLabel label8A = new JLabel("<Курс>");
        box8.add(label8);
        box8.add(Box.createHorizontalStrut(10));
        box8.add(label8A);
        
        Box box9 = Box.createHorizontalBox();
        JLabel label9 = new JLabel("Группа:");
        JLabel label9A = new JLabel("<Группа>");
        box9.add(label9);
        box9.add(Box.createHorizontalStrut(10));
        box9.add(label9A);
        
        Box box10 = Box.createHorizontalBox();
        JLabel label10 = new JLabel("Телефон:");
        JLabel label10A = new JLabel("<Телефон>");
        box10.add(label10);
        box10.add(Box.createHorizontalStrut(10));
        box10.add(label10A);
        
        Box box100 = Box.createHorizontalBox();
        JLabel label100 = new JLabel("Комната:");
        JLabel label100A = new JLabel("<Комната>");
        box100.add(label100);
        box100.add(Box.createHorizontalStrut(10));
        box100.add(label100A);
        
        Box box11 = Box.createHorizontalBox();
        JButton button = new JButton("Закрыть");
        box11.add(Box.createHorizontalGlue());
        box11.add(button);
        
        Box box12 = Box.createHorizontalBox();
        box12.add(Box.createHorizontalGlue());
        BufferedImage originalImage = ImageIO.read(new File("myimage/no-ava.png" ));
            int width = 200;
            int height = 200;
            Image image= originalImage.getScaledInstance(width, height, Image.SCALE_AREA_AVERAGING);
            BufferedImage changedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            Graphics2D graphics2D = changedImage.createGraphics();
            graphics2D.drawImage(image, 0, 0, null);
            graphics2D.dispose();
            ImageIO.write(changedImage,"png", new File("myimage/no-ava2.png"));
            JButton imageButton= new JButton(new ImageIcon("myimage/no-ava2.png"));
            imageButton.setMaximumSize(new Dimension(200, 200));
            imageButton.setAlignmentX(JComponent.CENTER_ALIGNMENT);
            imageButton.setOpaque(true);
            imageButton.setBackground(Color.WHITE);
            imageButton.setBorder(null);
            JLabel imageLabel = new JLabel();
            ImageIcon icon = new ImageIcon("myimage/no-ava.png");
            imageLabel.setIcon(icon);
            JPanel  imagePanel = new JPanel();
            imagePanel.add(imageLabel);
        
        box12.add(imageButton);    
            
        Box mainBox = Box.createVerticalBox();
        mainBox.setBorder(new EmptyBorder(12,12,12,12));
        mainBox.add(box12);
        mainBox.add(Box.createVerticalStrut(12));
        mainBox.add(box1);
        mainBox.add(Box.createVerticalStrut(12));
        mainBox.add(box2);
        mainBox.add(Box.createVerticalStrut(12));
        mainBox.add(box3);
        mainBox.add(Box.createVerticalStrut(12));
        mainBox.add(box4);
        mainBox.add(Box.createVerticalStrut(12));
        mainBox.add(box5);
        mainBox.add(Box.createVerticalStrut(12));
        mainBox.add(box6);
        mainBox.add(Box.createVerticalStrut(12));
        mainBox.add(box7);
        mainBox.add(Box.createVerticalStrut(12));
        mainBox.add(box8);
        mainBox.add(Box.createVerticalStrut(12));
        mainBox.add(box9);
        mainBox.add(Box.createVerticalStrut(12));
        mainBox.add(box10);
        mainBox.add(Box.createVerticalStrut(12));
        mainBox.add(box100);
        mainBox.add(Box.createVerticalStrut(12));
        mainBox.add(box11);
        
        
       label1.setPreferredSize(label6.getPreferredSize());
       label2.setPreferredSize(label6.getPreferredSize());
       label3.setPreferredSize(label6.getPreferredSize());
       label4.setPreferredSize(label6.getPreferredSize());
       label5.setPreferredSize(label6.getPreferredSize());
       label7.setPreferredSize(label6.getPreferredSize());
       label8.setPreferredSize(label6.getPreferredSize());
       label9.setPreferredSize(label6.getPreferredSize());
       label10.setPreferredSize(label6.getPreferredSize());
       label100.setPreferredSize(label6.getPreferredSize());
       
       frame.setContentPane(new JScrollPane(mainBox));
       //frame.setResizable(true);
       frame.setVisible(true);
       frame.pack();
       
       JFrame dialog = new JFrame();
       
       button.addActionListener(new ActionListener(){
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
       
       imageButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                
                SwingUtilities.invokeLater(new Runnable() {
               @Override
               public void run() {
//                
                     dialog.setSize(600,600);
                     dialog.setLocationRelativeTo(null);
                     dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                     dialog.setVisible(true);
                     dialog.setLayout(new BorderLayout(0,0));
                     dialog.add(new JScrollPane(imagePanel));
                     
               
                   
                }
            
        });
                
            }
        });
        
    }
}
