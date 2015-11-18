package excise.day.two;

public class Strings {
	public static void main(String [] args){
		String seeting  = "Welcome to computer world!      ";
		
		//boolean endsWith(suffix),如果字符串以suffix结尾的，返回true
		System.out.println("endsWith: " + seeting.endsWith("world"));
		
		//boolean equals(object other),如果字符串与other相等，返回true
		System.out.println("equals: " + seeting.equals("Hello world"));
		
		//boolean equalsIgnoreCase(String other)，如果字符串与other相等（忽略大小写），返回true
		System.out.println("equalsIgnoreCase: " + seeting.equalsIgnoreCase("welcome to computer world"));
		
		//int indexOf(String str)，返回与字符串str的开始位置，原始串不存在str，返回-1
		System.out.println("indexOf: " + seeting.indexOf("to"));
		
		//int lastIndexOf(String str),返回字符串str的最后位置
		System.out.println("lastIndexOf:　" + seeting.lastIndexOf("wor"));
		System.out.println(seeting.substring(seeting.indexOf("to "),seeting.lastIndexOf("wor")));
		System.out.println(seeting.trim().length());
		System.out.println(seeting.length());
	} 
}
