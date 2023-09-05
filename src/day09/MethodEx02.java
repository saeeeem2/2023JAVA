package day09;

public class MethodEx02 {

	public static void main(String[] args) {
		// 두 정수의 사칙연산(+ - * / %)을 처리
		MethodEx02 a=new MethodEx02();
		int add=a.add(4, 5);
		System.out.println(add);
		System.out.println(a.add(10,20));
		
		int sub=a.sub(5, 4);
		System.out.println(sub);
		System.out.println(a.sub(10,20));

		int mul=a.mul(add, sub);
		System.out.println(mul);
		System.out.println(a.mul(10,20));

		double div=a.div(sub, mul);
		System.out.println(div);
		System.out.println(a.div(10,20));

		int rem=a.rem(sub, mul);
		System.out.println(rem);
		System.out.println(a.rem(10,20));

		
	}
	// 사칙연산의 메서드 생성 단, static없이 생성
	public int add(int num1, int num2) {
		return num1+num2;
	}
	public int sub(int num1, int num2) {
		return num1-num2;
	}
	public int mul(int num1, int num2) {
		return num1*num2;
	}
	public double div(int num1, int num2) {
		return (double)num1/num2;
	}
	public int rem(int num1, int num2) {
		return num1%num2;
	}

}
