package excise.day.five;

public class Method {
	
	public static void main(String [] args){
		double percent = 10;
		trip(percent);
		System.out.println("percent= " + percent);
//		Method harry = new Method();
//		trip(harry);
		System.out.println("percent= " + percent);
	}
	public static void trip(double x){
		x = 3 * x;
		System.out.println("x= " + x);
	}
}
