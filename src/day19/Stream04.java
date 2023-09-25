package day19;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Stream04 {

	public static void main(String[] args) {
		/* Student클래스를 가지는 List생성
		 * 5명 정도의 값을 추가*/
		
		ArrayList<Student> list=new ArrayList<>();
		list.add(new Student("홍길동",90));
		list.add(new Student("이동혁",90));
		list.add(new Student("이해찬",90));
		list.add(new Student("이민형",90));
		list.add(new Student("나재민",90));
		
		
		//stream구성 후 출력
		//toString 존재할 경우
		list.stream().forEach(System.out::println);
		System.out.println("===============");
		//toString이 없을 경우
		//처리할 구문이 많으면 {}
		list.stream().forEach(n->{
			String name=n.getName();
			int score=n.getScore();
			System.out.println(name+":"+score);
			
		});
		
		// 성적합계 출력
		int sum=list.stream().mapToInt(n->n.getScore()).sum();
		System.out.println("성적합계");
		System.out.println(sum);
		
		
		// 점수가 70점 이상인 인원수 출력
		Long count = list.stream().mapToInt(n->n.getScore()).filter(a->a>=70).count();
		System.out.println("70이상 인원 수 : "+count);
	

	}

}
