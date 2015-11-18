package excise.day.two;

import java.util.Scanner;
import java.math.BigInteger;

public class BigIntegerTest {
	public static void main (String [] args){
		Scanner in  = new Scanner(System.in);
		
//		System.out.println("How many numbers do you need to draw?");
//		int k = in.nextInt();
//		
//		System.out.println("What is the highest number you can draw?");
//		int n = in.nextInt();
//		
//		BigInteger loteryOdds = BigInteger.valueOf(1);
//		
//		for(int i=1; i<=k; i++){
//			loteryOdds = loteryOdds.multiply(BigInteger.valueOf(n-i+1)).divide(BigInteger.valueOf(i));
//		}
//		
//		System.out.println("You oddrs are 1 in " + loteryOdds + ". Good luck");
		
		BigInteger a,b;
		System.out.println("input a: ");
		a = in.nextBigInteger();
		System.out.println("input b: ");
		b = in.nextBigInteger();
		System.out.println("a+b = " + a.add(b));
		System.out.println("a-b = " + a.subtract(b));
		System.out.println("a*b = " + a.multiply(b));
		System.out.println("a/b = " + a.divide(b));
		System.out.println("a%b = " + a.mod(b));
		
	}
}
