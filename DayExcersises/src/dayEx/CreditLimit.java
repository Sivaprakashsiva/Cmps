package dayEx;

import java.util.Scanner;

public class CreditLimit {
	public static void main(String[] args) {
		
	Scanner scanner=new Scanner(System.in);
	int accountNumber=scanner.nextInt();
	int balance=scanner.nextInt();
    int totalCharge=scanner.nextInt();
    int totalcredits=scanner.nextInt();
    int creditLimit=scanner.nextInt();
    int newBalance=balance+totalCharge-creditLimit;
    System.out.println(newBalance);
    if(newBalance>creditLimit){
    	System.out.println("Credit limit exceeded");
    }
  }

}
