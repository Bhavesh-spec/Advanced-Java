package session;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/update")
@SuppressWarnings("serial")
public class UpdateServlet extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
PrintWriter out = resp.getWriter();
resp.setContentType("text/html");
HttpSession session = req.getSession();
if(session!=null&&session.getAttribute("ab")!=null) {
	int k= new UpdateDAO().update(req);
	req.getRequestDispatcher("update.html").forward(req, resp);
	if(k>0) {
		System.out.println("<h3>Data update Successfully</h3>");
	}else {
		System.out.println("<h1>Faild to update data");
	}
}	
}
}
