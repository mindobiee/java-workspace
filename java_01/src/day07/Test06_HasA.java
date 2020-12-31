package day07;

public class Test06_HasA {

	public static void main(String[] args) {
		Circle c = new Circle(new Point(5,5), 3); //중심점과 반지름 대입! 
		System.out.println(c); // toString() 값이 나옴. 
		
		Circle c1 = new Circle();
		// setter 사용 
		c1.setP(new Point(7,9));
		c1.setR(3);
		System.out.println(c1);
		
		c1.setR(c1.getR()*2); // 반지름 2배로 set
		System.out.println(c1);
	}

}

class Point{
	int x;
	int y;
	
	public Point() {
		super();
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}

class Circle {
	private Point p; // has a 관계 
	private int r; // 반지름
	
	public Circle() {
		super();
	}
	
	public Point getP() {
		return p;
	}

	public void setP(Point p) {
		this.p = p;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public Circle(Point p, int r) {
		super();
		this.p = p;
		this.r = r;
	}
	@Override
	public String toString() {
		return "Circle [p=" + p + ", r=" + r + "]";
	}
	
}

