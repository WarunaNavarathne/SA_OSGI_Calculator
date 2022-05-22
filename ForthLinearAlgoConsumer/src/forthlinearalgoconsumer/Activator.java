package forthlinearalgoconsumer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import forthlinearalgoproducer.IForthLinearAlgo;

public class Activator implements BundleActivator {

	ServiceReference reference;
	
	public void start(BundleContext context) throws Exception {
		System.out.println("Fourth linear algo consumer started");
		reference = context.getServiceReference(IForthLinearAlgo.class.getName());
		IForthLinearAlgo fourthlinear = (IForthLinearAlgo) context.getService(reference);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Fourth linear algo consumer stopped");
		context.ungetService(reference);
	}

}
