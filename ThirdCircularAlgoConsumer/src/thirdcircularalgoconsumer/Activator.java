package thirdcircularalgoconsumer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;


import thirdcircularalgoproducer.IThirdCircularAlgo;

public class Activator implements BundleActivator {

	ServiceReference reference;

	public void start(BundleContext context) throws Exception {
		System.out.println("Third Circular Algo  consumer started");
		reference = context.getServiceReference(IThirdCircularAlgo.class.getName());
		IThirdCircularAlgo firCir = (IThirdCircularAlgo) context.getService(reference);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Third Circular Algo consumer stopped");
		context.ungetService(reference);
	}

}
