package excise.day.three;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class Dates {
	public static void main(String [] args){
		//������󼰳�ʼ��
		Date date = new Date();
		System.out.println("��ǰʱ�䣺"+date.toString());
		//���ʶ���ʵ��
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		int month = gregorianCalendar.get(Calendar.MONTH) + 1;
		int year = gregorianCalendar.get(Calendar.YEAR);
		int week = gregorianCalendar.get(Calendar.DAY_OF_WEEK);
		System.out.println("��ǰ�·ݣ�"+ month + " ��ǰ��ݣ�" + year + " ��ǰ�ܣ�" +week);
		//�޸Ķ���ʵ��
		gregorianCalendar.set(Calendar.YEAR, 2001);
		int years = gregorianCalendar.get(Calendar.YEAR);
		System.out.println(" ��ǰ��ݣ�" + years);
	}
}
