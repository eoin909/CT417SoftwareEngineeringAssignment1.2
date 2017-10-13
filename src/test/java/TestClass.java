import static org.junit.Assert.*;

import org.junit.Test;

public class TestClass {

	@Test
	public void testStudentMethods() {
		Student student = new Student("jason", "17-12-1996");
		Student student1 = new Student("jason", "17-12-1996");

		assertTrue(student.getAge() == 20);
		assertTrue(student.getName().equals("jason"));
		assertTrue(student.getUserName().equals("jason20"));
		assertTrue(student.getStudentId() != student1.getStudentId());
	}

	@Test
	public void testModuleMethods() {
		Student student = new Student("jason", "17-12-1996");
		Student student1 = new Student("emer", "23-02-1990");
		
		Module module = new Module("Software Engineering", "CT417");
		
		module.addStudent(student);
		module.addStudent(student1);
		
		assertTrue(module.getStudents().contains(student));
		assertTrue(module.getStudents().contains(student1));
		
		assertTrue(module.getModuleId().equals("CT417"));
		assertTrue(module.getModuleName().equals("Software Engineering"));
	}
	
	@Test
	public void testCourseMethods() {
		Student student = new Student("jason", "17-12-1996");
		Student student1 = new Student("emer", "23-02-1990");
		
		Module module = new Module("Software Engineering", "CT417");
		
		module.addStudent(student);
		module.addStudent(student1);
		
		CourseProgrammer course = new CourseProgrammer("BCT", "01-09-2014", "05-05-2018");
		course.addModule(module);
		
		assertTrue(course.getModules().contains(module));
		assertTrue(course.getCourseName().equals("BCT"));
	}
}
