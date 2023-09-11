package Sale;

import java.util.Scanner;

public class SaleMain {

	public static void main(String[] args) {
		SaleManager sm=new SaleManager();
		Scanner sc=new Scanner(System.in);
		
		int menu=-1;
		do {
			System.out.println("1. 메뉴추가, 2. 메뉴출력, 3. 주문, 4. 주문리스트, 5. 종료");
			System.out.println("메뉴입력");
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
