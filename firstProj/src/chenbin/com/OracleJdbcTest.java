package chenbin.com;
import java.sql.*;



public class OracleJdbcTest {
	   // JDBC driver name and database URL
	   static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";  
	   static final String DB_URL = "jdbc:oracle:thin:@192.168.0.178:1521:orcl";
	   //  Database credentials
	   static final String USER = "cmb";
	   static final String PASS = "cmb";

	   public static void main(String[] args) {
	   Connection conn = null;
	   Statement stmt = null;
	   try{
	      //STEP 2: Register JDBC driver
	     Class.forName("oracle.jdbc.driver.OracleDriver");
	      //STEP 3: Open a connection
	      //System.out.println("Connecting to database...");
	      conn = DriverManager.getConnection(DB_URL,USER,PASS);
	      //STEP 4: Execute a query
	      System.out.println("Creating statement...");
	      stmt = conn.createStatement();
	      String sql;
	      sql = "SELECT * FROM lu_year";
	      ResultSet rs = stmt.executeQuery(sql);
	      //STEP 5: Extract data from result set
	      while(rs.next()){
	         //Retrieve by column name
	    	 // System.out.println("Creating statement2...");
	    	  String yer_seq = rs.getString("YER_seq");
	    	  String yer_des = rs.getString("YER_des");
	    	  System.out.println(yer_seq+" "+yer_des);
	        /* int id  = rs.getInt("id");
	         int age = rs.getInt("age");
	         String first = rs.getString("first");
	         String last = rs.getString("last");
	         //Display values
	         System.out.print("ID: " + id);
	         System.out.print(", Age: " + age);
	         System.out.print(", First: " + first);
	         System.out.println(", Last: " + last);
	         */
	      }
	      //STEP 6: Clean-up environment
	      rs.close();
	      stmt.close();
	      conn.close();
	   }catch(SQLException se){
	      //Handle errors for JDBC
		  //System.out.println("ERROR1");
	      se.printStackTrace();
	   }catch(Exception e){
	      //Handle errors for Class.forName
		   //System.out.println("ERROR2");
	      e.printStackTrace();
	   }finally{
	      //finally block used to close resources
	      try{
	         if(stmt!=null)
	            stmt.close();
	      }catch(SQLException se2){
	    	//  System.out.println("ERROR3");
	      }// nothing we can do
	      try{
	         if(conn!=null)
	            conn.close();
	      }catch(SQLException se){
	    	 // System.out.println("ERROR4");
	         se.printStackTrace();
	      }//end finally try
	   }//end try
	   System.out.println("Goodbye!");
	}//end main
	}//end FirstExample

