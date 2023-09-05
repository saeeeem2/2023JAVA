package day02;

public class Switch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* switch문 : 값에 따라 케이스를 달리주는 형식
		 * switch(변수/식){
		 * case 값1 : 실행문1; break;
		 * case 값2 : 실행문2; break;
		 * case 값3 : 실행문3; break;
		 * default :  나머지 실행문;
		 * }
		 * break; : switch문을 빠져나갈 때 사용
		 */
		
//		int num =4;
//		switch(num) {
//		case 1 : 
//			System.out.println("num는 1입니다.");
//			break;
//		case 2 : 
//			System.out.println("num는 2 입니다.");
//			break;
//		case 3 : 
//			System.out.println("num는 3 입니다.");
//			break;
//		    default:
//		    	System.out.println("잘못된 입력값입니다.");
//		}
		
		
		//random으로 1~6까지의 수를 추출하여 주사위 : num칸 전진 출력
		// (0*6)+1~(1*6)+1 => 1~6까지
		int num2=(int)(Math.random()*6)+1;
		switch(num2) {
		case 1 : 
			System.out.println("주사위 : "+num2+"칸 전진");
			break;
		case 2 : 
			System.out.println("주사위 : "+num2+"칸 전진");
			break;
		case 3 : 
			System.out.println("주사위 : "+num2+"칸 전진");
			break;
		case 4 : 
			System.out.println("주사위 : "+num2+"칸 전진");
			break;
		case 5 : 
			System.out.println("주사위 : "+num2+"칸 전진");
			break;
		case 6 : 
			System.out.println("주사위 : "+num2+"칸 전진");
			break;
		}
		
	}

}
