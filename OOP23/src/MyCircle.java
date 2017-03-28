
public class MyCircle {

	private MyPoint center;
	private int radius;
	
	public MyCircle() {
		center = new MyPoint(0,0);
		radius = 1;
	}
	
	public MyCircle(int x, int y, int radius) {
		center = new MyPoint(x,y);
		this.radius = radius;
	}
	
	public MyCircle(MyPoint center, int radius) {
		this.center = center;
		this.radius = radius;
	}
	
	public int getRadius () {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public MyPoint getCenter() {
		return center;
	}
	
	public void setCenter(MyPoint center) {
		this.center = center;
	}
	
	public int getCenterX () {
		return center.getX();
	}
	
	public void setCenterX (int x) {
		center.setX(x);
	}
	
	public int getCenterY () {
		return center.getY();
	}
	
	public void setCenterY(int y) {
		center.setY(y);
	}
	
	public int[] getCenterXY () {
		return center.getXY();
	}
	
	public void setCenterXY(int x, int y) {
		center.setXY(x,y);
	}
	
	public String toString() {
		return "MyCircle[radius = " + radius + " , center = " + center + "]";
	}
	
	public double getArea() {
		return Math.PI*radius*radius;
	}
	
	public double getCircumference() {
		return Math.PI*2*radius;
	}
	
	public double distance(MyCircle another) {
		return center.distance(another.center);
	}
}
