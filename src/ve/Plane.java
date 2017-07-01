package ve;

public class Plane implements Cost {

	@Override
	public double cost(double weight, double space) {
		// TODO Auto-generated method stub
		double cost1=1;
		if(space<500){return -1;
			
		}else{cost1=weight*space*300;
		}
		return cost1;
	}

	

}
