package fe_main_ui;

public class MainImpl implements IMain {

	@Override
	public void Start() {
		FEMain_UI display = new FEMain_UI();
		display.setVisible(true);

	}

}
