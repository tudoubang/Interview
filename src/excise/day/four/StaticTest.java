package excise.day.four;

public class StaticTest {

	public static void main(String [] args){
		
		Employee[] saff = new Employee[3];
		
		saff[0] = new Employee("Doni", 7500);
		saff[1] = new Employee("Xipa", 7800);
		saff[2] = new Employee("Donsi", 8000);
		
		for(Employee e : saff){
			System.out.println("name= " + e.getName() + " salary= " + e.getSalary() + " id= " + e.getId());
		}
		
		int n = Employee.getNextId();
		System.out.println("n= " + n);
	}
}
