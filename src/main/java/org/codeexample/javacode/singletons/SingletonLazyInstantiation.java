package org.codeexample.javacode.singletons;

/**
 * This variant avoids the drawback of eager instantiation, as no resources are
 * allocated before the instance is actually accessed, but further
 * synchronization might seem unnecessary and expensive after the instance is
 * already constructed.
 * 
 */
public class SingletonLazyInstantiation {

	private static SingletonLazyInstantiation instance;

	private SingletonLazyInstantiation() {
	}

	public static synchronized SingletonLazyInstantiation getInstance() {
		if (instance == null) {
			instance = new SingletonLazyInstantiation();
		}
		return instance;
	}
}
