package com.yuelchen.load;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Inherits MapLoadTest methods for put and get methods. 
 * 
 * Load testing is done against Map object initialized with ConcurrentHashMap.
 * 
 * @author	yuelchen
 * @version	1.0.0
 * @since	2020-09-04
 */
public class ConcurrentHashMapLoadTest extends MapLoadTest {
	
	/**
	 * Constructor 
	 * 
	 * @param loadCount			the size of iterations per thread for test.
	 * @param threadCount		the number of threads for test.
	 */
	public ConcurrentHashMapLoadTest(int loadCount, int threadCount) {
		super(loadCount, threadCount);
		this.mapLoad = new ConcurrentHashMap<String, Integer>();
	}
}