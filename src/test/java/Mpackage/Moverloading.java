package Mpackage;

public class Moverloading {
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public  void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	 
	public static void main (String[] args) {
	
		/*
		 * Moverloading ad=new Moverloading(); add(10, 30); ad.add(3, 5, 7);
		 
		 */
		
		 int a=10;
		 int b=20;
		 int c=30;
        System.out.println( a > b);  
        System.out.println(--a + --b);
        

		
	}

	
	

}
