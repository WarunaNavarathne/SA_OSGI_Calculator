package preasure_producer;


import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;



public class Activator implements BundleActivator {

	ServiceRegistration registration;

	public void start(BundleContext context) throws Exception {
		System.out.println("Preasure Producer Started!");
		IPreasure ipreasure = new PreasureImpl();
		registration = context.registerService(IPreasure.class.getName(), ipreasure, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Preasure Producer Stopped!");
		registration.unregister();
	}

}
