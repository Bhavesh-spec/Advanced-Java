package Sessions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
int k=0;
Connection con;
public int  login(String EmpName , String EmpId){
	try {
		Class.forName(DBConnection.driver);
		con=DBConnection.getCon();
		String query="select * from SessionApp where EMPNAME=? and EMPID = ?";
		PreparedStatement statement = con.prepareStatement(query);
		statement.setString(1,EmpName);
		statement.setString(2,EmpId);
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
