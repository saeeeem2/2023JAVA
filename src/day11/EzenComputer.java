package day11;
/*수강관리 프로그램
 *- EzenComputer 클래스 생성
 *- 학생의 기본 정보 : 이름, 생년월일, 나이, 전화번호
 *- 학원정보 : 학원이름="EZEN",지점
 *- 수강정보 : 수강과목, 기간(2023-08-16~2023-03-14)

 *ex, 홍길동, 990101, 24, 010-1111-2222 => 학생정보 출력
     EZEN,인천지점 => 학원정보 출력
     자바(6개월) => 수강정보 출력
     DB(1개월)
     HTML(3개월)

 *- 기능 : 학생정보출력, 학원정보출력, 수강정보출력
 *- 학생의 수강정보를 추가하는 기능*/

public class EzenComputer {
	// 멤버변수 선언
	// final => 변경불가능한 값
	private String name;
	private String birth;
	private int age;
	private String phone;
	public final static String company="EZEN";
	private String branch;//지점
	// 수강정보 => 한사람이 여러과목을 수강
	private String[] course=new String[5]; //수강과목 5개
	private String[] period=new String[5]; //수강기간 5개
	private int cnt;//배열의 index처리를 위한 변수
	
	//생성자
	public EzenComputer() {}
	public EzenComputer(String name, String phone, String branch) {
		this.name=name;
		this.phone=phone;	
		this.branch=branch;
	}
	public EzenComputer(String name, String birth, int age, String phone, String branch) {
		this(name,phone,branch);
		this.age=age;
		this.birth=birth;
		this.branch=branch;
	}
	
//	public EzenComputer(String name, String birth, int age, String phone, String branch) {
//		super(); // 상속받을 경우 부모의 생성자
//		this.name = name;
//		this.birth = birth;
//		this.age = age;
//		this.phone = phone;
//		this.branch = branch;
//	}
	
	//메서드(출력,수강정보를 추가)
	public void student() {
		System.out.println("이름 : "+name+" 생년월일 : "+birth+" 나이 : "+age+" 연락처 : "+phone);
	}
	public void ezen() {
		System.out.println(company+"("+branch+")");
	}
	public void subject() {//배열이므로 for문으로 반복해서 출력
		if(course.length==0||cnt==0) {
			System.out.println("수강이력이 없습니다.");
			return; //출력을 멈추고 메서드 끝내기
		}
		//추가된 과목이 있다면
		for(int i=0; i<cnt; i++) { //과목이 추가되면 cnt가 1증가
	        System.out.print(this.course[i]+"("+period[i]+")");
		}
		System.out.println();//과목출력이 끝나면 줄바꿈
     }
	public void insertCourse(String course, String period) {
		this.course[cnt]=course;
		this.period[cnt]=period;
		cnt++; //index번지가 증가		
	}	
	//getter, setter
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBirth() {
		return birth;
	}


	public void setBirth(String birth) {
		this.birth = birth;
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


	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	public String[] getCourse() {
		return course;
	}


	public void setCourse(String[] course) {
		this.course = course;
	}


	public String[] getPeriod() {
		return period;
	}


	public void setPeriod(String[] period) {
		this.period = period;
	}


	public int getCnt() {
		return cnt;
	}


	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
}
