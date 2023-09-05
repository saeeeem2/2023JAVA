package day10;

public class Class03풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TV tv = new TV("LG");
		tv.isPower();
		

	}

}
class TV{
	/* 멤버변수 : name, power,channel,vol
	 * 메서드 : 전원, 채널  up/down, vol up/down*/
	
	private String name; //null
	private boolean power; //false
	private int channel; //0
	private int vol; //0
	
	//생성자
	public TV() {}
	public TV(String name) {
		this.name=name;
	}
	//메서드
	public void isPower() {
		if(!power) {
			power = true;
			System.out.println("전원이 켜졌습니다.");
		} else {
			power=false;
			System.out.println("전원이 꺼졌습니다.");
		}
	}
	//채널 상태
	public void channelUp() {
		if(channel == 100) {
			channel=0;
		}else {
			channel++;			
		}
		System.out.println("현재채널: "+channel);
	}
	public void channelDown() {
		if(channel == 0) {
			channel = 100;
		}else {
			channel--;
		}
		System.out.println("현재채널: "+channel);			
	}
	
	public void volUp() {
		//maxVol == 10;
		if(vol == 10) {
			System.out.println("더이상 올릴 수 없습니다.");
		}else {
			vol++;
			System.out.println("현재볼륨: "+vol);			
		}
	}
	public void VolDown() {
		if(vol == 0) {
			System.out.println("음소거~!!");
		}else {
			System.out.println("현재볼륨: "+vol);			
			vol--;
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	
}
