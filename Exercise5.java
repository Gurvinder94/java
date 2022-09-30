package firstJava;

import java.util.Arrays;
import java.util.HashMap;

public class Exercise5 {
	static int shortest(String a) {
		String[] arr = a.split(" ", 0);
		int res = arr.length;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length()<res) {
				res=arr[i].length();
			}
		}
		return res;
	}

	static int[] arrSort(int[] arr) {
		for(int j=arr.length-1;j>1;j--) {
			for(int k=0;k<j;k++) {
			if(arr[k+1]<arr[k]) {
			int temp=arr[k];
			arr[k]=arr[k+1];
			arr[k+1]=temp;
			}
			}
		}
		return arr;
	}
	
	static int arrSum(int[] arr) {
		arr=arrSort(arr);
		int low=arr[1];
		int sum=0;
		int high=arr[arr.length-1];
		for(int j=1;j<arr.length-1;j++) {
			if(arr[j]==low||arr[j]==high) {
				continue;
			}
			sum=sum+arr[j];
		}
		return sum;
	}
	
	static Boolean checkRepeat(String a) {
		HashMap<Character,Boolean> hMap=new HashMap<>();
		for(int i=0;i<a.length();i++) {
			if(hMap.get(a.charAt(i))!=null) {
				return false;
			}
			hMap.put(a.charAt(i), true);
		}
		
		return true;
	}
	static String reverseWord(String a) {
		String res="";
		char[] arr=a.toCharArray();
		for(int i=arr.length-1;i>=0;i--) {
			res=res+arr[i];
			}
			
		
		
		return res;
	}
	static String reverse(String a) {
		String res="";
		String[] arr = a.split(" ", 0);
		for(int i=0;i<arr.length;i++) {
			if(res.length()==0) {
				res=reverseWord(arr[i]);
				continue;
			}
			res=res+" "+reverseWord(arr[i]);
			}
			
		
		return res;
	}
	
	static Boolean balancedBraces(String a) {
		HashMap<Character,Integer> hMap=new HashMap<>();
		hMap.put('[', 0);
		hMap.put('{', 0);
		hMap.put('(', 0);
		char[] arr=a.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='['||arr[i]=='{'||arr[i]=='(') {
				int val=hMap.get(arr[i])+1;
				hMap.put(arr[i], val);
			} else if(arr[i]==']') {
				if(hMap.get('[')==0) {
					return false;
				} else {
					int val=hMap.get('[')-1;
					hMap.put('[', val);
				}
			}else if(arr[i]==')') {
				if(hMap.get('(')==0) {
					return false;
				} else {
					int val=hMap.get('(')-1;
					hMap.put('(', val);
				}
			}else if(arr[i]=='}') {
				if(hMap.get('{')==0) {
					return false;
				} else {
					int val=hMap.get('{')-1;
					hMap.put('{', val);
				}
			}
		
			}
			if(hMap.get('[')==0 &&hMap.get('{')==0&&hMap.get('(')==0) {
				return true;
			} else {
				return false;
			}
		
	}
	
	static String reverseCase(String a) {
		String res="";
		char[] arr=a.toCharArray();
		for(int i=0;i<arr.length;i++) {
			char b=' ';
		 if(Character.isUpperCase(arr[i])) {
				b= Character.toLowerCase(arr[i]);
			} else if(Character.isLowerCase(arr[i])) {
				 b= Character.toUpperCase(arr[i]);
			}
		 res=res+b;
			}
			
		
		return res;}
	
	
	static Integer evenOdd(int[] arr) {
		HashMap<String,Boolean> hMap=new HashMap<>();
		int list=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				if(hMap.get("even")==null) {
				hMap.put("even", true);}
				else {
					list=0;
					break;
				}
			} else {
				if(hMap.get("odd")==null) {
					hMap.put("odd", true);}
					else {
						list=1;
						break;
					}
			}
			}
		
			for(int j=0;j<arr.length;j++) {
				if(arr[j]%2!=list) {
					return arr[j];
				}
			}
			return null;
	}
	
	
	public static void main(String[] args) {
		
//		Task 1 Length of shortest word
		
System.out.println(shortest("Hi how are you!"));

//Task 2 Sum of array elements

int[] arr= {1,2,1,3,4,4};
System.out.println(arrSum(arr));


//Task 3 remove spaces from string

String myStr = "Hello world";
System.out.println(myStr.replace(" ", ""));


//Task 4 to check repeating letters
String sample = "isogram";
String sample2 = "instagram";
System.out.println(checkRepeat(sample));
System.out.println(checkRepeat(sample2));

//Task 4.b reverse string
String sample3 = "Be Happy and Stay Motivated";
System.out.println(reverse(sample3));

//Task 5 even or odd
int[] odd = {23,25,75,87,47,1,91,51,2};
int[] even = {22,44,64,76,98,12,43,54,90};
System.out.println(evenOdd(even));
System.out.println(evenOdd(odd));


//Task 6 reverse case of character
System.out.println(reverseCase("heLLo WOrLd”"));

//Task 7 to check balanced braces
System.out.println(balancedBraces("[})("));





	}

}
