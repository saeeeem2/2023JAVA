package day12;

import java.util.Scanner;

public class ProductMain1 {

	public static void main(String[] args) {
		
		Product[] p=new Product[10];
		Scanner scan=new Scanner(System.in);
		
		char menu='y';
		int cnt=0; //while에서 index를 핸들링하기 위한 변수
		
		while(menu!='n') {
			System.out.println("상품등록(y/n)");
			menu=scan.next().charAt(0);
			if(menu=='y') {
				//반복입력
				System.out.println("상품명 : ");
				String name=scan.next();
				System.out.println("가격 : ");
				int price=scan.nextInt();
				
				//객체를 생성해서 메뉴와 가격을 등록=>배열 cnt번지에 추가
				//생성자 이용하는 방법
//				Product tmp=new Product(name,price);
//				p[cnt]=tmp;
//				
				//메서드 이용
				p[cnt]=new Product();
				//p[cnt].inserProduct(name,price);
				cnt++; //index증가
				
			}else {
				//menu=='n'
				if(menu=='n') {
					System.out.println("상품등록 종료");
				}else {
					System.out.println("y/n만 입력 가능합니다.");
				}
			}
		}
		System.out.println("등록된 상품 리스트");
		for(int i=0; i<cnt; i++) {
			//toString
			System.out.println((i+1)+". "+p[i]);
			
			//출력 메서드를 사용한 경우
//			System.out.println((i+1));
//			p[i].메서드 호출
		}
		
	}

}
