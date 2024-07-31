package session;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static final String url="jdbc:oracle:thin:@localhost:1521:xe";
	public static final String username="system";
	public static final String password="manager";
	public static final String driver ="oracle.jdbc.driver.OracleDriver";
	static {
		try {
			Class.forName(driver);
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	public static Connection getCon()throws Exception{
		return DriverManager.getConnection(url,username,password);
	}
}
