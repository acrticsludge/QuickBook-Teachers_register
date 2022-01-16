package TeacherRegister;

import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.PreparedStatement;  
import java.sql.SQLException;
import java.util.*;
   
public class UpdateRecord {  
   
    private Connection connect() {  
        // SQLite connection string  
        String url = "jdbc:sqlite:C://sqlite/SSSIT.db";  
        Connection conn = null;  
        try {  
            conn = DriverManager.getConnection(url);  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
        return conn;  
    }  
   
  
    public void update(int RollNo, double Marks) throws ClassNotFoundException {  
        String sql = "UPDATE Marks SET Marks = ? WHERE RollNo = ?";
        
        
        try{
        	Class.forName("org.sqlite.JDBC");
            Connection conn = this.connect();  
            PreparedStatement pstmt = conn.prepareStatement(sql);  
            pstmt.setDouble(1, Marks);
            pstmt.setInt(2, RollNo);
            pstmt.executeUpdate();  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    }  
   
  
   
}  