

package firstproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;




public class DeleteTable {
    private static final String url="jdbc:mysql://localhost:3306/college";
    private static final String user="root";
    private static final String password="root";
    
    
    public static void main(String[]args) throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con=DriverManager.getConnection(url, user, password);
            Statement st=con.createStatement();
            String sql_query="drop table aish";
            st.executeUpdate(sql_query);
            System.out.println("Table Delete Successfully");
            con.close();
            
            
        } catch (ClassNotFoundException ex) {
           
        }
    
    
    
    
    
    
    }
    
}
