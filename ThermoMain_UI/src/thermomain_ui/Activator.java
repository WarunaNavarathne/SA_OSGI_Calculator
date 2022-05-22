package thermomain_ui;

import firstthermoalogproducer.FirstThermoAlogImpl;
import firstthermoalogproducer.IFirstThermoAlog;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.util.tracker.ServiceTracker;

public class Activator implements BundleActivator {

	ServiceRegistration registration;
	private static ServiceTracker slide1;
	private static IFirstThermoAlog  linear1;

	public void start(BundleContext context) throws Exception {
		System.out.println("Thermo Main display started");
		IThermo str = new ThermoImpl();
		registration = context.registerService(IThermo.class.getName(), str, null);
		
		slide1 = new ServiceTracker(context, IFirstThermoAlog.class.getName(), null);
		//str.start();
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Thermo Main display Stopped");
		registration.unregister();
	}
	
	public static boolean linearClick() {
		slide1.open();
		linear1 =  (IFirstThermoAlog) slide1.getService();
		
		if(linear1 != null) {
			System.out.println("line true");
			return true;
		}else {
			return false;
		}
	}

}
