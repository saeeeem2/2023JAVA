package day04;

import java.util.Scanner;

public class ForEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*소수 : 약수가 1과 자기자신만 가지는 수
		 * 소수 : 3,5,7,11,13,17 ...*/
		
		/*num를 입력받아서 num가 소수인지 아닌지 판별
		 * ex) num=13 => 소수입니다
		 * 	   num=12 => 소수가 아닙니다
		 * 입력받은 수의 약수가 몇개인지*/
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.");
//		int num=scan.nextInt();
//		int count=0;
//		for(int i=1; i<=num; i++) {
//			if(num%i==0) {
//				count++;
//				if(count>2) {
//					System.out.println("소수가 아닙니다.");
//				} else {
//					System.out.println("소수입니다.");
//				}
		//정답풀이
//		int count=0;
//		for(int i=1; i<=num; i++) {		
//			if(num%i==0) {
//				count=count+1;//count++;
//			}
//		}
//		System.out.println(count);
//		if(count==2) {
//			System.out.println("소수입니다.");
//		}else {
//			System.out.println("소수가 아닙니다.");
		//scan.close();
			

			
			/* 2~100까지 중 소수를 출력 ==int i
			 * 약수 값은1부터 i까지 돌려서 약수를 구해야 함*/
		int count=0;
		for(int num=2; num<=100; num++) { //2~100까지
			count=0; //카운트가 누적이 되지 않도록 항상 0으로 초기화
						// 각 num마다 약수의 갯수가 0부터 시작
		
				for(int i=1; i<=num; i++) {	//약수를 구하기 위해 돌리는 값	
					if(num%i==0) { //약수체크
						count=count+1;//count++;
						}		
					}
			if(count==2) { // 약수가 2개인지 체크
			System.out.print(num+" ");
			}
		}
		
	 }
}

	
	

