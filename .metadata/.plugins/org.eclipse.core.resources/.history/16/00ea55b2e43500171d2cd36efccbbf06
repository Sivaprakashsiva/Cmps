package day3Ex;

public class Static {
	private static int count=6;
	private int num=5;
	
	static{
		count++;
		System.out.println("Static blk count first "+count);
	}
	
	public static void firstSta(){
		count++;
		System.out.println("first Static mtd  "+count);
	}
	
	public void firstMtd(){
		count++;
		num++;
		System.out.println("firstmtd "+count+"  num  "+num);
	}
	public static void main(String[] args) {
		Static sta=new Static();
		System.out.println(sta.num);
		System.out.println(count);
		sta.firstMtd();
		firstSta();
	}
	

}
