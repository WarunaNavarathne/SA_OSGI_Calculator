package linearmotionmain_ui;

import firstlinearalgoproducer.IFirstLinearAlgo;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;
import org.osgi.util.tracker.ServiceTracker;

public class Activator implements BundleActivator {

	ServiceRegistration registration;
	private static ServiceTracker slide1;
	private static IFirstLinearAlgo  linear1;
	
	public void start(BundleContext context) throws Exception {
		System.out.println("Linear motion display started");
		ILinearMotion linnear = new LinearMotionImpl();
		registration = context.registerService(ILinearMotion.class.getName(), linnear, null);
		
		slide1 = new ServiceTracker(context, IFirstLinearAlgo.class.getName(), null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Linear motion display Stopped");
		registration.unregister();
	}
	
	public static boolean linearClick() {
		slide1.open();
		linear1 =  (IFirstLinearAlgo) slide1.getService();
		
		if(linear1 != null) {
			System.out.println("line true");
			return true;
		}else {
			return false;
		}
	}

}
