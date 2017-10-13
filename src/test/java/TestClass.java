import java.util.ArrayList;

import org.junit.Test;

public class TestClass {
	
	@Test
	public void test() {
		Student jason = new Student("Jason", "17-12-1996");
		Student emer = new Student("Emer", "23-02-1990");
		
		Module CT417 = new Module("Software Engineering", "CT417");
		Module CT437 = new Module("Computer Security and Forensic Computing", "CT437");
		Module CT436 = new Module("Advanced Professional Skills", "CT436");
		Module CT421 = new Module("Artificial Intelligence", "CT421");

		CourseProgrammer course = new CourseProgrammer("BCT", "01-09-2014", "05-05-2018");
		
		course.addStudent(emer);
		course.addStudent(jason);
		
		emer.addModule(CT417);
		jason.addModule(CT417);
		
		emer.addModule(CT437);
		jason.addModule(CT437);
		
		emer.addModule(CT436);
		jason.addModule(CT421);
		
		
		ArrayList<Student> students = course.getStudents();

		for (int i = 0; i < students.size(); i++) {
			ArrayList<Module> modules = students.get(i).getModules();
			System.out.println();
			System.out.println("Student Name :" + students.get(i).getName());
			System.out.println("Course Name :" +course.getCourseName());
			for(int j =0; j<modules.size(); j++) {
				System.out.println("Module Name :" +modules.get(j).getModuleName());
			}
		}
		
		

	}
}
