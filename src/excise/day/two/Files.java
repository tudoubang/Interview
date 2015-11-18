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
			System.out.println("请输入你的名字:");
			String name = in.nextLine();
			System.out.println("请输入你的年龄:");
			int age = in.nextInt();
			System.out.println("请输入你的性别:");
			String sex = in.nextLine();
			out.format("姓名：%s;年龄：%d;性别：%s;", name,age,sex);
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
