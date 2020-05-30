/**Contains employee info
 * 
 * @author Darryl Karney
 * @version 10Jul2018
 *
 */

public class Employee {
	private String name;
	private Address address;
	private PayInfo payInfo;
	
	//Constructor
	public Employee(String name, Address address, PayInfo payInfo) {
		this.name = name;
		this.address = address;
		this.payInfo = payInfo;
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
	 * @return the payInfo
	 */
	public PayInfo getPayInfo() {
		return payInfo;
	}

	/**
	 * @param payInfo the payInfo to set
	 */
	public void setPayInfo(PayInfo payInfo) {
		this.payInfo = payInfo;
	}
}
