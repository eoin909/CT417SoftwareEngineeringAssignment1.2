import java.time.LocalDate;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Student {

	private String name;
	private String DOB;
	private String userName;
	private String studentId;
	private int age;
	private static int ID = 0;
	private ArrayList<Module> moduleList = new ArrayList<Module>();

	Student(String studentName, String dob) {

		age = calAge(dob);
		name = studentName;
		userName = name + age;
		studentId = Integer.toString(ID);
		ID++;
	}

	private int calAge(String dob2) {
		int dobYear = Integer.parseInt(dob2.substring(6, 10));
		int dobMonth = Integer.parseInt(dob2.substring(3, 5));
		int dobDay = Integer.parseInt(dob2.substring(0, 2));

		LocalDate birthday = LocalDate.of(dobYear, dobMonth, dobDay);
		LocalDate now = LocalDate.now();

		return (int) ChronoUnit.YEARS.between(birthday, now);
	}

	public void addModule(Module module) {
		moduleList.add(module);
	}
	
	public ArrayList<Module> getModules(){
		return moduleList;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getName() {
		return name;
	}

	public String getDOB() {
		return DOB;
	}

	public String getStudentId() {
		return studentId;
	}

	public int getAge() {
		return age;
	}
}