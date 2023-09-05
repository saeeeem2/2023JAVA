package day12;

import java.util.Scanner;

public class Product {
	/*Product class생성
		메뉴 이름, 가격
		// 메뉴 추가 메서드
		//메뉴와 가격을 출력하는 메서드(메뉴 : 가격)*/
	
	private String menuName;
	private int price;
//	private String[] menuList=new String[10];
//	private int cnt;
	
	public Product() {}
	public Product(String menuName, int price) {
		this.menuName=menuName;
		this.price=price;
	}
		
	public void printMenu() {
		System.out.println("상품명 : "+menuName+", 가격 : "+price+"원");
	}
	
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}