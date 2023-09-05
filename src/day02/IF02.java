package day02;

import java.util.Scanner;

public class IF02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 국어, 영어, 수학 점수를 입력받아서 합계, 평균, 평가를 출력
		 * 평가는 평균이 90이상이면 A, 평균 80이상이면 B, 70이상이면 C, 나머지는 D
		 * 입력받는 값이 0보다 작거나 100보다 크면 "잘못된 값입니다" 문구 출력
		 */
		
//		Scanner scan= new Scanner(System.in);
//		System.out.println("국어점수를 입력해주세요.");
//		int kor = scan.nextInt();
//		if (kor<0 || kor>100) {
//			System.out.println("잘못된 값입니다.");
//		}
//		System.out.println("영어점수를 입력해주세요.");
//		int eng = scan.nextInt();
//		if (eng<0 || eng>100) {
//			System.out.println("잘못된 값입니다.");
//		}
//		System.out.println("수학점수를 입력해주세요.");
//		int math = scan.nextInt();
//		if (math<0 || math>100) {
//			System.out.println("잘못된 값입니다.");
//		}
//		int sum=kor+eng+math;
//		int avg=sum/3;
//		System.out.println("합계 : "+sum);
//		System.out.println("평균 : "+avg);
//		if (avg>=90) {
//			System.out.println("평가 : A");
//		} else if(avg>=80) {
//			System.out.println("평가 : B");
//		} else if(avg>=70) {
//			System.out.println("평가 : C");
//		} else {
//			System.out.println("평가 : D");
//		}
//		
//		scan.close();
		
		//정답
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력(0~100) : 국어, 영어, 수학 순으로 입력");
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();
		
		if(kor<0||kor>100) {
			System.out.println("국어점수가 입력 범위를 벗어났습니다");
		}
		if(eng<0||eng>100) {
			System.out.println("영어점수가 입력 범위를 벗어났습니다");
		}
		if(math<0||math>100) {
			System.out.println("수학점수가 입력 범위를 벗어났습니다");
		}
		int sum=kor+eng+math;
		double avg=sum/3.0;
		System.out.println("합계 : "+sum+" , 평균 : "+avg);
		
		char ch ='D'; //char 형태는 ''
		if(avg>100 || avg<0) {
			System.out.println("잘못된 성적입니다.");
		} else if(avg>=90) {
			ch='A';
		} else if(avg>=80) {
			ch='B';
		} else if(avg>=70) {
			ch='C';
		} else {
			ch='D';
		}
		
		scan.close();
		
		

	}

}
