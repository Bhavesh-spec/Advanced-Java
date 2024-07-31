package ServletContext;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/Reg2")
public class Reg2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Reg2() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext ctx = getServletContext();
		EmployeeBean emp = (EmployeeBean) ctx.getAttribute("emp");
		
		emp.setEmpLName(request.getParameter("elname"));
		emp.setEmpMail(request.getParameter("empmail"));
		emp.setEmpPhNo(request.getParameter("empphno"));
		request.getRequestDispatcher("Reg3.html").forward(request, response);
	}
}
