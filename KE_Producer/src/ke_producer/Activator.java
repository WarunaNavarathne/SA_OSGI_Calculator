package ke_producer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration registration;

	public void start(BundleContext context) throws Exception {
		System.out.println("Kinetic Energy Producer Started!");
		IKE ike = new KEImpl();
		registration = context.registerService(IKE.class.getName(), ike, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Kinetic Energy Producer Stopped!");
		registration.unregister();
	}

}
