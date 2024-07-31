package ServletContext;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
public static final String driver="oracle.jdbc.driver.OracleDriver";
public static final String url="jdbc:oracle:thin:@localhost:1521:xe";
public static final String username="system";
public static final String password="manager";

static {
	try {
		Class.forName(driver);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static Connection getConn() throws Exception {
	return DriverManager.getConnection(url,username,password);
}
}
