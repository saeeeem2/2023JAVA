package day12;

public class 상속 {

	public static void main(String[] args) {
		/* 상속 : 부모의 것을 자식에게 물려주는 것
		 * 클래스르르 상속 : 부모클래스의 멤버변수/멤버메서드를 물려주는 것
		 * 상속을 하는 이유 : 재사용을 ㅏ하기위함, 중복 코드를 줄이기 위해
		 * class A(부모) / class B(자식)
		 * 
		 * class B extends A{
		 *  -> 상속 키워드 extends
		 * }
		 * 상속을 받으면 부모의 멤버변수와 멤버 메서드를 사용할 수 있다
		 * 접근제한자가 private이면 자식 클랙스에서도 접근 불가능
		 * 접근제한자가 protected : 상속받는 자식에게 허용하는 제어자
		 * 
		 * */
		A a=new A();
		a.setA(10);
		a.setB(20);
		a.setC(30);
		a.setNum(40);
		a.print();
		
		B b=new B();
		b.setA(100);
		System.out.println(b.getA());
		b.setB(200);
		b.setC(300);
		b.num=400; // num에 직접 접근할 수 있는 이유 : 제어자가 protected
		b.setD(10);
		b.setE(20);
		b.setF(30);
		b.print();
		

	}

}

class A{
	private int a,b,c; //나만 사용 가능
	protected int num; //상속가능
	
	public void print() {
		System.out.println("a:"+a+"b:"+b+"c:"+c);
		System.out.println("num:"+num);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}

class B extends A{
	//a,b,c,num 모두 사용 가능
	private int d,e,f;
	
	//오버라이드 : 부모의 메서드를 가져와서 재정의하는 것을 의미
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("d:"+d+"e:"+e+"f:"+f);
	}
	
	
//	public void print() {
//		//super : 부모의 멤버를 가져올 때 사용하는 키워드
//		super.print(); //부모의 print()메서드 호출
//		System.out.println("d:"+d+"e:"+e+"f:"+f);
//	}

	public int getD() {
		return d;
	}


	public void setD(int d) {
		this.d = d;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}

	public int getF() {
		return f;
	}

	public void setF(int f) {
		this.f = f;
	}
}