package TeacherRegister;

import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException;  
import java.sql.Statement;  
   
public class CreateStudentTable {  
   
    public static void createNewTable() throws ClassNotFoundException {  
        // SQLite connection string  
        String url = "jdbc:sqlite:C://sqlite/SSSIT.db";  
          
        // SQL statement for creating a new table  
        String sql = "CREATE TABLE IF NOT EXISTS Marks (\n"  
                + " RollNo integer PRIMARY KEY,\n"  
                + " Name text NOT NULL,\n" 
                + " Marks integer\n"   
                + ");";  
          
        try{  
        	Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection(url);  
            Statement stmt = conn.createStatement();  
            stmt.execute(sql);  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    }  
   
    /** 
     * @param args the command line arguments 
     * @throws ClassNotFoundException 
     */  
    public static void main(String[] args) throws ClassNotFoundException {  
        createNewTable();  
    }  
   
}  
