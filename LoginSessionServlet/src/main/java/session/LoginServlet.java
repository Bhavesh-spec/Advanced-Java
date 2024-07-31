package session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/log")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
    }
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     AdminBean ab = new LoginDAO().login(request);
     PrintWriter pw = response.getWriter();
     if(ab!=null) {
    	HttpSession session = request.getSession();
    	session.setAttribute("ab", ab);
    	 pw.println("login sucess");
    	 request.getRequestDispatcher("LoginSuccess.jsp").forward(request, response);
     }else{
    	 request.getRequestDispatcher("loginFail.jsp").forward(request, response);
    	 pw.println("login fail");
     }
	}
}
