package thermomain_ui;

public class ThermoImpl implements IThermo{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		ThermoDisply display = new ThermoDisply();
		display.setVisible(true);
	}

}
