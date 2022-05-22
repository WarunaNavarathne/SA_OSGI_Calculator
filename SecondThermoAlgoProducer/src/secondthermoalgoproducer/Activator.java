package secondthermoalgoproducer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration registration;

	public void start(BundleContext context) throws Exception {
		System.out.println("Second Thermo Algo Started");
		ISecondThermoAlgo firstAlgo = new SecondThermoAlgoImpl();
		registration = context.registerService(ISecondThermoAlgo.class.getName(), firstAlgo, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Second Thermo Algo Stopped");
		registration.unregister();
	}

}
