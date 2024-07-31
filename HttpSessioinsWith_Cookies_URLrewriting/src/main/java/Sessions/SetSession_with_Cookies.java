package Sessions;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/set")
public class SetSession_with_Cookies extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SetSession_with_Cookies() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String s1 = request.getParameter("book1");
String s2 = request.getParameter("book2");
String s3 = request.getParameter("book3");
HttpSession hs = request.getSession();
hs.setAttribute("b1",s1);
hs.setAttribute("b2",s2);
hs.setAttribute("b3",s3);
String s = response.encodeUrl("get");
PrintWriter pw = response.getWriter();
pw.println("<html><body bgcolor=cyan text=red>");
pw.println("<h1>Your Book are added to cart</h1>");
pw.println("<a href="+s+">Next</a>");
pw.println("</body></html>");
	}
}
