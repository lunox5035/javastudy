package tv;

public class TV {
	private int channel;	//1~255 사이값을 가지게 하고 넘어 갈때는 라인딩 시킬 것
	private int volume;		//0~100 사이값을 가지게 하고 넘어 갈때는 라인딩 시킬 것
	
	private boolean power;	
	
	public void status() {
		System.out.println(
				"TV[channel="	+channel+
				", volume="		+volume+
				", power"		+(power ? "on":"off")+"]");
	}
	
}
