package com.yuelchen.load;

import java.util.LinkedHashMap;

/**
 * Inherits MapLoadTest methods for put and get methods. 
 * 
 * Load testing is done against Map object initialized with LinkedHashMap.
 * 
 * @author	yuelchen
 * @version	1.0.0
 * @since	2020-09-04
 */
public class LinkedHashMapLoadTest extends MapLoadTest {

	/**
	 * Constructor 
	 * 
	 * @param loadCount			the size of iterations per thread for test.
	 * @param threadCount		the number of threads for test.
	 */
	public LinkedHashMapLoadTest(int loadCount, int threadCount) {
		super(loadCount, threadCount);
		this.mapLoad = new LinkedHashMap<String, Integer>();
	}
}
