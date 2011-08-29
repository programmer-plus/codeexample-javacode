package org.codeexample.javacode.singletons;

/**
 * When the singleton class is referenced, its instance would not be created,
 * and also Java guarantees that the class initialization is atomic.
 * 
 * So using the static holder idiom, we combine the benefit of lazy
 * instantiation and no further synchronization after the instance is created,
 * <p>
 * Always use this idiom.
 */
public class SingletonHolderIdiom {

	private SingletonHolderIdiom() {
	}

	private static class SingletonHolder {
		private static final SingletonHolderIdiom instance = new SingletonHolderIdiom();
	}

	public static SingletonHolderIdiom getInstance() {
		return SingletonHolder.instance;
	}
}
