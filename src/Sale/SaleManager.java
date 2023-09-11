package Sale;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleManager {
	
	private ArrayList<Menu<String, Integer>> product = new ArrayList<>();
	private ArrayList<Menu<String, Integer>> order = new ArrayList<>();
	
	private int totSum=0;
	
	public SaleManager() {
		addMenu();
	}
	
	public void addMenu() {
		product.add(new Menu("햄버거",7000));
		product.add(new Menu("피자",15000));
		product.add(new Menu("음료",2000));
		product.add(new Menu("과자",1000));
		product.add(new Menu("사탕",500));

	}
	
	// 메뉴 추가 기능
	public void add(Scanner scan) {
		System.out.println("메뉴명 : ");
		String menu=scan.next();
		System.out.println("가격 : ");
		int price = scan.nextInt();
		
		Menu m=new Menu(menu,price);
		product.add(m);
		System.out.println("메뉴 추가 완료~~!");
	}
	
	// 메뉴 리스트
	public void printProduct() {
		System.out.println("--menu--");
		for(int i=0; i<product.size(); i++) {
			System.out.println((i+1)+". "+product.get(i));
		}
		System.out.println("------------------------");
	}
	
	//주문처리
	public void orderPick(Scanner scan) {
		System.out.println("주문메뉴 : ");
		//1. 메뉴를 직접 한글로 받는 케이스
		//String menu = scan.next(); //햄버거
		//2.메뉴를 숫자로 받는 케이스
		int pick=scan.nextInt(); //번호 : index-1
		String tmpMenu=product.get(pick-1).getMenu();
		
		if(tmpMenu==null) {
			System.out.println("찾는 메뉴가 없습니다.");
		}else {
			System.out.println("주문수량 : ");
			int count = scan.nextInt();
			int tmpPrice=product.get(pick-1).getPrice(); //햄버거 가격
			totSum += tmpPrice*count;
			
			Menu m=new Menu(tmpMenu, count); //메뉴와 개수
			order.add(m);
		}
		
	}
	
	//주문리스트
	public void printOrder() {
		int sum=0;
		int index=1;
		for(Menu m : order) { //임시변수에 형을 지정해주면 형변환 하지 않아도 됨 (Menu m<String, Integer>)
			String menu = (String)m.getMenu();
			int price = findMenu(menu);
			System.out.println(index+". "+m+"    "+m.getPrice()+"   "+((int)m.getPrice()*price));
			index++;
		}
		System.out.println("-------------");
		System.out.println("주문 총액 : "+totSum);
	}
	
	public int findMenu(String menu) {
		for(Menu m : product) { 
			if(m.getMenu().equals(menu)) {
				return (int)m.getPrice();
			}
		}
		return -1;
	}

}
