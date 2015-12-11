package com.exercise.six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GameHelper {
	private static final String alphabet = "abcdefg";
	private int gridLength = 7;
	private int gridSize = 49;
	private int [] grid = new int[gridSize];
	private int comCount = 0;
	
	public String getUserInput(String promt){
		String inputLine = null;
		System.out.print(promt + " ");
		
		BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
		try {
			inputLine = is.readLine();
			if(inputLine.length() == 0){
				return null;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return inputLine.toLowerCase();
	}
	
	public ArrayList<String> placeDotCom(int comSize){
		ArrayList<String> alphaCells = new ArrayList<String>();
		String[] alphacoords = new String[comSize]; //保存字符串
		
		String temp = null;//保存临时字符串
		int[] coords = new int[comSize];//现有字符串
		int attempts = 0;//目前测试的字符串
		boolean success = false;//找到适合的位置
		int location = 0;//目前起点
		comCount++;//现在处理到第n个
		int incr = 1;//水平增量
		
		if((comCount % 2) == 1){ //如果是奇数
			incr = gridLength; //垂直增量
		}
		
		while(!success & attempts++ < 200){ //主要搜索循环
			location = (int)(Math.random() * gridSize); //随机起点
			
			int x = 0; //第n个位置
			success = true;//假设成功
			
			while(success && x < comSize){//查找未使用点
				if(grid[location] == 0){
					coords[x++] = location; //存储位置
					location += incr; //尝试下一个点
					if(location >= gridSize){ //超出下边缘
						success = false; //失败
					}
					if(x > 0 && (location % gridLength == 0)){ //超出右边缘
						success = false;
					}
				}else{
					success = false;
				}
			}
		}
		
		int x = 0;
		int row = 0;
		int column = 0;
		
		while (x < comSize){
			grid[coords[x]] = 1;
			row = (int)(coords[x] / gridLength);
			column = coords[x] % gridLength;
			temp = String.valueOf(alphabet.charAt(column));
			alphaCells.add(temp.concat(Integer.toString(row)));
			x++;
		}
		
		return alphaCells;
	}
}
