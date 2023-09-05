package studentmanager;

import java.util.Scanner;

public class StudentManager implements Program{


	/* 멤버변수 : 학생 클래스를 배열로 생성[5]
	 * - Program 인터페이스를 구현
	 * - 메서드는 interface를 구현하는 형태로 
	 * - 학생 추가시 배열이 꽉 찼다면 배열을 늘려주는 기능 추가
	 * - manager는 student 배열만 관리*/
	
	private Student[] std=new Student[5];
	private int stdCount; //std배열을 index처리 하기 위한 변수
	
	@Override
	public void printStudent() {
		System.out.println("전체 학생 정보");
		for(int i=0; i<stdCount; i++) {
			std[i].stdPrint(); //학생의 정보만 출력
			std[i].subPrint(); //수강정보도 추가로 출력
			System.out.println("---------------------------");
		}
	}

	@Override
	public void insertStudent(Scanner scan) {
		//1명의 정보를 입력받아 객체를 생성한 후 std배열에 추가
		System.out.println("학생정보 입력");
		System.out.println("이름 : ");
		String name=scan.next();
		System.out.println("학번 : ");
		String num=scan.next();
		System.out.println("주민번호 : ");
		String sNum=scan.next();
		System.out.println("학부 : ");
		String f=scan.next();
		System.out.println("학과 : ");
		String m=scan.next();
		//입력받은 값으로 객체를 생성
		Student s=new Student(num,name,sNum,f,m);
		//배열이 꽉 차면 배열복사 후 배열 이동
		if(stdCount==std.length) {
			Student[] tmp=new Student[std.length+5];//새배열
			//arraycopy이용하여 배열 복사
			System.arraycopy(std,0,tmp, 0, std.length);
			std=tmp;
		}
		//배열에 등록
		std[stdCount]=s;//0번지
		stdCount++;//인원 증가
	}

	@Override
	public void searchStudent(Scanner scan) {
		//검색할 학생의 이름을 입력받아 배열에서 탐색 후 있다면 학생정보와 수강정보를 출력
		System.out.println("검색할 학생 이름을 입력해주세요.");
		String searchName = scan.next();
		for(int i=0; i<stdCount; i++) {
			if(std[i].getStdName().equals(searchName)) {
				std[i].stdPrint();
				std[i].subPrint();
				return;
			}
		}
			System.out.println("검색하는 이름이 없습니다.");
	}

	@Override
	public void registerSubject(Scanner scan) {
		// 누가 수강신청을 할 것인가?
		// 수강신청할 학생이름을 입력받기
		int index=-1;
		System.out.println("수강신청 학생명을 입력해주세요.");
		String name=scan.next();
		//학생 위치 체크
		for(int i=0; i<stdCount; i++) {
			if(std[i].getStdName().equals(name)){
				index=i;
				break;
			}
		}
		//입력한 학생이 없다면?
		if(index==-1) {
			System.out.println("학생정보가 없습니다.");
		}else {
			//있으면 신청과목 접수 받기
			System.out.println("수강신청 과목 : ");
			String subName=scan.next();
			//객체를 생성하여 
			Subject s=new Subject(subName);
			//insertSubject를 호출해서 값을 넘겨줌
			std[index].insertSubject(s);
		}
	}

	@Override
	public void deleteSubject(Scanner scan) {
		// 수강철회할 학생명 입력받기
		int index=-1;
		System.out.println("수강철회할 학생이름을 입력해주세요.");
		String name=scan.next();
		//그학생의 위치 확보
		for(int i=0; i<stdCount; i++) {
			if(std[i].getStdName().equals(name)) {
				index=i;
				break;
			}
		}
		//학번이 없다면
		if(index==-1) {
			System.out.println("학생정보가 없습니다.");
		}else {
			//취소할 과목명 입력받기
			System.out.println("취소할 과목명 : ");
			String sName=scan.next();
			std[index].deleteSubject(sName);
		}
	}
	

	   
}

