package day03;

public class For01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 반복문 : 규칙적인 작업을 반복적으로 할 때 사용하는 문법
		 * for문, while문, do~while문
		 * for문과 while문은 동작하는 방식이 동일 => 조건에 맞지 않으면 한 번도 실행되지 않을 수 있음
		 * do~while문은 동작하는 방식이 다름 => 조건에 맞지 않아도 무조건 1번 실행
		 * 
		 * for(초기화 ; 조건식 ; 증감식){
		 * 	실행문;
		 * }
		 * 
		 * 초기화 : 조건식이나 실행문에서 사용할 변수를 초기화 -> 생략가능
		 * 		   => 처음 한 번만 실행
		 * 조건식 : 반복문의 반복을 결정하는 식(true가 되어야 반복, false는 해당 반복문을 빠져나옴) -> 생략가능
		 * 증감식 : 조건식에서 사용되는 변수를 증가 / 감소시켜 반복횟수를 조절
		 */
		
		//1~10까지 출력하는 예제
		//초기화 값 : i변수 사용 int i=1;
		//조건식 : 10이 될 때까지 => i <= 10;
		//증감식 : i가 1씩 증가 => i++ (i=i+2 : i가 2씩 증가)
		//실행문 : i출력 
		
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();//줄바꿈용
		System.out.println("---------------------------");
		
		//10부터 1까지 출력하는 예제
		for(int i=10; i>=1; i--) {
			System.out.print(i+" ");
		}
		
		System.out.println();//줄바꿈용
		System.out.println("---------------------------");
		
		//2부터 10까지 짝수만 출력 예제
		for(int i=2; i<=10; i=i+2) {
			System.out.print(i+" ");
		}
		
		System.out.println();//줄바꿈용
		System.out.println("---------------------------");
		
		//1~20 중 짝수만 출력 예제 : if문 사용하여 조건에 맞는 자료만 출력
		for(int i=1; i<=20; i++) {
			if(i%2==0) { // 홀수인 경우 i%2==1
				System.out.print(i+" ");
			}
		}
		
		System.out.println();//줄바꿈용
		System.out.println("---------------------------");
		
		//1~10 중 홀수만 출력, 짝수일 때는 짝수는 "pass"라는 문구 출력
		for(int i=1; i<=10; i++) {
			if(i%2==1) {
				System.out.print(i+" ");
			} else {
				System.out.print("pass ");
			}
		}
		
		System.out.println();//줄바꿈용
		System.out.println("---------------------------");
		
		//1~10까지의 합계 출력
		//초기화 : 1부터, 조건식 : 10까지, 증감식 : 1씩 증가
		//실행문 : 누적해서 더하기
		//실행 후 출력
		//지역 변수는 괄호의 시작부터 괄호의 끝까지만 유효함 : 지역변수() {생성   소멸}
		//지역 변수는 반드시 초기화를 해줘야 함
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum=sum+i;
			//0+1+2+3+4+5+6+7+8+9+10
		}
		System.out.print(sum); //i는 for문 안에서 선언되었으므로 for문을 빠져나오는 순간 사용할 수 없음(for문 안에서만 출력 가능함)
								//sum은 for문 밖에서 선언 되었으므로 for문 실행 이후 출력 가능
		
		System.out.println();//줄바꿈용
		System.out.println("---------------------------");
		
		//1~10까지 짝수의 합과 홀수의 합을 출력
		/* for 1부터 10까지 1씩 증가하여 값을 비교
		 * if 짝수인지 판단 => 짝수의 합계
		 *    홀수인지 판단 => 홀수의 합계
		 * for문이 종료된 이후 출력 
		 */
		int a=0;
		int b=0;
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				a=a+i;
			} else {
				b=b+i;
			}
		} 
		System.out.println("짝수의 합 : "+a);
		System.out.println("홀수의 합 : "+b);

		System.out.println();//줄바꿈용
		System.out.println("---------------------------");
		
	}

}
