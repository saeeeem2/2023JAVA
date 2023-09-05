package day03;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* up/down 게임
		 * 1~50 사이의 랜덤 수를 생성하여 맞추는 게임
		 * ex) 컴퓨터가 랜덤 수를 생성 : 35
		 * 입력 > 10
		 * 컴퓨터는 up이라고 알려줌
		 * 재입력 > 20
		 * up
		 * 재입력 > 40
		 * down
		 * 재입력 > 35
		 * 정답입니다 출력*/
		
		//과제
     	Scanner scan=new Scanner(System.in);
//		int ran=(int)(Math.random()*50)+1;
//		System.out.println("숫자를 입력하세요.");
//		a : for(;;) {
//			int num=scan.nextInt();
//			if(ran<num) {
//				System.out.println("down");
//				
//			} else if(ran>num) {
//				   System.out.println("up");
//		
//			} else {
//				    System.out.println("정답입니다~~!");
//					break a;
//			}
//		}				
//		scan.close();
		
		//과제 풀이
		int random=(int)(Math.random()*50)+1;
		System.out.println("1~50사이의 정수를 입력해주세요");
	    System.out.println("기회는 5번~!");
	    int num=0;
	    for(int i=0; i<=5; i++) {
	    	System.out.println("입력>");
	    	num =scan.nextInt();
	    	if(num==random) {
	    		System.out.println("정답입니다~~!");
	    		break;
	    		} else if(num<random) {
	    			System.out.println("up~!"+i+"번 실행");
	    		} else {
	    			System.out.println("down~!"+i+"번 실행");
	    		}
	    }
	    System.out.println("기회를 모두 소진했습니다");
		scan.close();
		
		}

	}



