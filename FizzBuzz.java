package Ejercicios;


public class FizzBuzz {

	public static void main(String[] args) {
		
		for(int a = 1 ; a<20 ; a++) {
			
			if( a % 3 == 0 & a % 5 == 0) System.out.println("FizzBuzz");
			else {
				if( a % 3 == 0) System.out.println("Fizz");
				if( a % 5 == 0) System.out.println("Buzz");
			}
			if( a % 3 != 0 & a % 5 != 0) System.out.println(a);
				
		}
				

	}

}
