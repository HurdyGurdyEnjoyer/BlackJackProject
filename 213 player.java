/**
 * Creates a player with firstname lastname and deposit amount
 */

/**
 * @author maloneb97994
 *
 */
public class player {
	String FirstName;
	String LastName;
	double deposit = 0.0d;
	/**
	 * @param firstName
	 * @param lastName
	 * @param deposit
	 */
	public player(String firstName, String lastName, double deposit) {
		super();
		FirstName = firstName;
		LastName = lastName;
		this.deposit = deposit;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return FirstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return LastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	/**
	 * @return the deposit
	 */
	public double getDeposit() {
		return deposit;
	}
	/**
	 * @param deposit the deposit to set
	 */
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	@Override
	public String toString() {
		return "_player [FirstName=" + FirstName + ", LastName=" + LastName + ", deposit=" + deposit + "]";
	}
	
	
	
	
	
	
}
