import java.util.ArrayList;

/**Contains student info
 * 
 * @author Darryl Karney
 * @version 10Jul2018
 *
 */
public class Student {
	private int id;
	private String name;
	private Address address;
	private ArrayList<Course> courses;
	
	//Constructor
	public Student(int id, String name, Address address, ArrayList<Course> courses) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.courses = courses;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the courses
	 */
	public ArrayList<Course> getCourses() {
		return courses;
	}

	/**
	 * @param courses the courses to set
	 */
	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	
	/**Registers student to new course
	 * 
	 * @param in the course to add
	 */
	public void registerCourse(Course in) {
		courses.add(in);
	}
	
	/**Drops student from course
	 * 
	 * @param in the course to drop
	 */
	public void dropCourse(Course in) {
		courses.remove(in);
	}
}
