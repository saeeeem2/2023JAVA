package day18;

import java.util.ArrayList;

import Sale.Menu;

public class Word<K,V> {
	
	/* 단어장
	 * Word 클래스 생성
	 *  - 단어 : 의미
	 *  ex. hello : 안녕
	 *  	apple : 사과
	 *  	banana : 바나나
	 *  
	 * 단어를 추가하고 추가한 단어를 출력(정렬해서 출력)
	 * 검색 및 출력 기능도,,,, 넣어도,,,, 됨,,,
	 * */
	private K word;
	private V mean;
	
	public Word() {}
	public Word(K word, V mean) {
		this.word=word;
		this.mean=mean;
	}
	public K getWord() {
		return word;
	}
	public void setWord(K word) {
		this.word = word;
	}
	public V getMean() {
		return mean;
	}
	public void setMean(V mean) {
		this.mean = mean;
	}
	@Override
	public String toString() {
		return word + " : " + mean;
	}
}
