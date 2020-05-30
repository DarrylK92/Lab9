
public class PayInfo {
	private double salary;
	private boolean isFullTime;
	
	public PayInfo(double salary, boolean isFullTime) {
		this.salary = salary;
		this.isFullTime = isFullTime;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * @return the isFullTime
	 */
	public boolean isFullTime() {
		return isFullTime;
	}

	/**
	 * @param isFullTime the isFullTime to set
	 */
	public void setFullTime(boolean isFullTime) {
		this.isFullTime = isFullTime;
	}
	
	//I could not name this method isFullTime due to the variable isFullTime having the same name
	public boolean isFullTime1() {
		return isFullTime;
	}
}
