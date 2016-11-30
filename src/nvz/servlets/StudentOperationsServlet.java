package nvz.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* Use URL:  http://localhost:8080/courseapp/studentform   */
/** Present studentForm.jsp.  Note that clients do not have direct access to studentForm.jsp since it is hidden in 
 *  the WEB-INF/forms folder.   Clients must go through this servlet to get the form.
 */
@WebServlet("/studentform")
public class StudentOperationsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context;
		RequestDispatcher dispatch;
		
		context = getServletContext();
		dispatch = context.getRequestDispatcher("/WEB-INF/forms/studentForm.jsp");
		dispatch.forward(request, response);
	}

}
