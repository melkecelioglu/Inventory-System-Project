/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author melikekecelioglu
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author melikekecelioglu
 */
//instead of everytime using con=DriverManager.... 
//ı created a class and replace the connect method every jframe's constructer
//to connect database
public class DBConnection {

    Connection con = null;

    public static Connection connect() {

        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/newInventory?", "root", "yumurta1");
            // JOptionPane.showMessageDialog(null, "Connection success");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection failed");

        }
        return con;
    }

}
