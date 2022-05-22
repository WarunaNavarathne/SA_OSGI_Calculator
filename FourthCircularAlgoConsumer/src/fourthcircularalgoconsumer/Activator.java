package fourthcircularalgoconsumer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import fourthcircularalgoproducer.IFourthCircularAlgo;


public class Activator implements BundleActivator {

	ServiceReference reference;

	public void start(BundleContext context) throws Exception {
		System.out.println("Fourth circular algo consumer started");
		reference = context.getServiceReference(IFourthCircularAlgo.class.getName());
		IFourthCircularAlgo secondlinear = (IFourthCircularAlgo) context.getService(reference);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Fourth circular algo consumer stopped");
		context.ungetService(reference);
	}

}
