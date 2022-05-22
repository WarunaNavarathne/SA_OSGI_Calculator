package thirdlinearalgoconsumer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import thirdlinearalgoproducer.IThirdLinearAlgo;

public class Activator implements BundleActivator {

	ServiceReference reference;
	
	public void start(BundleContext context) throws Exception {
		System.out.println("Third linear algo consumer started");
		reference = context.getServiceReference(IThirdLinearAlgo.class.getName());
		IThirdLinearAlgo thirdlinear = (IThirdLinearAlgo) context.getService(reference);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Third linear algo consumer stopped");
		context.ungetService(reference);
	}

}
