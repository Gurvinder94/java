package firstJava;


import java.util.Arrays;
import java.util.HashMap;

public class Exercise4 {
	static int[] arrShift(int[] arr,int pointer, int i, Integer value) {
		if(value!=null) {
			arr[i]=value;
		}
		for(int j=i;j<pointer;j++) {
			int temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
		}
		return arr;
	}
	static int[][] addMatrix(int[][] a,int[][] b) {
		int[][] res=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[1].length;j++) {
				res[i][j]=a[i][j]+b[i][j];
			}
		}
		return res;
	}
	
	static Integer[] findSum(int[] arr,int number) {
		Integer[] res= new Integer[2];
	int i=0;
	int j=arr.length-1;
	while (i<j) {
		if(arr[i]+arr[j]>number) {
			j--;
		} else if(arr[i]+arr[j]<number) {
			i++;
		} else {
			res[0]=arr[i];
			res[1]=arr[j];
			return res;
		}
	}
	res[0]=null;
	res[1]=null;
		return res;
	}
	
	static int[] sortZero(int[] arr) {
		int pointer= arr.length-1;
		for(int j=0;j<arr.length;j++) {
			if(j>pointer) {
				break;
			}
			if(arr[j]==0) {
				arr=arrShift(arr, pointer, j, null);
				pointer--;
				j--;
			}
			
		}
		return arr;
	}
	static int[] closeZero(int[] arr) {
		double sum=Double.POSITIVE_INFINITY;
		int[] numbers=new int[2];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(Math.abs(arr[i]+arr[j])<sum) {
					sum=Math.abs(arr[i]+arr[j]);
					numbers[0]=arr[i];
					numbers[1]=arr[j];
				}
			}
		}
		return numbers;
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
	static int[] sortAlternative(int[] arr) {
		arr=arrSort(arr);
		int[] res= new int[arr.length];
		int i=0;
		int j=arr.length-1;
		int k=0;
		while (i<=j) {
			if(i==j) {
				res[k]=arr[i];
				break;
			}
			res[k]=arr[j];
			k++;
			j--;
			res[k]=arr[i];
			i++;
			k++;
			
		}
		return res;
	}
	
	static int[] arrRemoveDuplicate(int[] arr, Integer value) {
		HashMap<Integer,Boolean> hMap=new HashMap<>();
		
		int pointer=arr.length-1;
		for(int i=0;i<arr.length;i++) {
			if(hMap.get(arr[i])==null) {
				hMap.put(arr[i], true);
			} else {
				if(i>pointer) {
					break;
				}
				arrShift(arr, pointer, i, value);
				pointer--;	
				i--;
			}
		}
		if(value==null) {
			int[] newArr= new int[pointer+1];
			System.arraycopy(arr, 0, newArr, 0, pointer+1);
			return newArr;
		} else {
			return arr;
		}
	}

	public static void main(String[] args) {
int[] arr= {1,2,4,44,2,1,0,3,1,5,3,1,2,2,3,4,0,4,3,2,1,2,1,1,22};
int[] arr2= {1,2,4,44,2,1,0,3,1,5,3,1,2,2,3,4,0,4,3,2,1,2,1,1,22};

//Task 1 program to remove duplicate
System.out.println(Arrays.toString(arrRemoveDuplicate(arr,null)));

//Task 2 program to find second largest
System.out.println(arrSort(arrRemoveDuplicate(arr,null))[arrRemoveDuplicate(arr,null).length-2]);

//Task 3 program to find second smallest
System.out.println(arrSort(arrRemoveDuplicate(arr,null))[1]);

//Task 4 adding two matrices
int [ ] [ ] matrix1 = {   { 2, 1, 2, 2, 1 },
        { 1, 2, 1, 2, 2 },
        { 1, 1, 1, 2, 2 },
        {  5, 4, 2, 2, 5 }
    };
int [ ] [ ] matrix2 = {   { 20, 18, 22, 20, 16 },
        { 18, 20, 18, 21, 20 },
        { 16, 18, 16, 20, 24 },
        {  25, 24, 22, 24, 25 }
    };
System.out.println(Arrays.deepToString(addMatrix(matrix1, matrix2)));

//Task 5 program to sort all zeros
System.out.println(Arrays.toString(sortZero(arr2)));

//Task 6 program to convert duplicate into zeros
System.out.println(Arrays.toString(arrRemoveDuplicate(arr,0)));

//Task 7 sum of smallest and largest
int smallest=arrSort(arrRemoveDuplicate(arr,null))[0];
int largest=arrSort(arrRemoveDuplicate(arr,null))[arrRemoveDuplicate(arr,null).length-1];
System.out.println(smallest+largest);

//Task 8 remove duplicate and length of array
System.out.println(arrRemoveDuplicate(arr,null).length);

//Task 9 to find two elements where sum equal to given integer
int[] sample= {1,0,1,2,4,5,6};
int target=4;
arrSort(arrRemoveDuplicate(sample,null));
System.out.println(findSum(sample, target)[0]+" "+findSum(sample, target)[1]);

//Task 10 to find sum closest to zero

int[] sample1= {-4,-5,-7,1,0,1,2,4,5,6};
System.out.println(closeZero(sample1)[0]+" "+closeZero(sample1)[1]);

//Task 11 sort array with maximum minimum

int[] arr3= {1,2,4,44,2,1,0,3,1,5,3,1,2,2,3,4,0,4,3,2,1,2,1,1,22};
System.out.println(Arrays.toString(sortAlternative(arr3)));


	}

}
