package Word;

import java.util.Objects;

public class Word implements Comparable {
	
	/* 단어장
	 * Word 클래스 생성
	 *  - 단어 : 의미
	 *  ex. hello : 안녕
	 *  	apple : 사과
	 *  	banana : 바나나
	 *  
	 * 단어를 추가하고 추가한 단어를 출력(정렬해서 출력)
	 * 검색 및 출력 기능도,,,, 넣어도,,,, 됨,,,
	 * 
	 * 정렬을 하기 위해 comparator구현 객체 필요
	 * 기존클래스+Comparable구현
	 * 정렬(equals비교하여 정렬)
	 * 어떤 값을 기준으로 정렬할지? 
	 * */
	private String word;
	private String mean;
	
	public Word() {}

	public Word(String word, String mean) {
		super();
		this.word = word;
		this.mean = mean;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMean() {
		return mean;
	}

	public void setMean(String mean) {
		this.mean = mean;
	}

	@Override
	public String toString() {
		return "단어 : " + word + ", 의미 : " + mean;
	}
	public int compareTo(Object o) {
		// 내 클래스의 객체 값과 매개변수로 들어오는 객체의 값을 비교
		// Comparator(이미 완성된 컬렉션에서 앞의 값과 뒤의 값을 비교)
		Word word=(Word)o;
		return this.word.compareTo(word.word); //결과 앞에 -만 변경하면 내림차순, 오름차순 변경 가능
		//return -this.word.compareTo(word.word); 내림 차순 
	}

	@Override
	public int hashCode() {
		return Objects.hash(mean, word);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) // 실제 주소가 같은지 확인
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) //클래스의 정보를 확인
			return false;
		Word other = (Word) obj;
		return Objects.equals(mean, other.mean) && Objects.equals(word, other.word);
	}
	
	
	
}
