package pe_producer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration registration;

	public void start(BundleContext context) throws Exception {
		System.out.println("Potential Energy Producer Started!");
		IPE ipe = new PEImpl();
		registration = context.registerService(IPE.class.getName(), ipe, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Potential Energy Producer Stopped!");
		registration.unregister();
	}

}
