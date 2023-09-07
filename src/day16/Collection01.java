package day16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


public class Collection01 {

	public static void main(String[] args) {
		/* 컬렉션 프레임워크 : 표준화된 방식의 자료구조
		 * List, Map, Set
		 * 	- 데이터를 묶어서 관리할 때 사용(배열대신 List)
		 * 	- 주로 배열 대신에 사용됨
		 * 
		 * List
		 * 	- 배열과 동작하는 방식이 동일함
		 * 	- 값을 하나 씩 저장
		 * 	- 중복을 허용
		 * 	- index를 가짐
		 * 	- 배열 대신 가장 많이 사용됨
		 * Set
		 * 	- 값을 하나 씩 저장
		 * 	- 중복을 허용하지 않음(중복값은 버림)
		 * 	- index가 없음(for문 사용 불가)
		 * 	- index가 없으므로 순서를 보장할 수 없음(정렬불가)
		 * Map
		 * 	- 값을 두개 씩 저장, key/value의 쌍으로 묶어서 저장됨
		 * 	- key는 중복 불가, value는 중복 가능
		 *  - key가 중복되면 덮어쓰기 됨
		 *  - 아이디/패스워드처럼 같이 묶어서 하나의 자료로 저장해아할 때 많이 사용됨
		 *  - index가 없음(for문 사용 불가)
		 * 	- index가 없으므로 순서를 보장할 수 없음(정렬불가)
		 * 
		 * int arr[]=new int[5]; ===> int는 자료형(배열은 기본자료형 사용 가능)
		 * 컬렉션 프레임워크는 기본 자료형 사용 불가(cllection에서는 클래스로 데이터를 관리)
		 * int를 표현할 수 있는 클래스 : Integer
		 * String은 원래 클래스
		 * int와 String을 제외한 다른 자료형들은 첫 문자를 대문자로 변경하면 클래스로 사용 가능 : long -> Long, double -> Double, byte->Byte 등
		 * 클래스를 지정하지 않으면 Object가 자동으로 사용됨
		 * 
		 * */
		
		
		//List<Integer> list = new List<Integer>(); //리스트는 인터페이스라 이렇게 선언하는 것은 불가능함
		//List<Integer> list = new ArrayList<Integer>(); //일반적인 선언
		//ArrayList<Integer> list2=new ArrayList<Integer>();
		//List list3 = new ArrayList(); //Object가 자동으로 사용된 케이스
		
		//add() : 리스트에 요소를 추가
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		System.out.println(list);
		
		//size() : 리스트에 길이를 확인할 때 사용(리스트의 개수 리턴)
		//리스트는 정해진 길이가 없다
		//System.out.println(list.size());
		
		//문자열만 가능한 ArrayList 생성 후 3개의 문자열 추가, 추가되면 추가한 내용 출력
		List<String> list1=new ArrayList<String>();
		list1.add("이");
		list1.add("동");
		list1.add("혁");
		System.out.println(list1);
		System.out.println(list1.size());
		
		//list2에 1부터 10까지 입력하고 출력
		List<Integer> list2=new ArrayList<Integer>();
		for(int i=1; i<=10; i++) {
			list2.add(i);
		}
		for(int i=1; i<=10; i++) {
			list2.add(i);
		} //리스트의 값은 중복가능
		System.out.println(list2);
		
		//값을 가져올 때는 get(index) : index 번지의 값을 가져오는 것
		System.out.println(list2.get(0));
		
		//set(index, 값) : index번지의 값을 변경하는 것
		list2.set(0, 3);
		System.out.println(list2);
		
		//list2의 모든 요소를 하나씩 출력
		for(int i=0; i<list2.size(); i++) {
			System.out.println(list2.get(i)+" ");
		}
		
		
		//list2의 요소 중 짝수만 출력
		System.out.println("==================");
		for(int i=0; i<list2.size(); i++) {
			if(list2.get(i)%2==0) {
				System.out.println(list2.get(i));
			}
		}
		
		//remove(index) : index번지의 값을 삭제 , remove(object) : object 객체 삭제
		list2.remove(0); //0번지의 값 삭제
		System.out.println(list2);
		Integer a=10;
		list2.remove(a); 
		System.out.println(list2); 
		
		//contains(Object) : list에 값이 있는지 없는지 검사 => true, false로 값 리턴
		System.out.println("-----------------");
		System.out.println(list2.contains(a));
		
		//clear() : list비움 (전체 삭제)
		list2.clear();
		System.out.println(list2);
		
		//isEmpty() : list가 비었는지 체크 => true/false로 리턴
		System.out.println(list2.isEmpty());
		
		//list2에 1~5까지 값을 추가하고 각 요소를 출력
//		list2.add(1);
//		list2.add(2);
//		list2.add(3);
//		list2.add(4);
//		list2.add(5);
		for(int i=1; i<=5; i++) {
			list2.add(i);
		}
		//향상된 for문(index가 없으면 for문을 사용할 수 없기 때문에 list이외의 다른 컬렉션에서는 향상된 for문을 사용함)
		for(int tmp : list2) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		//index를 사용할 수 없는 컬렉션을 출력하기 위해 사용하는 객체
		//Iterator : index가 없는 컬렉션을 출력하기 위해 사용
		/* list는 index가 있기 때문에 get(i)사용가능
		 * set,map은 순서를 보장하지 않기 때문에 for사용불가, 향상된 for문 또는 Iterator 처럼 순서와 관계없이 값을 가져오는 구문을 사용해서 출력해야 함
		 * */
		System.out.println("> Iterator 출력");
		Iterator<Integer> it = list2.iterator();
		while(it.hasNext()) { //다음 요소가 있는지 체크 //hasNext() : 순서가 없는 값을 가져올 때 사용
			Integer tmp=it.next(); //다음 요소 가져오기
			System.out.print(tmp+" ");
		}
		
		System.out.println();
		
		//indexOf(값) : 해당하는 값의 index번지를 리턴, 없으면 -1리턴
		Integer b=5;
		System.out.println(list2.indexOf(b));
		
		//sort(객체)
		//	- 객체 : comparator 인터페이스를 구현한 객체를 넣어야 함(보통 내부(익명)클래스를 많이 사용함)
		list2.sort(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o2 - o1; //내림차순 , o1=o2 오름차순
			}
		});
		System.out.println(list2);
		
		
	}

}
