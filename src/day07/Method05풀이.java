package day07;

import java.util.Scanner;

public class Method05풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 2~100까지의 소수를 출력
		 * main에서는 2~100까지 for문을 돌려서 메서드 호출하여 true라면 출력
		 * */
		for(int i=2; i<=100; i++) { //2~100까지
			if(isPrime(i)) {
				System.out.print(i+" "); //소수만 출력
			}
		}
		
		// 2~100까지의 소수의 합계
		System.out.println();
		int sum=0;
		for(int i=2; i<=100; i++) { //2~100까지
			if(isPrime(i)) {
				sum+=i;
			}
		}
		System.out.println("2~100까지 소수의 합 : "+sum);
		
		// 값을 입력받아서 소수인지 아닌지 출력
		System.out.println();
		Scanner scan = new Scanner(System.in);
		System.out.println("정수입력");
		int num=scan.nextInt();
//		if(isPrime(num)) {
//			System.out.println("소수입니다.");
//		} else {
//			System.out.println("소수가 아닙니다.");
//		}
		
		System.out.println(isPrime(num)?"소수":"소수아님");
		scan.close();
		
		
	}
	
	/* 기능 : 정수가 주어지면 이 정수가 소수인지 아닌지 판단(소수가 맞으면 true, 아니면 false)
	 * 소수 : 1과 자기 자신만의 약수로 가지는 수
	 * 리턴타입 : boolean
	 * 매개변수 : 정수 => int num
	 * 메서드명 : isPrime =>is를 붙이면 맞냐 아니냐를 묻는 것
	 * */
	
	public static boolean isPrime(int num) {
		int cnt=0;
	    for(int i=1; i<=num; i++) {	//약수를 구하기 위해 돌리는 값	
			if(num%i==0) { //약수체크
				cnt++;//count++;
			}	
	    }
				if(cnt==2) { // 약수가 2개인지 체크
				return true;
			} return false;
		}	
		

}
