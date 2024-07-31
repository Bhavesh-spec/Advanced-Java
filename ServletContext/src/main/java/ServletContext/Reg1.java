package ServletContext;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/Reg1")
public class Reg1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Reg1() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	EmployeeBean emp = new EmployeeBean();
	emp.setEmpName(request.getParameter("ename"));
	emp.setEmpId(request.getParameter("eid"));
	emp.setEmpFName(request.getParameter("empfname"));
	ServletContext ctx = getServletContext();
	ctx.setAttribute("emp", emp);
	request.getRequestDispatcher("Reg2.html").forward(request, response);
	}
}
