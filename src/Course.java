/**Contains course info
 * 
 * @author Darryl Karney
 * @version 10Jul2018
 *
 */

public class Course {
	private int id;
	private String name;
	private String section;
	
	//Constructor
	public Course(int id, String name, String section) {
		this.id = id;
		this.name = name;
		this.section = section;
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
	 * @return the section
	 */
	public String getSection() {
		return section;
	}

	/**
	 * @param section the section to set
	 */
	public void setSection(String section) {
		this.section = section;
	}
}
