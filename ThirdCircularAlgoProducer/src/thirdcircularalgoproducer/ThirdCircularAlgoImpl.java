package thirdcircularalgoproducer;

public class ThirdCircularAlgoImpl implements IThirdCircularAlgo{

	@Override
	public double FinalAngularVelocity(double w0, double a, double t) {
		// TODO Auto-generated method stub
		return w0+(a*t);
	}

}
