package javaloops;
	
	abstract class Shape {
	    int b = 20;
	    abstract public void calculateArea();
	}

	public class Rectangle extends Shape {
	    public static void main(String args[]) {
	        Rectangle obj = new Rectangle();
	        obj.b = 200;
	        obj.calculateArea();
	    }
	    public void calculateArea() {
	        System.out.println("Area is " + (b * b));
	    }
	}


