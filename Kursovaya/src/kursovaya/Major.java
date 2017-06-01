/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kursovaya;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
/**
 *
 * @author Роман
 */
public  class Major  {
    
    public static void Major() throws IOException{
        JFrame frame = new JFrame("Приложение");
        
        frame.setSize(700,650);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        JButton jButton1 = new JButton("Вход",new ImageIcon("myimage/64px/loading.png"));
        JButton jButton2 = new JButton("Регистрация",new ImageIcon("myimage/64px/keyboard.png"));
 
        JPanel jPanel = new JPanel();
        
        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
         Font font = new Font("Verdana", Font.PLAIN, 20);
         jButton1.setMaximumSize(new Dimension(600, 100));
         jButton2.setMaximumSize(new Dimension(600, 100));
         jButton1.setFont(font);
         jButton2.setFont(font);
         
         jButton1.setAlignmentX(JComponent.CENTER_ALIGNMENT);
         jButton2.setAlignmentX(JComponent.CENTER_ALIGNMENT);
         jButton1.setOpaque(true);
         jButton2.setOpaque(true);
         jButton1.setBackground(Color.WHITE);
         jButton2.setBackground(Color.WHITE);
         jButton1.setForeground(Color.DARK_GRAY);
         jButton2.setForeground(Color.DARK_GRAY);
       
        jPanel.add(jButton1);
        jPanel.add(jButton2);
        jPanel.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        
            BufferedImage originalImage = ImageIO.read(new File("myimage/myimage/hotel.jpg" ));
            int width = 650;
            int height = 400;
            Image image= originalImage.getScaledInstance(width, height, Image.SCALE_AREA_AVERAGING);
            BufferedImage changedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            Graphics2D graphics2D = changedImage.createGraphics();
            graphics2D.drawImage(image, 0, 0, null);
            graphics2D.dispose();
            ImageIO.write(changedImage,"png", new File("myimage/myimage/hotel.png"));
            JLabel imageLabel = new JLabel();
            ImageIcon icon = new ImageIcon("myimage/myimage/hotel.png");
        
        
  
        imageLabel.setIcon(icon);
        imageLabel.setMaximumSize(new Dimension(600, 400));
        imageLabel.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        
        Font font2 = new Font("Vijaya", Font.PLAIN, 72);
        
        JLabel label = new JLabel("Welcome to home!", new ImageIcon("myimage/64px/rainbow.png"), SwingConstants.RIGHT);
        
        label.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        label.setFont(font2);
        label.setForeground(Color.LIGHT_GRAY);
        
           
          JPanel jPanel2 = new JPanel();
          jPanel2.setMaximumSize(new Dimension(0, 12));
          
          JPanel mainPanel = new JPanel();
          mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
          
          mainPanel.add(label);
          mainPanel.add(imageLabel);
          mainPanel.add(jPanel2);
          mainPanel.add(jPanel);
          JScrollPane scrollPane = new JScrollPane(mainPanel);
          scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
          scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
          JPanel jPanel3 = new JPanel();
          jPanel3.setLayout(new BorderLayout());
          jPanel3.add(scrollPane,BorderLayout.CENTER);
        
       
        frame.setContentPane(jPanel3);
        
        frame.pack();
        
        jButton1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                frame.setVisible(false);
                Enter enter = new Enter();
                enter.Enter();
                
            }
        });
        
         jButton2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                frame.setVisible(false);
                Registration reg = new Registration();
                reg.Registration();
            }
        });
        //frame.setResizable(false);
        frame.setVisible(true);  
        
                
    }
    
    public static void main(String[] args) {
        
    SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() { 
                Major major = new Major();
              
                try {
                    major.Major();
                } catch (IOException ex) {
                    Logger.getLogger(Major.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        
          }
}
