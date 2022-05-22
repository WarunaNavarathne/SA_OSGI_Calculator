package thirdcircularalgoproducer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;



public class Activator implements BundleActivator {

	ServiceRegistration registration;

	public void start(BundleContext context) throws Exception {
		System.out.println("Third Circular Algo Started");
		IThirdCircularAlgo firstAlgo = new ThirdCircularAlgoImpl();
		registration = context.registerService(IThirdCircularAlgo.class.getName(), firstAlgo, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Third Circular  Algo Stopped");
		registration.unregister();
	}

}
