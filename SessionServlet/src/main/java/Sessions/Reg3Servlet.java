package Sessions;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

//SessionApp
@WebServlet("/reg3")
public class Reg3Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Reg3Servlet() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	HttpSession hs = request.getSession();
	String EmpName = (String) hs.getAttribute("EmpName");
	String  EmpId= (String) hs.getAttribute("EmpId");
	String  EmpfName= (String) hs.getAttribute("EmpfName");
	String  EmpLName= (String) hs.getAttribute("EmpLName");
	String  EmpMail= (String) hs.getAttribute("EmpMail");
	String  EmpPhone= (String) hs.getAttribute("EmpPhone");
    String State = request.getParameter("State");
    String Country = request.getParameter("Country");
   
    EmpBean eb = new EmpBean();
    eb.setEmpName(EmpName);
    eb.setEmpId(EmpId);
    eb.setEmpfName(EmpfName);
    eb.setEmpLName(EmpLName);
    eb.setEmpMail(EmpMail);
    eb.setEmpPhone(EmpPhone);
    eb.setState(State);
    eb.setCountry(Country);
    PrintWriter pw = response.getWriter();
   int k = new EmpDAO().register(eb);
   if(k>0) {
	   pw.println("<h1> Registration Successful <h1>");
   }
	}
}
