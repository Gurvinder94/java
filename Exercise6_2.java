package firstJava;

public class Exercise6_2 {

	public static void main(String[] args) {
		Employee a=new Employee("Robert", 1994, "64C- Walls Streat");
		Employee b=new Employee("Sam", 2000, "68D- Walls Streat");
		Employee c=new Employee("John", 1999, "26B- Walls Streat");
		System.out.println("Name"+"			"+"Year of joining"+"			"+"Address");
		System.out.println(a.printDetail());
		System.out.println(b.printDetail());
		System.out.println(c.printDetail());

	}

}


class Employee{
	String name;
	int year;
	String address;
	
	public Employee(String n,int y,String a) {
		this.name=n;
		this.year=y;
		this.address=a;
		
		
				}
	String printDetail() {
		return this.name+"			"+this.year+"			"+this.address;
	}
}
