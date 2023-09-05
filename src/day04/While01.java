package day04;

public class While01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*while : 반복문 중 하나
		 * while(조건식) { -> 조건식이 true일 때 반복
		 * 실행문; -> 증감식으로 표현
		 * }*/
		
		/*1~10까지 출력*/
		
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();//줄바꿈용
		System.out.println("---------------------------");
		
		int i=0; //초기화
		while(i<=10) {
			System.out.print(i+" ");
			i++; //증감식
		}
		
		System.out.println();//줄바꿈용
		System.out.println("---------------------------");
		
		/*1~10까지 짝수만 출력(while문 이용)*/
		
		i=0; //위에 i를 한 번 사용했으므로 다시 초기화 해야 함
		while(i<=10) {
			i++;
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		

	}

}
