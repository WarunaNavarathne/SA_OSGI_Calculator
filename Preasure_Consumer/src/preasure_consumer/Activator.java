package preasure_consumer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import preasure_producer.IPreasure;

public class Activator implements BundleActivator {

	ServiceReference reference;

	public void start(BundleContext context) throws Exception {
		System.out.println("Preasure Consumer Stareted!");
		reference = context.getServiceReference(IPreasure.class.getName());
		IPreasure ipreasure = (IPreasure) context.getService(reference);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Preasure Consumer Stopped!");
		context.ungetService(reference);
	}

}
