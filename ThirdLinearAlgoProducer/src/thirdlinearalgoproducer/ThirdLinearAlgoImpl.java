package thirdlinearalgoproducer;

public class ThirdLinearAlgoImpl implements IThirdLinearAlgo{

	@Override
	public double DisplcementCal(double u, double t, double a) {
		// TODO Auto-generated method stub
		return (u*t)+(1/2.0*a*t*t);
	}
	
}




