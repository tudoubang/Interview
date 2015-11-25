package com.horstmann.corejava;

import static java.lang.System.*;

public class PackageTest {
	public static void main(String [] args){
		Employee harry = new Employee("joke", 20000, 2015, 11, 23);
		harry.raiseSalary(5);
		out.println("name="+harry.getName() + " salary="+harry.getSalary());
	}
}
