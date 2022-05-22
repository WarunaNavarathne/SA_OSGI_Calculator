package force_producer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration registration;

	public void start(BundleContext context) throws Exception {
		System.out.println("Force Producer Started!");
		IForce iforce = new ForceImpl();
		registration = context.registerService(IForce.class.getName(), iforce, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Force Producer Stopped!");
		registration.unregister();
	}

}
