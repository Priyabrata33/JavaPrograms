package interfaceExamles;

class Phone{
	public void call() {
		System.out.println("We can call by the phone");
	}
	public void SMS() {
		System.out.println("We can SMS by the Phone");
	}
}


interface ICamera{
	void click();
	void record();
}

interface ImusicPlayer{
	void play();
	void pause();
	void stop();
}



class SmartPhone extends Phone implements ICamera, ImusicPlayer{
	
	@Override
	public void call() {
		System.out.println("We can call by the smart phone");
	}
	
	@Override
	public void SMS() {
		System.out.println("We can SMS by the smart Phone");
	}
	
	public void VideoCall() {
		System.out.println("we can video call by the smart phone");
	}
	
	@Override
	public void click() {
		System.out.println("We can click photo by the Smart phone");
	}
	
	@Override
	public void record() {
		System.out.println("We can record video by the Smart phone");
	}
	
	@Override
	public void play() {
		System.out.println("We can record video by the Smart phone");
	}
	
	@Override
	public void pause() {
		System.out.println("We can record video by the Smart phone");
	}
	
	@Override
	public void stop() {
		System.out.println("We can record video by the Smart phone");
	}
	
	
	
	
}

public class SmartPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SmartPhone s = new SmartPhone();
		ICamera c = s;
		ImusicPlayer m = s;
		Phone p = s;
		
		s.call();
		s.SMS();
		s.click();
		s.pause();
		s.play();
		s.stop();
		s.VideoCall();
		s.record();
		
		
		System.out.println();
		
		p.call();						
		p.SMS();									//output is by smart phone because of reference indicate the smart class object here

		System.out.println();
		
		c.record();
		c.click();
		
		System.out.println();
		
		
		m.pause();
		m.play();
		m.stop();
		
		
	}

}
