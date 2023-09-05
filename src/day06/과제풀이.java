package day06;

import java.util.Scanner;

public class 과제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*가위바위보 게임*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("가위바위보 게임 시작");
		
		int comNum=(int)(Math.random()*3); //0 1 2 생성
		System.out.println("컴퓨터가 결정을 완료하였습니다.");
		System.out.println("가위/바위/보 중 하나를 선택하세요>");
		String myChoice=scan.next(); //내 선택(가위,바위,보)
		
		//컴퓨터의 선택을 String으로 변경
		String comChoice=(comNum==0)?"가위" : (comNum==1)? "바위" : "보";
		System.out.println("com선택 : "+comChoice);
		
		//비교(문자끼리 비교는 ==는 사용할 수 없음, equals사용하여 비교)
		if(comChoice.equals(myChoice)) {
			System.out.println("비겼습니다.");
		} else {
			if(comChoice.equals("가위")) {
				System.out.println(myChoice.equals("가위")?"이겼습니다":"졌습니다");
			} else if(comChoice.equals("바위")) {
				System.out.println(myChoice.equals("바위")?"이겼습니다":"졌습니다");
		} else {//보
			System.out.println(myChoice.equals("가위")?"이겼습니다":"졌습니다");
		}
		
		}
		
		System.out.println("게임종료");
		
		scan.close();
		

	}

}
