package firstJava;

public class Exercise6_4 {

	public static void main(String[] args) {
		Rectangle a=new Rectangle();
		Rectangle b=new Rectangle(2);
		Rectangle c=new Rectangle(3,4);
		
		System.out.println(a.area());
		System.out.println(b.area());
		System.out.println(c.area());

	}

}

class Rectangle{
	int length;
	int breadth;
	public Rectangle() {
		this.length=0;
		this.breadth=0;
	}
public Rectangle(int a) {
	this.length=a;
	this.breadth=a;
	}
public Rectangle(int a,int b) {
	this.length=a;
	this.breadth=b;
}
int area() {
	return this.length*this.breadth;
}
}