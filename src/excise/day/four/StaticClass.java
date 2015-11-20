package excise.day.four;

public class StaticClass {
	private static int nextId = 10;
	private int id = 1000;
	
	public void setId(){
		id = nextId;
		nextId++;
	}
	
	public static int getNextId(){
		return nextId;
	}
	
	public int getId(){
		return id;
	}
	
	public static void main(String [] args){
		StaticClass sc = new StaticClass();
		sc.setId();
		System.out.println("getNextId: "+ getNextId() +" nextId: "+ nextId +" getId: " + sc.getId());
	}
}
