package day07;

public class Method04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 메서드 : 기능으르 하기 위한 코드 조각
		 * 접근제한자 리턴타입 메서드명(매개변수){
		 * 코드;
		 * return;
		 * ....(리턴이 실행되었으므로 그 뒤 코드는 실행되지 않음)
		 * }
		 * 
		 * return : 메서드에서 전달해야 하는 값을 전달하는 역할
		 * 메서드에서 return을 만나면 리턴 타입의 값을 전달하고, 메서드를 종료*/
		
		/* 1. 랜덤(1~100) 정수 5개를 배열에 담는 메서드(정수 배열을 리턴)
		 * 2. 배열을 전달받아서 평균을 연산하는 메서드(평균을 리턴)
		 * 3. 배열의 정수 5개와 평균을 출력하는 메서드(출력)
		 * 메인에서는 연산식이 있으면 안 됨
		 * 메서드간의 데이터 전다라 및 호출만 있어야 함
		 * 카페에 제출*/
		int arr[] = store();
		int a = avg(arr);
		print(arr, a);

	}
	
	/* 랜덤(1~100) 정수 5개를 배열에 담는 메서드(정수 배열을 리턴)
	 * 
	 * */
	public static int[] store() {
		int store[] = new int[5];
		for(int i=0; i<store.length; i++) {
			store[i]=(int)(Math.random()*100)+1;
		}
		return store;
	}
	
	//배열을 전달받아서 평균을 연산하는 메서드(평균을 리턴)
	public static int avg(int store[]) {
		int avg=(store[0]+store[1]+store[2]+store[3]+store[4])/5;
		return avg;
	}
	
	//배열의 정수 5개와 평균을 출력하는 메서드(출력)
    public static void print(int store[], int avg) {
        for(int i=0; i<store.length; i++) {
           System.out.println(i+"번째 배열 값 : "+store[i]);
        }
        System.out.println("평균 : "+avg);
     }

}
