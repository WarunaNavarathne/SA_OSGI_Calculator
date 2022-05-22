package firstthermoalogconsumer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import firstthermoalogproducer.IFirstThermoAlog;

public class Activator implements BundleActivator {

	ServiceReference reference;

	public void start(BundleContext context) throws Exception {
		System.out.println("First thermo algo consumer started");
		reference = context.getServiceReference(IFirstThermoAlog.class.getName());
		IFirstThermoAlog firlinear = (IFirstThermoAlog) context.getService(reference);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("First thermo algo consumer stopped");
		context.ungetService(reference);
	}

}
