package excise.day.four;

public class ParmTest {
	public static void main (String [] args){
		/*
		 * Test 1: Methods can't modify numeric parameters
		 */
		System.out.println("Testing tribleValue:");
		double precent = 10;
		System.out.println("Before: precent= " + precent);
		tripleVale(precent);
		System.out.println("After: percent= " + precent);
		
		/*
		 * Test 2: Methods can change the state of object parameters
		 */
		System.out.println("\nTesting tribleSalary:");
		EmployeeParm harry = new EmployeeParm("Harry", 5000);
		System.out.println("Before: salary= " + harry.getSalary());
		tripleSalary(harry);
		System.out.println("After: salary= " + harry.getSalary());
		
		/*
		 * Test 3: Methods can't attach new objects to object parameters
		 */
		System.out.println("\nTesting swap:");
		EmployeeParm a = new EmployeeParm("Jack", 8000);
		EmployeeParm b = new EmployeeParm("Bob", 6000);
		
		System.out.println("Before: a= " + a.getName());
		System.out.println("Before: b= " + b.getName());
		
		swap(a, b);
		System.out.println("After: a= " + a.getName());
		System.out.println("After: b= " + b.getName());
	}
	
	public static void tripleVale(double x){
		x = 3 * x;
		System.out.println("End of method: x= " +x);
	}
	
	public static void tripleSalary(EmployeeParm x){
		x.raiseSalary(200);
		System.out.println("End of method: salary= " + x.getSalary());
	}
	
	public static void swap(EmployeeParm x, EmployeeParm y){
		EmployeeParm temp = x;
		x = y;
		y = temp;
		System.out.println("End of method: x= " + x.getName());
		System.out.println("End of method: y= " + y.getName());
	}
}
