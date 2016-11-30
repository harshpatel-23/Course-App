package nvz.servletForms;

import javax.servlet.http.HttpServletRequest;

import nvz.domain.Name;

public class NameForm {
	private String lastName;
	private String firstName;
	private Name name;
	private final static String fieldCannotBeLeftEmptyMsg = "This field cannot be left empty";
	
	
	public NameForm(HttpServletRequest request) {
		name = extractFormData(request);
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Name getName() {
		return name;
	}

	private String validationMsgForName(String name) {
		if (name.length() == 0) {
			return fieldCannotBeLeftEmptyMsg;
		}
		
		return null;
	}
	
	public Name extractFormData(HttpServletRequest request) {
		String validationMsg;
		boolean formDataValid = true;
		
		lastName = request.getParameter("LastName");
		firstName = request.getParameter("FirstName");
		
		validationMsg = validationMsgForName(firstName);
		if (validationMsg != null) {
			request.setAttribute("errorInFirstNameMsg", validationMsg);
			formDataValid = false;
		}
		
		validationMsg = validationMsgForName(lastName);
		if (validationMsg != null) {
			request.setAttribute("errorInLastNameMsg", validationMsg);
			formDataValid = false;
		}
		
		if (!formDataValid) {
			/* Can't create the name object, data is bad */
			return null;
		}
		
		name = new Name();
		name.setFirstName(firstName);
		name.setLastName(lastName);
		return name;
	}

}
