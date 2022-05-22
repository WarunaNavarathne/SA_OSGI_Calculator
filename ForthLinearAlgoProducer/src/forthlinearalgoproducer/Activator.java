package forthlinearalgoproducer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration registration;
	
	public void start(BundleContext context) throws Exception {
		System.out.println("Fourth Linear Algo Started");
		IForthLinearAlgo firstAlgo = new ForthLinearAlgoImpl();
		registration = context.registerService(IForthLinearAlgo.class.getName(), firstAlgo, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Fourth Linear Algo Stopped");
		registration.unregister();
	}

}
