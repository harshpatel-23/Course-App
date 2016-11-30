package nvz.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import nvz.domain.Name;
import nvz.domain.Student;
import nvz.services.StudentService;
import nvz.servletForms.NameForm;

/**
 * Extract and process data from studentForm.jsp.   On error in form, forward using either:
 *     dispatch = context.getRequestDispatcher("/WEB-INF/forms/simplestudentForm.jsp");   // No Backing Object 
 *    OR
 *     dispatch = context.getRequestDispatcher("/WEB-INF/forms/studentForm.jsp"); // Uses Backing Object (original form data not lost on form error)
 */
@WebServlet("/servlet/processstudentform")
public class ProcessStudentFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context;
		RequestDispatcher dispatch;
		HttpSession session;
		String pageCtx;
		NameForm nameForm;
		Name name;
		Student createdStudent;
		
		/* Extract data and insert error messages if needed */
		nameForm = new NameForm(request);
		name = nameForm.getName();
		
		if (name == null) {
			/* The form contained invalid data, transfer control back to original form */
			context = getServletContext();
			request.setAttribute("studentFormData", nameForm);
			dispatch = context.getRequestDispatcher("/WEB-INF/forms/studentForm.jsp");
			dispatch.forward(request, response);
			return;
		} 
		
		/* The form was valid.   Apply business logic on it and then redirect to new view */
		pageCtx = request.getContextPath();
		session = request.getSession();
		
		try {
			createdStudent = StudentService.insertNewStudentFromName(name);
		} catch (Exception ex){
			session.setAttribute("StudentInsertFailureMsg", ex.getMessage());
			response.sendRedirect(pageCtx + "/views/studentInsertFailure.jsp");
			return;
		}
		
		session.setAttribute("student", createdStudent);
		response.sendRedirect(pageCtx + "/views/studentInsertSuccess.jsp");
	}

}
