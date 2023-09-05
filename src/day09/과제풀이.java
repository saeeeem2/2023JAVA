package day09;

import java.util.Scanner;

public class 과제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		s1.stdPrint();
		s1.setName("홍길동");
		s1.setAge(27);
		s1.setPhone("010-1111-2222");
		s1.setAddr("인천시");
		s1.stdPrint();
		
		Student s2 = new Student();
		s2.setName("김영이");
		s2.setAge(25);
		s2.setPhone("010-2222-3333");
		s2.setAddr("서울시");
		s2.stdPrint();
		
		Student s3 = new Student();
		s3.input("철수", 23, "010", "인천");
//		Scanner scan = new Scanner(System.in);
//		System.out.println("이름 : ");
//		s3.setName(scan.next());
//		System.out.println("나이 : ");
//		s3.setAge(scan.nextInt());
//		System.out.println("tel : ");
//		s3.setPhone("010");
//		System.out.println("adress : ");
//		s3.setAddr("경기도");
		s3.stdPrint();
		
//		scan.close();
		
		Student s4 = new Student("홍길순",23,"01077778888","서울시");
		s4.stdPrint();
		
		Student s5 = new Student("이동혁",23);
		s5.stdPrint();


	}

}
class Student {
	//멤버변수
	private String name;
	private int age;
	private	String phone;
	private String addr;
	
	//생성자 위치(생성자도 오버로딩 가능)
	//생성자 오버로딩 조건 : 매개변수 개수가 다르거나, 매개변수 유형이 달라야 함
	public Student() {} //기본생성자(컴파일러가 자동으로 제공)
	public Student(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public Student(String name, int age, String phone, String addr) {
		//생성자 호출
		this(name,age); //생성자 호출은 반드시 첫 줄에서만 가능함
		this.phone=phone;
		this.addr=addr;
	}
	
	public void stdPrint() {
		System.out.println(name+"("+age+")"+phone);
	}
	public void input(String name, int age, String phone, String addr) {
		this.name=name;
		this.age=age;
		this.phone=phone;
		this.addr=addr;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
}
