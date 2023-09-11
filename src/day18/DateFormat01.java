package day18;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat01 {

	public static void main(String[] args) throws ParseException {
		/* 날짜의 형식을 맞춰주기 위한 설정 
		 * format 설정
		 * 날짜는 년/월/일/요일/시/분/초
		 * 날짜를 문자로 변환해서 년/월/일까지만 나타낼 수 있음 =>SimpleDateFormat */
		
		Date date=new Date();
		System.out.println(date);
		// 날짜를 문자로 변환
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd (E) hh:mm:ss");// 월은 대문자M, 분은 소문자 m
		String dateString =sdf.format(date);
		System.out.println(dateString);
		
		//문자열을 날짜로 변환
		String birth="2009-09-30 08:30:55";
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date2=sdf.parse(birth);
		//Date date2=sdf.parse(dateString);
		System.out.println(date2);
	}
		

}
