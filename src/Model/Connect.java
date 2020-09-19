/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Connect {
    private final  String className = "com.mysql.jdbc.Driver";
    private final String url = "jdbc:mysql://127.0.0.1:3306/qlbh_babylion";
    private final String used = "root";
    private final String pass = "phuc2911.";
    
    private Connection cons;
    
    private void MyConnect() {
        try {
            Class.forName(className);
            cons =  DriverManager.getConnection(url,used, pass);
            System.out.println("Thanh cong !!");
            
        } catch (ClassNotFoundException e) {
            System.out.println("falses");
        }catch (SQLException e){
            System.out.println("falsesss");
            Logger.getLogger(Connect.class.getName()).log( Level.SEVERE , null , e) ;
        }
    
}
    public static void main(String[] args){
        Connect connect = new Connect();
        connect.MyConnect();
    }
}
