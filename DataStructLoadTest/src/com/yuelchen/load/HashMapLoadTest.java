package com.yuelchen.load;

import java.util.HashMap;

/**
 * Inherits MapLoadTest methods for put and get methods. 
 * 
 * Load testing is done against Map object initialized with HashMap.
 * 
 * @author	yuelchen
 * @version	1.0.0
 * @since	2020-09-04
 */
public class HashMapLoadTest extends MapLoadTest {
	
	/**
	 * Constructor 
	 * 
	 * @param loadCount			the size of iterations per thread for test.
	 * @param threadCount		the number of threads for test.
	 */
	public HashMapLoadTest(int loadCount, int threadCount) {
		super(loadCount, threadCount);
		this.mapLoad = new HashMap<String, Integer>();		
	}	
}
