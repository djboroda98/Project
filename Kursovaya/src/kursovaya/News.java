
package kursovaya;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

/**
 *
 * @author Роман
 */
public class News {
    private  JEditorPane  editor ;
    private  JTextField   url    ;
    
    
    public  void News(){
        JFrame frame = new JFrame("ETU8");
        frame.setSize(550, 550);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        url = new JTextField("http://www.eltech.ru/", 35);
        JTextField   url2 = new JTextField(url.getText(), 35);
        url.addActionListener(new URLAction());
        
        try {
            // Создание редактора
         editor = new JEditorPane(url.getText());
        } catch (IOException ex) {
           //JOptionPane.showMessageDialog(this, unavailable);
        }
        editor.setContentType("text/html");
        editor.setEditable(false);
        // Поддержка ссылок
        editor.addHyperlinkListener(new LinkListener());
        editor.setBackground(Color.WHITE);
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        Box box = Box.createVerticalBox();
        panel.add(editor);
        panel.setBackground(Color.WHITE);
        JButton  button = new JButton(new ImageIcon("64px/arrow-left.png"));
        JButton  button2 = new JButton(new ImageIcon("64px/x.png"));
        button.setBackground(Color.WHITE);
        button2.setBackground(Color.WHITE);
        //panel2.setAlignmentX(JComponent.LEFT_ALIGNMENT);
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel2.add(button);
        panel2.add(button2);
        panel2.setBackground(Color.WHITE);
        mainPanel.add(panel2, BorderLayout.NORTH);
        mainPanel.add(panel);
        frame.setContentPane(new JScrollPane(mainPanel));
        //frame.pack();
        frame.setVisible(true);
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                
                panel.setVisible(false);
                panel.removeAll();
                editor.removeAll();
                try {
                    editor.setPage(url2.getText());
                } catch (IOException ex) {
                    Logger.getLogger(News.class.getName()).log(Level.SEVERE, null, ex);
                }
                panel.add(editor);
                panel.setVisible(true);
//
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
    
    class URLAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Переход по адресу
            String newAddress = url.getText();
            try {
                editor.setPage(newAddress);
            } 
            catch (IOException ex) {
                //JOptionPane.showMessageDialog(null, unavailable);
            }
        }
    }
    class LinkListener implements HyperlinkListener {
        @Override
        public void hyperlinkUpdate(HyperlinkEvent he) {
            // Проверка типа события
            if ( he.getEventType() != HyperlinkEvent.EventType.ACTIVATED) 
                return;
            // Переходим по адресу
            try {
                editor.setPage(he.getURL());
            } catch (IOException e) {
                //JOptionPane.showMessageDialog(News.this, unavailable);
            }
        }
    }
  
      public static void main(String[] args) {
        
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
//               
                News news = new News();
               news.News();
            }
        });
        
      }
     
     
}

