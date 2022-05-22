package main_ui;

import linearmotionmain_ui.ILinearMotion;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.util.tracker.ServiceTracker;

public class Activator implements BundleActivator {
	
	@SuppressWarnings("rawtypes")
	ServiceRegistration registration;
	
	private static ServiceTracker slide;
	private static ILinearMotion  linearr;

	public void start(BundleContext context) throws Exception {
		System.out.println("Main Service Started");
		MainInterface main1 = new MainImplimentation();
		registration = context.registerService(MainInterface.class.getName(), main1, null);
		
		slide = new ServiceTracker(context, ILinearMotion.class.getName(), null);
		main1.start();
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Main Service Stopped");
		registration.unregister();
	}

	public static boolean linearClick() {
		slide.open();
		linearr =  (ILinearMotion) slide.getService();
		
		if(linearr != null) {
			System.out.println("line true");
			return true;
		}else {
			return false;
		}
	}
}
