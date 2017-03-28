

	/*
	 * The Circle class models a circle with a radius and color.
	 */
	public class Circle {  // Save as "Circle.java"
	   // private instance variable, not accessible from outside this class
	   private double radius;
	   private String color;
	   
	   // The default constructor with no argument.
	   // It sets the radius and color to their default value.
	   public Circle() {
	      radius = 1.0;
	      color = "red";
	   }
	   
	   // 2nd constructor with given radius, but color default
	   public Circle(double radius) {
	      this.radius = radius;
	      color = "red";
	   }
	   
	   public Circle(double radius, String color) {
		   this.radius = radius;
		   this.color = color;
	   }
	   
	   // A public method for retrieving the radius
	   public double getRadius() {
	     return radius; 
	   }
	   
	   // A public method for computing the area of circle
	   public double getArea() {
	      return radius*radius*Math.PI;
	   }
	   
	   public String getColor() {
		   return color;
	   }
	   
	   // Setter for instance variable radius
	   public void setRadius(double radius) {
	      this.radius = radius;
	   }
	    
	   // Setter for instance variable color
	   public void setColor(String color) {
		   this.color = color;
	   }
	   
	   // Return a description of this instance in the form of
	   // Circle[radius=r,color=c]
	   public String toString() {
		   return "Circle[radius=" + radius + " color=" + color + "]";
	   }
	}

