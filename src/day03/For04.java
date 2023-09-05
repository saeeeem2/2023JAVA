package day03;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*최대공약수 찾기
		 * 양수 : 1부터 자기 자신까지 나누어서 떨어지는 수
		 * 공약수 : 두 정수의 공통된 약수
		 * 최대 공약수 : 공약수 중 가장 큰 값
		 * 8의 약수 : 1,2,4,8
		 * 12의 약수 : 1,2,3,4,6,12
		 * 8과 12의 공약수 : 1,2,4
		 * 8과 12의 최대 공약수 : 4*/
		
		//두 정수 num1,num2를 입력받아 최대 공약수를 출력
		
		Scanner scan=new Scanner(System.in);
		System.out.println("최대 공약수를 구할 숫자를 두 개 입력해주세요.");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int a=0;
		for(int i=1; i<=num1; i++) //num1, num2 둘 다 상관없음. 공약수를 구하는 것이므로 1부터 자기 자신까지 밖에 나누지 못함. 
								  //공약 수는 num1,num2 중 더 작은 수보다 큰 숫자가 나올 수 없음.
			if(num1%i==0&&num2%i==0) {
				a=i; // i는 공약수
			  }	
		System.out.println(a);
		
		
		/* 반복문에서 조건이 맞다면 반복문을 빠져나오는 역할을 함
		 * break;
		 * 중첩 for문일 경우 if문을 포함하는 가장 가까운 for문만 빠져나옴
		 * 빠져나올 for문에 닉네임을 지어 해당 닉네임의 for문을 빠져나올 수 있음*/
		for(int i=num1; ; i--) {
			if(num1%i==0&&num2%i==0) {
				System.out.println("두 수의 최대 공약수 : "+i);
				break;
			}
		}
		
//		int i=0;
//		a : for(;;) {
//			for(;;) {
//				for(;;) {
//					i++;
//					if(i==10) {
//						System.out.println(i+"벗어나기..");
//						break a;
//					}
//				}
//			}
//		}

		
		
		scan.close();
		

	}

}
