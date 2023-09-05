package lottoprogram;

import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {
		// LottoMain : 메뉴를 입력받기
		
		LottoManager lm=new LottoManager();
		Scanner scan=new Scanner(System.in);
		
		int menu=0;
		do {
			lm.printMenu();
			menu=scan.nextInt();
			
			switch(menu) {
			case 1 : lm.createLotto(scan);
				break;
			case 2 : lm.createLottoAuto();
				break;
			case 3 : lm.insertLottoAuto();
				break;
			case 4 : lm.checkLotto();
				break;
			case 5 : lm.printLotto();
				break;
			case 6 : break;
				default : 
					System.out.println("잘못된 메뉴");
			}
			} while(menu!=6);
				System.out.println("프로그램 종료");
			
		
	}
}

		
