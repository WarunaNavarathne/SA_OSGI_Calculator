package ke_consumer;

import ke_producer.IKE;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class Activator implements BundleActivator {

	ServiceReference reference;

	public void start(BundleContext context) throws Exception {
		System.out.println("Kinetic Energy Consumer Stareted!");
		reference = context.getServiceReference(IKE.class.getName());
		IKE ike = (IKE) context.getService(reference);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Kinetic Energy Consumer Stopped!");
		context.ungetService(reference);
	}

}
