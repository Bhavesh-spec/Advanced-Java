package Sessions;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/log")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LoginServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String EmpName = request.getParameter("EmpName");
	String EmpId = request.getParameter("EmpId");
	int login = new LoginDAO().login(EmpName, EmpId);
	PrintWriter pw = response.getWriter();
	if(login>0) {
		pw.println("<h1>Welcome</h1>");
	}else {
		pw.println("<h1>Invalid nameORid</h1>");
	}
	}
}
