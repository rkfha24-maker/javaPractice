package chapter4;

public class practice3 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		 	}
			System.out.println("-----------");
		
		for (int i = 1; i <= 5; i++) {
			for(int j = 5; j >= i; j-- ) {
				System.out.print("*");
			}
			System.out.println("");
			} 
			System.out.println("-----------");
	
		for (int i = 1; i <= 5; i++) {
			for(int j = 5; j >= i; j-- ) {
			System.out.print("");
			}
			System.out.println("");  //여기 까지 공백... ?
			}
			for(int e = 0; e<(e*2+2); e++ ) {
			} 
			System.out.println("*");
			}
			}
