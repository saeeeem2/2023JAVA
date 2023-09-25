package day19_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* 수강관리 프로그램 list로 작성
		 * 수강관리 프로그램
		 * 1. 학생 등록 2. 학생 검색 3. 학생 리스트 4. 수강신청 5. 수강철회 6. 종료
		 * 기존 배열의 수강관리 프로그램을 List로 변경해서 구현
		 * 아이템 선정 -> 메뉴 구성 -> 클래스(컬렉션) -> 기능 세분화(인터페이스 구성)
		 * 
		 * 인터페이스 생성 -> student클래스 생성 -> main(test하기 위해) -> manager(처리)*/
		
		/* 학생관리 프로그램*/
		
		Scanner scan=new Scanner(System.in);
		StudentManager sm=new StudentManager(); //생성자에 추가했으므로 기본학생이 자동으로 추가됨
		//sm.add(); //기본학생 추가
		
		int menu=0;
		do { 
			System.out.println("-----학생관리 프로그램-----");
			System.out.println("1. 학생추가 2. 학생리스트 3. 학생검색 4. 학생수정 5. 학생 삭제 6. 과목추가 7. 점수수정 8. 과목삭제 9. 종료");
			System.out.println(">> 메뉴 선택");
			menu=scan.nextInt();
			
			switch(menu){
			case 1 : sm.addStd(scan); break;
			case 2 : sm.printStd(); break;
			case 3 : sm.searchStd(scan); break;
			case 4 : sm.modStd(scan); break;
			case 5 : sm.delStd(scan); break;
			case 6 : sm.addSub(scan); break;
			case 7 : sm.modSub(scan); break;
			case 8 : sm.delSub(scan); break;
			case 9 :  break;
			default : 
				System.out.println("잘못된 메뉴입니다.");
			}
			
		}while(menu!=9);
		System.out.println("프로그램 종료");
		
		
		
		

	}

}