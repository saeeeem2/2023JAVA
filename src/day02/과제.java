package day02;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 카페에 제출
		 * 정수 2개와 연산자 하나를 입력받아 두 정수의 연산을 출력
		 * 연산자는 + - * % /
		 * ex) 3 2 + => 3+2=5
		 * ex) 6 3 / => 6/3=2
		 * 만약 연산자의 종류가 예시 5개의 연산자가 아닌 경우 "잘못된 입력" 출력 
		 */
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("정수 2개와 연산자 하나를 입력해주세요.(연산자 예시 : +,-,*,/,%)");
//		
//		int num1=scan.nextInt();
//		int num2=scan.nextInt();
//		char ch=scan.next().charAt(0);
//		switch (ch) {
//		case '+' :
//			System.out.println(num1+num2);
//			break;
//		case '-' :
//			System.out.println(num1-num2);
//			break;
//		case '*' :
//			System.out.println(num1*num2);
//			break;
//		case '/' :
//			System.out.println(num1/num2);
//			break;
//		case '%' :
//			System.out.println(num1%num2);
//			break;
//		default : 
//			System.out.println("잘못된 입력");
//		
//		}
		
		//답
		Scanner scan=new Scanner(System.in);
		System.out.println("숫자(정수)를 입력해주세요.");
		int num1=scan.nextInt();
		System.out.println("다음 숫자를 입력해주세요.");
		int num2=scan.nextInt();
		System.out.println("연산자를 입력해주세요.");
		char op = scan.next().charAt(0); //한글자 입력받기
		
		int a = num1+num2;
		int b = num1-num2;
		int c = num1*num2;
		double d = (double)num1/num2;
		int e = num1%num2;
		
		switch(op) {
		case '+' : System.out.println(""+num1+op+num2+"="+a); // 맨 앞에 의미 없는 문자열을 입력해야 연산이 가능함(string은 의미없는 문자열 필요없음)
			break;
		case '-' : System.out.println(""+num1+op+num2+"="+b);
			break;
		case '*' : System.out.println(""+num1+op+num2+"="+c);
			break;
		case '/' : System.out.println(""+num1+op+num2+"="+d);
			break;
		case '%' : System.out.println(""+num1+op+num2+"="+e);
			break;
			default : 
				System.out.println("잘못된 연산자 입니다.");

		}
		

		

			
		scan.close();
		

	}

}
