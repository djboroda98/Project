package kursovaya;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;


public class Kursovaya {
    public static void main(String[] args) {
        
        //Major();
    SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
//                Registration reg = new Registration();
//                reg.Registration();
                Major major = new Major();
              
                try {
                    major.Major();
                } catch (IOException ex) {
                    Logger.getLogger(Kursovaya.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        
          }
    }
    

