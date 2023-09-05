package day08;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		 /* 야구게임
	       * 컴퓨터가 3자리의 숫자를 랜덤으로 생성(1~9까지 한자리수만) => 3개의 숫자를 중복없이 생성
	       * user가 3자리 숫자를 맞추는 게임
	       * 자리와 숫자가 같이 일치하면 strike
	       * 자리는 안 맞고 숫자만 일치하면 ball
	       * 자리와 숫자 모두 맞지 않으면 out
	       * 컴퓨터 : 3 5 7
	       * 사용자 : 3 6 7 => 2스트라이크
	       * 컴퓨터 : 3 5 7
	       * 사용자 : 3 7 6 => 1스트라이크 1볼
	       * 컴퓨터 : 3 5 7
	       * 사용자 : 1 2 9 => 아웃
	       * 
	       * 정답을 맞추면 게임 종료
	       * 
	       * --야구게임 시작
	       * 컴퓨터가 숫자를 정했습니다.
	       * 숫자 입력(1~9까지 3자리) :
	       * 입력 > 3 4 5 
	       * 결과 > 3s
	       * 3s 다 맞으면 종료(게임 횟수 출력)
	       *   
	       * */
		
		   int comArr[]=new int[3]; //랜덤
		   int userArr[]=new int[3]; //사용자

		   System.out.println("야구게임 시작~~!");
		   System.out.println("컴퓨터가 숫자를 정했습니다."); 

		   int gameCnt = 0;
		   int strike = 0;
		   int ball = 0;
		   comArr = comNum();
		   
		   while(true){
		   
		      gameCnt++;
		   		   
		      userArr = userNum();

		      //스트라이크 체크
		      for(int i=0; i<comArr.length; i++){
		         if(comArr[i] == userArr[i]){
		            strike++;
		         }
		      }

		      //볼 체크
		      for(int i=0; i<comArr.length; i++){
		    	  for(int j=0; j<userArr.length; j++){
		            if(comArr[i] == userArr[j]){
		               ball++; 
		            }
		         }      
		      }

		      if(strike == 0 && ball == 0){
		         System.out.println("아웃");
		         strike = 0;
		         ball = 0;
		      }else{
		         if(strike == 3){
		            System.out.println("성공!! 게임 횟수 : "+gameCnt);
		            break;
		         }else{
		            System.out.println(strike+" 스트라이크, "+(ball-strike)+" 볼");
		            strike = 0;
		            ball = 0;
		         }
		      }

		   }//while end
		}

		//컴퓨터 랜덤 숫자 생성 
		public static int[] comNum() {

		   int comArr[] = new int[3];

		   for(int i=0; i<comArr.length; i++) {
		      comArr[i] = (int)(Math.random()*9)+1;
		      for(int j=0; j<i; j++) {
		         if(comArr[i] == comArr[j]) {
		            i--;
		            break;
		         }
		      }
		   }
		   return comArr;
		}

		//사용자 숫자 입력
		public static int[] userNum() {
		   
		   int userArr[] = new int[3];
		   Scanner scan = new Scanner(System.in);

		   System.out.println("숫자 입력(1~9까지 3자리)");
		   
		   for(int i=0; i<userArr.length; i++){
		      userArr[i] = scan.nextInt();
		   }   
		   
		   return userArr;
		}
}
