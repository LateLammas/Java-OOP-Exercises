
public class TestEmployee {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(43, "Lauri", "Salo", 3000);
		System.out.println(e1.getID());
		System.out.println(e1.getFirstName());
		System.out.println(e1.getLastName());
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
		e1.setSalary(3200);
		System.out.println(e1.getAnnualSalary());
		
		System.out.println(e1.raiseSalary(7));
		
	}

}
