package Test;


public class CardPack2 {
	
	private Card[] pack = new Card[52];
	private int cnt = 0;  //pack 배열의 index 체크용
	
	//생성자 : 52장의 카드를 모두 생성
	public CardPack2() {
		// ♥(1~13)  ♣(1~13)  ♠(1~13)  ◆(1~13)
		char shape='♥';
		for(int i=1; i<=4; i++) {
			switch(i) {
			case 1: shape='♥'; break;
			case 2: shape='♣'; break;
			case 3: shape='♠'; break;
			case 4: shape='◆'; break;
			}
			for(int j=1; j<=13; j++) {  //숫자
				Card c = new Card(); //카드 1장 생성
				c.setShape(shape);
				c.setNum(j);
				pack[cnt] = c;
				cnt++;
			}
		}
		
	}

	public Card[] getPack() {
		return pack;
	}

	public void setPack(Card[] pack) {
		this.pack = pack;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	

}
