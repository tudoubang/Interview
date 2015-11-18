package excise.day.two;

public class Constants {
	
	public static void main(String [] args){
		Constants2 c2 = new Constants2();
		double paperWidth = 8.5;
		double paperHeight = 11;
		
		System.out.println("Paper size in centimeters:" + paperWidth * c2.CM_PER_INCH + " by " + paperHeight * c2.CM_PER_INCH);
	}
}
