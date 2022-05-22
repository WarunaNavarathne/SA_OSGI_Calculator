package forthlinearalgoproducer;

public class ForthLinearAlgoImpl implements IForthLinearAlgo{

	@Override
	public double displacementcal(double u, double v, double t) {
		// TODO Auto-generated method stub
		return ((u+v)/2.0)*t;
	}

}
