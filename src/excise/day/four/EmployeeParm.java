package excise.day.four;

public class EmployeeParm {
	private String name;
	private double salary;
	
	public EmployeeParm(String n, double s){
		name = n;
		salary = s;
	}
	
	public String getName(){
		return name;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public void raiseSalary(double byPercent){
		double raise = salary * byPercent / 100;
		salary += raise;
	}
}
