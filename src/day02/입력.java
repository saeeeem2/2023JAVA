package day02;

import java.util.Scanner;

public class 입력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 콘솔 입력 : 콘솔에서 값을 입력 받는 것을 의미
		 * Scanner 클래스 => 콘솔에서 값을 입력받을 수 있게 해주는 클래스
		 */
//		Scanner scan= new Scanner(System.in);
//		System.out.println("숫자(정수)를 입력해주세요.");
//		int num =scan.nextInt();
//		System.out.println("내가 입력한 수 : "+num);
//		//콘솔에서 숫자를 하나 입력받아 입력받은 수가 짝수인지 홀수인지 출력
//		if (num%2==0) {
//			System.out.println("짝수");
//		} else {
//			System.out.println("홀수");
//		}
//
//		scan.close();
		
		
		// 숫자를 입력받아 양수인지, 음수인지, 0인지 판별하여 출력
     	Scanner scan = new Scanner(System.in);
		System.out.println("숫자(정수)를 입력해주세요");
		int num = scan.nextInt();
		System.out.println("내가 입력한 수 : "+num);
		if(num>0) {
			System.out.println("양수입니다");
		}else if(num==0) {
			System.out.println("0입니다");
		}else {
			System.out.println("음수입니다");
		}
		System.out.println("----------");
		System.out.println("실수 입력 > ");
		double num3=scan.nextDouble();
		System.out.println("실수입력 > "+num3);
//		
		System.out.println("한글자 입력 > "); //next() : 문자열 charAt(index) : 문자열 중 index번지 글자 한 글자만 추출
		char ch=scan.next().charAt(0); //문자열을 입력받는 형태
//		//index번지는 0부터 시작
		System.out.println("한글자 > "+ch);
//		
		//문자열 입력 : next() 공백은 포함되지 않음
		System.out.println("문자열 입력 > ");
		String s=scan.next();
		System.out.println("문자열 > "+s);
		
		scan.nextLine(); //enter처리용
		
		//여러 문자열 입력 : nextLine() 공백 포함
		System.out.println("여러문자 > ");
		String str=scan.nextLine();
		System.out.println("여러문자 > "+str);
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
		
		}
		
	}


