package day12;

public class Class05 {

	public static void main(String[] args) {
		/* static이 붙은 멤버변수/메서드 클래스 멤버변수/클래스 메서드라고 함
		 * static이 안 붙은 멤버변수/메서드들은 객체(인스턴스) 멤버변수/메서드라고 함
		 * 
		 * - 객체 멤버변수/메서드들은 객체를 통해 사용되고 생성됨
		 * - 각 객체마다 독립적으로 변수/메서드가 사용됨
		 * 
		 * - 클래스 멤버변수/메서드는 클래스를 통해 사용
		 * - 클래스명.메서드/변수 호출
		 * (객체를 통해서 호출이 가능하나 일반적이진 않음)
		 * - 클래스 멤버변수는 하나의 멤버변수를 모든 객체가 공유(사용)함
		 * - 모든 객체들이(하나의 클래스를 통해 생성되는 모든 객체) 동일한 값을 사용한다면 static을 붙이는 것을 고려
		 * 
		 * 클래스와 객체 변수들은 생성 시점이 달라서 메서드에서 사용될 수 있는 환경이 다름
		 * - 객체/멤버는 이미 클래스가 생성된 후 생성 / 클래스의 멤버 메서드를 객체에서는 사용가능
		 * - 클래스의 멤버변수는 클래스/객체의 멤버에서 모두 사용 가능함
		 * - 클래스 멤버 메서드는 클래스/객체의 멤버에서 모두 사용 가능
		 * - 객체 멤버 변수는 클래스 멤버 메서드에서 사용할 수 없음(객체를 생성해야지만 사용 가능)
		 * - 객체 멤버 메서드도 클래스 멤버 메서드에서 사용할 수 없음(객체를 생성해야지만 사용 가능)
		 * 
		 * */
		
		TV t=new TV();
		t.isPower();
		t.printBrand();//클래스 멤버 메서드호출
		TV.printBrand(); //클래스명.메서드로 호출

	}

}

class TV{
	private boolean power;
	//final : 최종변수라 수정할 수 없음
	public final static String brand="samsung";
	
	public void isPower() {
		System.out.println("제조사 : "+brand);
		if(!power) {
			power=true;
			System.out.println("켜졌습니다.");
		} else {
			power = false;
			System.out.println("꺼졌습니다.");
		}
	}
	public static void printBrand() {
		System.out.println("제조사 : "+brand);
		//클래서 메서드에서 객체 변수를 사용할 수 없음
		//System.out.println("전원상태" "+power);
	}
}
