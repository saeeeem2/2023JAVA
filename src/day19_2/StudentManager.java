package day19_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager implements Program {
	
	//멤버변수 Student List
	private List<Student> student=new ArrayList<Student>();
	
	public StudentManager() {
		add();
	}
	
	//기본학생 추가해놓기
	public void add() {
		student.add(new Student("이동혁",16,"010-2000-0606"));
		student.add(new Student("김정우",15,"010-1998-0050"));
		student.add(new Student("이민형"));
		student.add(new Student("나재민"));
		student.add(new Student("이해찬"));
	}

	@Override
	public void addStd(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("추가할 학생을 입력해주세요.");
		String std=scan.next();
		student.add(new Student(std));
		System.out.println("학생 등록 완료");
	}

	@Override
	public void printStd() {
		// TODO Auto-generated method stub
		System.out.println("------학생명단------");
		for(int i=0; i<student.size(); i++) {
			System.out.println(student.get(i));
		}
	}

	@Override
	public void searchStd(Scanner scan) {
		// 학생명을 입력받아 학생 정보를 출력하기
		System.out.println("학생명을 입력해주세요.");
		String name=scan.next();
		for(int i=0; i<student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				student.get(i).printOne();
				return;
			}
		}
		System.out.println("등록되지 않은 학생입니다.");		
	}

	@Override
	public void modStd(Scanner scan) {
		// 수정할 정보(이름, 나이, 전화번호)
		System.out.println("정보를 수정할 학생명을 입력해주세요.");
		String name = scan.next();
		for(int i=0; i<student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				System.out.println("수정할 정보 > ");
				String op=scan.next();
				switch(op) {
				case "이름" :
					System.out.println("수정할 값 > ");
					String modName=scan.next();
					student.get(i).setName(modName);
					break;
				case "나이" :
					System.out.println("수정할 값 > ");
					int modAge=scan.nextInt();
					student.get(i).setAge(modAge);
					break;
				case "전화번호" :
					System.out.println("수정할 값 > ");
					String modPhon=scan.next();
					student.get(i).setPhone(modPhon);
					break;
				default : 
					System.out.println("존재 하지 않습니다.");
				}
				return;
			}
		}
		System.out.println("학생이 존재하지 않습니다.");		
	}

	@Override
	public void delStd(Scanner scan) {
		// 학생이름을 입력받아서 일치하는 학생을 삭제
		// remove는 index삭제, remove삭제가 가능
		System.out.println("삭제할 학생명을 입력해주세요.");
		String name=scan.next();
		//index 삭제 방법
//		for(int i=0; i<student.size(); i++) {
//			if(student.get(i).getName().equals(name)) {
//				student.remove(i);
//				return;
//			}
//		}	
//		System.out.println("해당 학생이 존재하지 않습니다.");
		
		//remove사용해서 object 삭제하는 방법 => object자체로 이름이 일치하면 같은 객체 
		if(!student.remove(new Student(name))) {
			System.out.println("해당 학생이 존재하지 않습니다.");
			return;
		}
		student.remove(new Student(name));	
	}

	@Override
	public void addSub(Scanner scan) {
		// 학생명/과목/점수 입력받아 과목등록 메서드 호출
		System.out.println("학생명을 입력해주세요.");
		String name=scan.next();
		System.out.println("과목명 > ");
		String sub=scan.next();
		System.out.println("성적 > ");
		int score=scan.nextInt();
		for(int i = 0; i<student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				student.get(i).addSubject(sub, score);
				return;
			}
		}
		System.out.println("해당 학생이 존재하지 않습니다.");
	}

	@Override
	public void modSub(Scanner scan) {
		// 학생명/과목/점수 입력받아 과목수정 메서드 호출
		System.out.println("학생명을 입력해주세요.");
		String name=scan.next();
		System.out.println("과목명 > ");
		String sub=scan.next();
		System.out.println("성적 > ");
		int score=scan.nextInt();
		for(int i = 0; i<student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				student.get(i).delSubject(sub);//과목 삭제
				student.get(i).addSubject(sub, score); //과목 다시 추가
				return;
			}
		}
		System.out.println("해당 학생이 존재하지 않습니다.");
	}

	@Override
	public void delSub(Scanner scan) {
		// 학생명과 과목을 입력받아 삭제 메서드 호출
		System.out.println("학생명을 입력해주세요.");
		String name=scan.next();
		System.out.println("과목명 > ");
		String sub=scan.next();
		
		//index메서드 활용
		int i=index(name);
		if(i==-1) {
			System.out.println("해당 학생이 존재하지 않습니다.");
		}else {
			student.get(i).delSubject(sub);
		}
		
		// 해당 for문이 계속 사용되고 있으니 메서드 만들어서 써보기
//		for(int i=0; i<student.size(); i++) {
//			if(student.get(i).getName().equals(name)) {
//				student.get(i).delSubject(sub);
//				return;
//			}
//		}
//		System.out.println("해당 학생이 존재하지 않습니다.");		
	}
	
	// 학생명을 주고, 그 학생의 위치를 리턴하는 메서드
	public int index(String name) {
		for(int i = 0; i<student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				return i;
			}
		}
		return -1; //0번지 포함이기 때문에 아니면 -1로 리턴
	}

}
