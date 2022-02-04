package TeacherRegister;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Percentage {
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


public void select(int RollNo) throws ClassNotFoundException{  
    String sql = "SELECT * FROM Marks WHERE RollNo = ?";  
    double Percentage = 0; 
    try {  
        Connection conn = this.connect();  
        PreparedStatement pstmt  = conn.prepareStatement(sql);
        pstmt.setInt(1, RollNo);
        ResultSet rs = pstmt.executeQuery();  
          
        // loop through the result set  
        Percentage = rs.getDouble("Marks")/80.0 * 100;   
        System.out.println("Percentage of "+(rs.getString("Name"))+" is: "+Percentage);
    } catch (SQLException e) {  
        System.out.println(e.getMessage());  
    }  
}  

}
