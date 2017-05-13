package day3Ex;

class SuperCls {
	static{
		System.out.println("I am the boss");
	}
    SuperCls() {
       System.out.println("Super class empty cons");
       }	

    SuperCls(int num) {
	   this();
       System.out.println("Superclass 1Arg cons  "+num);
       }	
}

public class SubCls extends SuperCls{
	SubCls() {
		System.out.println("Sub class empty cons");
		}	

	SubCls(int num) {
		super(num);
		System.out.println("Sub class 1Arg cons  "+num);
		}
	static{
		System.out.println("I am the boss 2");
	}
	public static void main(String[] args) {
	       new SubCls(5);
	}
}
