package Polimofismo;

public class Rectangle extends Shape{

	 protected double width = 1.0;
	 protected double length = 1.0;
	
	
	   public Rectangle() {
		   
	   }
	   
	 
	    public Rectangle(double width, double length) {
	        this.width = width;
	        this.length = length;
	    }

	    public Rectangle(double width, double length, String color, boolean filled) {
	        super(color, filled);
	        this.width = width;
	        this.length = length;
	    }

	    public double getWidth() {
	        return this.width;
	    }

	    public void setWidths(double width) {
	        this.width = width;
	    }

	    public double getLengths() {
	        return this.length;
	    }

	    public void setLengths(double length) {
	        this.length = length;
	    }

	    @Override
	    public double getArea() {
	        return width * length;
	    }

	    @Override
	    public double getPerimeter() {
	        return 2 * (width * length);
	    }

	    @Override
	    public String toString() {
	        return "Rectangle[Shape[" + this.color + "," + this.filled + "]" + "," + this.width + "," + this.length + "]";
	    }


		public char[] getLength() {
			return null;
		}
	}