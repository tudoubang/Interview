package excise.day.two;

import java.util.Arrays;

public class arrary {
	
	public static void main(String [] args){
		int[] arrarys = {10,11,12,13,14,15,16,17,18,19,20,1,2,3,4,5,6,7};
		int[] arrs = Arrays.copyOf(arrarys,2 * arrarys.length);
		Arrays.sort(arrarys);
		for(int i : arrarys){
			System.out.print(" " + i);
		}
//		for(int i : arrs){
//			System.out.println(i);
//		}
	}
}
