/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kursovaya;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JTabbedPane;

/**
 *
 * @author Роман
 */
public class Hotel {
    
    public static void Hotel(){
        
        JFrame frame = new JFrame("ETU8");
        frame.setSize(500,550);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT);
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        
        //ПАНЕЛЬ ГЛАВНОГО МЕНЮ
         panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
         JButton button1 = new JButton("Заселиться",new ImageIcon("64px/key.png"));
         JButton button2 = new JButton("Услуги Общежития",new ImageIcon("64px/magicwand.png"));
         JButton button3 = new JButton("Переехать", new ImageIcon("64px/ufo.png"));
         JButton button4 = new JButton("Фотогалерея",new ImageIcon("64px/image.png"));
         JButton button5 = new JButton("Информация об общежитии",new ImageIcon("64px/news.png"));
         JButton button6 = new JButton("Съехать",new ImageIcon("64px/shoeprints.png"));
         
         addMyJButton(button1);
         addMyJButton(button2);
         addMyJButton(button3);
         addMyJButton(button4);
         addMyJButton(button5);
         addMyJButton(button6);
         panel1.setBackground(Color.WHITE);
         
         panel1.add(button1);
         panel1.add(button2);
         panel1.add(button3);
         panel1.add(button4);
         panel1.add(button5);
         panel1.add(button6);
         
        //ПАНЕЛЬ ЛИЧНОГО КАБИНЕТА
        
         panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
         JButton button7 = new JButton("Посмотреть профиль",new ImageIcon("64px/contacts.png"));
         JButton button8 = new JButton("Редактировать профиль",new ImageIcon("64px/compose.png"));
         JButton button9 = new JButton("Мои счета", new ImageIcon("64px/creditcard.png"));
         JButton button10 = new JButton("Мои услуги",new ImageIcon("64px/colorwheel.png"));
         JButton button11= new JButton("Настройки",new ImageIcon("64px/tools.png"));
         JButton button12= new JButton("Выйти из аккаунта",new ImageIcon("64px/door.png"));
         addMyJButton(button7);
         addMyJButton(button8);
         addMyJButton(button9);
         addMyJButton(button10);
         addMyJButton(button11);
         addMyJButton(button12);
         panel3.setBackground(Color.WHITE);
         panel3.add(button7);
         panel3.add(button8);
         panel3.add(button9);
         panel3.add(button10);
         panel3.add(button11);
         panel3.add(button12);
         
         //ПАНЕЛЬ УСЛУГ ОБЩ.
         JPanel panel4 = new JPanel();
         
         panel4.setLayout(new BoxLayout(panel4, BoxLayout.Y_AXIS));
         JButton button13 = new JButton("Стирка",new ImageIcon("64px/water.png"));
         JButton button14 = new JButton("Спорт Зал",new ImageIcon("64px/trophy.png"));
         JButton button15= new JButton("Уборка комнаты", new ImageIcon("64px/recycle.png"));
         JButton button16 = new JButton("Библиотека",new ImageIcon("64px/bookshelf.png"));
         JButton button17= new JButton("Кино",new ImageIcon("64px/video.png"));
         JButton button18= new JButton(new ImageIcon("64px/arrow-left.png"));
         
         addMyJButton(button13);
         addMyJButton(button14);
         addMyJButton(button15);
         addMyJButton(button16);
         addMyJButton(button17);
         addMyJButton(button18);
         button18.setMaximumSize(new Dimension(100, 100));
         panel4.setBackground(Color.WHITE);
         
         panel4.add(button13);
         panel4.add(button14);
         panel4.add(button15);
         panel4.add(button16);
         panel4.add(button17);
         panel4.add(button18);
         //panel4.setVisible(false);
        
         //ПАНЕЛЬ НОВОСТЕЙ
         panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
         JButton buttonNews = new JButton(new ImageIcon("64px/play.png"));
         buttonNews.setBackground(Color.WHITE);
         panel2.add(buttonNews);
         panel2.setBackground(Color.WHITE);
         
         tabbedPane.addTab("Главное меню",new ImageIcon("myimage/power.png"), panel1);
         tabbedPane.addTab("Новости",new ImageIcon("myimage/globe.png"), panel2);
         tabbedPane.addTab("Личный кабинет",new ImageIcon("myimage/profle.png"), panel3);
        
        frame.setContentPane(tabbedPane);
        
        //ДЕЙСТВИЯ КНОПОК
        
