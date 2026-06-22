abstract class Shape {
	double area;
	
	Shape(){
		
	}

	Shape(double area) {
		this.area = area;
	}

	abstract double calArea();
	
	double getArea() {
		return area;
	}

	void setArea(double area) {
		this.area = area;
	}
	
	void display() {
		System.out.println("Area: "+this.area);
	}
	
}

class Circle extends Shape{
	double radius;
	
	Circle(){
		super();
		
	}

	Circle(double area,double radius) {
		super(area);
		
		this.radius = radius;
	}

	double calArea() {
		return area= 3.14 * radius * radius;
	}
	
	double getRadius() {
		return radius;
	}

	void setRadius(int radius) {
		this.radius = radius;
	}
	
	void display() {
		super.display();
		
		System.out.println("Radius: "+this.radius);
	}
	
}

 class Triangle extends Shape{
	double base;
	double height;
	
	 Triangle() {
		super();
		
	}

	 Triangle(double area, double base, double height) {
		super(area);
		
		this.base =base;
		this.height = height;
	 }

	 double calArea() {
		 return area = 0.5 * base * height;
	 }
	 
	 double getBase() {
		 return base;
	 }

	 void setBase(double base) {
		 this.base = base;
	 }

	 double getHeight() {
		 return height;
	 }

	 void setHeight(double height) {
		 this.height = height;
	 }
	 
	 void display() {
		 super.display();
		 
		 System.out.println("Base: "+this.base);
		 System.out.println("Height: "+this.height);
	 }
}

class Rectangle extends  Shape{
	double length;
	double breadth;
	
	Rectangle(){
		super();
	}

	Rectangle(double area,double length, double breadth) {
		super(area);
		
		this.length = length;
		this.breadth = breadth;
	}

	double calArea() {
		return area = length * breadth;
	}
	
	double getLength() {
		return length;
	}

	void setLength(double length) {
		this.length = length;
	}

	double getBreadth() {
		return breadth;
	}

	void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	void display() {
		super.display();
		
		System.out.println("Length: "+this.length);
		System.out.println("Breadth: "+this.breadth);
	}
}

public class ShapeClass {
    public static void main(String[] args) {
	
    	Shape s;
    	
    	s = new Circle(0,5);
    	s.calArea();
    	s.display();
    	
    	System.out.println();
    	
    	s = new Triangle(0,10,6);
    	s.calArea();
    	s.display();
    	
    	System.out.println();
    	
    	s = new Rectangle(0,7,4);
    	s.calArea();
    	s.display();
    	
}
}
