package ForwdingIncluding;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
@WebServlet("/log")     
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LoginServlet() {
        super();
    }
	Connection con;
    @Override
    public void init() throws ServletException {    	
    try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		 con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		System.out.println("connect");
	} catch (Exception e) {
		e.printStackTrace();
	}
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
		String s1 = request.getParameter("uname");
       String s2 = request.getParameter("pword");
       String query="Select * from uinfo where UNAME=? and PWORD=?";
       
	try {
		PreparedStatement statement = con.prepareStatement(query);
		statement.setString(1,s1);
		statement.setString(2,s2);
		ResultSet executeQuery = statement.executeQuery();
		if(executeQuery.next()) {
			response.sendRedirect("welcome");
		}else {
		RequestDispatcher pd = request.getRequestDispatcher("login.html");
		pd.include(request, response);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
       
	}
}
