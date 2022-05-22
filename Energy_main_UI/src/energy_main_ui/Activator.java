package energy_main_ui;

import ke_producer.IKE;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.util.tracker.ServiceTracker;
import pe_producer.IPE;


public class Activator implements BundleActivator {

	ServiceRegistration registration;

	//service tracker
	private static ServiceTracker forcetra2;
	private static ServiceTracker forcetra3;
	private static IKE ike;
	private static IPE ipe;
	
	
	public void start(BundleContext context) throws Exception {
		System.out.println("Energy Consumer Started!");
		IEnergy_Main_Display energymain = new Energy_Main_DisplayImpl();
		registration = context.registerService(IEnergy_Main_Display.class.getName(), energymain, null);
		
		forcetra2 = new ServiceTracker(context, IKE.class.getName(), null);
		forcetra3 = new ServiceTracker(context, IPE.class.getName(), null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Energy Consumer Stopped!");
		registration.unregister();
	}
	
	
	
	public static boolean keDisplay() {
		forcetra2.open();
		ike = (IKE) forcetra2.getService();
		if(ike != null) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean peDisplay() {
		forcetra3.open();
		ipe = (IPE) forcetra3.getService();
		if(ipe != null) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	

}
