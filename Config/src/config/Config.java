/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

/**
 *
 * @author maddi pc
 */

/// database jadi satu datamahasiswa sama kasir

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
public class Config {
    private static Connection mysqlconfig;
    public static Connection configDB() throws SQLException{
    try {
       String url="jdbc:mysql://localhost:3306/mahasiswa"; //url database
       String user="root"; // host db
       String pass=""; // password DB
       DriverManager.registerDriver(new com.mysql.jdbc.Driver());
       mysqlconfig=DriverManager.getConnection(url, user,pass); 
       System.out.println("koneksi berhasil");
        } catch(Exception e) {
        System.err.println("konekai gagal " + e.getMessage());
        }
    return mysqlconfig;
    }  


}
   

