package excise.day.two;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Files {
	public static void main(String [] args){
//		Scanner in = new Scanner("e:\\git\\Interview\\files\\myfile.txt");
		try {
			PrintWriter out  = new PrintWriter("files/myfiles.txt");
			Scanner in = new Scanner(System.in);
			System.out.println("�������������:");
			String name = in.nextLine();
			System.out.println("�������������:");
			int age = in.nextInt();
			System.out.println("����������Ա�:");
			String sex = in.nextLine();
			out.format("������%s;���䣺%d;�Ա�%s;", name,age,sex);
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
