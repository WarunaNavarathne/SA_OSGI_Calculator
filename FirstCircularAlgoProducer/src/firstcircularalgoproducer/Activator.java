package firstcircularalgoproducer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration registration;

	public void start(BundleContext context) throws Exception {
		System.out.println("First Circular Algo Started");
		IFirstCircularAlgo firstAlgo = new FirstCircularAlgoImpl();
		registration = context.registerService(IFirstCircularAlgo.class.getName(), firstAlgo, null);		
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("First Circular Algo Stopped");
		registration.unregister();
	}

}
