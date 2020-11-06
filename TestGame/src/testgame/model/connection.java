/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgame.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Andrea Rahmadanisya
 */
public class connection {
     private Connection conn = null;
    private Statement stmt = null;
    private ResultSet  rs = null;
    
    public connection(){
        
    }
            
    
    public void connect(){
        try{
            String ur1 = "jdbc:mysql://localhost/2048";
            String user = "root";
            String pass = "";
            conn = DriverManager.getConnection(ur1,user,pass);
            stmt = conn.createStatement();    
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public void insertUser(String nama){
        try{
            String ur1 = "jdbc:mysql://localhost/2048";
            String user = "root";
            String pass = "";
            conn = DriverManager.getConnection(ur1,user,pass);
            stmt = conn.createStatement();
            String sql = "insert into user values ('"+nama+"','"+0+"');";
            stmt.executeUpdate(sql);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public void insertScore(int score, String username) {
        try{
            String ur1 = "jdbc:mysql://localhost/2048";
            String user = "root";
            String pass = "";
            conn = DriverManager.getConnection(ur1,user,pass);
            stmt = conn.createStatement();
            String sql = "update user set score = '"+score+"' where nama = '"+username+"';";
            stmt.executeUpdate(sql);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public String selectnama(String nama){
        connect();
        String name="";
         try{
            String sql = "select nama from user where nama = '"+nama+"';";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                name = rs.getString("nama");
                System.out.println(name);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return name;
    }
    
    public int selectScore(String nama) {
        int score = 0;
        try{
            String ur1 = "jdbc:mysql://localhost/2048";
            String user = "root";
            String pass = "";
            conn = DriverManager.getConnection(ur1,user,pass);
            stmt = conn.createStatement();
            String sql = "select score from user where nama = '"+nama+"';";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                score = rs.getInt("score");
                
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
         return score;
    }
}
