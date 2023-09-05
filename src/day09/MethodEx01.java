package day09;

//class의 public은 파일명과 일치하는 class에만 가능
// 한 파일에 1개만 public class 존재
public class MethodEx01 {
	//멤버변수자리
	
	//메서드 자리
	public static void main(String[] args) {
		/* num1, num2 숫자 두 개를 주고 두 수의 합을 리턴하는 메서드
		 * 메서드는 메서드를 선언하는 것으로 일을 하지 않음.
		 * 
		 * */ 
		int a=3;
		int b=5;
		
		// 호출 : 반복적으로 호출가능(여러번 호추 가능)
		int hap=sum(a,b);
		System.out.println(hap);
		
		sum1(b,hap);
		
		// static이 없는 메서드의 호출
		// 객체를 생성해야 메서드 호출이 가능함
		// 현재 클래스 MethodEx01
		// 같은 클래스임에도 객체를 생성하는 이유 : 현재 실행 Method가 static을 포함하는 main메서드이기 때문에
		// 만약 main메서드가 static이 아니었으면 객체 생성하지 않고 사용 가능함
		MethodEx01 me=new MethodEx01(); // 객체 생성
		int hap2=me.sum2(b, hap);
		System.out.println(hap2);
		
	}
	// 다음 메서드
	// 기능 : 두 정수의 합을 리턴하는 메서드
	// 매개변수 : 두 정수 => int num1, int num2
	// 리턴타입 : 합(int)
	
	public static int sum(int num1, int num2) {
		return num1+num2;
	}	
	//다음 메서드
	// 기능 : 두 정수의 합을 출력하는 메서드
	// 리턴타입 : 없음 => void
	// 매개변수 : 두 정수 =>int num1, int num2
	public static void sum1(int num1, int num2) {
		System.out.println(num1+num2);
	}
	// 메서드 오버로딩이 가능하려면
	// 메서드 오버로딩 : 같은 이름의 메서드를 여러개 정의하는 것
	// 매개변수의 종류가 다르거나 개수가 다르거나 
	
	
	// 두 수의 합을 리턴하는 메서드(static 없이)
	public int sum2(int num1, int num2) {
		return num1+num2;
	}

}

// 클래스 자리