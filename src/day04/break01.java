package day04;

import java.util.Scanner;

public class break01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Break문 : 반복문을 빠져나오게 하는 키워드
		 * - 반복문에서 조건문을 동반하여 조건을 만족하면 반복문을 벗어나는 역할
		 * - 다중for문에서는 나를 포함하는 for문만 벗어날 수 있음
		 * - 바깥쪽 for문을 벗어나고 싶을 때는 for문에 이름을 붙여 벗어날 수 있음
		 *   => a : for(){
		 *  	  if(){
		 *     		break a;
		 *     		}
		 *  	}
		 *  
		 *  1~10까지 출력
		 *  조건식을 생략(무한루프) break를 이용하여 10이되면 벗어나게 설정*/
		
		for(int i=1; ; i++) {
			System.out.print(i+" ");
			if(i==10) {
				break;
			}
		}
		
		/* 한 글자를 입력받아서 글자를 그대로 출력(반복해서 출력)
		 * 첫 글자 중 y를 입력받으면 종료
		 * a를 입력받으면 a출력, b를 입력받으면 b출력, y를 입력받는 경우 종료*/
		
		//풀이
		/* Scanner scna new Scanner(Sytem.in);
		 * for(;;){ //무한루프
		 * 		char ch=scan.next().charAt(0);
                if(ch=='y') {
				break; }
		System.out.println(ch);
				}
		 * */
		
		System.out.println();//줄바꿈용
		System.out.println("---------------------------");
		
		Scanner scan=new Scanner(System.in);
		System.out.println("문자를 입력해주세요.");
		char ch=scan.next().charAt(0);
		for(;;) {
			if(ch=='y') {
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println(ch);
			}
		}
		scan.close();
		

	}

}
