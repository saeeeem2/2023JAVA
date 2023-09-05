package day06;

public class Method02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 메서드를 활용하여 계산기를 작성
		 * 메서드는 + - * / % 
		 * 두 정수가 주어지면 두 정수의 연산을 하는 메서드를 작성
		 * + 일 때 호출 => 메인에서 출력
		 * - 일 때 호출 => 메인에서 출력
		 * * 일 때 호출 => 메서드에서 출력
		 * / 일 때 호출 => 메서드에서 출력 => 리턴을 double
		 * % 일 때 호출 => 메서드에서 출력
		 * */
		
		int add=add(4,5);
		System.out.println(add);
		
		int sub=sub(9,5);
		System.out.println(sub);
		
		mul(4,5);
		div(9,6);
		rem(4,2);
		int method01=Method01.sum(10, 30); // Method01클래스에서 정의한 sum메서드 호출
		System.out.println(method01);
		
		//다른 클래스에 있는 메서드를 사용 (시 static이 있는 경우 사용 가능)
		// => 클래스명.메서드명
		//클래스 => 정의서 => 객체를 생성해서 메서드를 사용
		//현재 시점에서 객체 생성없이 메서드를 사용할 수 있는 이유는 = static
		//메서드를 사용할 때 static이 없는 경우 - 선언만 해놓고 생성이 안 되어있다는 것을 의미
		//객체를 생성해야 함 => 클랙스 필요
		
		Method02 me=new Method02();
		int s = me.add(20,30);
		System.out.println("me 객체 생성 후 add호출 : "+s);
		

	} 
	//메서드 정의
	public static int add(int num1, int num2) {
		int result=num1+num2;
		return result;
	}
	public static int sub(int num1, int num2) {
		int result=num1-num2;
		return result;
	}
	public static void mul(int num1, int num2) {
		System.out.println(num1*num2);
	}
	public static double div(int num1,int num2) {
		System.out.println((double)num1/num2);
		return (double)num1/num2;
	}
	
//	public static void div(double num1, double num2) {
//		System.out.println(num1/num2);
//	}

	public static void rem(int num1, int num2) {
		System.out.println(num1%num2);
	}
}


