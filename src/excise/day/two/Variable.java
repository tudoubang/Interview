package excise.day.two;

public class Variable {
	//�����Ա����������ɼ�
	public String name;
	//˽�б������������пɼ�
	private double salary;
	
	public Variable(String variable){
		name  = variable;
	}
	
	public void setSalary (double empsal){
		salary = empsal;
	}
	
	public void printEmp(){
		System.out.println("name: " + name);
		System.out.println("salart: " + salary);
	}
	
	public static void main(String [] args){
		Variable variable  = new Variable("Hello world");
		variable.setSalary(1000);
		variable.printEmp();
	}
}
