import java.util.ArrayList;

public class Module {	
	
	//(Module Name, ID (CT417), List of students).
	private String moduleName;
	private String moduleId;
	private ArrayList<Student> studentsList = new ArrayList<Student>();
	
	Module(String moduleName, String moduleId) {

		this.moduleName = moduleName;
		this.moduleId = moduleId;
	}
	
	public void addStudent(Student student) {
		studentsList.add(student);
	}
	
	public ArrayList<Student> getStudents(){
		return studentsList;
	}

	public String getModuleName() {
		return moduleName;
	}

	public String getModuleId() {
		return moduleId;
	}
}