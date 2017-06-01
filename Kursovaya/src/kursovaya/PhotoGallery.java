/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kursovaya;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage; 
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Роман
 */
public class PhotoGallery implements ActionListener {
    
         private JFrame[] dialog;
         private  JLabel[] imageLabel;
         private  JPanel[] imagePanel;
         private ImageIcon[] icon;
         private JButton[] button;
         private String[] names;

    
 public void PhotoGallery(String stringPhoto, JPanel mainPanel) throws IOException{
        
       
            
//        JFrame frame = new JFrame("ETU8");
//        frame.setSize(800,800);
//        frame.setLocationRelativeTo(null);
//        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        
        File file = new File(stringPhoto);
        names = file.list();
        
        JPanel panel = new JPanel(new GridLayout( 0, 4, 5, 7 ));
        

        
        button = new JButton[names.length];
        dialog = new JFrame[names.length];
        imageLabel = new JLabel[names.length];
        imagePanel = new JPanel[names.length];
//      panelForScrollPane = new JPanel[names.length];
        icon = new ImageIcon[names.length];
//        scrollPane2 = new JScrollPane[names.length];
        
        BufferedImage[] originalImage = new BufferedImage[names.length];
        int width = 200;
        int height = 200; 
        Image[] image = new Image[names.length];
        BufferedImage[] changedImage = new BufferedImage[names.length];
        Graphics2D[] graphics2D = new Graphics2D[names.length]; 
        
         
            for(int i = 0; i < names.length; i++){
            
            originalImage[i] = ImageIO.read(new File(stringPhoto +"/" + names[i]));
            image[i] = originalImage[i].getScaledInstance(width, height, Image.SCALE_AREA_AVERAGING);
            changedImage[i] = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            graphics2D[i] = changedImage[i].createGraphics();
            graphics2D[i].drawImage(image[i], 0, 0, null);
            graphics2D[i].dispose();
            ImageIO.write(changedImage[i],"jpg", new File(stringPhoto+"/"+names[i]));
            
            button[i] = new JButton(new ImageIcon(stringPhoto +"/"+names[i]));
            button[i].setMaximumSize(new Dimension(100, 100));
            button[i].setOpaque(true);
            button[i].setBackground(Color.WHITE);
            button[i].setBorder(null);
            panel.add(button[i]);
            dialog[i] = new JFrame( names[i] );
            imageLabel[i] = new JLabel();
            imagePanel[i] = new JPanel();
            icon[i] = new ImageIcon(stringPhoto+"big/" + names[i]);
            imageLabel[i].setIcon(icon[i]);
           
             imageLabel[i].setMaximumSize(new Dimension(600, 250));
             
             imagePanel[i].setLayout(new FlowLayout(FlowLayout.CENTER));
             imagePanel[i].add(imageLabel[i]);
//             scrollPane2[i] = new JScrollPane(imagePanel[i]);
//             scrollPane2[i].setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//             scrollPane2[i].setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
//             panelForScrollPane[i].setLayout(new BorderLayout());
//             panelForScrollPane[i].add(scrollPane2[i], BorderLayout.CENTER);
             
             button[i].addActionListener((ActionListener) this);
            
             //dialog[i].removeAll();
             dialog[i].dispose();
            
            
        }
        
          JScrollPane scrollPane = new JScrollPane(panel);
          scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
          scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
          
         // mainPanel = new JPanel();
          mainPanel.setLayout(new BorderLayout());
        
          mainPanel.add(scrollPane,BorderLayout.CENTER);
          mainPanel.setOpaque(true);
          mainPanel.setBackground(Color.WHITE);
          
        
//         frame.add(mainPanel, BorderLayout.CENTER);
//         frame.pack();
//         
//         frame.setBackground(Color.WHITE);
//         frame.setVisible(true);
//         
         
     
    }
    
    
//    public static void main(String[] args){
//        
//         SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
////                
//                PhotoGallery phG = new PhotoGallery();
//                try {
//                    phG.PhotoGallery("nature");
//                }   catch (IOException ex) {
//                    Logger.getLogger(PhotoGallery.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        });
//        
//    }
 
    @Override
     public void actionPerformed(ActionEvent e) {
         Object source = e.getSource();   
         for(int i = 0; i < names.length;i++){
             if(source == button[i]){
                     dialog[i].setSize(800,800);
                     dialog[i].setLocationRelativeTo(null);
                     dialog[i].setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                     dialog[i].setVisible(true);
                     dialog[i].setLayout(new BorderLayout(0,0));
                     dialog[i].add(imagePanel[i]);
                     dialog[i].pack();
             }
                     
     }}
}

