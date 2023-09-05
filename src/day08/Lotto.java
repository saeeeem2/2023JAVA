package day08;

import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 로또번호 랜덤 생성(1~45까지 랜덤으로 생성)
		 * 로또번호 => 1~45까지 6개 (배열의 갯수가 6개) => 사용자 번호
		 * 당첨번호 => 1~45까지 7개 (배열의 갯수가 7개) => 기본 6자리 + 보너스 번호 1자리
		 * 로또번호 (6자리)      1 2 3 4 5 6
		 * 당첨번호 (6자리+1자리) 1 2 3 4 5 6 [7] => 보너스 번호는 []표시
		 * 로또 등수 확인
		 * 1등 : 6자리 일치
		 * 2등 : 5자리 일치+보너스번호 일치
		 * 3등 : 5자리 일치
		 * 4등 : 4자리 일치
		 * 5등 : 3자리 일치
		 * 낙첨
		 * 로또번호와 당첨번호는 랜덤생성하되 중복 값이 제거되어야 함
		 * */
		
		
		
		  


	


	}
	public static int[] myNum(int size) {
		int[] arr=new int[6];
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*45+1);
			for(int j=0; j<i; j++) {
				arr[j]=(int)(Math.random()*45+1);
				if(arr[i]==arr[j]) {
					i--;
					break;
				}
			}
		} 
		return arr;
	}

	public static int[] lottoNum(int size) {
		int[] arr1=new int[7];
		for(int i=0; i<arr1.length; i++) {
			arr1[i]=(int)(Math.random()*45+1);
			for(int j=0; j<i; j++) {
				arr1[j]=(int)(Math.random()*45+1);
				if(arr1[i]==arr1[j]) {
					i--;
					break;
				}
			}
		}
		for(int j=0; j<arr1.length-1; j++) {
			arr1[j]=(int)(Math.random()*45+1);
		}
		return arr1;
	}
	
		
	public static void prize(int arr[], int arr1[]) {
	    int count=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr1.length-1; j++) {
				if(arr==arr1) {
					count++;
				}
			}
		}
	 

	}
	
}





