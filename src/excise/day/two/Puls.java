package excise.day.two;

public class Puls {
	public static void main(String [] arges){
		int m = 7;
		int n = 7;
		int a = 2 * ++m;
		int b = 2 * n++;
		System.out.println("Now a is: " + a + " , m is: " + m);
		System.out.println("Now b is: " + b + " , n is: " + n);
	}
}
