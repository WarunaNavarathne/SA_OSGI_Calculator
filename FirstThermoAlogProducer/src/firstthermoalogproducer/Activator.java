package firstthermoalogproducer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration registration;
	
	public void start(BundleContext context) throws Exception {
		System.out.println("First Thermo Algo Started");
		IFirstThermoAlog firstAlgo = new FirstThermoAlogImpl();
		registration = context.registerService(IFirstThermoAlog.class.getName(), firstAlgo, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("First Thermo Algo Stopped");
		registration.unregister();
	}

}
