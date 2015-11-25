package com.horstmann.corejava;

public class Manager extends Employee{
	
	private double bonus;//½±½ð
	public void setBonus(double b){
		bonus = b;
	}
	
	public double getSalary(){
		double baseSalary = getSalary();
		return baseSalary + bonus;
	}
	public Manager(String n, double s, int year, int month, int day) {
		super(n, s, year, month, day);
		// TODO Auto-generated constructor stub
	}

}
