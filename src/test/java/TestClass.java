import static org.junit.Assert.*;

import org.junit.Test;

public class TestClass {

	@Test
	public void testStudentMethods() {
		Student jason = new Student("jason", "17-12-1996");
		Student emer = new Student("emer", "17-12-1996");

		assertTrue(jason.getAge() == 20);
		assertTrue(jason.getName().equals("jason"));
		assertTrue(jason.getUserName().equals("jason20"));
		assertTrue(jason.getStudentId() != emer.getStudentId());
	}
	
	@Test
	public void testPrintOut() {
		Student jason = new Student("Jason", "17-12-1996");
		Student emer = new Student("Emer", "23-02-1990");

		Module CT417 = new Module("Software Engineering", "CT417");
		Module CT437 = new Module("Computer Security and Forensic Computing", "CT437");
		Module CT436 = new Module("Advanced Professional Skills", "CT436");
		Module CT421 = new Module("Artificial Intelligence", "CT421");

		CourseProgrammer BCT = new CourseProgrammer("BCT", "01-09-2014", "05-05-2018");

		BCT.addStudent(emer);
		BCT.addStudent(jason);

		emer.addModule(CT417);
		jason.addModule(CT417);

		emer.addModule(CT437);
		jason.addModule(CT437);

		emer.addModule(CT436);
		jason.addModule(CT421);

		System.out.println(BCT);
	}
}
