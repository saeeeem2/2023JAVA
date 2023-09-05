package day12;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		/*ProductMain class 생성
		  Product 배열생성[10]
		  상품등록 후 상품리스트 출력

		  상품을 등록하시겠습니까? (y/n)
		  y=등록
		  n=취소
		  상품이름과 가격을 등록받아 배열에 등록

		  n=>등록된 제품리스트 출력*/
		
		int cnt = 0;
		Product mn=new Product();
		Product[] prd = new Product[10];
		while(true){
			System.out.println("상품을 등록하시겠습니까? (y/n)");
			Scanner scan = new Scanner(System.in);
			String choice = scan.next();

				if(choice.equals("y")||choice.equals("Y")){
					System.out.println("메뉴를 입력하세요.");   
			        String menuName = scan.next();

			        System.out.println("가격 입력하세요.");   
			        int price = scan.nextInt();

			        prd[cnt] = new Product(menuName, price);
			        prd[cnt].printMenu();
			        cnt++;
			    }else if(choice.equals("n")||choice.equals("N")){
			        for(int i=0; i<cnt; i++) {
			        	prd[i].printMenu();
			        }
   
			     break;
			    }
		}		
	}

}
