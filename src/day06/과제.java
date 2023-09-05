package day06;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      /* 가위바위보 게임 만들기
	       * 컴퓨터가 가위,바위,보 중 랜덤으로 선택
	       * 0=가위, 1=바위, 2=보
	       * 사용자도 가위,바위,보 중 선택해서 입력(숫자, 문자 모두 가능)
	       * 결과 => 
	       * 컴퓨터 : 가위, 사용자 : 가위 => 무승부입니다.
	       * 
	       * */
	   
		  int random=(int)(Math.random()*3);
		  Scanner scan = new Scanner(System.in);
	      System.out.println("가위바위보 게임!");
	      String str=scan.next();
	      

	      if(str.equals("0")||str.equals("가위")) {
	    	  if(random==0) {
	    		  System.out.println("무승부입니다!");
	    	  } else if(random==2) {
	    		  System.out.println("승리!");
	    	  } else if(random==1) {
	    		  System.out.println("패배ㅠㅠ");
	    	  } 
		       System.out.println("컴퓨터 : "+random);
		       System.out.println("사용자 : "+str);
	      }

	      if(str.equals("1")||str.equals("바위")) {
	    	  if(random==1) {
	    		  System.out.println("무승부입니다!");
	    	  } else if(random==0) {
	    		  System.out.println("승리!");
	    	  } else if(random==2) {
	    		  System.out.println("패배ㅠㅠ");
	    	  }
		       System.out.println("컴퓨터 : "+random);
		       System.out.println("사용자 : "+str);
	      } 

	      if(str.equals("2")||str.equals("보")) {
	    	  if(random==2) {
	    		  System.out.println("무승부입니다!");
	    	  } else if(random==1) {
	    		  System.out.println("승리!");
	    	  } else if(random==0) {
	    		  System.out.println("패배ㅠㅠ");
	    	  }
		       System.out.println("컴퓨터 : "+random);
		       System.out.println("사용자 : "+str);
	      }		

	      scan.close();

	   }
 }
