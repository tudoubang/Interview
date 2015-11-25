package com.horstmann.corejava;

public class Manager extends Employee{
	
	private double bonus;//½±½ð
	public void setBonus(double b){
		bonus = b;
	}
	
	public double getSalary(){
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}
	public Manager(String n, double s, int year, int month, int day) {
		super(n, s, year, month, day);
		bonus = 0;
	}
	
	public static void main(String [] args){
		Manager boss = new Manager("jeke", 50000, 2015, 3, 25);
		boss.setBonus(5000);
		
		Employee[] staff = new Employee[3];
		staff[0] = boss;
		staff[1] = new Employee("tom",5000,2015,11,13);
		staff[2] = new Employee("john",6000,2015,4,12);
		
		for(Employee e : staff){
			System.out.println("name=" + e.getName() + " salary= " + e.getSalary());
		}
	}

}
