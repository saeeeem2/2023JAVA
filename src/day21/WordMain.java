package day21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Word.Word;

public class WordMain  {
	
	List<Word> list=new ArrayList<Word>();
	BufferedReader br = null;
	PrintWriter pw = null;


	public static void main(String[] args) throws IOException {
		/* Word package에서 생성한 Word 클래스를 사용하여 단어장 프로그램 생성
		 * 1.단어등록, 2. 단어검색, 3. 단어수정, 4. 단어출력, 5. 단어삭제, 6. 단어를 파일로 출력, 7. 종료
		 * Word Class를 ArrayList로 구성*/
		BufferedReader br=new BufferedReader(new FileReader("word.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("word.txt"));
		
		Scanner scan=new Scanner(System.in);
		WordMain wm=new WordMain();
		int menu=0;
		do {
			System.out.println("1.단어등록, 2. 단어검색, 3. 단어수정, 4. 단어출력, 5. 단어삭제, 6. 단어를 파일로 출력, 7. 종료");
			System.out.println("메뉴를 선택해주세요. > ");
			menu=scan.nextInt();
			
			switch(menu) {
			case 1 : wm.insert(scan); break;
			case 2 : wm.search(scan); break;
			case 3 : wm.modWord(scan); break;
			case 4 : wm.printWord(); break;
			case 5 : wm.delWord(scan); break;
			case 6 : wm.filePrint(); break;
			case 7 : break;
			default :
				System.out.println("잘못된 메뉴입니다.");
			}
				
		}while(menu!=7);
		
		
		
		
		}
	public void insert(Scanner scan) {
		System.out.println("등록할 단어를 입력해주세요.");
		String word=scan.next();
		System.out.println("해당 단어의 의미를 입력해주세요.");
		String mean=scan.next();
		list.add(new Word(word, mean));
	}
	public void search(Scanner scan) {
		System.out.println("검색할 단어를 입력해주세요.");
		String word=scan.next();
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getWord().equals(word)) {
				System.out.println(list.get(i));
				return;
			}
		}
	}
	public void modWord(Scanner scan) {
		System.out.println("수정할 단어를 입력해주세요.");
		String word=scan.next();
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getWord().equals(word)) {
				list.remove(i);
				System.out.println("수정할 내용(단어)을 입력해주세요.");
				word=scan.next();
				System.out.println("수정할 내용(의미)을 입력해주세요.");
				String mean=scan.next();
				list.add(new Word(word,mean));
			}
		}
	}
	public void printWord() {
		System.out.println(list);
	}
	public void delWord(Scanner scan) {
		System.out.println("삭제할 단어를 입력해주세요.");
		String word=scan.next();
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getWord().equals(word)) {
				list.remove(i);
			}
		}
	}
	public void filePrint() throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("word.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("word.txt"));
		for(int i=0; i<list.size(); i++) {
	    	pw.println(list.get(i).getWord()+list.get(i).getMean());
		}
		pw.close();
		for(int i=0; i<list.size(); i++) {
			String line=br.readLine(); //홍길동 89
			System.out.println(line);
			if(line==null) {
				break;
			}
		}
	    br.close();
	}
		
	

	

}
