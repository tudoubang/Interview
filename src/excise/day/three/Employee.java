package excise.day.three;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	
	private String name;
	private double salary;
	private Date hireDay;
	
	public Employee(String n, double s, int year, int month, int day){
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
		hireDay = calendar.getTime();
	}
	
	public String getName(){
		return name;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public Date getHireDay(){
		return hireDay;
	}
	
	private void rasieSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	public static void main(String [] args){
		Employee[] emp = new Employee[3];
		emp[0] = new Employee("Carl", 5000, 2015, 11, 8);
		emp[1] = new Employee("Harry", 7000.18, 2015, 11, 9);
		emp[2] = new Employee("Tony", 6000.12, 2015, 11, 19);
		for(Employee e : emp){
			e.rasieSalary(5);
		}
		for(Employee e : emp){
			System.out.println("name="+e.getName()+" ,salary="+e.getSalary()+" ,hireDay="+e.getHireDay());
		}
	}

}
