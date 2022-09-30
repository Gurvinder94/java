package firstJava;

import java.util.Scanner;

public class Exercise6_1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter real and imaginary part of first number");
		double r= input.nextDouble();
		double i= input.nextDouble();
		Complex a=new Complex(r, i);
		System.out.println("enter real and imaginary part of second number");
		double r1= input.nextDouble();
		double i1= input.nextDouble();
		Complex b=new Complex(r1, i1);
		System.out.println("sum is "+a.sum(b));
		System.out.println("product is "+a.product(b));
		System.out.println("difference is "+a.difference(b));

	}

}

 class Complex{
	double real;
	double imaginary;
	 Complex(double real, double imaginary){
		 this.real=real;
		 this.imaginary=imaginary;
	 }
	 
	 String sum(Complex second) {
		 double real1=this.real+second.real;
		 double imaginary2=this.imaginary+second.imaginary;
		 return real1+" + "+"i "+imaginary2;
	 }
	 
	 String difference(Complex second) {
		 double real1=this.real-second.real;
		 double imaginary2=this.imaginary-second.imaginary;
		 return real1+" + "+"i "+imaginary2;
	 }
	 
	 String product(Complex second) {
		 double real1=this.real*second.real;
		 double imaginary2=this.imaginary*second.imaginary;
		 return real1+" + "+"i "+imaginary2;
	 }
}