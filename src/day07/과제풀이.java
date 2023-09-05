package day07;

import java.util.Scanner;

public class 과제풀이 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[]=getNums();
//		System.out.println(nums[0]);
//		System.out.println(nums[1]); 배열에 저장 잘 됐는지 확인
		
		int select=getSelect();
//		System.out.println(select);
		
		switch(select) {
		case 1 : sum(nums); break;
		case 2 : sub(nums); break;
		case 3 : mul(nums); break;
		case 4 : div(nums); break;
		case 5 : rem(nums); break;
		default : 
			System.out.println("잘못된 연산입니다.");

		}
		System.out.println("계산기 종료");

	}
	
	// 숫자를 배열로 입력받는 메서드
	/* 매개변수 : x
	 * 리턴타입 : 배열=>int[]
	 * aptjemaud : getNums()*/
	
	public static int[] getNums() {
		int[] nums=new int[2];
		for(int i=0; i<nums.length; i++) {
			System.out.println((i+1)+"번 째 숫자를 입력> ");
			nums[i]=scan.nextInt();
		}
		return nums;
	}
	/* 메뉴를 나타내는 메서드 
       
	 * 매개변수 : x
	 * 리턴타입 : 메뉴에서 선택한 값 => int
	 * 메서드명 : getSelect()*/
	public static int getSelect() {
		System.out.println("원하는 계산을 선택해주세요.");
		System.out.println("1. 덧셈, 2. 뺼셈, 3. 곱셈, 4. 나눗셈, 5. 나머지");
		int select=scan.nextInt();
		return select;
		
	}
	/* 각 기능 메서드 => 출력
	 * 리턴타입 : void
	 * 매개변수 : 배열*/
	public static void sum(int nums[]) {
		System.out.println(nums[0]+"+"+nums[1]+"="+(nums[0]+nums[1]));
	}
	public static void sub(int nums[]) {
		System.out.println(nums[0]+"-"+nums[1]+"="+(nums[0]-nums[1]));
	}

	public static void mul(int nums[]) {
		System.out.println(nums[0]+"*"+nums[1]+"="+(nums[0]*nums[1]));
	}

	public static void div(int nums[]) {
		System.out.println(nums[0]+"/"+nums[1]+"="+(double)(nums[0]/nums[1]));
	}

	public static void rem(int nums[]) {
		System.out.println(nums[0]+"%"+nums[1]+"="+(nums[0]%nums[1]));
	}


}
