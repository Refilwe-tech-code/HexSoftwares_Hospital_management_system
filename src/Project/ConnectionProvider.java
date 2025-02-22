/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;


/**
 *
 * @author Refilwe Potele
 */
public class ConnectionProvider {
    public static Connection getcon()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","P@ssword@2003");
            return conn;
             }
               catch(Exception e)
               {
                   return null;
               }
    }
    
}
