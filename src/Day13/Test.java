package Day13;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Electrical []electricals=new Electrical[2];
		electricals[0]=new Fan("风扇");
		electricals[1]=new Light("电灯");
		electricals[0].on();
		electricals[0].off();
		electricals[1].on();
		electricals[1].off();
		for(Electrical e:electricals){
			e.on();
			e.off();
		}*/
		Printer c1=new Color("彩色打印机打印");
		Printer c2=new Black("黑白打印机打印");
		School sc=new School();

		sc.setPrinter(c1);

		sc.setPrinter(c2);
	}

}
