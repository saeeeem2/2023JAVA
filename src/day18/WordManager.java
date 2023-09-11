package day18;

import java.util.ArrayList;
import java.util.Scanner;

public class WordManager {
	ArrayList<Word<String,String>> wordList=new ArrayList<>(); //String, int
	
	public void addWord(Scanner scan) {
		System.out.println("추가할 단어를 입력해주세요.");
		String word=scan.next();
		System.out.println("단어의 의미를 입력해주세요.");
		String mean=scan.next();
		
		Word w=new Word(word,mean);
		wordList.add(w);
		System.out.println("단어가 추가되었습니다.");
	}
	public void printWordList() {
		System.out.println("====단어장====");
		for(int i=0; i<wordList.size(); i++) {
			System.out.println((i+1)+". "+wordList.get(i));
		}
	}

}
