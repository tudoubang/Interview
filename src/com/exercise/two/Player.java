package com.exercise.two;


public class Player {
	int number = 0; //Ҫ���µ�����
	
	public void guess(){
		 number = (int) (Math.random() * 10);
		 System.out.println("I'm guessing " + number);
	}
}
