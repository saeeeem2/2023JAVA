package day16;

public class 내부클래스 {

	public static void main(String[] args) {
		/* 내부클래스 : 클래스 내부에 선언한 클래스
		 * 	- 외부클래스->내부클래스
		 * 	- 다른 외부에서는 내부클래스를 사용할 일이 없고 내부클래스가 외부클래스와 밀접한 연관이 있을 경우 사용
		 * 
		 * 	- 내부적으로 사용할 목적으로 만드는 클래스이기 때문에 private로 선언하는 것을 권장함
		 * 	- 내부클래스가 생성되는 시기 : 외부클래스가 생성된 후 내부클래스가 생성됨
		 * 익명(anomymous class) 내부클래스 -> 익명클래스를 사용하기 위해 내부클래스를 사용
		 * 
		 * 
		 * */
		
		A a =new A();
		a.outprint();
		//B b=new B(); //내부클래스여서 메인에서 객체 생성 불가
		

	}

}
//외부클래스
class A{
	//내부클래스
	private int num=10;
	private int num2=20;
	private B b;
	
	public A() {
		b = new B();
	}
	
	class B{
		int inNum=100;
		public void inprint() {
			System.out.println("외부클래스 num "+num);
			System.out.println("외부클래스 num2 "+num2);
			System.out.println("내부클래스 inNum "+inNum);
		}		
	}
	
	public void outprint() {
		b.inprint(); //내부클래스의 객체 변수를 사용하여 메서드 호출
	}
}