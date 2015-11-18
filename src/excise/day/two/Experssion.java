package excise.day.two;

public class Experssion {
	public static void main (String []  args){
		int a = 3;
		int b = 4;
		System.out.println("!=: " + (a != b));
		System.out.println("&&: " + (a<b && a>b));
		System.out.println("||: " + (a>b || a<b));
		System.out.println("Three: " + (a>b?a:b));
		
	}
}
