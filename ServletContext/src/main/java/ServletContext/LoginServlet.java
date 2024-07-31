package ServletContext;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/log")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String ename = request.getParameter("ename");
      String eid = request.getParameter("empId");
      int login = new LoginDAO().login(ename, eid);
      PrintWriter pw = response.getWriter();
      if(login>0) {
    	  pw.println("login sucess");
      }else {
    	  pw.println("invalid");
      }
      
      
	}

}

