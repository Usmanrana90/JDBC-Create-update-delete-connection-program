package firstproject;
import java.sql.*;


public class ConnectionDemo {
    
     private static final String url="jdbc:mysql://localhost:3306/college";
     private static final String user="root";
     private static final String password="root";
    
    public static void main(String[]args) throws SQLException {
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= (Connection) DriverManager.getConnection(url,user,password);
            
            Statement s=con.createStatement();
            s.executeUpdate("create table aish(rollno int, name varchar(20), mobile bigint(10))");
            System.out.println("Create Table Aish Successfully");
             
             
        } 
        catch (ClassNotFoundException ex) 
        {
                    
            System.out.println("Table Not Create ");
        }
   }
    }


    
