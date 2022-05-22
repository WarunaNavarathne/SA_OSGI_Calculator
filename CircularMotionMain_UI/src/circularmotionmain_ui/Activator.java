package circularmotionmain_ui;

import firstcircularalgoproducer.IFirstCircularAlgo;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.util.tracker.ServiceTracker;

public class Activator implements BundleActivator {

	ServiceRegistration registration;
	private static ServiceTracker slide1;
	private static IFirstCircularAlgo  linear1;

	public void start(BundleContext context) throws Exception {
		System.out.println("Circular motion display started");
		ICircularMotion linnear = new CircularMotionImpl();
		registration = context.registerService(ICircularMotion.class.getName(), linnear, null);
		slide1= new ServiceTracker(context, IFirstCircularAlgo.class.getName(), null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Circular motion Cousumer Stopped");
		registration.unregister();

	}
	public static boolean linearClick() {
		slide1.open();
		linear1 =  (IFirstCircularAlgo) slide1.getService();
		
		if(linear1 != null) {
			System.out.println("line true");
			return true;
		}else {
			return false;
		}
	}


}
