package org.codeexample.javacode.singletons;

import java.io.Serializable;

/**
 * To maintain the singleton guarantee, you have to declare all instance fields
 * transient and provide a readResolve method that directly return the static
 * instance, also you must use eager instantiation.
 * <p>
 * see Effective Java 2nd Edition: <br>
 * Item 3: Enforce the singleton property with a private constructor or an enum
 * type
 */
public class SerializableSingleton implements Serializable {

	private static final long serialVersionUID = 1L;
	private static SerializableSingleton instance = new SerializableSingleton();

	private SerializableSingleton() {
	}

	public static SerializableSingleton getInstance() {
		return instance;
	}

	// readResolve method to preserve singleton property
	private Object readResolve() {
		return instance;
	}
}
