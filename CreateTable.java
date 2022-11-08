

package firstproject;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.*;
import java.util.Scanner;


public class CreateTable {
    private static final String url="jdbc:mysql://localhost:3306/college";
    private static final String user="root";
    private static final String password="root";
    
    public static void main(String[]args) throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=(Connection) DriverManager.getConnection(url, user, password);
            Statement st=(Statement) con.createStatement();
            String sql_query="create table Sales(eno int(10),ename varchar(20),esal int(10),eaddr varchar(10))";
            st.executeUpdate(sql_query);
          
           
            System.out.println("Table Created  Successfully");
            
            con.close();
            
            
            
        } catch (ClassNotFoundException ex) {
           
            
            
        }
       
        
    
    
    
    }
    
}
