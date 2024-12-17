package CircleQ2;

public class Circle {
	
	class CircleQ2 implements GeometricaObjecto {
	
		private double radius;

	    public CircleQ2(double radius) {
	        this.radius = radius;
	    }

	    @Override
	    public double getArea() {
	        return Math.PI * radius * radius;
	    }

	    @Override
	    public double getPerimeter() {
	        return 2 * Math.PI * radius;
	    }

	    @Override
	    public String toString() {
	        return "Circle[radius=" + this.radius + "]";
	    }
	}

}
