/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.scrumsimulator.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nithi
 */
public class DatabaseConnection {
    Connection con;
    String url = "jdbc:mysql://sql9.freesqldatabase.com:3306/sql9657006";
    String username = "sql9657006";
    String password = "YhYJ89Krjh";
    public static void main(String[] args){
        DatabaseConnection db = new DatabaseConnection();
        try{
        ResultSet results = db.fetchUsers();
        while(results.next()){
                System.out.println("Username: " + results.getString(1) +
                        ", Password: " + results.getString(2) + 
                        ", UserType: " + results.getString(3) +
                        ", UserRole: " + results.getString(4)  );
            }
        }catch(Exception e){
            System.out.println(e);
        }
        
        try{
        ResultSet results = db.fetchUserStories();
        while(results.next()){
                System.out.println("StoryID: " + results.getInt(1) +
                        ", Status: " + results.getString(2) + 
                        ", AssignedTo: " + results.getString(3) +
                        ", Title: " + results.getString(4) +
                        ", Description: " + results.getString(2) + 
                        ", StoryPoints: " + results.getString(2) + 
                        ", Business Value: " + results.getString(2) + 
                        ", Comments: " + results.getString(2) );
            }
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    
    public ResultSet fetchUsers(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            Statement stat = con.createStatement();
            ResultSet results = stat.executeQuery("select * from UserInfo");
            //con.close();
            return results;
        } catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
    public ResultSet fetchUserStories(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            Statement stat = con.createStatement();
            ResultSet results = stat.executeQuery("select * from UserStories");
            //con.close();
            return results;
        } catch(Exception e){
            System.out.println(e);
        }
        return null;
    } 
}
