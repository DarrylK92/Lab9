import java.util.ArrayList;

/**Contains codpersonnel info
 * 
 * @author Darryl Karney
 * @version 10Jul2018
 *
 */

public class CODPersonnel {
	private ArrayList<Employee> employees;
	private ArrayList<Student> students;
	
	//Constructor
	public CODPersonnel(ArrayList<Employee> employees, ArrayList<Student> students) {
		this.employees = employees;
		this.students = students;
	}

	/**
	 * @return the employees
	 */
	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	/**
	 * @param employees the employees to set
	 */
	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}

	/**
	 * @return the students
	 */
	public ArrayList<Student> getStudents() {
		return students;
	}

	/**
	 * @param students the students to set
	 */
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	
	/**Adds new employee to arraylist
	 * 
	 * @param in the employee to add
	 */
	public void addEmployee(Employee in) {
		employees.add(in);
	}
	
	/**Adds new student to arraylist
	 * 
	 * @param in the student to add
	 */
	public void addStudent(Student in) {
		students.add(in);
	}
}
