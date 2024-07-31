package Sessions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EmpDAO {
	int k=0;
	Connection con;
public  int register(EmpBean eb) {
	try {
		System.out.println(eb);
		String EmpName = eb.getEmpName();
		String EmpId = eb.getEmpId();
		String EmpfName = eb.getEmpfName();
		String EmpLName = eb.getEmpLName();
		String EmpMail = eb.getEmpMail();
		String EmpPhone = eb.getEmpPhone();
		String State = eb.getState();
		String Country = eb.getCountry();
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		System.out.println("connect");
		String query="insert into SessionApp values(?,?,?,?,?,?,?,?)";
		PreparedStatement statement = con.prepareStatement(query);
		statement.setString(1,EmpName);
		statement.setString(2,EmpId);
		statement.setString(3,EmpfName);
		statement.setString(4,EmpLName);
		statement.setString(5,EmpMail);
		statement.setString(6, EmpPhone);
		statement.setString(7,State);
		statement.setString(8,Country);
		k = statement.executeUpdate();
		System.out.println(k);
	} catch (Exception e) {
		e.printStackTrace();
	}	
	return k;
}
}
