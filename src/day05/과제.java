package day05;

import java.util.Scanner;

public class 과제 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      /*파일명 5개가 주어졌을 때, 원하는 단어를 입력하면 입력한 단어가 있는 파일들을 출력하도록 코드를 작성하시오
       * java검색시 java라는 글자를 포함하는 모든 파일명 출력*/
	   //contains(str) : str단어가 포함되어있는지 체크 return=true 혹은 false
	   
	  //과제 풀이
	   	String[] fileName= {"java의 정석.txt","이것이 java다.jpg","String메서드.txt","String함수.jpg","java의 함수.png"};
      	Scanner scan=new Scanner(System.in);
      	System.out.println("검색어를 입력하세요.");
      	String s=scan.next();//공백없는 1단어 입력
      	int count=0;
     
       	System.out.println("--검색 값 : "+s+"--");
       	for(String tmp:fileName) {
       		if(tmp.contains(s)) {//if의 조건식은 true/false
       			System.out.println(tmp);   
       			count++;
       		}
       	}
       	 if(count==0) { //검색결과가 없다면
       		System.out.println("검색결과가 없습니다.");
       	}else {
       		System.out.println("총 검색 결과 "+count+" 개 출력");
       	}
     
	   

	   
      //내가 푼 것
//      String[] fileName= {"java의 정석.txt","이것이 java다.jpg","String메서드.txt","String함수.jpg","java의 함수.png"};
//      Scanner scan=new Scanner(System.in);
//      System.out.println("검색어를 입력하세요.");
//      String str=scan.nextLine();
//      for(int i=0; i<fileName.length; i++) {
//      if(fileName[i].contains(str)) {
//    	   System.out.println(fileName[i]);
//    	} 
//      }

      scan.close();
   }

}