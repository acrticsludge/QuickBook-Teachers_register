package TeacherRegister;

import java.sql.DriverManager;  
import java.sql.Connection;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.sql.Statement;  
   
public class SelectStudentRecords {  
   
    private Connection connect() throws ClassNotFoundException {  
        // SQLite connection string  
        String url = "jdbc:sqlite:C://sqlite/SSSIT.db";  
        Connection conn = null;  
        try {  
        	Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(url);  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
        return conn;  
    }  
   
  
    public void selectAll() throws ClassNotFoundException{  
        String sql = "SELECT * FROM Marks";  
          
        try {  
            Connection conn = this.connect();  
            Statement stmt  = conn.createStatement();  
            ResultSet rs    = stmt.executeQuery(sql);  
              
            // loop through the result set  
            while (rs.next()) {  
                System.out.println(rs.getInt("RollNo") +  "\t" +   
                                   rs.getString("Name") + "\t" +  
                                   rs.getDouble("Marks"));  
            }  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    }  
      
     
    /** 
     * @param args the command line arguments 
     * @throws ClassNotFoundException 
     */  
  
   
}  
