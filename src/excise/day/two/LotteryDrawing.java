package excise.day.two;

import java.util.Scanner;
import java.util.Arrays;

public class LotteryDrawing {
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("How many numbers do you need to draw?");
		int k = in.nextInt();
		
		System.out.println("What is the highest number you can draw?");
		int n = in.nextInt();
		
		int[] numbers = new int[n];
		for(int i=0; i<numbers.length; i++){
			numbers[i] = i+1;
//			System.out.print("numbers[ "+i+" ]= " + (i+1) + "  ");
		}
//		System.out.println("");
		
		int[] result = new int[k];
		for(int i=0; i<numbers.length; i++){
			int r = (int)(Math.random() * n);
			result[i] = numbers[r];
			numbers[r] = numbers[n-1];
			n--;
		}
		Arrays.sort(result);
		for(int r : result){
			System.out.print(" "+r);
		}
	}
}
