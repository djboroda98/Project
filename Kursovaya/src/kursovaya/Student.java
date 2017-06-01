
package kursovaya;

import java.text.Collator;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;


public class Student implements Comparable {
    
     private int id;
     private String firstName; 
     private String lastName;  
     private String patronymic;
     private Date dateOfBirth;
     private String sex;
     private String email;
     private String faculty;
     private int course;
     private int group; 
     
     
     public int getId(){
         return id;
        }
     public void setId(int id){
         this.id = id;
     }
     
     public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
     public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
     
     public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
     
     public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
     
    public String getSex(){
        return sex;
    }
    
    public void setSex(String sex){
        this.sex = sex;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getFaculty(){
        return faculty;
    }
    public void setFaculty(String faculty){
        this.faculty = faculty;
    }
    
    public int getCourse(){
        return course;
    }
    public void setCourse(int course){
        this.course = course;
    }
    
    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }
    
    
     @Override
    public String toString() {
        return id+". " + lastName + " " + firstName + " " + patronymic + ", "
                + DateFormat.getDateInstance(DateFormat.SHORT).format(dateOfBirth)
                + ", Пол: " + sex + ", E-mail: " + email + ", Факультет: " + faculty
                + ", Группа: " + group + ", Курс: " + course;
    }

     @Override
    public int compareTo(Object obj) {
        Collator c = Collator.getInstance(new Locale("ru"));
        c.setStrength(Collator.PRIMARY);
        return c.compare(this.toString(), obj.toString());
    }
    
}
