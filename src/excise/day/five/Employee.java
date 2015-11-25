package excise.day.five;

import java.util.Random;

public class Employee {
	private static int nextId;
	private int id;
	private String name = "";
	private double salary;
	
	//��ʼ����
	static {
		Random generator = new Random();
		nextId = generator.nextInt(1000);
	}
	
	{
		id = nextId;
		nextId++;
	}
	
	
	public Employee(String n, double s){
		name = n;
		salary = s;
	}
	//���ع�����
	public Employee(double s){
		this("Employee #" + nextId, s);//this������һ��������
	}
	
	//�޲���������
	public Employee(){
		
	}
	
	public String getName(){
		return name;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public int getId(){
		return id;
	}
}
