package day18;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Set03 {

	public static void main(String[] args) {
		// 삽입, 삭제, 수정 : ArrayList유리, LinkedList:삽입, 삭제에 유리
		// 어떤 List, Set, Map이든 선언 -> 메서드 사용
		// 내부 동작하는 구조가 다름
		// 각 List, Set, Map마다 본인만의 메서드가 다름
		
		
		// Set , TreeSet => 검색에 유리, 순차로 데이터를 정렬해서 저장
		
		
		// 해당 점수들 중 가장 큰 점수와 가장 작은 점수를 출력
		int[] score= {80,89,94,78,59,60,80,70,90};
		TreeSet<Integer> set =new TreeSet<>();
		for(int i=0; i<score.length; i++) {
			set.add(score[i]);
			System.out.println(set);
			
			
			//first(): 가장 앞에 있는 값 출력(트리셋 입장에서 가장 작은 값)
			//last(): 가장 마지막에 있는 값 출력(트리셋 입장에서 가장 큰 값)
			
			System.out.println("최소값 : "+set.first());
			System.out.println("최대값 : "+set.last());
			
			//headSet : 지정된 객체 값보다 작은(지정된 객체 보다 앞 쪽) 값 출력
			//tailSet : 지정된 객체보다 큰(지정된 객체 보다 뒤 쪽) 값 출력
			
			System.out.println("80보다 작은 값 : "+set.headSet(80)); //80보다 작은 객체 출력
			System.out.println("80보다 큰 값 : "+set.tailSet(80));
			
			//subSet : 범위를 Set으로 추출
			System.out.println("70~90사이의 값 : "+set.subSet(70,90));// 항상 시작값은 포함, 종료값은 미포함(70은 포함, 90은 미포함)
			
			//내림차순 정렬 가능
			NavigableSet<Integer> desSet=set.descendingSet();
			System.out.println(desSet);
			
		}

	}

}
