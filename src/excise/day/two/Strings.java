package excise.day.two;

public class Strings {
	public static void main(String [] args){
		String seeting  = "Welcome to computer world!      ";
		
		//boolean endsWith(suffix),����ַ�����suffix��β�ģ�����true
		System.out.println("endsWith: " + seeting.endsWith("world"));
		
		//boolean equals(object other),����ַ�����other��ȣ�����true
		System.out.println("equals: " + seeting.equals("Hello world"));
		
		//boolean equalsIgnoreCase(String other)������ַ�����other��ȣ����Դ�Сд��������true
		System.out.println("equalsIgnoreCase: " + seeting.equalsIgnoreCase("welcome to computer world"));
		
		//int indexOf(String str)���������ַ���str�Ŀ�ʼλ�ã�ԭʼ��������str������-1
		System.out.println("indexOf: " + seeting.indexOf("to"));
		
		//int lastIndexOf(String str),�����ַ���str�����λ��
		System.out.println("lastIndexOf:��" + seeting.lastIndexOf("wor"));
		System.out.println(seeting.substring(seeting.indexOf("to "),seeting.lastIndexOf("wor")));
		System.out.println(seeting.trim().length());
		System.out.println(seeting.length());
	} 
}
