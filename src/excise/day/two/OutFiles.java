package excise.day.two;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OutFiles {
	public static void main(String [] args){
		try {
			Scanner in = new Scanner(new File("files/myfile.txt"));
			System.out.println(in.next());
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
