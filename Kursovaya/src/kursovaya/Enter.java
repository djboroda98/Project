
package kursovaya;

import javax.swing.JFrame;
import javax.swing.Box;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import static kursovaya.Major.Major;



/**
 *
 * @author Роман
 */
public class Enter extends JFrame {
    public static void Enter(){
        
        JFrame frame = new JFrame("Вход в систему");
        
        frame.setSize(320,150);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

 

Box box1 = Box.createHorizontalBox();
JLabel loginLabel = new JLabel("Логин:");
JTextField loginField = new JTextField(25);
box1.add(loginLabel);
box1.add(Box.createHorizontalStrut(10));
box1.add(loginField);
// Настраиваем вторую горизонтальную панель (для ввода пароля)
Box box2 = Box.createHorizontalBox();
JLabel passwordLabel = new JLabel("Пароль:");
JPasswordField passwordField = new JPasswordField(25);
box2.add(passwordLabel);
box2.add(Box.createHorizontalStrut(10));
box2.add(passwordField);
// Настраиваем третью горизонтальную панель (с кнопками)
Box box3 = Box.createHorizontalBox();
JButton ok = new JButton("OK");
JButton cancel = new JButton("Отмена");
box3.add(Box.createHorizontalGlue());
box3.add(ok);
box3.add(Box.createHorizontalStrut(12));
box3.add(cancel);
// Уточняем размеры компонентов
loginLabel.setPreferredSize(passwordLabel.getPreferredSize());
// Размещаем три горизонтальные панели на одной вертикальной
Box mainBox = Box.createVerticalBox();
mainBox.setBorder(new EmptyBorder(12,12,12,12));
mainBox.add(box1);
mainBox.add(Box.createVerticalStrut(12));
mainBox.add(box2);
mainBox.add(Box.createVerticalStrut(17));
mainBox.add(box3);

frame.setContentPane(mainBox);
//frame.pack();
frame.setResizable(false);

 cancel.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                frame.setVisible(false);
                try {
                    Major();
                } catch (IOException ex) {
                    Logger.getLogger(Enter.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });

// ok.addActionListener(new ActionListener(){
//            @Override
//           public void actionPerformed(ActionEvent e){
//                frame.setVisible(false);
//                //Проверка логина и пароля????
//                
//            }
//        });
 
ok.addMouseListener(new MouseAdapter() {
 
@Override
public void mouseClicked(MouseEvent event) {
String password = new String(passwordField.getPassword());   
if ((loginField.getText().equals("root"))&&(password.equals("root"))){
//JOptionPane.showMessageDialog(null, "Вход выполнен");
frame.setVisible(false);
Hotel hotel = new Hotel();
hotel.Hotel();
}
else JOptionPane.showMessageDialog(null, "Вход НЕ выполнен");
}
 
});


    }
}
