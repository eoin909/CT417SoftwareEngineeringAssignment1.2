import java.util.ArrayList;
import org.joda.time.DateTime;

public class CourseProgrammer {

	// (Course Name (CS & IT or ECE, etc), List of modules, Academic Start date and End dates).
	private String courseName;
	private ArrayList<Module> moduleList = new ArrayList<Module>();
	private ArrayList<Student> studentsList = new ArrayList<Student>();

	private DateTime startDate;
	private DateTime endDate;

	CourseProgrammer(String moduleName, String startDate, String endDate) {

		this.courseName = moduleName;
		this.startDate = calDateTime(startDate);
		this.endDate = calDateTime(endDate);
	}

	public DateTime calDateTime(String date) {

		int year = Integer.parseInt(date.substring(6, 10));
		int month = Integer.parseInt(date.substring(3, 5));
		int day = Integer.parseInt(date.substring(0, 2));

		// DateTime(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour)
		DateTime dt = new DateTime(year, month, day, 0, 0);

		return dt;
	}

	public void addStudent(Student student) {
		studentsList.add(student);
	}

	public ArrayList<Student> getStudents() {
		return studentsList;
	}

	public String getCourseName() {
		return courseName;
	}

	public DateTime getEndDate() {
		return endDate;
	}

	public DateTime getStartDate() {
		return startDate;
	}

	public String toString() {
		String courseString = "";
		for (int i = 0; i < studentsList.size(); i++) {
			ArrayList<Module> modules = studentsList.get(i).getModules();

			courseString = courseString + System.lineSeparator();
			courseString = courseString + "Student Name :" + studentsList.get(i).getName() + System.lineSeparator();
			courseString = courseString + "Course Name :" + courseName + System.lineSeparator();

			for (int j = 0; j < modules.size(); j++) {
				courseString = courseString + "Module Name :" + modules.get(j).getModuleName() + System.lineSeparator();
			}
		}
		return courseString;
	}
}