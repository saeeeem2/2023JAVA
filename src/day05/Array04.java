package day05;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 다섯자리의 숫자를 입력받아서 입력받은 숫자를 거꾸로 출력
		 * 각 자리의 합계 출력
		 * ex) 11345=>65411=>6+5+4+1+1*/
		
		
//		int arr[]=new int[5];
//		int sum=0;
//		Scanner scan=new Scanner(System.in);
//		System.out.println("숫자 5자리를 입력하세요.");
//		for(int i=0; i<arr.length; i++) {	
//			arr[i]=scan.nextInt();
//			sum +=arr[i];
//		}
//		System.out.println("다섯자리 합계 : "+sum);
//
//		for(int i=4; i<arr.length; i--) {
//			System.out.println(arr[i]);
//		}
//
//		scan.close();
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("숫자 5자리를 입력하세요.");
//		int num=scan.nextInt();
//		int arr[]-new int[5];
//		string s ="12345";
//		string s1[]=new String[5];
//		
		
		
		
		//나누기와 나머지를 이용하여 구하기
		//12345 => %10 => 나머지 5 => 배열에 저장
		//값을 나눈 몫만 다시 나눌값으로 지정
		//12345/10=>정수만 저장
		//1234=> %10 => 나머지 4 => 배열에 저장 ...
		Scanner scan=new Scanner(System.in);
		System.out.println("숫자 5자리를 입력하세요.");
		int num=scan.nextInt();
		int arr[]=new int[5];
		int sum=0;
		int i=0;
		while(num>0) {//입력받은 num가 0보다 작아지면 false로 반복문 종료
			int b=num%10; //마지막 자리를 나머지로 받기
			arr[i]=b;
			sum+=b;
			num=num/10; //몫저장 => 정수/정수=정수
			System.out.println(arr[i]);
			i++;
		}
		System.out.println("sum : "+sum);
		
		scan.close();
	}

}
