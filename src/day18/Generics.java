package day18;

import java.util.Scanner;

public class Generics {

	public static void main(String[] args) {
		/* 제네릭(Generic) 클래스
		 * 클래스 선언 시 구체적인 타입을 기재하지 않고 사용할 수 있도록 해주는 방식
		 * <클래스> : String, Integer, Student, Subject
		 * */
		
		/* --메뉴판-- 
		 * 1.햄버거 : 7000
		 * 2.피자 : 15000
		 * 3.음료수 : 2000
		 * 4.과자 : 1000
		 * 5.사탕 : 500
		 * 6.프로그램 종료
		 * 
		 * ex.
		 * 메뉴를 선택하세요> 1
		 * 수량을 선택하세요> 2
		 * 1번 햄버거 2개 주문
		 * 주문을 끝내시려면 0을 눌러주세요. 1(0이외 다른 숫자)
		 * 메뉴를 선택하세요> 3
		 * 수량을 선택하세요> 2
		 * 3번 음료수 2개 주문
		 * 주문을 끝내시려면 0을 눌러주세요. 0
		 * 
		 * --선택한 메뉴
		 * 1. 햄버거 2개,
		 * 2. 음료 2개 선택
		 * 총 지불 금액 000원
		 * 
		 * */
		
		// main - 메인 메뉴 출력과 처리
		// 1. 메뉴추가, 2. 메뉴출력, 3. 주문, 4. 주문리스트, 5. 종료
		
		SaleManager sm=new SaleManager();
		Scanner sc=new Scanner(System.in);
		
		int menu=-1;
		do {
			System.out.println("메뉴입력");
			System.out.println("1. 메뉴추가, 2. 메뉴출력, 3. 주문, 4. 주문리스트, 5. 종료");
			menu=sc.nextInt();
			
			switch(menu) {
			case 1 : sm.add(sc); break;
			case 2 : sm.printProduct(); break;
			case 3 : sm.orderPick(sc); break;
			case 4 : sm.printOrder(); break;
			case 5 :  break;
			default :
				System.out.println("잘못된 메뉴입니다.");
			}
			
		} while(menu!=5);
			
		
		

	}

}
