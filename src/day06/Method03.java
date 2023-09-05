package day06;

import java.util.Scanner;

public class Method03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 메서드를 활용한 계산기 작성
		 * 연산자는 + _ * / %만 허용
		 * 두 수와 연산자를 입력받아서 메서드를 활용하여 연산 
		 * ex) 3+4=7 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("==계산기를 만들어 보자==");
		System.out.println("연산자를 입력해주세요");
		String op=scan.next();
		
		System.out.println("두 정수를 입력해주세요");
	    int num1=scan.nextInt();
	    int num2=scan.nextInt();
	    
	    switch(op) {
	    case "+" : add(op,num1,num2);
	    	break;
	    case "-" : int r=sub(num1, num2);
	    	System.out.println(num1+op+num2+"="+r);
	    	break;
	    case "*" : mul(op, num1, num2);
	    	break;
	    case "/" : double r1=div(num1, num2);
    		System.out.println(num1+op+num2+"="+r1);
	    	break;
//	    case "%" : 
//	    	int r2=rem(num1, num2);
//			System.out.println(num1+op+num2+"="+r2);
	    case "%" : //rem2를 호출하여 몫과 나머지를 출력
	    	double[] rem2=rem2(num1, num2);
			System.out.println("몫 : "+rem2[0]);
			System.out.println("나머지 : "+rem2[1]);
	    	break;
	    	default:
	    	System.out.println("잘못된 연산자 입니다");

	    }
	    System.out.println("계산기 종료");
		
		
		
		
		
		//내가 푼거
//		int num1=scan.nextInt();
//		int num2=scan.nextInt();
//		String s=scan.nextLine();
//		
//		if(s=="+") {
//			int add=add(num1,num2);
//			System.out.println(num1+s+num2+"="+add);
//		}
//		if(s=="-") {
//			int sub=sub(num1,num2);
//			System.out.println(num1+s+num2+"="+sub);
//		}
//		if(s=="*") {
//			int mul=mul(num1,num2);
//			System.out.println(num1+s+num2+"="+mul);		
//		}
//		if(s=="/") {
//			double div=(double)div(num1,num2);
//			System.out.println(num1+s+num2+"="+div);	
//		}
//		if(s=="%") {
//			int rem=rem(num1,num2);
//			System.out.println(num1+s+num2+"="+rem);	
//		}	
//		
		
		scan.close();
		
	}
	//내가 푼거
//	public static int add(int num1, int num2) {
//		int result=num1+num2;
//		return result;
//	}
//	public static int sub(int num1, int num2) {
//		int result=num1-num2;
//		return result;
//	}
//	public static int mul(int num1, int num2) {
//		int result=num1*num2;
//		return result;
//	}
//	public static double div(int num1,int num2) {
//		System.out.println((double)num1/num2);
//		return (double)num1/num2;
//	}
//	
//	public static int rem(int num1, int num2) {
//		int result=num1%num2;
//		return result;
	
	//값을 연산자까지 매개변수로 받아 리턴없이 출력한 메서드
	public static void add(String op, int num1, int num2) {
		System.out.println(num1+op+num2+"="+(num1+num2));
	}
	//두 정수를 매개변수로 받아 결과를 리턴받는 형태의 메서드
	public static int sub(int num1, int num2) {
		return num1-num2;
	}
	public static void mul(String op, int num1, int num2) {
		System.out.println(num1+op+num2+"="+(num1*num2));
	}
	public static double div(int num1, int num2) {
		return (double)num1/num2;
	}
	public static int rem(int num1, int num2) {
		return num1%num2;
	}
	
	/* 기능 : 두 정수를 입력받아 두 정수의 몫과 나머지를 double[]로 리턴
	 * 리턴 타입 : double 타입의 배열
	 * 매개변수 : 두 정수
	 * 변수명 rem2
	 * */
	public static double[] rem2(int num1,int num2) {
		double arr[] = new double[2];
		arr[0]=(double)num1/num2;
		arr[1]=(double)num1%num2;
		return arr;
			
	}
}
