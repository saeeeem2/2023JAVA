package day01;

public class 연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 연산자 정리
		/* 대입 연산자 : =, +=, -= 
		 * =을 기준으로 오른쪽에 있는 값을 왼쪽의 변수에 저장하라는 의미(기존에 값이 있다면 덮어쓰기 됨)
		 * a=b : b를 a에 저장 (a는 반드시 변수여야 함)
		 *  1=a (x)
		 * a+=1; => a=a+1; 기존의 a값과 1을 더해서 a에 저장
		 */
		
		int a = 1;
		System.out.println(a);
		a=a+1;
		System.out.println(a);
		a+=1;
		System.out.println(a);
		
		a-=1;
		System.out.println(a);
		
		int b=10;
		a=b;
		System.out.println(a);
		
		//증감 연산자 : ++(1증가) --(1감소)
		a++; //=> a=a+1;
		System.out.println(a++); // a를 프린트 한 후에 1을 증가
		System.out.println(a);
		System.out.println(++a); // 1을 증가한 후 a출력
		
		//산술연산자 : + - * / %
		/* 나누기(/): 정수/정수=정수 (10/3=3.33333이지만 3으로 출력됨) 소수점 버림
		 *        : 정수/실수=실수 (10/3=3.33333)
		 *        : 실수/정수=실수
		 *        :실수/실수=실수
		 * 값/0 => 예외발생
		 */
		
		System.out.println("3+2="+(3+2));
		System.out.println("3-2="+(3-2));
		System.out.println("3/2="+(3/2));
		System.out.println("3*2="+(3*2));
		System.out.println("3/2="+(3/2.0));
		System.out.println("3/2="+(3%2)); // % 나머지 연산 : 배수나 약수를 구할 때, 짝수/홀수를 구할 때 사용
		
		
		/*비교연산자 : 비교연산의 결과는 반드시 true or false
		 * >= 이상, ,<= 이하, > 초과, < 미만
		 * == 같다, != 같지않다
		 * ()&&() : and, 둘다 true여야 true 리턴 
		 * ()||() : or, 둘 중 하나라도 ture면 true 리턴
		 */
		
		System.out.println("3>2 ? "+(3>2));
		System.out.println("3<2 ? "+(3<2));
		System.out.println("3==2 ? "+(3==2));
		System.out.println("3!=2 ? "+(3!=2));
		
		System.out.println("&&연산자 : "+(3>2&&4<3));
		System.out.println("||연산자 : "+(3>2||4<3));

		/* 조건선택 연산자 : 3항 연산자
		 * (조건식)? true : false ;
		 * 
		 */
		System.out.println(3>2? "참입니다" : "거짓입니다");
		System.out.println(3<2? "참입니다" : "거짓입니다");
		
		/* 문제 : num가 짝수인지 홀수인지 출력
		 * 조건선택 연산자를 사용
		 * 짝수란 2로 나누어 나머지가 0인 값
		 */
		int num;
		num=23;
		System.out.println((num%2==0)? "짝수입니다":"홀수입니다");
		System.out.println((num%2!=0)? "홀수입니다":"짝수입니다");
		
		// string : 문자열을 저장하는 클래스
		
		String result = (num%2==0)? "짝수입니다":"홀수입니다";
		
	}

}
