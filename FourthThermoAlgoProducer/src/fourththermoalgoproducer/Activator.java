package fourththermoalgoproducer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration registration;

	public void start(BundleContext context) throws Exception {
		System.out.println("Fourth Thermo Algo Started");
		IFourthThermoAlgo firstAlgo = new FourthThermoAlgoImpl();
		registration = context.registerService(IFourthThermoAlgo.class.getName(), firstAlgo, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Fourth Thermo Algo Stopped");
		registration.unregister();
	}

}
