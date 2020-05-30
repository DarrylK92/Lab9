import java.util.ArrayList;
/**Tests the CODPersonnel, Employee, PayInfo, Student, Course and Address classes
 * 
 * @author Darryl Karney
 * @version 10Jul2018
 */

public class TestCODPersonnel {

	public static void main(String[] args) {
		//Create course
		Course course = new Course(1, "CIS-1500", "1");
		
		//Create addresses
		Address address = new Address("123 Main St.", "Carol Stream", "IL", "60188");
		Address address2 = new Address("852 South St.", "Lincoln", "IL", "60157");
		
		//Create payinfo
		PayInfo payInfo = new PayInfo(38720.00, true);
		
		//create student and courseList ArrayList
		ArrayList<Course> courseList = new ArrayList<Course>();
		courseList.add(course);
		Student student = new Student(1, "Darryl Karney", address, courseList);
		
		//Create employee
		Employee employee = new Employee("Mr. Test", address2, payInfo);
		
		//Create codpersonnnel, employeeList ArrayList and studentList ArrayList
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(employee);
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(student);
		CODPersonnel codPersonnel = new CODPersonnel(employeeList, studentList);
		
		//Create additional course to test registerCourse method
		Course course2 = new Course(2, "HISTO-1000", "1");
		//Register for new course
		student.registerCourse(course2);
		
		//Drop from course
		student.dropCourse(course2);
		
		//Create new address/payInfo/employee to test addEmployee method
		Address address3 = new Address("159 North St.", "Staton", "PA", "76845");
		PayInfo payInfo2 = new PayInfo(32664.00, true);
		Employee employee2 = new Employee("Jane Doe", address3, payInfo2);
		//Add new employee
		codPersonnel.addEmployee(employee2);
		
		//Create new address/course arraylist/student to test addStudent method
		Address address4 = new Address("456 East St.", "Fullton", "SC", "65354");
		ArrayList<Course> courseList2 = new ArrayList<Course>();
		courseList2.add(course2);
		courseList2.add(course);
		Student student2 = new Student(2, "John Smith", address4, courseList2);
		//Add new student
		codPersonnel.addStudent(student2);
		
		//Display codPersonnel info
		System.out.println("Employees:");
		for(Employee e : codPersonnel.getEmployees()) {
			System.out.println("	Name: " + e.getName());
			System.out.println("	Address: " + e.getAddress().getStreetAddress() + "\n	" + e.getAddress().getCity() + ", " + e.getAddress().getState() + " " + e.getAddress().getZipcode());
			System.out.println("	Salary: " + e.getPayInfo().getSalary());
			System.out.println("	Full time: " + e.getPayInfo().isFullTime1());
			System.out.println();
		}
		
		System.out.println("Students:");
		for(Student s : codPersonnel.getStudents()) {
			System.out.println("	ID: " + s.getId());
			System.out.println("	Name: " + s.getName());
			System.out.println("	Address: " + s.getAddress().getStreetAddress() + "\n	" + s.getAddress().getCity() + ", " + s.getAddress().getState() + " " + s.getAddress().getZipcode());
			System.out.println("	Courses:");
			for(Course c : s.getCourses()) {
				System.out.println("		ID: " + c.getId());
				System.out.println("		Name: " + c.getName());
				System.out.println("		Section: " + c.getSection());
			}
		}
	}

}
