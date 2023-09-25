package Word;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) {
		// 자료구조는 객체를 담는 변수
		// 객체는 반드시 생성(new)해서 list에 add해야함
		
		ArrayList<Word> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		int menu=-1;
		do {
			//메뉴의 값이 0이면 그만 입력, 그 전까지는 계속 입력
			System.out.println("단어 입력을 계속 하시겠습니까? 계속 1번, 종료 0번");
			menu=scan.nextInt();
			if(menu==0) {
				System.out.println("입력종료");
				break;
			} else {
				System.out.println("단어 입력 : ");
				String word=scan.next();
				
				System.out.println("의미 입력 : ");
				String mean=scan.next();
				
				Word w=new Word(word,mean);
				list.add(w);
				
			}
		} while(menu!=0);
		Collections.sort(list);
		for(Word tmp : list) {
			System.out.println(tmp);
		}		
	}

}
