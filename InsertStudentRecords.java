package TeacherRegister;

import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.PreparedStatement;  
import java.sql.SQLException;
import java.util.*;
 
public class InsertStudentRecords {  
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
   
  
    public void insert( int RollNo, String Name, double Marks) throws ClassNotFoundException {  
        String sql = "INSERT INTO Marks(RollNo, name, Marks) VALUES(?,?,?)";  
   
        try{
        	Class.forName("org.sqlite.JDBC");
            Connection conn = this.connect();  
            PreparedStatement pstmt = conn.prepareStatement(sql);  
            pstmt.setInt(1, RollNo);
            pstmt.setString(2, Name);  
            pstmt.setDouble(3, Marks);
            pstmt.executeUpdate();  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    }
    
    
    
   
  
   
}  
