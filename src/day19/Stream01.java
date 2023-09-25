package day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream01 {

	public static void main(String[] args) {
		/* Stream(스트림) : 자료의 대상과 관계없이 동일한 연산을 수행할 수 있도록 해주는 반복자
		 * 요소가 하나씩 흘러가는 형태로 처리
		 * 스트림을 생성하여 연산을 수행하면 스트림은 소모가 됨(재사용 불가)
		 * 다른 연산을 수행하려면 다시 스트림을 생성해야 함
		 * 스트림 연산은 기존 자료를 변경하지 않음
		 * 
		 * 중간연산 : filter(조건에 맞는 오소만 추출), distinct(중복제거)
		 * 			sorted(정렬), map(추출)
		 * 최종연산 : sum(),forEach(), reduce(계산)...
		 * 
		 * */
		
		Stream<Integer> integerStream=Stream.of(1,2,3,4,5,6,7,8,9);
		int[] arr= {10,20,30,40,50};
		IntStream arrStream=Arrays.stream(arr);
		Long cnt=arrStream.count();
		//int sum=arrStream.sum();
		int sum=Arrays.stream(arr).sum();
		
		OptionalDouble avg= Arrays.stream(arr).average();
		System.out.println(avg);
		
		int sum1=Arrays.stream(arr).filter(b->b>=30).sum();
		
		
		System.out.println(cnt);
		System.out.println(sum);
		
		String[] str= {"a","b","c","d"};
		Stream<String> strStrean=Arrays.stream(str);
				
				
		// 성적배열에서 70이상인 점수만 합계를 출력
		int[] numArr= {50,78,96,85,45,35,12};
		int sum2=0;
		for(int i=0; i<numArr.length; i++) {
			if(numArr[i]>=70) {
				sum2+=numArr[i];
			}
		}
		System.out.println("java로 구현 : "+sum2);
			
		// stream으로 출력
		int sum3=Arrays.stream(numArr).filter(n->n>=70).sum();
		System.out.println("stream으로 구현 : "+sum3);
		
		//리스트로 스트림 생성
		//리스트로 성적 리스트 생성 70이상인 점수만 합계
		ArrayList<Integer> list=new ArrayList<>();
		list.add(78);
		list.add(98);
		list.add(45);
		list.add(85);
		list.add(63);
		list.add(52);

		//sum은 int스트림에서만 사용 가능
		int listSum=list.stream().filter(n->n>=70).mapToInt(t->t.intValue()).sum();
		System.out.println("Integer stream "+listSum);
		
		Stream<Integer> s=list.stream();
		s.filter(b->b>=70).forEach(n->System.out.println(n+" "));
		list.stream().mapToInt(n->n.intValue()).count();
	}
}
