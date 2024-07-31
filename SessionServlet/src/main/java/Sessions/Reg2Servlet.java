package Sessions;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/reg2")
public class Reg2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Reg2Servlet() {
        super(); }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	HttpSession hs = request.getSession();
	String EmpName = (String) hs.getAttribute("EmpName");
	String EmpId = (String) hs.getAttribute("EmpId");
	String EmpfName = (String) hs.getAttribute("EmpfName");
	String EmpLName = request.getParameter("EmpLName");
	String EmpMail = request.getParameter("EmpMail");
	String EmpPhone=request.getParameter("EmpPhone");
HttpSession hs1 = request.getSession();
hs1.setAttribute("EmpName",EmpName);
hs1.setAttribute("EmpId",EmpId);
hs1.setAttribute("EmpfName", EmpfName);
hs1.setAttribute("EmpLName", EmpLName);
hs1.setAttribute("EmpMail", EmpMail);
hs1.setAttribute("EmpPhone", EmpPhone);
	PrintWriter pw = response.getWriter();
    pw.println("<html><body><form action=\"reg3\" method=\"post\">");
    pw.println("State:<input type=\"text\" name=\"State\"><br>");
    pw.println("Country:<input type=\"text\" name=\"Country\" ><br>\r\n"+ "");
    pw.println("<input type=\"submit\" value=\"Submit\">");
    pw.println("</body></html>");
	}
}
