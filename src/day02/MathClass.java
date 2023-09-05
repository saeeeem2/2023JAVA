package day02;

public class MathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Math.method 
		 * 반올림(Math.round) : 소수점의 자리수는 무조건 0
		 * 올림(Math.ceil), 버림(Math.floor)
		 * 
		 */
		double num=34.666666;
		
		//int roundNum=Math.round(num); //return long형
		int roundNum=(int)Math.round(num);
		System.out.println(Math.round(num));
		System.out.println(Math.ceil(num));
		System.out.println(Math.floor(num));
		
		/*Math.max(최대값) , Math.min(최소값)
		 */
		
		System.out.println(Math.max(5, 3));
		System.out.println(Math.min(5, 3));
		
		//Math.random : 0과 1 사이의 임의의 값을 리턴
		// 0<=random<1 사의의 값을 리턴함
		//(int)(Math.random()*10)+1 : 1부터 시작하여 10개의 정수를 얻는 공식
		System.out.println(Math.random()); //0은 포함되고 1은 미포함됨
		System.out.println((int)(Math.random()*10+1)); 
		
				
		
		
	}

}
