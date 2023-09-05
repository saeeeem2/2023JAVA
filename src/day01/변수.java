package day01;

public class 변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 변수선언
		 * 자료형(타입) 변수명;
		 * 
		 * 변수선언+초기화
		 * 자료형(타입) 변수명 = 값;
		 * 
		 */

		int num=123;//선언+초기화
		System.out.println(num);
		//sustem.out.println=>sysout+ctrl+space
		System.out.println();//줄바꿈
		
		//int num=456; // 중복 선언 불가능
		
		num=456; // = : 대입연산자 앞의 변수에 뒤에 있는 값을 저장(덮어쓰기 됨)
		System.out.println(num);
		
		int num1=78, num2=45, num3=89; // 같은 자료형에서는 여러번 선언하는 것이 가능함
		// 노란 밑 줄은 선언 후 한 번도 쓰이지 않는 경우 표시됨(한 번도 사용하지 않았으므로 필요없는 변수임)
		
		num1=789;
		System.out.println(num1);
		
		//8개의 기본 자료형은 지역변수로 선언됨 : 지역변수가 가지는 범위(scope) { } 
		
		// 명령어 {} : 명령어도 마찬가지로 {} 안에서만 실행 가능함 {}밖에서도 사용하고 싶으면 선언을 {}밖에 해야 함
		int a=0;
		if(true) {
			a = 10;
			System.out.println(a);
		}
		System.out.println(a);
		
		//char는 한글자만 저장 가능함 char ch ='';
		char ch = 'a'; // " " 는 문자열(string) , ' ' 는 한 글자
		double dou =3.0;
		byte b = 1;
		boolean boo = true; // true, false로만 저장 가능
		float f = 1.2f; 
		long l = 1L;
		// float, long 자료형은 접미사를 반드시 붙여야 인식이 가능함
		// float (f/F) long (l/L)
		
		num2=010; //숫자 앞에 0이 붙으면 8진수로 인식함 (0~7까지 8=>10)
		num3=0x10; // 16진수로 인식(0~15(0부터 9까지는 숫자로 쓰고 10부터는 ABCDEF로 사용)까지 16=>10)
		
		
		// = - * / % 
		// 국어점수(kor), 영어점수(eng), 수학점수(math) 변수를 선언하고, 값을 입력하여, 세 점수의 합을 콘솔에 출력하시오
		
		int sum, kor, eng, math;
		kor=10; eng=20; math=30;
		sum=kor+eng+math;
		System.out.println("국어,영어,수학점수 합계 : "+sum); // 여기서 +는 연결연산자, 값에 문자열이 포함되어있으면 연결연산자임
		System.out.println(kor+eng+math+"점");
		System.out.println("합계: "+(kor+eng+math)); // 문자가 앞에 붙는 경우 연결 연산자 사용 시 우선순위 정해줘야 함
		
		
		
	}
	// num1=123; main 함수가 끝났으므로 num1을 다시 선언해야 사용 가능함
}
