package com.seven.equals;

public class Equals {
	
	
	public static void main(String [] args){
		
		
		Equals e = new Equals();
		Dog dog1 = e.new Dog("dog", "black");
		Dog dog2 = e.new Dog("dog", "black");
		
		System.out.print(dog1.equals(dog2));
	}
	
	class Dog{
		String name;
		String color;
		
		public Dog(){}
		
		public Dog(String name, String color){
			this.name = name;
			this.color = color;
		}
		
		public boolean equals(Object obj){
			if(this == obj){
				return true;
			}
			
			if(obj instanceof Dog){
				Dog d = (Dog)obj;
				return this.name.equals(d.name) && this.color.equals(d.color);
			}
			
			return false;
		}
		
	}
}
