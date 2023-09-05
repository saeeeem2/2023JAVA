package studentmanager;

import java.util.Scanner;

public interface Program {
	/*수강관리 프로그램
	1. 인터페이스 생성
 		- 학생리스트 출력 메서드
 		- 학생을 추가하는 메서드
 		- 학생을 검색하는 메서드
 		- 학생의 수강신청 메서드
 		- 학생의 수강철회 메서드*/
	
	void printStudent(); //학생 전체 리스트
	void insertStudent(Scanner scan); //스캐너로 메서드 내부에서 입력받기
	void searchStudent(Scanner scan);
	void registerSubject(Scanner scan); //수강신청 : 누가 수강신청을 하는지, 어떤 과목을 수강신청 하는지(수강신청 메서드 호출(매개변수))
	void deleteSubject(Scanner scan);
	

}


