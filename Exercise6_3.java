package firstJava;

public class Exercise6_3 {

	public static void main(String[] args) {
		Student a=new Student();
		Student b= new Student("ABC");
		System.out.println(a.printName());
		System.out.println(b.printName());

	}

}

class Student{
	String name;
	public Student(String name) {
		this.name=name;
	}
	public Student(){
	this.name="Unknown";	
	}
	String printName() {
		return this.name;
	}
}
