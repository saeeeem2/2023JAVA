package day18;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTime01 {

	public static void main(String[] args) {
		/* LocalDateTime : 현재 날짜 시간 처리
		 * LocalTime : 시간만
		 * LocalDate : 날짜만
		 * */
		
		LocalDateTime today=LocalDateTime.now();
		System.out.println(today);
		System.out.println(today.getYear());
		System.out.println(today.toString());
		
		String curr=today.toString();
		//T기준으로 앞에 있는 년월일 추출
		String date=curr.substring(0,curr.indexOf("T"));
		System.out.println(date);
		System.out.println(curr.substring(0,curr.lastIndexOf("T")));
		System.out.println(curr.substring(0,curr.indexOf("T")));
		
		//T기준으로 뒤에 있는 시분초 추출
		String time=curr.substring(curr.indexOf("T")+1,curr.indexOf("."));
		System.out.println(curr.substring(curr.lastIndexOf("T")+1,curr.lastIndexOf(".")));
		
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd (a)hh:mm:ss");//a는 오전 오후 구분
		System.out.println(dtf.format(today));
		
		LocalDateTime sDate=LocalDateTime.of(2000, 06, 06, 11, 10); //날짜 생성
		System.out.println(sDate.format(dtf));
	}

}

