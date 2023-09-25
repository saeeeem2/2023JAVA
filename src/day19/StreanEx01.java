package day19;

import java.util.ArrayList;

public class StreanEx01 {

	public static void main(String[] args) {
		/* 여행상품이 있습니다.
		 * 여행비용은 15세 이상은 100만원, 15세 미만은 50만원
		 * 고객 3명이 패키지 여행을 떠나려고 할 때
		 * 1. 여행비용 계산
		 * 2. 고객 명단 출력
		 * 
		 * 고객은 class로 생성 
		 * 3명의 고객은 ArrayList로 추가
		 * 고객 정보
		 * 이름 : 이순신, 나이 : 40, 비용 : 100만원 
		 * 이름 : 김순이, 나이 : 35, 비용 : 100만원
		 * 이름 : 이아들, 나이 : 10, 비용 : 50만원
		 * 총 여행 경비 : 250만원
		 * */
		
		ArrayList<Traveler> list=new ArrayList<>();
		list.add(new Traveler("이순신",40));
		list.add(new Traveler("김순이",35));
		list.add(new Traveler("이아들",10));
		
		System.out.println("== 고객 명단 ==");
		//list.stream().forEach(System.out::println);
		list.stream()
			.forEach(n->{
				String name=n.getName();
				int age=n.getAge();
				int price=n.getPrice();
				System.out.println(name+" : "+age+"세 비용 : "+price);
			});
		System.out.println("---------------");
		int sum=list.stream().mapToInt(n->n.getPrice()).sum();
		System.out.println("총 여행 경비 : "+sum);
		
		
		System.out.println("---------------");
		//20세 이상 성인만 이름을 정렬하여 출력
		list.stream()
			.filter(n->n.getAge()>=20)
			.sorted()
			.forEach(n->{
				String name=n.getName();
				int age=n.getAge();
				int price=n.getPrice();
				System.out.println(name+" : "+age+"세 비용 : "+price);
			});

	}

}

class Traveler implements Comparable<Traveler>{
	
	private String name;
	private int age;
	private int price;
	
	public Traveler() {}

	public Traveler(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.price=(age>=15)? 100 : 50 ;
//		if(age>=15) {
//			price=100;
//		} else if(age<15) {
//			price=50;
//		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "이름 :" + name + ", 나이 : " + age + ", 경비 : " + price ;
	}

	@Override
	public int compareTo(Traveler o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}	
}