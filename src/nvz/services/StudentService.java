package nvz.services;
import java.sql.SQLException;

import javax.naming.NamingException;

import nvz.database.StudentDb;
import nvz.domain.Name;
import nvz.domain.Student;

public class StudentService {
	
	public static Student insertNewStudentFromName(Name newStudentName) throws SQLException, NamingException {
		Student newStudent, insertedStudent;
		
		newStudent = new Student();
		newStudent.setName(newStudentName);
		
		insertedStudent = StudentDb.insertNewStudent(newStudent);
		return insertedStudent;
	}
	
}
