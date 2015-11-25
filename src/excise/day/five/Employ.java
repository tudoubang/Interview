package excise.day.five;

public class Employ {
	
	private String name;
	private double salary;
	
	public Employ(String a, double b){
		name = a;
		salary = b;
	}
	
	public String getName(){
		return name;
	}
	
	public static void main(String [] args){
		Employ a = new Employ("joke", 200);
		Employ b = new Employ("jokse", 2002);
		swap(a,b);
		System.out.println("a="+a.getName());
		System.out.println("b="+b.getName());
	}
	
	public static void swap(Employ x, Employ y){
		Employ temp = x;
		x = y;
		y = temp;
	}
}
