package dayEx;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String str="siva";
		String str1="prakash";
		System.out.println(str+"  "+str1);
		char []arr=new char[str.length()];
		char []arr1=new char[str1.length()];
		if(str.length()==str1.length()){
			for(int i=0;i<str1.length();i++){
				
				arr[i]=Character.toLowerCase(str.charAt(i));
				arr1[i]=Character.toLowerCase(str1.charAt(i));
			}
			Arrays.sort(arr);
			Arrays.sort(arr1);
			//System.out.println(arr[1]+"  "+arr1[1]);
			int count=0;
			for(int j=0;j<str.length();j++){
				if(arr[j]==arr1[j]){
					count++;
				}
			}
			if(count==str.length()){
				System.out.println("Anagram");
			}
		}
		else{
	       System.out.println("Not Anagram");
		}
	}

}
