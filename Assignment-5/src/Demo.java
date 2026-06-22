class Shape{
	double area;
	
	Shape(){
}
	
	Shape(double area){
		this.area = area;
	}
	
	void setArea(double area) {
		this.area = area;
	}
	
	double getArea() {
		return this.area;
	}
	
	void calculatorArea() {
//		System.out.println("Area not defined");
	}
	
	void display() {
		System.out.println("Area: "+this.area);
	}
}
//Base class ends here

class Circle extends Shape{
	double radius;
	
	Circle(){
}
	
	Circle(double area, double radius){
		super(area);
		this.radius = radius;
	}
	
	void setRadius(double radius) {
		this.radius = radius;
	}
	
	double getRadius() {
		return this.radius;
	}
	
	void calculatorArea() {
		super.calculatorArea();
		area = 3.14 * radius * radius;
	}
	
	void display() {
		super.display();
		System.out.println("Radius: "+this.radius);
	}
}
//Circle class ends here

class Triangle extends Shape{
	double base;
	double height;
	
	Triangle(){
		
	}
	
	Triangle(double area,double base,double height){
		super(area);
		this.base = base;
		this.height = height;
	}
	
	void setBase(double base) {
		this.base = base;
	}
	
	double getBase() {
		return this.base;
	}
	
	void calculateArea() {
		super.calculatorArea();
        area = 0.5 * base * height;
    }
	
	void display() {
		super.display();
		System.out.println("Base: "+this.base);
		System.out.println("Height: "+this.height);
	}
}
//Triangle class ends here

class Rectangle extends Shape{
	double length;
	double breadth;
	
	Rectangle(){
		
	}
	
	Rectangle(double area,double length,double breadth){
		super(area);
		this.length = length;
		this.breadth= breadth;
	}
	
	void setLength(double length) {
		this.length = length;
	}
	
	double getLength() {
		return this.length;
	}
	
	void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	double getBreadth() {
		return this.breadth;
	}
	
	void calculateArea() {
		super.calculatorArea();
        area = length * breadth;
    }
	
	void display() {
		super.display();
		System.out.println("Length: "+this.length);
		System.out.println("Breadth: "+this.breadth);
	}
	
}
//Rectangle class ends here

public class Demo {
   public static void main(String[] args) {
	
	   Circle c1 = new Circle(0,5);
	   c1.calculatorArea();
	   System.out.println("=======Circle========");
	   c1.display();
	   
	   Triangle t1 = new Triangle(0,10, 6);
	   t1.calculateArea();
	   System.out.println("=======Triangle========");
	   t1.display();
	   
	   Rectangle r1 = new Rectangle(0,7,4);
	   r1.calculateArea();
	   System.out.println("=========Rectangle========");
	   r1.display();
}
}
