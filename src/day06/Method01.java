package day06;

public class Method01 {
	//메서드 선언 위치

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 메서드 : 기능/함수
		 * 접근 제어자(제한자) : 접근할 수 있는 주체의 제한 범위
		 * 리턴타입 : 메서드의 실행결과로 받을 수 있는 정보의 값(자료형)
		 * 메서드명 : 메서드 이름 => 소문자로 시작
		 * 매개변수 : 메서드를 실행하기 위해서 필요로 하는 값(자료형 변수명)
		 * 메서드 선언 구현
		 * 접근제어자 리턴타입 메서드명(매개변수, 매개변수 ...){
		 * 구현;
		 * }
		 * 메서드 선언 위치
		 * 클래스 안, 다른 메서드 밖(메인 메서드와 중복되면 안 됨)
		 * */
		int sum = sum(3,5);
		System.out.println(sum);
		
		int sum1=sum(sum,2);
		System.out.println(sum1);
		
		int mul1=mul(3,4);
		System.out.println(mul1);
		
		sum2(10,20);


	}
	//메서드 선언 위치
	/* 기능 : 두 정수가 주어지면 두 정수의 합을 알려주는 메서드
	 * 리턴타입 : 알려줘야 하는 값 => 합 (자료형으로 변환한다면 int)
	 * 메개변수 : 두 정수 => int num1, int num2
	 * 메서드 명 : sum
	 * */
	public static int sum(int num1, int num2) { //매개변수는 자료형을 반드시 각각 선언해줘야함
		int result = num1+num2;
		return result; 
	}
	
	/* 기능 : 두 정수가 주어지면 두 정수의 곱을 알려주는 메서드
	 * 리턴타입 : 알려줘야 하는 값 => 곱 (int)
	 * 매개변수 : 두 정수 => num3,num4
	 * 메서드명 : mul*/
	
	public static int mul(int num3, int num4) {
		int result=num3*num4;
		return result;
	}
	
	/* 기능 : 두 정수가 주어지면 두 정수의 합을 출력하는 메서드
	 * 리턴타입 : 없음(void)
	 * 매개변수 : 두 정수(int num1, int num2)
	 * 메서드 명 : sum2
	 * */
	
	public static void sum2(int num1, int num2) {
		System.out.println(num1+num2); //바로 찍음
		return; // 리턴은 항상 마지막에 위치함. return은 메서드를 종료하는 역할이 있음. 값을 돌려준 후 메서드가 종료됨
	}
		
}
