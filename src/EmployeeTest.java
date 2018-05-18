public class EmployeeTest
{
	public static void main(String[] args) {
		Date birth = new Date(7, 24, 1949);
		Date hire = new Date(3, 12, 1988);
		Employee employee = new Employee("Bob", "Blue", birth, hire);
		
		System.out.println(employee);
		
		System.out.printf("Employees before instantiation: %d%n", Employee.getCount());
		
		Employee e1 = new Employee("Susan", "Baker");
		Employee e2 = new Employee("Bob", "Blue");
		
		System.out.printf("%nEmployees after instantiation:%n");
		System.out.printf("via e1.getCount(): %d%n", e1.getCount());
		System.out.printf("via e2.getCount(): %d%n", e2.getCount());
		System.out.printf("via Employee.getCount(): %d%n", Employee.getCount());
		
		System.out.printf("%nEmployee 1: %s %s%nEmployee 2: %s %s%n", 
				e1.getFirstName(), e1.getLastName(),
				e2.getFirstName(), e2.getLastName());
	}
}