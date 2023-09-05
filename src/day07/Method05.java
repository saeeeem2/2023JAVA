package day07;

public class Method05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 2~100까지의 소수를 출력
		 * main에서는 2~100까지 for문을 돌려서 메서드 호출하여 true라면 출력
		 * */
		
		for(int i=2; i<=100; i++) { //2~100까지
			if(pn(i)) {
				System.out.println(i);
			}
		}
	}
	
	/* 기능 : 정수가 주어지면 이 정수가 소수인지 아닌지 판단(소수가 맞으면 true, 아니면 false)
	 * 소수 : 1과 자기 자신만의 약수로 가지는 수
	 * 리턴타입 : boolean
	 * 매개변수 : num
	 * 메서드명 : pn
	 * */
	
	public static boolean pn(int num) {
		int count=0;
	    for(int i=1; i<=num; i++) {	//약수를 구하기 위해 돌리는 값	
			if(num%i==0) { //약수체크
				count=count+1;//count++;
			}	
	    }
				if(count==2) { // 약수가 2개인지 체크
				return true;
			} else {return false;}
		}	
		

}
