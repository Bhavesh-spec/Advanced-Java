package ServletContext;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
int k=0;
Connection con;
public int  login(String ename,String eid) {
	try {
		Class.forName(DBConnection.driver);
		con= DBConnection.getConn();
		System.out.println(ename);
		System.out.println(eid);
		String query = "select * from ServletContxt where EMPNAME=? and EMPID =?";
		PreparedStatement statement = con.prepareStatement(query);
		statement.setString(1,ename);
		statement.setString(2,eid);
		ResultSet executeQuery = statement.executeQuery();
		if(executeQuery.next()) {
			k=1;
		}		
	} catch (Exception e) {
		e.printStackTrace();
	}	
	return k;
	
}

}
