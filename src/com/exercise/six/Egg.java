package com.exercise.six;

import java.util.ArrayList;

public class Egg {
	public static void main(String[] args){
		ArrayList<Egg> mylist = new ArrayList<Egg>();
		
		Egg s = new Egg();
		mylist.add(s);
		
		Egg b = new Egg();
		mylist.add(b);
		
		int theSize = mylist.size();
		boolean isIn = mylist.contains(s);
		
		int idx = mylist.indexOf(b);
		boolean empty = mylist.isEmpty();
		
		System.out.println("theSize: " + theSize + " isIn: " + isIn + " idx: " + idx + " empty: " + empty);
		
		mylist.remove(s);
		System.out.println(mylist.indexOf(s));
		
	}
}
