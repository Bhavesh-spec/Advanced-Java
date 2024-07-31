package Sessions;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/reg")
public class Reg1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Reg1Servlet(){

    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     String EmpName = request.getParameter("EmpName");
     String EmpId = request.getParameter("EmpId");
     String EmpfName = request.getParameter("EmpfName");
     HttpSession  hs = request.getSession();
     hs.setAttribute("EmpName",EmpName );
     hs.setAttribute("EmpId",EmpId );
     hs.setAttribute("EmpfName",EmpfName );
     PrintWriter pw = response.getWriter();
     pw.println("<html><body><form action=\"reg2\" method=\"post\">");
     pw.println("EmpLName:<input type=\"text\" name=\"EmpLName\"><br>");
     pw.println("EmpMail:<input type=\"text\" name=\"EmpMail\" ><br>\r\n"+"");
     pw.println("EmpPhone:<input type=\"text\" name=\"EmpPhone\" ><br>\r\n"+"");
     pw.println("<input type=\"submit\" value=\"Next>>\">");
     pw.println("</body></html>");
	}
}
