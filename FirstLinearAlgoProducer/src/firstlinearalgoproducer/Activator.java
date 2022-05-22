package firstlinearalgoproducer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration registration;
	
	public void start(BundleContext context) throws Exception {
		System.out.println("First Linear Algo Started");
		IFirstLinearAlgo firstAlgo = new FirstLinearAlgoImpl();
		registration = context.registerService(IFirstLinearAlgo.class.getName(), firstAlgo, null);		
				
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("First Linear Algo Stopped");
		registration.unregister();
	}

}
