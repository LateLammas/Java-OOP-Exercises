
public class TestAccount {

	public static void main(String[] args) {
		
		Account a1 = new Account("34","Lauri Salo", 1500);
		Account a2 = new Account("35","Jonne Loikkanen", 3000);
		System.out.println(a1.credit(2000));
		a1.transferTo(a2, 2000);
		System.out.println(a1.getBalance());
		System.out.println(a2.getBalance());
	}

}
