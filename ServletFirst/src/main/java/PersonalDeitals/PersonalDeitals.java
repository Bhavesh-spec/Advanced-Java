package PersonalDeitals;

import jakarta.servlet.ServletConfig;
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
import java.sql.SQLException;

/**
 * Servlet implementation class PersonalDeitals
 */
@WebServlet("/ab")
public class PersonalDeitals extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonalDeitals() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see Servlet#init(ServletConfig)
	 */
    Connection con;
	public void init(ServletConfig config) throws ServletException {
	 try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		System.out.println("connect");
	} catch (Exception e) {
		e.printStackTrace();
	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name =req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		long mobile=Long.parseLong(req.getParameter("mobile"));
		String gender =req.getParameter("gen");
		String []hobbies=req.getParameterValues("ho");
		PrintWriter pw = res.getWriter();
	    String s="";
	    for(String s1:hobbies) {
	    	s+=s1;
	    	s+=",";
	    }
	 try {
		PreparedStatement statement = con.prepareStatement("insert into PersonalDetials values(?,?,?,?,?)");
		statement.setString(1,name);
		statement.setInt(2, age);
		statement.setLong(3, mobile);
		statement.setString(4, gender);
		
			statement.setString(5, s);
	
		statement.executeUpdate();
		pw.println("<h1>Data added successfly</h1>");
	} catch (SQLException e) {
		e.printStackTrace();
	}
	}
}
