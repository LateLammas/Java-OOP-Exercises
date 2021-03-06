
public class MyPoint {

	private int x;
	private int y;
	
	public MyPoint () {
		x = 0;
		y = 0;
	}
	
	public MyPoint (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int[] getXY() {
		int[] xy = new int[2];
		xy[0] = x;
		xy[1] = y;
		return xy;
	}
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return x + ", " + y;
	}
	
	//distance of this object to another point
	public double distance(int x, int y) {
		int xDiff = this.x - x;
		int yDiff = this.y - y;
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
	
	//distance of this object to another MyPoint object
	public double distance(MyPoint another) {
		int xDiff = this.x - another.x;
		int yDiff = this.y - another.y;
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
	
	//distance to the 0,0 point
	public double distance() {
		int xDiff = x;
		int yDiff = y;
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
	
}