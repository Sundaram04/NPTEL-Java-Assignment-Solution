// Example of static variable 
// A class method and instance method


public class DemoCircleII {
	static int circlecount = 0; // class variable
	public double x,y,r; // instance variable;
	public DemoCircleII(double x, double y, double r) {
		this.x = x;
		this.y = y;
		this.r = r;	
	}
	public DemoCircleII(double r){
		this(0.0,0.0,r);
		circlecount++;
	}
	public DemoCircleII(DemoCircleII c) {
		this(c.x, c.y, c.r);
		circlecount++;
	}
	public DemoCircleII() {
		this(0.0,0.0,0.1);
		circlecount++;
	}
	
	// An instance method. Return the bigger of two circles.
	public Circle bigger(Circle c) {
		if(c.r > r) return c;
		else return this;
	}
	
	// Class method: Return the bigger of two classes
	public static Circle bigger (Circle a, Circle b) {
		if (a.r > b.r) return a;
		else return b;
	}
	
	public static void main(String args[]) {
		Circle a = new Circle(2.0);
		Circle b = new Circle(3.0);
		Circle c = a.bigger(b);
		Circle d = Circle.bigger(a, b);
	}
}