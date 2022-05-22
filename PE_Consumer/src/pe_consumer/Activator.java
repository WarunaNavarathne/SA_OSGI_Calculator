package pe_consumer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import pe_producer.IPE;

public class Activator implements BundleActivator {

	ServiceReference reference;

	public void start(BundleContext context) throws Exception {
		System.out.println("Potential Energy Consumer Stareted!");
		reference = context.getServiceReference(IPE.class.getName());
		IPE ipe = (IPE) context.getService(reference);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Potential Energy Consumer Stopped!");
		context.ungetService(reference);
	}

}
