package force_main_ui;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;
import org.osgi.util.tracker.ServiceTracker;
import preasure_producer.IPreasure;
import force_consumer.Force_Display;
import force_producer.ForceImpl;
import force_producer.IForce;


public class Activator implements BundleActivator {

	ServiceRegistration registration;
	
	//service tracker
	private static ServiceTracker forcetra2;
	private static ServiceTracker forcetra3;
	private static IForce iforce;
	private static IPreasure ipreasure;

	public void start(BundleContext context) throws Exception {
		System.out.println("Force Consumer Started!");
		IForce_Main_Display forceMainDisplay = new Force_Main_DisplayImpl();
		registration = context.registerService(IForce_Main_Display.class.getName(), forceMainDisplay, null);	

		forcetra2 = new ServiceTracker(context, IForce.class.getName(), null);
		forcetra3 = new ServiceTracker(context, IPreasure.class.getName(), null);
//		display.Start();
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Force Consumer Stopped!");
		registration.unregister();
	}

	public static boolean forceonlyDisplayClick() {
		forcetra2.open();
		iforce = (IForce) forcetra2.getService();
		if(iforce != null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean preasureonlyDisplayClick() {
		forcetra3.open();
		ipreasure = (IPreasure) forcetra3.getService();
		if(ipreasure != null) {
			return true;
		}else {
			return false;
		}
		
	}

}