        button1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                frame.setVisible(false);
                SwingUtilities.invokeLater(new Runnable() {
               @Override
               public void run() {
//                
               ChooseFloor cF = new ChooseFloor();
               cF.ChooseFloor();
               
                   
                }
            
        });
                
            }
        });
        
        button2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                tabbedPane.removeAll();
                tabbedPane.addTab("Услуги Общежития", new ImageIcon("myimage/magicwand.png"), panel4);
                tabbedPane.addTab("Новости",new ImageIcon("myimage/globe.png"), panel2);
                tabbedPane.addTab("Личный кабинет",new ImageIcon("myimage/profle.png"), panel3);
//                  tabbedPane.setTabComponentAt(0, panel4);
//                  tabbedPane.setIconAt(0, new ImageIcon("myimage/magicwand.png"));
//                  tabbedPane.setToolTipTextAt(0, "Услуги Общежития");
            }
        });
        
        button4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                frame.setVisible(false);
                SwingUtilities.invokeLater(new Runnable() {
               @Override
               public void run() {
//                
               ChoosePhotoAlbum choosePhotoAlbum = new ChoosePhotoAlbum();
               choosePhotoAlbum.ChoosePhotoAlbum();
                   
                }
            
        });
                
            }
        });
         
        button6.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Object[] options = { "Да", "Нет" };
                int n = JOptionPane.showOptionDialog(null, "Ты, действительно, хочешь съехать? \n Все твои данные и аккаунт будут удалены!","Подтверждение",JOptionPane.YES_NO_OPTION,
                                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                if(n == 0) {
                    frame.setVisible(false);
                    Major major = new Major();
                    try {
                        major.Major();
                    } catch (IOException ex) {
                        Logger.getLogger(Hotel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                
                }
            }
        });
         
        button7.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                frame.setVisible(false);
                SwingUtilities.invokeLater(new Runnable() {
               @Override
               public void run() {
//                
               Profile profile = new Profile();
                   try {
                       profile.Profile();
                   } catch (IOException ex) {
                       Logger.getLogger(Hotel.class.getName()).log(Level.SEVERE, null, ex);
                   }
               
                   
                }
            
        });
                
            }
        });
        
        button12.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Object[] options = { "Да", "Нет" };
                int n = JOptionPane.showOptionDialog(null, "Ты, действительно, хочешь выйти из аккаунта?","Подтверждение",JOptionPane.YES_NO_OPTION,
                                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                if(n == 0) {
                    frame.setVisible(false);
                    Major major = new Major();
                    try {
                        major.Major();
                    } catch (IOException ex) {
                        Logger.getLogger(Hotel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                
                }
            }
        });
        
        button13.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                frame.setVisible(false);
                SwingUtilities.invokeLater(new Runnable() {
               @Override
               public void run() {
//                
               Wash wash = new Wash();
               wash.Wash();
               
                   
                }
            
        });
                
            }
        });
        
        button14.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                frame.setVisible(false);
                SwingUtilities.invokeLater(new Runnable() {
               @Override
               public void run() {
//                
               Gym gym = new Gym();
               gym.Gym();
               
                   
                }
            
        });
                
            }
        });
         
        button18.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                tabbedPane.removeAll();
                tabbedPane.addTab("Главное меню",new ImageIcon("myimage/power.png"), panel1);
                tabbedPane.addTab("Новости",new ImageIcon("myimage/globe.png"), panel2);
                tabbedPane.addTab("Личный кабинет",new ImageIcon("myimage/profle.png"), panel3);
//                  
            }
        });
        
        buttonNews.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                frame.setVisible(false);
                SwingUtilities.invokeLater(new Runnable() {
               @Override
               public void run() {
//                
               News news = new News();
               news.News();
               
                   
                }
            
        });
                
            }
        });
        
        
    }
        
    
    
    
    
    public static void main(String[] args) {
        
        //Major();
    SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
//                Registration reg = new Registration();
//                reg.Registration();
                Hotel hotel = new Hotel();
              
                  hotel.Hotel();
            }
        });

        
          }

    public static  void addMyJButton(JButton button){

         Font font = new Font("Verdana", Font.PLAIN, 20);
         button.setMaximumSize(new Dimension(500, 100));
         button.setFont(font);
         button.setHorizontalAlignment(JLabel.LEFT);
         button.setOpaque(true);
         button.setBackground(Color.WHITE);
         button.setForeground(Color.DARK_GRAY);
}


}



 