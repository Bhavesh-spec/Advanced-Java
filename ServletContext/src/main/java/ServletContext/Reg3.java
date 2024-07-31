package ServletContext;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/Reg3")
public class Reg3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Reg3() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
ServletContext ctx = getServletContext();
EmployeeBean emp = (EmployeeBean) ctx.getAttribute("emp");
emp.setState(request.getParameter("state"));
emp.setCountry(request.getParameter("country"));
//System.out.println(emp);
int k = new EmpDAO().register(emp);
PrintWriter pw = response.getWriter();
if(k>0) {
	pw.println("Register Successfully");
}else {
  pw.println("Not Register");
}
	}
}
