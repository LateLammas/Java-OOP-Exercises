
public class TestInvoiceItem {

	public static void main(String[] args) {
		
		InvoiceItem i1 = new InvoiceItem("xyz","Something",3,9.99);
		System.out.println(i1.getTotal());
		System.out.println(i1);

	}

}
