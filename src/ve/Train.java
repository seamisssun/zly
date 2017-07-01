package ve;

public class Train implements Cost{

	@Override
	public double cost(double weight, double space) {
		// TODO Auto-generated method stub
		double cost1=1;
		if(space<900){
			cost1=weight*space*250;
		System.out.println("»ð³µ"+cost1);		
		}
		else if(space<=900){
			cost1=weight*space*300;
					System.out.println("»ð³µ"+cost1);	
		}
		return cost1;
	}
	

}
