package day04;

import java.util.Scanner;

public class Dowhile01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*do~while : 반복문 중 하나
		 * do {
		 * 실행문;
		 * } while(조건식);
		 * 
		 * for, while문은 조건식이 처음부터 false면 한 번도 실행이 안 될 수 있음
		 * 실행문을 먼저 실행하고 나서 조건식을 비교하여 반복 여부를 결정하므로 do~while문은 무조건 한 번은 실행됨 => 조건식이 false여도 무조건 한 번은 실행됨
		 * 메뉴 생성시 많이 사용*/
		
		Scanner scan=new Scanner(System.in);
		
		
		int menu=0;
		do {
			System.out.println("---menu---");
			System.out.println("1.저장하기");
			System.out.println("2. 새로만들기");
			System.out.println("3. 종료하기");
			System.out.println("> 메뉴입력");
			
			menu =scan.nextInt();
			//실제 기능을 처리하는 구문
			switch(menu) {
			case 1:
				//실제기능
				System.out.println("저장합니다");
				break;
			case 2:
				//실제기능
				System.out.println("새로 만듭니다");
				break;
			case 3:
				System.out.println("종료됩니다");
				break;
				default:
				System.out.println("잘못된 메뉴입니다.");
			}
			
		} while(menu!=3);//true면 반복
		System.out.println("프로그램 종료");
	
		scan.close();
	
	}

}
