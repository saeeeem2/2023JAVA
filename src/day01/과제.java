package day01;

public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*매일 마지막 시간 과제 출제
		 * 카페에 제출
		 * 국어, 영어, 수학의 점수 합계과 평균을 출력
		 * 조건선택 연산자 이용하여 평균이 80이상이면 결과 : 합격, 아니면 결과 : 불합격 출력
		 */
		
		int kor, eng, math;
		kor=55; eng=20; math=76;
		int sum=kor+eng+math;
		double avg = (double)sum/3;
		System.out.println("합계 : "+sum+", 평균 : "+avg+", 결과 : "+(avg>=80? "합격":"불합격"));
		
		/* 답
		 * int kor=78; 
		 * int eng=45; 
		 * int math=23; 
		 * int sum=0; 지역변수는 반드시 초기화를 해야한다
		 * double avg=0;
		 * sum=kor+eng+math;
		 * avg=sum/3.0;
		 * system.out.println("합계: "+sum+", 평균: "+avg);
		 * system.out.println("결과: "+(avg>=80 ? "합격":"불합격");
		 */
		
		//조건선택 연산자를 if문으로 변경
		
		int kor2=78; int eng2=45; int math2=23;
		int sum2=0;
		double avg2=0;
		sum2=kor2+eng2+math2;
		avg2=sum2/3.0;
		if (avg2>=80) {
			System.out.println("결과 : 합격");
			} else {
				System.out.println("결과 : 불합격");
			}
		
		
	}

}
