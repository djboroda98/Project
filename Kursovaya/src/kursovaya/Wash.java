/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kursovaya;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Роман
 */
public class Wash {
   
    public void Wash(){
        JFrame frame = new JFrame("ETU8");
        frame.setSize(700,550);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font font = new Font("Verdana", Font.PLAIN, 14);
        
        JLabel label1 = new JLabel("<html><p align='left'>Стирка</p></html>",
                new ImageIcon("myimage/stiralnaja-mashina.gif"), SwingConstants.RIGHT); 
        
        label1.setFont(new Font("Arial", Font.PLAIN, 35));
        label1.setForeground(Color.ORANGE);
        
        JLabel label2 = new JLabel("<html><p align='left'> Стирка(порошок): 80 рублей <br>"
                + "Стирка(порошок+кондиционер): 120 рублей <br> Стирка + Сушка: 200 рублей <br>"
                + "Стирка + Сушка(с кондиционером): 230 рублей</p></html>");
        label2.setFont(font);
        JLabel label3 = new JLabel("<html><p align='left'>Понедельник: с 10:00 - 21:00<br> " +
                "Среда: с 10:00 - 21:00 <br>" + 
                "Суббота: с 11:00 - 21:00 <br>"+ "Воскресенье: с 11:00 - 21:00 <br></p></html> ");
        
        label3.setFont(font);
        JButton button1 = new JButton("<html>Сейчас<br>свободно?</html>");
        JButton button2 = new JButton("Закрыть");
        
        
        
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel mainPanel = new JPanel();
        
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel1.add(label1);
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel2.setBorder(new TitledBorder("Режим Работы: "));
        panel2.add(label3);
        panel3.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel3.setBorder(new TitledBorder("Расценки: "));
        panel3.add(label2);
        panel4.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel4.add(button1);
        panel4.add(new JPanel());
        panel4.add(button2);
        
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(panel1);
        mainPanel.add(panel2);
        mainPanel.add(panel3);
        mainPanel.add(panel4);
        
        frame.setContentPane(new JScrollPane(mainPanel));
        frame.setVisible(true);
        
       
            button1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                SwingUtilities.invokeLater(new Runnable() {
               @Override
               public void run() {
               
               
               if(Math.random()> Math.random()){
                   JOptionPane.showMessageDialog(null, "Приходите, сейчас свободно",null,0,
                       new ImageIcon("myimage/running.png"));
               }
               
               else
               JOptionPane.showMessageDialog(null, "Извините, но вам придется подождать",null,0,
                      new ImageIcon("myimage/clock.png") );
                   
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
