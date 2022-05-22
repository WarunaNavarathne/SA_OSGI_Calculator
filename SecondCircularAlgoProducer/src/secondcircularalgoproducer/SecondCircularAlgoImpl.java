package secondcircularalgoproducer;

public class SecondCircularAlgoImpl implements ISecondCircularAlgo {

	@Override
	public double AngularAcceleration(double r, double w) {
		// TODO Auto-generated method stub
		return r*(w*w);
	}

}
