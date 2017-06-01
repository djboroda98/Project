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
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

/**
 *
 * @author Роман
 */
public class ChoosePhotoAlbum {
   
    public static void ChoosePhotoAlbum(){
        
        JFrame frame = new JFrame("ETU8");
        frame.setSize(850,450);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT);
        JPanel panel1 = new JPanel(new GridLayout( 0, 3, 0, 0 ));
         panel1.setAlignmentX(JComponent.LEFT_ALIGNMENT);
        JPanel fullPanel1 = new JPanel ();
        fullPanel1.setLayout(new BoxLayout(fullPanel1, BoxLayout.Y_AXIS));
        //fullPanel1.setAlignmentX(JComponent.LEFT_ALIGNMENT);
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        
        
         JButton[] button = new JButton[6];
//         
         
         Font font = new Font("Verdana", Font.PLAIN, 12);
         
            for (int i=0; i <button.length; i++) {
            int j=i+1;
            button[i] = new JButton("Папка " + j ,new ImageIcon("myimage/64px/folder.png"));
            
            button[i].setMaximumSize(new Dimension(100, 100));
            button[i].setFont(font);
            button[i].setHorizontalAlignment(JLabel.CENTER);
            button[i].setOpaque(true);
            button[i].setBackground(Color.WHITE);
           
            button[i].setHorizontalTextPosition(SwingConstants.CENTER);
            button[i].setVerticalTextPosition(SwingConstants.BOTTOM);
            panel1.add(button[i]);
           
        } 
          button[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                PhotoGallery phG = new PhotoGallery();
                try {
                    phG.PhotoGallery("myimage/1", panel2);
                    tabbedPane.removeAll();
                    tabbedPane.addTab("" , new ImageIcon("myimage/myimage/arrow-left.png"), new JPanel());
                    tabbedPane.addTab("Папка 1" ,new ImageIcon("myimage/myimage/folder.png"), panel2 );
                    tabbedPane.setSelectedIndex(1);
                    tabbedPane.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                    //int idx = ((JTabbedPane)e.getSource()).indexAtLocation(e.getX(), e.getY());
                    if(((JTabbedPane)e.getSource()).indexAtLocation(e.getX(), e.getY()) == 0){
                    tabbedPane.removeAll();
                    tabbedPane.addTab("Фотогалерея",new ImageIcon("myimage/myimage/image.png"), fullPanel1);
            }}
        });
                }   catch (IOException ex) {
                    Logger.getLogger(PhotoGallery.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
          button[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            PhotoGallery phG = new PhotoGallery();
                try {
                    phG.PhotoGallery("myimage/3", panel3);
                    tabbedPane.removeAll();
                    tabbedPane.addTab("" , new ImageIcon("myimage/myimage/arrow-left.png"), new JPanel());
                    tabbedPane.addTab("Папка 2" ,new ImageIcon("myimage/myimage/folder.png"), panel3 );
                    tabbedPane.setSelectedIndex(1);
                    tabbedPane.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                    if(((JTabbedPane)e.getSource()).indexAtLocation(e.getX(), e.getY()) == 0){
                    tabbedPane.removeAll();
                    tabbedPane.addTab("Фотогалерея",new ImageIcon("myimage/myimage/image.png"), fullPanel1);
            }}
        });
                }   catch (IOException ex) {
                    Logger.getLogger(PhotoGallery.class.getName()).log(Level.SEVERE, null, ex);
                }
                
        
            }
        });

            
           
          
           JButton buttonLeft= new JButton(new ImageIcon("myimage/64px/arrow-left.png"));
           buttonLeft.setMaximumSize(new Dimension(100, 100));
           buttonLeft.setOpaque(true);
           buttonLeft.setBackground(Color.WHITE);
           buttonLeft.setHorizontalAlignment(JLabel.LEFT);
           //buttonLeft.setAlignmentX(JComponent.LEFT_ALIGNMENT);
           //Создать панель для кнопки
           //fullPanel1.setAlignmentX(JComponent.LEFT_ALIGNMENT);
          buttonLeft.addActionListener(new ActionListener(){
            @Override
           public void actionPerformed(ActionEvent e){
                frame.setVisible(false);
                Hotel hotel = new Hotel();
                hotel.Hotel();
                
            }
        });
           
           
           fullPanel1.add(panel1);
           
           fullPanel1.add(buttonLeft);
           
           
           tabbedPane.addTab("Фотогалерея",new ImageIcon("myimage/myimage/image.png"), fullPanel1);
         
          
         
         frame.setContentPane(tabbedPane);
         //frame.add(mainPanel, BorderLayout.CENTER);
         //frame.pack();
         
         frame.setBackground(Color.WHITE);
         frame.setVisible(true);
         
         
         
        
    }
    
    
     public static void main(String[] args){
        
         SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
//                
                ChoosePhotoAlbum choosePhotoAlbum = new ChoosePhotoAlbum();
                choosePhotoAlbum.ChoosePhotoAlbum();
                   
                }
            
        });
        
    }
    



}

