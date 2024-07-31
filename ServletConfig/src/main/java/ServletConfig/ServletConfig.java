package ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import oracle.net.aso.s;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ServletConfig extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ServletConfig() {
    }
    Connection con;
	public void init(ServletConfig config) throws ServletException {
          try {
      		Class.forName("oracle.jdbc.driver.OracleDriver");
    		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
    		System.out.println("connect");
//			String s1 = config.getInitParameter("driver");
//			String s2 = config.getInitParameter("url");
//			String s3 = config.getInitParameter("username");
//			String s4 = config.getInitParameter("password");
//			Class.forName(s1);
//			con=DriverManager.getConnection(s2,s3,s4);
		} catch (Exception e) {
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.println("<h1>Hii</h1>");
		try {
			String s1 = request.getParameter("uname");
			String s2 = request.getParameter("psw");
			String query="select * from uinfo where UNAME=? and PWORD=?";
			
			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1,s1);
			statement.setString(2,s2);
			pw.println(s1);pw.println(s2);
		
			ResultSet executeQuery = statement.executeQuery();
			if(executeQuery.next()) {
				pw.println("welcome"+s1);
			}else {
				pw.println("invalid username/password");
			}
			pw.println("<h1>hello</h1>");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
