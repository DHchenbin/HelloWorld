package chenbin.com;
import java.sql.*;

public class myself{
	static String DB_Driver="oracle.jdbc.driver.OracleDriver";
	static String DB_Url="jdbc:oracle:thin:@192.168.0.178:1521:orcl";
	static String DB_User="cmb";
	static String DB_Psswd="cmb";
			public static void main(String[] args){
				Connection conn=null;
				Statement stmt=null;
				try{
				Class.forName(DB_Driver);
				conn=DriverManager.getConnection(DB_Url, DB_User, DB_Psswd);
				stmt=conn.createStatement();
				String sql;
				sql="select * from lu_year";
				ResultSet rs=stmt.executeQuery(sql);
				while(rs.next()){
					String yer_id=rs.getString("yer_seq");
					System.out.println(yer_id);
				}
				}
				catch(Exception e){
					System.out.println("error");
					e.printStackTrace();
				}
	}
}
