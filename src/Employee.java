public abstract class Employee implements Payable
{
	private static int count = 0;
	private String firstName;
	private String lastName;
	private Date birthDate;
	private Date hireDate;
	private final String socialSecurityNumber;
	
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = "";
		++count;
		System.out.printf("Employee constructor: %s %s; count = %d%n", firstName, lastName, count);
	}
	
	public Employee(String firstName, String lastName, Date birthDate, Date hireDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.setBirthDate(birthDate);
		this.setHireDate(hireDate);
		this.socialSecurityNumber = "";
	}
	
	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	public String toString() {
		return String.format("%s %s%nsocial security number: %s", getFirstName(), getLastName(), getSocialSecurityNumber());
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public static int getCount() {
		return count;
	}
	
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	public abstract double earnings();

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	// Note: We do not implement Payable method getPaymentAmount here so
	// this class must be declared abstract to avoid a compilation error.
}