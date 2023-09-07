package day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class List01 {

	public static void main(String[] args) {
		/* 하루일과를 저장하는 list를 생성 <String> */
		List<String> list=new ArrayList<>();//앞에서 이미 String으로 선언했기 때문에 뒤에는 String 안 붙여도 됨
		list.add("06:30 기상");
		list.add("08:30 학원 도착");
		list.add("09:00~15:30 학원 수업");
		list.add("02:00 취침");
		
		//일반 for문으로 출력
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
				
		//향상된 for문으로 출력
		for(String tmp : list) {
			System.out.print(tmp+" ");
		}
		
		System.out.println();
		//Iterator로 출력
		Iterator<String> it=list.iterator();
		while(it.hasNext()) { //다음의 요소값이 있는지 확인
			String tmp=it.next(); //다음요소 가져오기
			System.out.print(tmp+" ");
		}
		
		//Cillection.sort(list); => 오름차순만 가능함
		//sort(Comparator c) => 오름차순/내림차순 가능
		System.out.println();
		Collections.sort(list);
		System.out.println(list);
	}

}
