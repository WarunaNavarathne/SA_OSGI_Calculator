package force_consumer;

import force_producer.IForce;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class Activator implements BundleActivator {

	ServiceReference reference;

	public void start(BundleContext context) throws Exception {
		System.out.println("Force Consumer Stareted!");
		reference = context.getServiceReference(IForce.class.getName());
		IForce iforce = (IForce) context.getService(reference);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Force Consumer Stopped!");
		context.ungetService(reference);
	}

}
