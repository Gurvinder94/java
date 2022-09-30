package firstJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Exercise7 {
	static String reverse(String a) {
		String res="";
		char[] arr=a.toCharArray();
		for(int i=arr.length-1;i>=0;i--) {
			res=res+arr[i];
			}		
		return res;
	}
	
	static Boolean uniqueString(String a) {
		char[] arr=a.toCharArray();
		HashMap<Character,Boolean> hMap=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(hMap.get(arr[i])==null) {
				hMap.put(arr[i], true);
			} else {
				return false;
			}
			}		
		return true;
	}
	
	static double factorial(int a) {
		double res=1;
		for(int i=a;i>0;i--) {
			res=res*i;
		}
			
		return res;
	}
	
	static Integer numberOfwords(String a) {
		String[] arr = a.split(" ", 0);
			
		return arr.length;
	}
	
	static HashMap<Character,Integer> count(String a) {
		char[] arr=a.toCharArray();
		HashMap<Character,Integer> hMap=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==' ') {
				continue;
			}
			if(hMap.get(arr[i])==null) {
				hMap.put(arr[i], 1);
			} else {
				int num=hMap.get(arr[i])+1;
				hMap.put(arr[i], num);
			}
			}		
		return hMap;
	}
	
	static Boolean armStrong(Integer a) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int num=a;
		double res=0;
		while (a>0) {
			arr.add(a%10);
			a=a/10;
			
		}
		for(int i=0;i< arr.size();i++) {
			res=res+Math.pow(arr.get(i), arr.size());
		}
		return res==num;
	}
	
	static Integer max(Integer[] arr) {
		int max=0;
		
		for(int i=0;i< arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	
	
	static String intersection(Integer[] a, Integer[] b) {
		HashMap<Integer,Boolean> hMap=new HashMap<>();
		String res="";
		for(int i=0;i<a.length;i++) {
			hMap.put(a[i], true);
			}	
		for(int i=0;i<b.length;i++) {
			if(hMap.get(b[i])!=null) {
				hMap.put(b[i], null);
				if(res.length()==0) {
					res=String.valueOf(b[i]);
				} else {
				res=res+","+b[i];}
			}
			}	
		
		return res;
	}
	
	static Character nonRepeated(String a) {
		LinkedHashMap<Character, Integer> hmap
        = new LinkedHashMap<Character, Integer>();
		char[] arr=a.toCharArray();
		Character res=' ';
		for(int i=0;i<arr.length;i++) {
			if(hmap.get(arr[i])==null) {
				hmap.put(arr[i], 1);
			} else {
				int val=hmap.get(arr[1])+1;
				hmap.put(arr[i], val);
			}
			}	
		 Set<Character> keys = hmap.keySet();
		for(Character ch:keys) {
		if(hmap.get(ch)==1) {
			res=ch;
			break;
		}
		} return res;
	}
	
	static double permutation(String a) {
		HashMap<Character,Integer> hMap=new HashMap<>();
		char[] arr=a.toCharArray();
		double den=1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==' ') {
				continue;
			}
			if(hMap.get(arr[i])==null) {
				hMap.put(arr[i], 1);
			} else {
				int val=(hMap.get(arr[i]))+1;
				hMap.put(arr[i], val);
			}
			}	
		 Set<Character> keys = hMap.keySet();
		for(Character ch:keys) {
		if(hMap.get(ch)>1) {
			den=den*factorial(hMap.get(ch));
		}
		} return factorial(arr.length)/den;
	}
	
	
	static void subarray(Integer[] arr,int sum) {
		
		for(int i=0;i<arr.length;i++) {
			ArrayList<Integer> temp = new ArrayList<Integer>();

			int total=sum;
			temp.add(arr[i]);
			total=total-arr[i];
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]==total) {
					temp.add(arr[j]);
					System.out.println(temp);
					total=total-arr[j];
					continue;			
				}
					total=total-arr[j];
					temp.add(arr[j]);
			}	}	}
	

	 static void stringPermutation(String str, String res){
		 if (str.length() == 0) {
			 System.out.print(res + " ");
			 return;
		 }
		 for (int i = 0; i < str.length(); i++) {
			 char ch = str.charAt(i);
			 String ros = str.substring(0, i) +
					 str.substring(i + 1);		 
				 stringPermutation(ros, res + ch);	
		 }
	 	}
	
	static void sortByKeys( HashMap<Integer, String> hash_map) {
		ArrayList<Integer> arr = new ArrayList<Integer>(hash_map.keySet());
		Collections.sort(arr);
		for (Integer i : arr) {
			System.out.println(i);
		}
	}
	static void sortByValues( HashMap<Integer, String> hash_map) {
		ArrayList<String> arr = new ArrayList<String>(hash_map.values());
//		arr.sort((a1, a2) -> a1.compareTo(a2));
		Collections.sort(arr);
		for (String i : arr) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
//		Task 1 Reverse a String
		System.out.println(reverse("this is reversed"));
		
//		Task 2 Find non repeated character;
		System.out.println(nonRepeated("isisreversed"));
		
//		Task 3 Find intersection of array;
		Integer[] arr= {22,11,23,5,3,2,4};
		Integer[] arr2= {1,11,2,3,3,3,4};
		System.out.println(intersection(arr,arr2));
		
//		Task 4 Find if string has unique characters;
		System.out.println(uniqueString("abcdefgh"));
		
//		Task 5 Count number of words;
		System.out.println(numberOfwords("abcdefgh guygug hiuh"));
		
//		Task 6 armstrong number;
		System.out.println(armStrong(370));
		
//		Task 7 count occurance of character;
		System.out.println(count("giguyfgydts5su 6su6du"));
		
//		Task 8 permutations;
		System.out.println(permutation("ybghjhbuytb"));
		
//		Task 9 maximum value in array;
		System.out.println(max(arr));
		
//		Task 10 combination of string;
		stringPermutation("abc", "");
		System.out.println(" ");

//		Task 10 combination of string;
		stringPermutation("abc", "");
		System.out.println(" ");
		
//		Task 11 sorting hashmap by keys;
      HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		  
      hashMap.put(10, "b");
      hashMap.put(5, "a");
      hashMap.put(20, "d");
      hashMap.put(25, "c");
      hashMap.put(15, "e");
	sortByKeys(hashMap);	
	System.out.println(" ");
//		Task 11 sorting hashmap by values;
	sortByValues(hashMap);
	
		
//		Task 12 subarrays with given sum;
	    Integer nums[] = { 3, 4, -7, 1, 3, 3, 1, -4 };
		subarray(nums,7);
		
	}

}
