package secondlinearalgoconsumer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import secondlinearalgoproducer.ISecondLinearAlgo;

public class Activator implements BundleActivator {

	ServiceReference reference;
	
	public void start(BundleContext context) throws Exception {
		System.out.println("Second linear algo consumer started");
		reference = context.getServiceReference(ISecondLinearAlgo.class.getName());
		ISecondLinearAlgo secondlinear = (ISecondLinearAlgo) context.getService(reference);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Second linear algo consumer stopped");
		context.ungetService(reference);
	}

}
