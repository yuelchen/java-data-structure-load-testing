package com.yuelchen.load;

import java.util.Collections;
import java.util.TreeMap;

/**
 * Inherits MapLoadTest methods for put and get methods. 
 * 
 * Load testing is done against Map object initialized with TreeMap.
 * 
 * @author	yuelchen
 * @version	1.0.0
 * @since	2020-09-04
 */
public class TreeMapLoadTest extends MapLoadTest {
	
	/**
	 * Constructor 
	 * 
	 * @param loadCount			the size of iterations per thread for test.
	 * @param threadCount		the number of threads for test.
	 * @param threadSafe		boolean representation to make Map thread safe;.
	 * 							If true, concurrency will not be possible and operations
	 * 							will be performed against a single lock.
	 * 							If false, concurrency will work but may run into 
	 * 							exceptions such as NullPointerException.								
	 */
	public TreeMapLoadTest(int loadCount, int threadCount, boolean threadSafe) {
		super(loadCount, threadCount);
		this.mapLoad = threadSafe ?
				Collections.synchronizedSortedMap(new TreeMap<String, Integer>()) :
				new TreeMap<String, Integer>();
	}
}