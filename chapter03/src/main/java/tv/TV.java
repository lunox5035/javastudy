package tv;

public class TV {
	private int channel; // 1~255 사이값을 가지게 하고 넘어 갈때는 라인딩 시킬 것
	private int volume; // 0~100 사이값을 가지게 하고 넘어 갈때는 라인딩 시킬 것
	private boolean power;

	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}	

//	public int getChannel() {
//		return channel;
//	}
//
//	public int getVolume() {
//		return volume;
//	}
//
//	public boolean isPower() {
//		return power;
//	}
		//==================================================================
	public void power(boolean on) {	
		power = on;
	}
	//==================================================================

	public void channel(boolean chan) {		
		if (chan) {
			channel(channel+1);
		}else {
			channel(channel-1);
		}
	}	
	
	public void channel(int channel) {		
		if(!power) {
			return;
		}
		
		if(channel < 1) {
			channel = 255;
		} else if(channel > 255){
			channel = 1;
		}
		
		this.channel = channel;
	}

	//==================================================================
	public void volume(boolean vol) {		
//		if (vol) {
//			volume=volume+1;
//		}else {
//			volume=volume-1;
//		}
		volume(volume + (vol ? 1 : -1));
	}
	
	public void volume(int volume) {			
		if(!power) {
			return;
		}
		
		if(volume < 0) {
			volume = 100;
		} else if(volume > 100){
			volume = 0;
		}
		
		this.volume = volume;
	}

	public void status() {						
		System.out.println(
		"TV[channel=" + channel + ", volume=" + volume + ", power " + (power ? "on" : "off") + "]");
	}
	
	
	
		

//	public static void volume(int volume) {		
//		if (volume>=1 && volume<=255){
//			return;
//		}else if(volume>255){
//			volume=volume-255;
//		}else if(volume<0) {
//			volume=255+volume;
//		}
//	}
//	
////
//		void setVolume(int volume1) {
//			if (volume1 >= 1 && volume1 <= 255) {
//				this.volume = volume1;
//			} else if (volume1 > 255) {
//				this.volume = volume1 - 255;
//			} else if (volume1 < 0) {
//				this.volume = 255 + volume1;
//			}	
}
