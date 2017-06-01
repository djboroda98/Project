
package kursovaya;

import java.text.Collator;
import java.util.Locale;


public class Account {
    
    private int id;
    private String login;
    private String password;
    
    public int getId(){
         return id;
        }
     public void setId(int id){
         this.id = id;
     }
    
    public String getLogin(){
        return login;
    }
    
   public void setLogin (String login){
       this.login = login;
   }
   
   public String getPassword(){
       return password;
   }
   
   public void setPassword(String password){
       this.password = password;
   }
   
    @Override
   public String toString(){
       return "Логин: "+ login + ", Пароль: " + password;
   }
   
   public int compareTo(Object obj) {
        Collator c = Collator.getInstance(new Locale("ru"));
        c.setStrength(Collator.PRIMARY);
        return c.compare(this.toString(), obj.toString());
    }
}
