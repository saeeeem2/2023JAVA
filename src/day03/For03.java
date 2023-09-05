package day03;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 구구단 : 숫자를 입력받아서 단을 출력
		 * ex) 2를 입력하면 2*1=2~2*9=18까지 출력
		 * */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("구구단의 단을 입력해주세요.");
		int num=scan.nextInt();
		int a=0;
		for(int i=1; i<=9; i++) {
			a=num*i;
			System.out.println(num+"*"+i+" = " +a);
		}
		
		scan.close();
		

		
	}

}
