package firstJava;

public class Exercise6_6 {

	public static void main(String[] args) {
		Programming a=new Programming();
		Programming b=new Programming("Java");

	}

}

class Programming{
	String keyword;
	public  Programming() {
		this.keyword="programming languages";
		System.out.println("I love "+this.keyword);
	}
public  Programming(String a) {
	this.keyword=a;
	System.out.println("I love "+this.keyword);
	}


}