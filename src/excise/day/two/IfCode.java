package excise.day.two;

public class IfCode {
	public static void main (String [] args){
		int yourSales = 10;
		int target = 9;
		double bonus = 0;
		String performance = "";
		
		if(yourSales >= target){
			performance = "Satisfactory";
			bonus = 100 + 0.01 * (yourSales - target);
		}else{
			performance = "Unsatifactory";
			bonus = 0;
		}
		System.out.println("bonus: "+bonus);
	}
}
