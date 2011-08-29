package org.codeexample.javacode.singletons;

/**
 * From Oracle JRockit: The Definitive Guide:
 * http://www.amazon.com/Oracle-JRockit-Definitive-Marcus-Hirt/dp/1847198066/ref=sr_1_1?ie=UTF8&qid=1314254643&sr=8-1
 * 
 * Double checked locking doesn't work on older JVM, although in new version of
 * Java Memory Model(Java5 and newer version), by declaring the field as
 * volatile, it may work, but because underlying memory model implementations
 * may not be correct, double checked locking should be avoided!
 * <p>
 * 
 * So don't use this implementation.
 */
@Deprecated
public class SingletonDoubleCheckedLocking {

	private static SingletonDoubleCheckedLocking instance;

	private SingletonDoubleCheckedLocking() {
	}

	public static SingletonDoubleCheckedLocking getInstance() {
		if (instance == null) {
			synchronized (SingletonDoubleCheckedLocking.class) {
				instance = new SingletonDoubleCheckedLocking();
			}
		}
		return instance;
	}

}
