package Polimofismo;

abstract class Shape {
    
	protected String color = "red";
    protected boolean filled = true;

    public Shape() {
    	
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape[" + this.color + "," + this.filled + "]";
    }

	public String ToString() {
		return null;
	}

	public void setLength(double length) {
		
	}

	public void setWidth(double width) {
		
	}
}

