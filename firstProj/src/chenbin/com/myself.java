package chenbin.com;

import java.sql.*;

public class myself {
	static String DB_Driver = "oracle.jdbc.driver.OracleDriver";
	static String DB_Url = "jdbc:oracle:thin:@192.168.0.178:1521:orcl";
	static String DB_User = "cmb";
	static String DB_Passwd = "cmb";

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName(DB_Driver);
			conn = DriverManager.getConnection(DB_Url, DB_User, DB_Passwd);
			stmt = conn.createStatement();
			String sql = "select * from lu_month";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String mon_seq = rs.getString("mon_seq");
				System.out.println(mon_seq);
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println("The end");
			e.printStackTrace();
		} finally {
			System.out.println("The finally");
		}
	}
}