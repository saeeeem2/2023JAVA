package day05;

public class Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Array 예제
		 * 5개의 값을 가지는 배열을 생성
		 * 1~50사이의 랜덤값을 저장한 후 출력*/
		
		int arr[] = new int[5]; // 0 1 2 3 4

		for( int i=0; i<arr.length; i++ ){
		   arr[i] = (int)(Math.random()*50)+1;
		   System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		System.out.println("-----------------");
		// 정렬(오름차순) : 교환
		// 임시변수 tmp
		/* int tmp=a;
		 * a=b;
		 * b=tmp;
		 * if(arr[0]>arr[1])*/
		
		// 정렬을 위해서는 이중 for문 필요
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) { //오름차순 교환 => 부등호 방향 변경하면 내림차순으로 변경 가능
					int tmp=arr[i];
					
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		//이중 for문이 다 돌아간 후 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		//향상된 for문
		System.out.println();
		System.out.println("향상된 for >");
		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}
	}

}
