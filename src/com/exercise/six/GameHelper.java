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
		String[] alphacoords = new String[comSize]; //�����ַ���
		
		String temp = null;//������ʱ�ַ���
		int[] coords = new int[comSize];//�����ַ���
		int attempts = 0;//Ŀǰ���Ե��ַ���
		boolean success = false;//�ҵ��ʺϵ�λ��
		int location = 0;//Ŀǰ���
		comCount++;//���ڴ�����n��
		int incr = 1;//ˮƽ����
		
		if((comCount % 2) == 1){ //���������
			incr = gridLength; //��ֱ����
		}
		
		while(!success & attempts++ < 200){ //��Ҫ����ѭ��
			location = (int)(Math.random() * gridSize); //������
			
			int x = 0; //��n��λ��
			success = true;//����ɹ�
			
			while(success && x < comSize){//����δʹ�õ�
				if(grid[location] == 0){
					coords[x++] = location; //�洢λ��
					location += incr; //������һ����
					if(location >= gridSize){ //�����±�Ե
						success = false; //ʧ��
					}
					if(x > 0 && (location % gridLength == 0)){ //�����ұ�Ե
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
