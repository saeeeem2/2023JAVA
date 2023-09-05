package studentmanager;

public class Subject {
	/* 과목 클래스 : 한 과목의 기본정보를 나타내는 클래스
	 * - 과목코드, 과목명, 학점, 시수, 교수명,학기,시간표,,,
	 * - 멤버변수 선언, 생성자, getter/setter 호출, 그외 필요한 메서드
	 * - toString, print 메서드*/
	
	//멤버변수 선언
	private String subCode;
	private String subName;
	private double subCredite;
	private int subTime;
	private String subProfassor;
	private String subSemester;
	private String subScheduler;
	
	//생성자
	public Subject() {}
	public Subject(String subName) {
		this.subName=subName;
	}
	public Subject(String subCode, String subName, double subCredite, int subTime, String subProfassor,
			String subSemester, String subScheduler) {
		super();
		this.subCode = subCode;
		this.subName = subName;
		this.subCredite = subCredite;
		this.subTime = subTime;
		this.subProfassor = subProfassor;
		this.subSemester = subSemester;
		this.subScheduler = subScheduler;
	}
	
	
	
	//메서드(필요시 필요한 메서드 추가) => 지금은 없음
	
	//getter/setter
	public String getSubCode() {
		return subCode;
	}
	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public double getSubCredite() {
		return subCredite;
	}
	public void setSubCredite(double subCredite) {
		this.subCredite = subCredite;
	}
	public int getSubTime() {
		return subTime;
	}
	public void setSubTime(int subTime) {
		this.subTime = subTime;
	}
	public String getSubProfassor() {
		return subProfassor;
	}
	public void setSubProfassor(String subProfassor) {
		this.subProfassor = subProfassor;
	}
	public String getSubSemester() {
		return subSemester;
	}
	public void setSubSemester(String subSemester) {
		this.subSemester = subSemester;
	}
	public String getSubScheduler() {
		return subScheduler;
	}
	public void setSubScheduler(String subScheduler) {
		this.subScheduler = subScheduler;
	}
	
	//toString
	
	@Override
	public String toString() {
		return "Subject [subCode=" + subCode + ", subName=" + subName + ", subCredite=" + subCredite + ", subTime="
				+ subTime + ", subProfassor=" + subProfassor + ", subSemester=" + subSemester + ", subScheduler="
				+ subScheduler + "]";
	}
}
