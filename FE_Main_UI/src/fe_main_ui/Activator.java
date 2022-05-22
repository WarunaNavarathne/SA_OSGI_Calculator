package fe_main_ui;

import energy_main_ui.IEnergy_Main_Display;
import force_main_ui.IForce_Main_Display;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.util.tracker.ServiceTracker;

public class Activator implements BundleActivator {

	ServiceRegistration register;

	
	private static ServiceTracker forcetra;
	private static ServiceTracker energytra;
	private static IForce_Main_Display forceDisplay;
	private static IEnergy_Main_Display energyDisplay;
	
	public void start(BundleContext context) throws Exception {
		System.out.println("Mechanics Cousumer Started");
		IMain display = new MainImpl();
		register = context.registerService(IMain.class.getName(), display, null);
		
		forcetra = new ServiceTracker(context, IForce_Main_Display.class.getName(), null);
		energytra = new ServiceTracker(context, IEnergy_Main_Display.class.getName(), null);
		//display.Start();
				
	}


	public void stop(BundleContext context) throws Exception {
		System.out.println("Mechanics Cousumer Stopped");
		register.unregister();
	}
	
	
	public static boolean forceDisplayClick() {
		forcetra.open();
		forceDisplay = (IForce_Main_Display) forcetra.getService();
		if(forceDisplay != null) {
			return true;
		}
		else
			return false;
	}
	
	
	public static boolean energyDisplayClick() {
		energytra.open();
		energyDisplay = (IEnergy_Main_Display) energytra.getService();
		if(energyDisplay != null) {
			return true;
		}else {
			return false;
		}
	}
	

}
