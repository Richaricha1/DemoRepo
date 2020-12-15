package qa.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	
	public static void main (String a[])
	{
		//getCategoryCount();
		//getProductCount();
		//getLaptopCount();
		//getDesktopPcCount();
		//getTabletsCount();
		getPhoneCount();
	}
	
	
	public static int getCategoryCount()
	{
		int count = 0;
		
		
			   Connection conn = null;
			   Statement stmt = null;
			   try{
			      
				  conn = DBConnection.getConnection();
			      stmt = conn.createStatement();

			      String sql = "SELECT id, name FROM Category";
			      ResultSet rs = stmt.executeQuery(sql);

			      while(rs.next()){
			    	  count ++;
			         //Retrieve by column name
			         String id = rs.getString("id");
			         String name = rs.getString("name");

			         //Display values
			         System.out.print("ID: " + id);
			         System.out.print(", Age: " + name);
			      }
			      rs.close();
			   }catch(SQLException se){
			      se.printStackTrace();
			   }catch(Exception e){
			      e.printStackTrace();
			   }finally{
			      try{
			         if(stmt!=null)
			            conn.close();
			      }catch(SQLException se){
			      }
			      try{
			         if(conn!=null)
			            conn.close();
			      }catch(SQLException se){
			         se.printStackTrace();
			      }//end finally try
			   }//end try
			   System.out.println("Goodbye!");
		
		System.out.println("category items="+count);
		return count;
	}
	//
	
	public static int getProductCount()
	{
		int count = 0;
		
		
			   Connection conn = null;
			   Statement stmt = null;
			   try{
			      
				  conn = DBConnection.getConnection();
			      stmt = conn.createStatement();

			      String sql = "SELECT id, name FROM Products";
			      ResultSet rs = stmt.executeQuery(sql);

			      while(rs.next()){
			    	  count ++;
			         //Retrieve by column name
			         String id = rs.getString("id");
			         String name = rs.getString("name");

			         //Display values
			         System.out.print("ID: " + id);
			         System.out.print(", Age: " + name);
			      }
			      rs.close();
			   }catch(SQLException se){
			      se.printStackTrace();
			   }catch(Exception e){
			      e.printStackTrace();
			   }finally{
			      try{
			         if(stmt!=null)
			            conn.close();
			      }catch(SQLException se){
			      }
			      try{
			         if(conn!=null)
			            conn.close();
			      }catch(SQLException se){
			         se.printStackTrace();
			      }//end finally try
			   }//end try
			   System.out.println("Goodbye!");
		
		System.out.println("product items="+count);
		return count;
	}
	//

	public static int getLaptopCount()
	{
		int count = 0;
		
		
			   Connection conn = null;
			   Statement stmt = null;
			   try{
			      
				  conn = DBConnection.getConnection();
			      stmt = conn.createStatement();

			      String sql = "SELECT * FROM products WHERE category_id = 1";
			      ResultSet rs = stmt.executeQuery(sql);

			      while(rs.next()){
			    	  count ++;
			         //Retrieve by column name
			         String id = rs.getString("category_id");
			         String name = rs.getString("name");

			         //Display values
			         System.out.print("ID: " + id);
			         System.out.print(", Age: " + name);
			      }
			      rs.close();
			   }catch(SQLException se){
			      se.printStackTrace();
			   }catch(Exception e){
			      e.printStackTrace();
			   }finally{
			      try{
			         if(stmt!=null)
			            conn.close();
			      }catch(SQLException se){
			      }
			      try{
			         if(conn!=null)
			            conn.close();
			      }catch(SQLException se){
			         se.printStackTrace();
			      }//end finally try
			   }//end try
			   System.out.println("Goodbye!");
		
		System.out.println("laptop items="+count);
		return count;
	}
	
	
	public static int getDesktopPcCount()
	{
		int count = 0;
		
		
			   Connection conn = null;
			   Statement stmt = null;
			   try{
			      
				  conn = DBConnection.getConnection();
			      stmt = conn.createStatement();

			      String sql = "SELECT * FROM products WHERE category_id = 2";
			      ResultSet rs = stmt.executeQuery(sql);

			      while(rs.next()){
			    	  count ++;
			         //Retrieve by column name
			         String id = rs.getString("category_id");
			         String name = rs.getString("name");

			         //Display values
			         System.out.print("ID: " + id);
			         System.out.print(", Age: " + name);
			      }
			      rs.close();
			   }catch(SQLException se){
			      se.printStackTrace();
			   }catch(Exception e){
			      e.printStackTrace();
			   }finally{
			      try{
			         if(stmt!=null)
			            conn.close();
			      }catch(SQLException se){
			      }
			      try{
			         if(conn!=null)
			            conn.close();
			      }catch(SQLException se){
			         se.printStackTrace();
			      }//end finally try
			   }//end try
			   System.out.println("Goodbye!");
		
		System.out.println("Desktop items="+count);
		return count;
		
	}
		

		public static int getTabletsCount()
		{
			int count = 0;
			
			
				   Connection conn = null;
				   Statement stmt = null;
				   try{
				      
					  conn = DBConnection.getConnection();
				      stmt = conn.createStatement();

				      String sql = "SELECT * FROM products WHERE category_id = 3";
				      ResultSet rs = stmt.executeQuery(sql);

				      while(rs.next()){
				    	  count ++;
				         //Retrieve by column name
				         String id = rs.getString("category_id");
				         String name = rs.getString("name");

				         //Display values
				         System.out.print("ID: " + id);
				         System.out.print(", Age: " + name);
				      }
				      rs.close();
				   }catch(SQLException se){
				      se.printStackTrace();
				   }catch(Exception e){
				      e.printStackTrace();
				   }finally{
				      try{
				         if(stmt!=null)
				            conn.close();
				      }catch(SQLException se){
				      }
				      try{
				         if(conn!=null)
				            conn.close();
				      }catch(SQLException se){
				         se.printStackTrace();
				      }//end finally try
				   }//end try
				   System.out.println("Goodbye!");
			
			System.out.println("Tablets items="+count);
			return count;
	}
		
		
		
		public static int getPhoneCount()
		{
			int count = 0;
			
			
				   Connection conn = null;
				   Statement stmt = null;
				   try{
				      
					  conn = DBConnection.getConnection();
				      stmt = conn.createStatement();

				      String sql = "SELECT * FROM products WHERE category_id = 4";
				      ResultSet rs = stmt.executeQuery(sql);

				      while(rs.next()){
				    	  count ++;
				         //Retrieve by column name
				         String id = rs.getString("category_id");
				         String name = rs.getString("name");

				         //Display values
				         System.out.print("ID: " + id);
				         System.out.print(", Age: " + name);
				      }
				      rs.close();
				   }catch(SQLException se){
				      se.printStackTrace();
				   }catch(Exception e){
				      e.printStackTrace();
				   }finally{
				      try{
				         if(stmt!=null)
				            conn.close();
				      }catch(SQLException se){
				      }
				      try{
				         if(conn!=null)
				            conn.close();
				      }catch(SQLException se){
				         se.printStackTrace();
				      }//end finally try
				   }//end try
				   System.out.println("Goodbye!");
			
			System.out.println("Pnone items="+count);
			return count;
	}

}//end main class
