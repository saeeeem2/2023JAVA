package day07;

//import java.util.Scanner;

public class Method06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 구구단 출력
		 * 단 1개를 주고, 구구단 출력
		 * */
//		Scanner scan=new Scanner(System.in);
//		System.out.println("구구단의 단을 입력하세요.");
//		int num=scan.nextInt();
//		mul(num);
//		scan.close();
		
		mul(3);
		
		// 2~9까지 반복하여 모든 단을 출력
		System.out.println();
		System.out.println("----------------------------");
		for(int i=2; i<=9; i++) {
			mul(i);
			System.out.println();
		}
	}
	/* 기능 : 단이 주어지면 그 단의 구구단을 출력(리턴x)
	 * 2*2=4, 2*3=6 ...*/
	public static void mul(int num) { //단
		int a=0;
		for(int i=1; i<=9; i++) {
			a=num*i;
			System.out.println(num+"*"+i+" = " +a);
		}		
	}

}
