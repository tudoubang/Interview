package excise.day.four;

public class Methods {
	
	private double percent = 10;
	
	public static void Methods(double x){
		x = x * 3;
	}
	
	public double getPercent(){
		return percent;
	}
	public static void main(String [] args){

		Methods method = new Methods();
		System.out.println("percnet= " + method.percent);
		Methods(method.percent);
		System.out.println("Methods(): " + method.getPercent());
	}
}
