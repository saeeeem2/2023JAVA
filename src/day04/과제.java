package day04;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 문제 : 5명의 점수를 입력받아서 배열에 저장하고, 점수의 합계와 평균을 출력
		 * 최고점수 출력
		 * 입력 -> Scanner
		 * 배열생성
		 * for문을 활용하여 입력받은 점수를 저장
		 * 최대값 : if / Math.max*/
		
		Scanner scan=new Scanner(System.in);
		//과제
//		System.out.println("5명의 점수를 입력하세요");
//	    int num1=scan.nextInt();
//	    int num2=scan.nextInt();
//	    int num3=scan.nextInt();
//	    int num4=scan.nextInt();
//	    int num5=scan.nextInt();
//	    int sum=0;
//	    
//	    int[] arr= {num1,num2,num3,num4,num5};
//	    for(int i=0; i<arr.length; i++) {
//	    	sum=sum+arr[i];
//	    	}
//    	System.out.println("합계 : "+sum+" 평균 : "+(sum/5));
		
		//과제 풀이
		int size=5;
		int arr[]=new int[size];
		int sum=0;
		double avg=0;
		int max=0; //if문으로 구하기
		int max1=0; //Math.max함수 이용해서 구하기
		int min=100; //최소값 구하기 : 최소값이므로 0으로 초기화할 수 없음(점수가 0보다 작을 수 없으므로 최소값을 구할 수 없음)
		int min1=100;
		
		System.out.println("점수를 입력해주세요(5명).");
		for(int i=0; i<arr.length; i++) {
			arr[i]=scan.nextInt();
			sum +=arr[i];
			//최대값구하기
			if(max < arr[i]) {
				max=arr[i]; //max의 초기값인 0대신 arr[i]값이 저장됨
			} 
			if(min>arr[i]) {
				min=arr[i];
			}
			//Math.max
			Math.max(max1,arr[i]);
			Math.min(min1, arr[i]);
		}
		avg=sum/size; //또는 avg=(double)sum/arr.length;
		
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		System.out.println("최대값 : "+max);
		System.out.println("최대값 : "+max1);
		System.out.println("최소값 : "+min);
		System.out.println("최소값 : "+min1);
		
		scan.close();

	}

}
