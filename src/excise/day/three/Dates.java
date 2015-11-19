package excise.day.three;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class Dates {
	public static void main(String [] args){
		//构造对象及初始化
		Date date = new Date();
		System.out.println("当前时间："+date.toString());
		//访问对象实例
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		int month = gregorianCalendar.get(Calendar.MONTH) + 1;
		int year = gregorianCalendar.get(Calendar.YEAR);
		int week = gregorianCalendar.get(Calendar.DAY_OF_WEEK);
		System.out.println("当前月份："+ month + " 当前年份：" + year + " 当前周：" +week);
		//修改对象实例
		gregorianCalendar.set(Calendar.YEAR, 2001);
		int years = gregorianCalendar.get(Calendar.YEAR);
		System.out.println(" 当前年份：" + years);
	}
}
