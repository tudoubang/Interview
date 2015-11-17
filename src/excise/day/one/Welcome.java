/*
 * This program display a greeting from the authors.
 * @version 1.20 2015-11-17
 * @author Tudoubang
 */

package excise.day.one;

public class Welcome {
	public static void main(String [] args){
		String[] greeting = new String[3];
		greeting[0] = "Welcome to Core Java.";
		greeting[1] = "by Can Tudoubang";
		greeting[2] = "and Gary Cornell";
		
		for(String g : greeting)
			System.out.println(g);
	}
}
