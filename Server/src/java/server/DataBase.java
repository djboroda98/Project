/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;


/**
 *
 * @author Роман
 */
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DataBase {
  public static void main(String[] args) {
      
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
    try{
      Class.forName("com.mysql.jdbc.Driver");
      connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull",
           "root", "");
      statement = connection.createStatement();
      resultSet = statement.executeQuery("select * from student");
      while (resultSet.next()) {
        System.out.println("word id: " + resultSet.getLong(1) +
            " spelling: " + resultSet.getString(2) +
            " part of speech: " + resultSet.getString(3));
      }
    }catch(SQLException e){
      e.printStackTrace();
    }catch(ClassNotFoundException e){
      e.printStackTrace();
    }finally{
      try{resultSet.close();} catch(Exception e){}
      try{statement.close();} catch(Exception e){}
      try{connection.close();} catch(Exception e){}
   }
  }

}
