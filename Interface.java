package accountee;
class phone{
	void call() { System.out.println("calling");}
	void sms() { System.out.println("sending sms");}
}
interface camera{
	 void click();
	 void record();
}
interface music{
	 void play();
	 void pause();
}
class smartphone extends phone implements camera,music{
	public void click() {
		System.out.println("clicking photo");
	};
	public void record(){
			System.out.println("recording");
		};
	public void play(){
			System.out.println("recording");
		};
	public void pause(){
			System.out.println("recording");
		};
}

public class Interface {
public static void main(String[] args) {
  phone p = new smartphone();
  p.call();
  p.sms();
	}

}
