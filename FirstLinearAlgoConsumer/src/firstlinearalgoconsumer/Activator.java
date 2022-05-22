package firstlinearalgoconsumer;

import firstlinearalgoproducer.IFirstLinearAlgo;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class Activator implements BundleActivator {
	
	ServiceReference reference;

	public void start(BundleContext context) throws Exception {
		System.out.println("First linear algo consumer started");
		reference = context.getServiceReference(IFirstLinearAlgo.class.getName());
		IFirstLinearAlgo firlinear = (IFirstLinearAlgo) context.getService(reference);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("First linear algo consumer stopped");
		context.ungetService(reference);
	}

}
