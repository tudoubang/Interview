package com.exercise.five;

import java.util.ArrayList;

public class SimpleDotCom {
	private ArrayList<String> locationCells;
	
	public String checkYourself(String stringGuess){
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		int index = locationCells.indexOf(stringGuess);
		
		if(index >= 0){
			locationCells.remove(index);
			if(locationCells.isEmpty()){
				result = "kill";
			}else{
				result = "hit";
			}
		}
		
		System.out.println(result);
		return result;
	}
	
	void setLocationCells(ArrayList<String> loc){
		locationCells = loc;
	}
}
