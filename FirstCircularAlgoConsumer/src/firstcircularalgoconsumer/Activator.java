package firstcircularalgoconsumer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import firstcircularalgoproducer.IFirstCircularAlgo;

public class Activator implements BundleActivator {

	ServiceReference reference;
	
	public void start(BundleContext context) throws Exception {
		System.out.println("First Circular algo consumer started");
		reference = context.getServiceReference(IFirstCircularAlgo.class.getName());
		IFirstCircularAlgo firCir = (IFirstCircularAlgo) context.getService(reference);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("First Circular algo consumer stopped");
		context.ungetService(reference);
	}

}
