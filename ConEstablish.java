

package firstproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class ConEstablish {
    private static final String url="jdbc:mysql://localhost:3306/college";
    private static final String user="root";
    private static final String password="root";
    
    public static void main(String[]args) throws SQLException, ClassNotFoundException{
        try{
      Class.forName("com.mysql.jdbc.Driver");
      Connection con= (Connection) DriverManager.getConnection(url,user,password);
    
      
      Statement s=con.createStatement();
      s.executeUpdate("insert into suha values('101','usman','9898989898')");
     
     
         System.out.println("data insert  Succeesfully");
        }
        catch(Exception e)
        {
        
         System.out.println("Not create Table ");
        
        }
     }
    
    
    
    }
    
