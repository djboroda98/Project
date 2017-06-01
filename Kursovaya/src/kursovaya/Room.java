/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kursovaya;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;
import javax.swing.border.TitledBorder;
/**
 *
 * @author Роман
 */
public class Room {
    
    JToggleButton toggleButton;
    public void Room(JPanel mainPanel){
       
       //mainPanel = new JPanel();
       JPanel panel1 = new JPanel();
       JPanel panel2 = new JPanel();
       toggleButton = new JToggleButton("Оставить заявку", 
               new ImageIcon("myimage/64px/flag.png"),false);
       
       JLabel label1 = new JLabel("Площадь (м^2): ");
       JLabel label1A = new JLabel("< >");
       JLabel label2 = new JLabel("Количество мест: " );
       JLabel label2A = new JLabel("< >");
       JLabel label3 = new JLabel("Цена (руб./мес.): ");
       JLabel label3A = new JLabel("< >");
       
        panel1.setLayout(new GridLayout(0,2));
        panel1.setBorder(new TitledBorder("Информация о комнате: "));
        panel1.add(label1);
        panel1.add(label1A);
        panel1.add(label2);
        panel1.add(label2A);
        panel1.add(label3);
        panel1.add(label3A);
        
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel2.add(toggleButton);
        
        
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(panel1);
        mainPanel.add(panel2);
        
//        toggleButton.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e){
//               
//                SwingUtilities.invokeLater(new Runnable() {
//               @Override
//               public void run() {
////                
//               if (toggleButton.isEnabled()){
//                   
//               }
//               
//                   
//                }
//            
//        });
//                
//            }
//        });
        
   }
}
