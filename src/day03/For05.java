package day03;

public class For05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 최소 공배수
		 * 공배수 : 공통된 배수
		 * 10의 배수 : 10 20 30 40 ...
		 * 15의 배수 : 15 30 45 60 ...
		 * 10과 15의 공배수 : 30 60 ...
		 * 10과 15의 최소 공배수 : 30 
		 * */
		
		//내가 풀이한 것
//		int num1=10;
//		int num2=15;
//		int a=0;
//		for(int i=10;;) {
//			i=i+10;
//			if(i%num1==0&&i%num2==0) {
//				a=num1*i;
//				System.out.println("최소 공배수 : "+a);
//				break;
//						}
//		}
		
		//정답
		int num1=10;
		int num2=15;
		for(int i=num1; ;i+=num1) { // i=i+num1
			if(i%num1==0&&i%num2==0) {
				System.out.println("두 수의 최소 공배수 : "+i);
				break;
			}
		}
		

	}

}
