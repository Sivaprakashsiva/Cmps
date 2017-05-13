package dayEx;

import java.util.Scanner;

public class DiscreteArray {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int []arr=new int[3];
		int []arr1=new int[3];
		System.out.println("enter 1st array");
		for(int i=0;i<3;i++){
			arr[i]=scanner.nextInt();
		}
		System.out.println("enter 2nd array");
		for(int i=0;i<3;i++){
			arr1[i]=scanner.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr1.length;j++){
				if(arr[i]==arr1[j]){
					arr[i]=00000;
					arr1[j]=00000;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=00000){
				System.out.println(arr[i]);
			}
		}
		for(int i=0;i<arr1.length;i++){
			if(arr1[i]!=00000){
				System.out.println(arr1[i]);
			}
		}
		scanner.close();
	}

}
