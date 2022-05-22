package secondcircularalgoproducer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;



public class Activator implements BundleActivator {
	ServiceRegistration registration;

	public void start(BundleContext context) throws Exception {
		System.out.println("Second Circular Algo Started");
		ISecondCircularAlgo firstAlgo = new SecondCircularAlgoImpl();
		registration = context.registerService(ISecondCircularAlgo.class.getName(), firstAlgo, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Second Circular Algo Stopped");
		registration.unregister();
	}

}
