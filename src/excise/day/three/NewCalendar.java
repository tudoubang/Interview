package excise.day.three;

import java.util.GregorianCalendar;
import java.util.Calendar;
import java.text.DateFormatSymbols;

public class NewCalendar {
	public static void main(String [] args){
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		
		//获取日、月
		int today = gregorianCalendar.get(Calendar.DAY_OF_MONTH);
		int month = gregorianCalendar.get(Calendar.MONTH);
		
		//将gregorianCalendar设置为这个月的第一天，并得到这一天为周几
		gregorianCalendar.set(Calendar.DAY_OF_MONTH, 1);
		int weekday = gregorianCalendar.get(Calendar.DAY_OF_WEEK);
		
		//getFirstDayOfWeek方法获取当前地区星期的起始日
		//为了确定所需要的缩进距离，将日历对象的日减1，直到一个星期的第一天为止
		int firstDayOfWeek  = gregorianCalendar.getFirstDayOfWeek();
		int indent = 0;
		while(weekday != firstDayOfWeek){
			indent++;
			gregorianCalendar.add(Calendar.DAY_OF_MONTH, -1);
			weekday = gregorianCalendar.get(Calendar.DAY_OF_WEEK);
		}
		
		//输出表示星期几名称的前几个字母，调用DateFormatSymbols
		String[] weekdays = new DateFormatSymbols().getShortWeekdays();
		
		//循环将打印星期几的缩写字符串
		do{
			System.out.printf("%4s", weekdays[weekday]);
			gregorianCalendar.add(Calendar.DAY_OF_WEEK, 1);
			weekday = gregorianCalendar.get(Calendar.DAY_OF_WEEK);
		}
		while(weekday != firstDayOfWeek);
		System.out.println();
		
		
	}
}
