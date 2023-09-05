package day06;

import java.util.Scanner;

public class 주사위게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 주사위를 던져서 총 30칸을 이동하면 완주
		 * 주사위 수는 1~6까지 랜덤수가 출력
		 * ex) 주사위 수가 3인 경우 3칸이동 => "27칸 남았습니다" 출력
		 * 	   주사위 수가 6인 경우 6칸이동 => "??칸 남았습니다"
		 * 30칸에 도착하면 도착했다고 출력, 이동 이동횟수 출력(ex. 8번만에 완주)*/
		// 랜덤값(주사위 값 1~6까지 생성)
		// 목표값=30, sum합산거리, count=이동횟수
		
		//풀이
		Scanner scan=new Scanner(System.in);

		int random=0;
		int sum=0;
		int count=0;
		int last=30;
		
		while(sum<last) { //true값이 되어야 반복
			//random 수 생성
			System.out.println("주사위를 던지려면 Enter를 누르세요");
			scan.nextLine();
			random=(int)(Math.random()*6+1);
			sum+=random; //거리 합산
			count++;
			System.out.println("주사위 : "+random+"칸 이동 => "+(last-sum)+"칸 남았습니다.");
		}
		System.out.println("완주~~!, 총 이동 횟수 : "+count);
		scan.close();
		
		//내가 푼 답
//		int cnt=0;
//		int i=0;
//		int num=0;
//				
//		while(i<=30) {
//			num = (int)(Math.random()*6+1);
//			i = i + num;
//			if(i<30) {
//				System.out.println((30-i)+"칸 남았습니다.");
//				cnt++;				
//			} else if(i>=30) {
//				System.out.println("도착");
//			}
//		}
//		System.out.println(cnt+"번 만에 완주했습니다.");
	}

}
