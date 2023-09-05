package day12;

public class Class06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EzenStudent std=new EzenStudent("서울","이동혁","자바","010-2000-0606");
		//객체를 출력하면 자동으로 toString메서드를 호출
		System.out.println(std);
		EzenStudent std2=new EzenStudent();
		System.out.println(std2);
		
	}

}
/* 멤버변수 : 지점, 이름 ,반, 전화번호
 * 메서드 : 출력(print 메서드) => toString
 * getter/setter
 * */

/* 객체를 초기화 하는 방법 : 기본값(null,0), 명시적 초기값, 초기화 블럭, 생성자
 * 1.명시적 초기화 : 멤버변수의 선언과 동시에 초기값을 명시
 * 2.초기화 블럭 : {} 멤버변수를 초기화
 * 초기화 우선순위
 * 기본값<명시적 초기값<초기화 블럭<생성자
 * 
 * */

class EzenStudent{
	private String branch="인천";
	private String name="미상";
	private String group;
	private String phone;
	{
		//초기화 블럭
		branch="incheon";
		group="미정";
	}
	
	public EzenStudent() {}
	
	//생성자
	public EzenStudent(String branch, String name, String group, String phone) {
		super();
		this.branch = branch;
		this.name = name;
		this.group = group;
		this.phone = phone;
	}

	public void print() {
		System.out.println("지역 : "+branch+", 이름 : "+name+", 반 : "+group+", 연락처 : "+phone);
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override //부모의 것을 상속받아 사용
	public String toString() {
		return "EzenStudent [branch=" + branch + ", name=" + name + ", group=" + group + ", phone=" + phone + "]";
	}		
	
}
