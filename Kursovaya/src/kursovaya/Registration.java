/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kursovaya;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.awt.event.KeyEvent;
import javax.swing.JRadioButton;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import static kursovaya.Major.Major;
/**
 *
 * @author Роман
 */
public class Registration implements ActionListener {
    
    public static void Registration(){
    
        JFrame frame = new JFrame("Регистрация");
        
        frame.setSize(750,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Box box1 = Box.createHorizontalBox();
        JLabel label1 = new JLabel("Имя:");
        JTextField textField1 = new JTextField(25);
        box1.add(label1);
        box1.add(Box.createHorizontalStrut(10));
        box1.add(textField1);
        
        
        Box box2 = Box.createHorizontalBox();
        JLabel label2 = new JLabel("Фамилия:");
        JTextField textField2 = new JTextField(25);
        box2.add(label2);
        box2.add(Box.createHorizontalStrut(10));
        box2.add(textField2);
        
        
        Box box3 = Box.createHorizontalBox();
        JLabel label3 = new JLabel("Отчество:");
        JTextField textField3 = new JTextField(25);
        box3.add(label3);
        box3.add(Box.createHorizontalStrut(10));
        box3.add(textField3);
        
        Box box4 = Box.createHorizontalBox();
        JLabel label4 = new JLabel("E-mail:");
        JTextField textField4 = new JTextField(25);
        box4.add(label4);
        box4.add(Box.createHorizontalStrut(10));
        box4.add(textField4);
        
        
        Box box5 = Box.createHorizontalBox();
        JLabel label5 = new JLabel("Логин:");
        JTextField textField5 = new JTextField(25);
        box5.add(label5);
        box5.add(Box.createHorizontalStrut(10));
        box5.add(textField5);
        
        Box box6 = Box.createHorizontalBox();
        JLabel label6 = new JLabel("Пароль:");
        JPasswordField passwordField1 = new JPasswordField(25);
        box6.add(label6);
        box6.add(Box.createHorizontalStrut(10));
        box6.add(passwordField1);
        
        Box box7 = Box.createHorizontalBox();
        JLabel label7 = new JLabel("Повторить пароль:");
        JPasswordField passwordField2 = new JPasswordField(25);
        box7.add(label7);
        box7.add(Box.createHorizontalStrut(10));
        box7.add(passwordField2);
       
        
        JRadioButton radioButton1 = new JRadioButton("Мужской");
        //radioButton1.setMnemonic(KeyEvent.VK_B);
        radioButton1.setActionCommand("Мужской");
        radioButton1.setSelected(false);
        radioButton1.setAlignmentX(JComponent.RIGHT_ALIGNMENT);
        
        JRadioButton radioButton2 = new JRadioButton("Женский");
        //radioButton2.setMnemonic(KeyEvent.VK_B);
        radioButton2.setActionCommand("Женский");
        radioButton2.setSelected(false);
        radioButton2.setAlignmentX(JComponent.WHEN_FOCUSED);
        
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
       
//        radioButton1.addActionListener(this);
//        radioButton2.addActionListener(this);
        Box box8 = Box.createHorizontalBox();
        JLabel label8 = new JLabel("Пол:");
        box8.add(label8);
        box8.add(Box.createHorizontalStrut(100));
        box8.add(radioButton1);
        box8.add(Box.createHorizontalStrut(10));
        box8.add(radioButton2);
        box8.add(Box.createHorizontalStrut(750));
        
        String[] day = new String[31];
        int[] dayInt = new int[31];
        for(int i = 0; i < 31; i++){
           dayInt[i]=i+1;
           day[i]=Integer.toString(dayInt[i]);
        }
        
        String[] month = new String[]{"Январь","Февраль","Март", "Апрель","Май",
        "Июнь", "Июль", "Август", "Сентябрь", "Ноябрь", "Декабрь"};
        
        String[] year = new String[100];
        int[] yearInt = new int[100];
        for(int i = 0; i < 100; i++){
          yearInt[i]=2017-i;
          year[i]=Integer.toString(yearInt[i]);
        }
        
        JComboBox comboBox1 = new JComboBox(day);
        JComboBox comboBox2 = new JComboBox(month);
        JComboBox comboBox3 = new JComboBox(year);
        Box box9 = Box.createHorizontalBox();
        JLabel label9 = new JLabel("Дата рождения:");
        box9.add(label9);
        box9.add(Box.createHorizontalStrut(40));
        box9.add(comboBox1);
        box9.add(Box.createHorizontalStrut(10));
        box9.add(comboBox2);
        box9.add(Box.createHorizontalStrut(10));
        box9.add(comboBox3);
        box9.add(Box.createHorizontalStrut(750));
        
        Box box10 = Box.createHorizontalBox();
        JButton ok = new JButton("Зарегистрироваться");
        JButton cancel = new JButton("Отмена");
        box10.add(Box.createHorizontalGlue());
        box10.add(ok);
        box10.add(Box.createHorizontalStrut(12));
        box10.add(cancel);        
        
        Box mainBox = Box.createVerticalBox();
        mainBox.setBorder(new EmptyBorder(12,12,12,12));
        mainBox.add(box1);
        mainBox.add(Box.createVerticalStrut(12));
        mainBox.add(box2);
        mainBox.add(Box.createVerticalStrut(12));
        mainBox.add(box3);
        mainBox.add(Box.createVerticalStrut(12));
        mainBox.add(box8);
        mainBox.add(Box.createVerticalStrut(12));
        mainBox.add(box9);
        mainBox.add(Box.createVerticalStrut(12));
        mainBox.add(box4);
        mainBox.add(Box.createVerticalStrut(12));
        mainBox.add(box5);
        mainBox.add(Box.createVerticalStrut(12));
        mainBox.add(box6);
        mainBox.add(Box.createVerticalStrut(12));
        mainBox.add(box7);
        mainBox.add(Box.createVerticalStrut(12));
        mainBox.add(box10);
        
        label1.setPreferredSize(label7.getPreferredSize());
        label2.setPreferredSize(label7.getPreferredSize());
        label3.setPreferredSize(label7.getPreferredSize());
        label4.setPreferredSize(label7.getPreferredSize());
        label5.setPreferredSize(label7.getPreferredSize());
        label6.setPreferredSize(label7.getPreferredSize());
        label8.setPreferredSize(label7.getPreferredSize());
        
        frame.setContentPane(mainBox);
        //frame.pack();
        frame.setResizable(true);
        frame.setVisible(true);
        
        cancel.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                frame.setVisible(false);
                try {
                    Major();
                } catch (IOException ex) {
                    Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }

   
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

}