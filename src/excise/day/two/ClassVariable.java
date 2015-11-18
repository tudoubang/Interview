package excise.day.two;

public class ClassVariable {
	private static double salary;
	public static final String DEPARTMENT = "Development";
	
	public static void main(String [] args){
		String greeting  = "Hello world";
		System.out.println(greeting.substring(0,5));;
		salary = 1000;
		System.out.println(DEPARTMENT + " average salary " + salary);
	}
}
