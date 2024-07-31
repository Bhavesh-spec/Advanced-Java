package session;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

public class LoginDAO {
 AdminBean ab = null;
 Connection con;
	public AdminBean login(HttpServletRequest request) {
	String Aname = request.getParameter("name");
		String Apass = request.getParameter("pass");
		try {
			Class.forName(DBConnection.driver);
			con=DBConnection.getCon();
			String query="select * from TestExam where ANAME=? and APASS=?";
			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1, Aname);
			statement.setString(2, Apass);
			ResultSet executeQuery = statement.executeQuery();
			while (executeQuery.next()) {
				ab= new AdminBean();
			 ab.setAdminName(executeQuery.getString(1));
			 ab.setAdminPass(executeQuery.getString(2));
			 ab.setAdminFName(executeQuery.getString(3));
			 ab.setAdminLName(executeQuery.getString(4));
			 ab.setAdminMailId(executeQuery.getString(5));
			 ab.setAdminPhno(executeQuery.getString(6));
			 HttpSession hs1 = request.getSession();
			 hs1.setAttribute("hs1", ab);
			 
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ab;
	}

}
