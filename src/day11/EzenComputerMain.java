package day11;

public class EzenComputerMain {

	public static void main(String[] args) {
		// EzenComputer의 객체 생성 후 출력
		
		EzenComputer ez=new EzenComputer("홍길동","000606",23,"010-2000-0606","서울");
		ez.student();
		ez.ezen();
		ez.subject();
		ez.insertCourse("JAVA","1개월");
		ez.subject();
		
		EzenComputer ez2=new EzenComputer("이동혁","000606",23,"010-2000-0606","서울");
		ez2.student();
		ez2.insertCourse("JAVA","8/16~3/14");
		ez2.insertCourse("html","2개월");
		ez2.subject();
		
		
		/* 학생 클래스를 담을 수 있는 배열을 생성한 후 5명의 학생을 등록*/
		
		EzenComputer[] std=new EzenComputer[7];
		std[0]=new EzenComputer("이민형","990802",24,"010-1999-0802","서울");
		std[1]=new EzenComputer("홍길동","950606",28,"010-1999-0802","인천");
		std[2]=new EzenComputer("이순이","950601",28,"010-1999-0802","경기");
		std[3]=new EzenComputer("국영수","990606",24,"010-1999-0802","인천");
		std[4]=new EzenComputer("도수철","990601",24,"010-1999-0802","서울");
		std[5]=ez;
		std[6]=ez2;
		std[0].insertCourse("DB","1개월");
		std[1].insertCourse("HTML","2개월");
		std[2].insertCourse("JAVA","3개월");
		std[3].insertCourse("CSS","4개월");
		std[4].insertCourse("HTML","1개월");
		
		/* 과제 : 학생 이름으로 검색 => 학생의 모든 정보 출력
		 * 		지점 정보로 검색 => 학생 정보만 출력(인천으로 검색 시 인천지점으로 다니는 학생 정보 출력)
		 * 		과목 정보로 검색 => 자바 검색 시 자바 과목을 수강하고 있는 학생 정보, 수강정보 출력*/
		
		int cnt=0;
		String searchName="홍길동";
		System.out.println(searchName+" 님의 정보 -------");
		for(int i=0; i<std.length; i++) {
			if(std[i].getName().equals(searchName)) {
				std[i].student();
				std[i].ezen();
				std[i].subject();
				cnt++;
			}
		}
		if(cnt==0) {
			System.out.println("검색결과가 없습니다.");
		}
		System.out.println("----------------------------");
		String searchBranch="인천";
		System.out.println(searchBranch+"지점의 학생 정보");
		//향상된 for문(배열에서 사용가능)
		//향상된 for문은 완성된 배열에서만 사용가능(get만 가능, set은 불가)
		for(EzenComputer e : std) {
			if(e.getBranch().equals(searchBranch)) {
				e.student();
			}
		}
		System.out.println("----------------------------");
		String searchCourse="JAVA";
		System.out.println(searchCourse+"의 학생정보");
		for(EzenComputer e : std) {
			for(int i=0; i<e.getCnt(); i++) {
				if(e.getCourse()[i].equals(searchCourse)) {
					e.student();
					e.ezen();
					e.subject();
				}
			}
		}
			
		
//	      // 학생 이름으로 검색 시 학생의 모든 정보 출력(동명이인 포함)
//	      for(int i=0; i<std.length; i++) {
//	    	  if(std[i].getName().equals(searchName)) {
//	    		  std[i].student();
//	    	  }
//	      }
//	      // 지역검색 시 학생정보 출력
//	      System.out.println("----------------------------");
//	      for(int i=0; i<std.length; i++) {
//	    	  if(std[i].getBranch().equals(searchBranch)) {
//	    		  std[i].student();
//	    	  }
//	      }
//	      //과목 정보 검색시 수강 학생 정보 및 수강정보 출력
//	      System.out.println("----------------------------");
//	      for(int i=0; i<std.length; i++) {
//	    	  for(int j=0; j<std[i].getCnt(); j++) {
//	    		  if(std[i].getCourse()[j].equals(searchCourse)) {
//	    			  std[i].student();
//	    			  std[i].subject();
//	    		  }
//	    	  }
//	      }
	   }
	}