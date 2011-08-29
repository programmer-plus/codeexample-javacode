package org.codeexample.javacode.singletons;

/**
 * This would initialize this singleton class eagerly, when the class is loaded
 * at first time. Thus, it may happen that the singleton instance is constructed
 * even if it is not accessed. This is a drawback, especially when the
 * construction is complex and time/resource consuming. The good part of this
 * variant is its simplicity.
 * 
 */
public class SingletonEagerInstantiation {

	private static SingletonEagerInstantiation instance = new SingletonEagerInstantiation();

	private SingletonEagerInstantiation() {
	}

	public static SingletonEagerInstantiation getInstance() {
		return instance;
	}
}
