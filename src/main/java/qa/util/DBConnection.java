package qa.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

class DBConnection {
  public static void main(String[] args) throws ClassNotFoundException  {
	  
	  getConnection();
  }
    
  
  
  
  public static Connection getConnection() throws ClassNotFoundException {
	  
	  Connection con = null;

	    String url = "jdbc:mysql://localhost:3306/ecomm";
	    String username = "root";
	    String password = "";

	    try {
	      Class.forName("com.mysql.jdbc.Driver");
	      con = DriverManager.getConnection(url, username, password);

	      System.out.println("Connected!");

	    } catch (SQLException ex) {
	        throw new Error("Error ", ex);
	    }  
	      
	      return con;
	  
  }
  
  
  
}
  
