package ve;

public class Truck implements Cost{

	@Override
	public double cost(double weight, double space) {
		double cost1=1;
		if(space>1000&& weight>60){
			return -1;
		}else{cost1=weight*space*120;
		return cost1;}
		
	}

	
			
		}
		
	
	

