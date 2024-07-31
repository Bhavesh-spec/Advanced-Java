package ServletContext;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpDAO {
int k=0;
Connection con;
public int register(EmployeeBean eb) {
	String empName = eb.getEmpName();
	String empId = eb.getEmpId();
	String empFName = eb.getEmpFName();
	String empLName = eb.getEmpLName();
	String empMail = eb.getEmpMail();
	String empPhNo = eb.getEmpPhNo();
String state = eb.getState();
String country = eb.getCountry();
System.out.println(eb);
	try {
		Class.forName(DBConnection.driver);
		con=DBConnection.getConn();
		System.out.println("connect");
		String query="insert into ServletContxt values(?,?,?,?,?,?,?,?)";
		PreparedStatement statement = con.prepareStatement(query);
		statement.setString(1,empName);
		statement.setString(2,empId);
		statement.setString(3,empFName);
		statement.setString(4, empLName);
		statement.setString(5, empMail);
		statement.setString(6, empPhNo);
		statement.setString(7,state);
		statement.setString(8, country);
		 k=statement.executeUpdate();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return k;
}
}
