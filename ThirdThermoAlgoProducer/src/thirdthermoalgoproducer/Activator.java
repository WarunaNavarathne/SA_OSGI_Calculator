package thirdthermoalgoproducer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration registration;

	public void start(BundleContext context) throws Exception {
		System.out.println("Third Linear Algo Started");
		IThirdThermoAlgo thirdAlgo = new ThirdThermoAlgoImpl();
		registration = context.registerService(IThirdThermoAlgo.class.getName(), thirdAlgo, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Third Linear Algo Stopped");
		registration.unregister();
	}

}
