package excise.day.eight;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String [] args){
		
		ArrayList<Employee> staff = new ArrayList<Employee>();
		
		staff.add(new Employee("Carl Craker", 75000, 2015, 3, 23));
		staff.add(new Employee("Harry Hacker", 85000, 2015, 3, 23));
		staff.add(new Employee("Tony Craker", 95000, 2015, 3, 23));
		
		for(Employee e : staff){
			e.raiseSalary(5);
		}
		
		for(Employee e : staff){
			System.out.println("name= " + e.getName() +" ,salary= " + e.getSalary() + " ,hireDay=" + e.getHireDay());
		}
	}
}
