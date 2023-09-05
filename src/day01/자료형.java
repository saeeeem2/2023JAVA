package day01;

public class 자료형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 자료형 변환 : 자료의 형태를 바꿔주는 것(casting)
		 * 자료형(변수의 타입) 
		 * a=b : a의 자료형과 b의 자료형이 맞지 않는다면 오류
		 * 자료형 변환을 통해서 양쪽의 자료형을 맞춰주는 역할
		 * 자동 자료형 변환 : 자료형 변환시 생략해도 문제가 되지 않는 상황
		 * 크기가 큰 자료형 = 크기가 작은 자료형
		 * 명시적 자료형 변환 : 리터럴 값 앞에(타입)
		 */
		
		byte num=10;
		int num1=num; // int에 byte를 저장(자동 형변환 가능 : 큰 것에 작은 것을 저장하는 거라 가능함)
		
		double num2=10.2;
		//num1=num2; // 작은 자료형에 큰 자료형을 저장할 수 없음 (명시적 형변환 필요)
		num1=(int)num2; 
		System.out.println(num1);
		
		int num3=(int)1.2; //소수점 절사
		System.out.println(num3);
		
		/* 문제 : 국어,영어,수학 세 값의 합계와 평균을 출력(소수점까지 출력)*/
		double kor=11, eng=29, math=37, sum, avg;
		sum=kor+eng+math;
		avg=(kor+eng+math)/3;
		System.out.println(sum);
		System.out.println(avg);

		float kor1=11f, eng1=29f, math1=37f, sum1, avg1;
		sum1=kor1+eng1+math1;
		avg1=(kor1+eng1+math1)/3;
		System.out.println(sum1);
		System.out.println(avg1);
		
		int kor2, eng2, math2;
		kor2 = 77;
		eng2 = 78;
		math2 = 89;
		int sum2=kor2+eng2+math2;
		double avg2=(double)sum/3;
		//자료형이 double이고, 나누는 값이 0이면 infinity
		//자료형이 int이고, 나누는 값이 0이면 예외발생(exception)
		System.out.println("합계 : "+sum2+", 평균 : "+avg2);
		
		
	}

}
