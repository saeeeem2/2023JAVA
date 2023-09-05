package day07;

import java.util.Scanner;

public class 과제 {
   //공통 변수 선언 (==멤버변수) 파란색 멤버변수 갈색 지역변수
   static Scanner scan=new Scanner(System.in);

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      /* 계산기 만들기
       * + _ * / % 각각 메서드 만들기 => 메서드에서 바로 출력
       * ex) 3 5 입력하면 => 메뉴를 띄움
       * - 원하는 계산을 선택해주세요.
       * - 1. 덧셈, 2. 뺼셈, 3. 곱셈, 4. 나눗셈, 5. 나머지 이외에는 잘못된 연산
       * - 각기능은 메서드에서 바로 출력할 수 있도록 (3+5=8)
       * 
       * 만들어야 하는 메서드
       * 1. 숫자를 입력받는 메서드 => 숫자를 배열에 담아 리턴
       * 2. 메뉴를 출력해주는 메서드 => 메뉴를 출력하고 메뉴의 번호를 입력받아 리턴
       * 3. 각 기능 메서드들 
       * 
       * main에서 할 일
       * 1. 1번 메서드 호출 => 숫자의 배열을 리턴
       * 2. 2번 메서드 호출 => 내 선택번호 가져오기
       * 3. switch(내가 선택한 번호)
       * 4. 기능 메서드 호출
       * */
	   
	   int arr[]=arr();
	   switch(menu()) {
	   case 1 : 
		   add(arr[0],arr[1]);
		   break;
	   case 2 : 
		   sub(arr[0],arr[1]);
		   break;
	   case 3 : 
		   mul(arr[0],arr[1]);
		   break;
	   case 4 : 
		   div(arr[0],arr[1]);
		   break;
	   case 5 : 
		   rem(arr[0],arr[1]);
		   break;
	   }
	   
   }
   public static int[] arr() {
	  System.out.println("두 정수를 입력해주세요.");
	  int num1=scan.nextInt();
	  int num2=scan.nextInt();
      int arr[] = new int[2];
      arr[0]=num1;
      arr[1]=num2;
      return arr;
   } 
   public static int menu() {
      System.out.println("원하는 계산을 선택해주세요.");
      System.out.println("1. 덧셈 2. 뺄셈 3. 곱셈 4. 나눗셈 5. 나머지구하기");
      int choice=scan.nextInt();
      if(choice==1) {
         System.out.println("덧셈을 선택했습니다.");
      } else if(choice==2) {
         System.out.println("뺄셈을 선택했습니다.");
      } else if(choice==3) {
         System.out.println("곱셈을 선택했습니다.");
      } else if(choice==4) {
         System.out.println("나눗셈을 선택했습니다.");
      } else if(choice==5) {
         System.out.println("나머지 구하기를 선택했습니다.");
      } else {
         System.out.println("잘못된 계산입니다.");
      } 
      return choice;
   } 
   public static void add(int num1, int num2) {
      System.out.println(num1+"+"+num2+"="+(num1+num2));
   }
   public static void sub(int num1, int num2) {
      System.out.println(num1+"-"+num2+"="+(num1-num2));
   }
   public static void mul(int num1, int num2) {
      System.out.println(num1+"*"+num2+"="+(num1*num2));
   }
   public static void div(double num1, double num2) {
	  System.out.println(num1+"/"+num2+"="+(num1/num2));
   }
   public static void rem(int num1, int num2) {
      System.out.println(num1+"%"+num2+"="+(num1%num2));
   }

}