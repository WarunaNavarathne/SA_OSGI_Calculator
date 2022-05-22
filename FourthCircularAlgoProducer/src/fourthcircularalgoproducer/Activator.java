package fourthcircularalgoproducer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;



public class Activator implements BundleActivator {
	
	ServiceRegistration registration;
	
	public void start(BundleContext context) throws Exception {
		System.out.println("Fourth Circular Algo started");
		IFourthCircularAlgo linnear = new FourthCircularAlgoImpl();
		registration = context.registerService(IFourthCircularAlgo.class.getName(), linnear, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Fourth Circular Algo Cousumer Stopped");
		registration.unregister();
	}

}
