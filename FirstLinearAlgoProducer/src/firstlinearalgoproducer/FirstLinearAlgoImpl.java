package firstlinearalgoproducer;

public class FirstLinearAlgoImpl implements IFirstLinearAlgo{

	@Override
	public double velocityCal(double u, double a, double t) {
		// TODO Auto-generated method stub
		return u+(a*t);
	}

}
