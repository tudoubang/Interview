package excise.day.three;

import java.util.GregorianCalendar;
import java.util.Calendar;
import java.text.DateFormatSymbols;

public class NewCalendar {
	public static void main(String [] args){
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		
		//��ȡ�ա���
		int today = gregorianCalendar.get(Calendar.DAY_OF_MONTH);
		int month = gregorianCalendar.get(Calendar.MONTH);
		
		//��gregorianCalendar����Ϊ����µĵ�һ�죬���õ���һ��Ϊ�ܼ�
		gregorianCalendar.set(Calendar.DAY_OF_MONTH, 1);
		int weekday = gregorianCalendar.get(Calendar.DAY_OF_WEEK);
		
		//getFirstDayOfWeek������ȡ��ǰ�������ڵ���ʼ��
		//Ϊ��ȷ������Ҫ���������룬������������ռ�1��ֱ��һ�����ڵĵ�һ��Ϊֹ
		int firstDayOfWeek  = gregorianCalendar.getFirstDayOfWeek();
		int indent = 0;
		while(weekday != firstDayOfWeek){
			indent++;
			gregorianCalendar.add(Calendar.DAY_OF_MONTH, -1);
			weekday = gregorianCalendar.get(Calendar.DAY_OF_WEEK);
		}
		
		//�����ʾ���ڼ����Ƶ�ǰ������ĸ������DateFormatSymbols
		String[] weekdays = new DateFormatSymbols().getShortWeekdays();
		
		//ѭ������ӡ���ڼ�����д�ַ���
		do{
			System.out.printf("%4s", weekdays[weekday]);
			gregorianCalendar.add(Calendar.DAY_OF_WEEK, 1);
			weekday = gregorianCalendar.get(Calendar.DAY_OF_WEEK);
		}
		while(weekday != firstDayOfWeek);
		System.out.println();
		for(int i = 0; i<= indent; i++){
			System.out.println("   ");
		}
		
		gregorianCalendar.set(Calendar.DAY_OF_MONTH,1);
		do{
			int day = gregorianCalendar.get(Calendar.DAY_OF_MONTH);
			System.out.printf("%3d", day);
			
			if(day == today){
				System.out.print("*");
			}else{
				System.out.print("   ");
			}
			gregorianCalendar.add(Calendar.DAY_OF_MONTH, 1);
			weekday = gregorianCalendar.get(Calendar.DAY_OF_WEEK);
			
			if(weekday == firstDayOfWeek){
				System.out.println();
			}	
		}
		while(gregorianCalendar.get(Calendar.MONTH) == month);
		
		if(weekday != firstDayOfWeek){
			System.out.println();
		}
	}
}
