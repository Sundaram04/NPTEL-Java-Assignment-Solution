// Example of static variable 

public class DemoCircle {
	static int circlecount = 0; // class variable
	public double x,y,r; // instance variable;
	public DemoCircle(double x, double y, double r) {
		this.x = x;
		this.y = y;
		this.r = r;	
	}
	public DemoCircle(double r){
		this(0.0,0.0,r);
		circlecount++;
	}
	public DemoCircle(DemoCircle c) {
		this(c.x, c.y, c.r);
		circlecount++;
	}
	public DemoCircle() {
		this(0.0,0.0,0.1);
		circlecount++;
	}
	public double circumference() {
		return (2*3.14159*r);
	}
	public double area() {
		return 3.14159*r*r;
	}
	
	public static void main(String args[]) {
		DemoCircle c1 = new DemoCircle();
		System.out.println("c1#" + c1.circlecount);
		
		DemoCircle c2 = new DemoCircle(5.0);
		System.out.println("c2#" + c1.circlecount);
		
		DemoCircle c3 = new DemoCircle(c1);
		System.out.println("c3#" + c1.circlecount);
		
		System.out.println("c1# " + c1.circlecount + " c2# " + c1.circlecount + " c3# " + c1.circlecount);
	}
}