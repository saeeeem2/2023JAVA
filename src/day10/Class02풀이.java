package day10;

public class Class02풀이 {

	public static void main(String[] args) {
		/* 자동차 클래스 생성
		 * 멤버변수 : name, year, color, power, speed
		 * 메서드 : 전원(시동on/시동off), 스피드 up, 스피드 down
		 * 
		 * 
		 * 
		 * */
		Car2 c=new Car2("포르쉐",2011,"회색");
		c.powerOn();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.powerOff();
		
		
		

	}

}
class Car2{
	private String name;
	private int year;
	private String color;
	private boolean power;
	private int speed;

	

	public Car2() {}
	public Car2(String name, int year, String color) {
		this.name=name;
		this.color=color;
		this.year=year;
	}
	//메서드 
	public void powerOn() {
		power=true;
		System.out.println("전원이 켜졌습니다.");
	}
	public void powerOff() {
		if(speed==0) {
		power=false;
		System.out.println("전원이 꺼졌습니다.");
	} else {
		System.out.println("속도를 먼저 줄여주세요.");
	}
	}
	
	public void speedUp() {
		if(power) {
		speed++;
		System.out.println("현재속도 : "+speed);
		} else {
			System.out.println("시동을 켜주세요.");
		}
	}
	public void speedDown() {
		if(speed==0) {
			System.out.println("최저 속도 입니다.");
		}else {
		speed--;
		System.out.println("현재속도 : "+speed);
		}	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
	

