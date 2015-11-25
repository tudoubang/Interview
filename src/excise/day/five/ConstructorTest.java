package excise.day.five;

public class ConstructorTest {
	public static void main(String [] args){
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("joke", 2000);
		staff[1] = new Employee("Tom", 3000);
		staff[2] = new Employee();
		
		for(Employee e : staff){
			System.out.println("name = " + e.getName() + " salary = " + e.getSalary() + " id = " + e.getId());
		}
	}
}
