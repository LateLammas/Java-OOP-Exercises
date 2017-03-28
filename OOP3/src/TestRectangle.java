
public class TestRectangle {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		System.out.println(r1);
		r1.setLength(2.0f);
		System.out.println(r1.toString());
		System.out.println(r1.getPerimeter());
		r1.setWidth(4.0f);
		System.out.println(r1.getArea());
	}

}
