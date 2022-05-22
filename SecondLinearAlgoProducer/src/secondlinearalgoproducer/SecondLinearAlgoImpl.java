package secondlinearalgoproducer;

public class SecondLinearAlgoImpl implements ISecondLinearAlgo{

	@Override
	public double powVelocitycal(double u, double a, double s) {
		// TODO Auto-generated method stub
		return Math.sqrt((u*u)+(2*a*s));
	}
}
