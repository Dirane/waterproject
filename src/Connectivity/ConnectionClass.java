/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connectivity;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author dirane
 */
public class ConnectionClass {
    public Connection connection;
    public Connection getConnection(){
        String dbName="waterprojectdb";
        String dbUser="root";
        String password="";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/"+dbName,dbUser,password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
