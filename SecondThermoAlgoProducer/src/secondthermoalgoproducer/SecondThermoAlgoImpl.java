package secondthermoalgoproducer;

public class SecondThermoAlgoImpl implements ISecondThermoAlgo{

	@Override
	public double SpecificHeatCapacity(double m, double c, double q) {
		// TODO Auto-generated method stub
		return m*c*q;
	}
	
}
