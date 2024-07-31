package session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/view")
public class ViewServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		// TODO Auto-generated method stub
  if(session!=null&&session.getAttribute("ab")!=null) {	
		request.getRequestDispatcher("ViewAllsuccess.jsp").forward(request, response);
		
	}else {
	
	}
	}
	
}
