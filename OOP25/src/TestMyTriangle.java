
public class TestMyTriangle {

	public static void main(String[] args) {
		
		MyTriangle t1 = new MyTriangle(0,1,1,2,2,1);
		
		MyPoint p1 = new MyPoint(0,2);
		MyPoint p2 = new MyPoint(0,3);
		MyPoint p3 = new MyPoint(1,4);
		
		MyTriangle t2 = new MyTriangle(p1,p2,p3);
		
		System.out.println(t1);
		System.out.println(t2);
		
		System.out.println(t1.getPerimeter());
		System.out.println(t2.getPerimeter());
		
		System.out.println(t1.getType());
		System.out.println(t2.getType());

	}

}
