package day16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List02 {

	public static void main(String[] args) {
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
		
		
		System.out.println("--메뉴판--");
		System.out.println("1. 햄버거 : 7000");
		System.out.println("2. 피자 : 15000");
		System.out.println("3. 음료수 : 2000");
		System.out.println("4. 과자 : 1000");
		System.out.println("5. 사탕 : 500");
		System.out.println("6. 프로그램 종료");
		Scanner scan=new Scanner(System.in);
		int menu=scan.nextInt();
		int acount=scan.nextInt();
		
		

	}

}

class FoodManager{
	//멤버변수 ArrList 메뉴, ArrayList 가격
	//그 외 필요한 멤버변수는 선택
	private List<String> menuArr=new ArrayList<>();
	private List<String> priceArr=new ArrayList<>();
		
	//메서드
	//결과 출력, 메뉴 출력, 주문에 대한 add(), 결과 출력 sale()
	public void add(int menu, int acount) {
		
	
	}
	
	public String[] menuList {

		return list;
	}
}
