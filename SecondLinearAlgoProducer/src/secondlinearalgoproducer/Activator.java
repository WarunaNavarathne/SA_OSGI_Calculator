package secondlinearalgoproducer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration registration;
		
	public void start(BundleContext context) throws Exception {
		System.out.println("Second Linear Algo Started");
		ISecondLinearAlgo firstAlgo = new SecondLinearAlgoImpl();
		registration = context.registerService(ISecondLinearAlgo.class.getName(), firstAlgo, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Second Linear Algo Stopped");
		registration.unregister();
	}

}
