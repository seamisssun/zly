package Day13;

public class Fan extends Electrical {

	public Fan(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void on(){
		System.out.println("风扇开");
	}
	
	public void off(){
		System.out.println("风扇关");
	}
}
