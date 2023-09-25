package Test;

public class Card2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CardPack2 cp = new CardPack2();
		int index = 0;
		for(int i=0; i<cp.getPack().length; i++) {
			cp.getPack()[i].print();
			index++;
			if(index % 13==0) {
				System.out.println();
			}
		}
		

	}
	private char shape;  //모양
	private int num; //숫자
	
	//생성자
	public Card2() {
		shape = '♥';
		num = 1;
	}
	
	//print 메서드
	public void print() {
		System.out.print(shape);
		switch(num) {
		case 11: System.out.print("J ");
			break;
		case 12: System.out.print("Q ");
			break;
		case 13: System.out.print("K ");
			break;
			default:
				System.out.print(num+" ");
		}
	}

	public char getShape() {
		return shape;
	}

	public void setShape(char shape) {
		switch(shape) {
		case '♥': case '♣': case '♠': case '◆':
			this.shape = shape;
		break;
		default:
			this.shape='♥';
		}
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if(num < 1 || num > 13) {
			this.num = 1;
		}else {
			this.num = num;			
		}
	}

}
