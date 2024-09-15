package oopstask;

public class Circle {
	
	double radius1;
	double radius2;
	Circle(){
		this.radius1 = 7.0;
	}
	
	Circle(double radiusA,double radiusB){
		radius1 = radiusA; 
		radius2 = radiusB;
		
	}
	
	void radius()
	{
	
	System.out.println("radius1: "  +2 * Math.PI * radius1);
	System.out.println("radius2: " +2 * Math.PI * radius2);
	}


	public static void main(String[] args) {

	//	Circle C1 = new Circle();//
		Circle c1 = new Circle();
		c1.radius();
		Circle c2 = new Circle(8.0, 9.0);
		c2.radius();
		
		
	}

}
