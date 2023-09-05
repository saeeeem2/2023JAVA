package day07;

import java.util.Scanner;

public class Method07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*숫자와 기호를 주고 기호를 숫자만큼 출력하는 메서드
		 * ex)
		 * 3,* => ***
		 * 5,o => ooooo
		 * 2,★ => ★★
		 * 
		 * main에서 숫자와 기호를 입력받아 메서드 호출 후 출력*/
		Scanner scan=new Scanner(System.in);
		System.out.println("숫자와 기호를 입력해주세요.");
		int num=scan.nextInt();
		String str=scan.next(); //char ch=scan.next().cahrAt(0);
		a(num,str);
		
		scan.close();
		
		System.out.println();
		a(7,"☆");

	}
	public static void a(int num, String str) { //char ch 로 받아도 됨
		for(int i=1; i<=num; i++) {
			System.out.print(str);
		}
				
	}

}
