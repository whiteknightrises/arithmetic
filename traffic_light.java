package logic;
class trafficlights{
	int duration;
	String color;
	
	public trafficlights(String color,int duration) {
		this.duration = duration;
		this.color = color;
	}
	public int getDuration() {
		return duration;
	}
	public String getColor() {
		return color;
	}
	public void display() {
		System.out.println("the color is "+color+" and the duration is "+duration);
	}
	
}

public class traffic_light {

	public static void main(String[] args) {
		trafficlights t = new trafficlights("red",30);
		t.display();
		
		
		
		
	}

}
