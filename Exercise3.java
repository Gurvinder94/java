package firstJava;

import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class Exercise3 {
//	Method to check leap year
	static boolean yearCheck(int y) {
		if(y%4!=0) {
			return false;
		} else if((y%100==0 && y%400==0)|| y%100!=0 ) {
			return true;
		} else {
			return false;
		}
	}
public static void main(String[] args) {
	
//	Task 1
	
//	System.out.println("enter a number");
//	Scanner input= new Scanner(System.in);
//	int a= input.nextInt();
//	int i=1;
//	while(i<11) {
//		System.out.println(i*a);
//		i++;
//	}
	
//	Task 2
	
	
	
//	Scanner input= new Scanner(System.in);
//	
//	int i=1;
//	int sum=0;
//	while(i<11) {
//		System.out.println("enter a number");
//		int a= input.nextInt();
//		sum=sum+a;
//		i++;
//	}
//	System.out.println(sum);
//	System.out.println((double)sum/10);
	
	
//	Task 3
//	System.out.println("enter a number");
//	Scanner input= new Scanner(System.in);
//	int a= input.nextInt();
//	if(a==1||a==3||a==5||a==7||a==8||a==10||a==12) {
//		System.out.println("31 Days");
//	} else if (a==4||a==6||a==9||a==11) {
//		System.out.println("30 Days");
//	}
//	else if(a==2) {System.out.println("28 days");}
//	else {System.out.println("Invalid details");}
	
//	Task 4
	
//	System.out.println("enter a number");
//	Scanner input= new Scanner(System.in);
//	int a= input.nextInt();
//	int i=1;
//	int sum=0;
//	while(i<=a) {
//		System.out.println(i);
//		sum=sum+i;
//		i++;
//	}
//	System.out.println("sum = "+sum);
//	
	
//		Task 5
//	System.out.println("enter a number");
//	Scanner input= new Scanner(System.in);
//	int a= input.nextInt();
//	int sum=0;
//	while(a>0) {
//		int i=a%10;
//		System.out.println(i);
//		sum=sum+i;
//		a=a/10;
//	}
//	System.out.println(sum);

		
//		Task 6
	
//	System.out.println("enter three numbers");
//	Scanner input= new Scanner(System.in);
//	int a= input.nextInt();
//	int b= input.nextInt();
//	int c= input.nextInt();
//	if(a>b&& b>c) {
//		System.out.println("Decreasing");
//	} else if(a<b&& b<c) {
//		System.out.println("Increasing");
//	} else {
//		System.out.println("Neither increasing nor decreasing order");
//	}


	
//	Task 7
//	
//	Scanner input= new Scanner(System.in);
//	System.out.println("Input a month number:");	
//	int a= input.nextInt();
//	System.out.println("Input a year:");	
//	int b= input.nextInt();
//	String month[]= {"January","February","March","April","May","June","July","August","September","October","November","December"};
//	if(a==1||a==3||a==5||a==7||a==8||a==10||a==12) {
//		System.out.println(month[a-1]+" "+b+" has 31 Days");
//	} else if (a==4||a==6||a==9||a==11) {
//		System.out.println(month[a-1]+" "+b+" has 30 Days");
//	}
//	else if(a==2&&!yearCheck(b)) {System.out.println(month[a-1]+" "+b+" has 28 Days");}
//	else if(a==2&&yearCheck(b)) {System.out.println(month[a-1]+" "+b+" has 29 Days");}
//	else {System.out.println("Invalid details");}
//	
	
//	Task 8
//	
//	Scanner input= new Scanner(System.in);
//	System.out.println("Input a year");	
//	int a= input.nextInt();
//	if(yearCheck(a)) {
//		System.out.println("Leap year");	
//	} else {
//		System.out.println("Not a Leap year");
//	}
	
//	Task 9
	
//		Scanner input= new Scanner(System.in);
//	System.out.println("Input a number");	
//	int a= input.nextInt();
//	for(int i=1;i<=a;i++) {
//		for(int j=1;j<=i;j++) {
//			System.out.print(j);	
//		}
//		System.out.println();	
//	}
	
//	Task 10
	
//	Scanner input= new Scanner(System.in);
//System.out.println("Input a number");	
//int a= input.nextInt();
//int[] arr;
//int[] temp;
//arr=new int[a];
//temp=new int[a];
//for(int i=1;i<=a;i++) {
//	for(int j=1;j<=(a-i);j++) {
//		System.out.print(" ");
//	}
//	
//	for(int k=0;k<i;k++) {
//		if(k==0||k==i-1) {
//			temp[k]=1;
//			System.out.print(1+" ");
//		} else {
//			temp[k]=arr[k-1]+arr[k];
//			System.out.print(temp[k]+" ");
//		}
//			
//	}arr=temp.clone();
//	
//	System.out.println();
//}
	
//	Task 11
//	
//	Scanner input= new Scanner(System.in);
//System.out.println("Input two float numbers");	
//Double a= input.nextDouble();
//Double b= input.nextDouble();
//	if(Math.floor(a*100)==Math.floor(b*100)) {
//		System.out.println("Both numbers are same");
//	} else {
//		System.out.println("Numbers are different");
//	}
	
}
}
