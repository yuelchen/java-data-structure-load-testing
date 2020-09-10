package com.yuelchen.load;

import java.util.LinkedList;

/**
 * Inherits ListLoadTest methods for put and get methods. 
 * 
 * Load testing is done against List object initialized with LinkedList.
 * 
 * @author	yuelchen
 * @version	1.0.0
 * @since	2020-09-04
 */
public class LinkedListLoadTest extends ListLoadTest {
	
	/**
	 * Constructor 
	 * 
	 * @param loadCount			the size of iterations per thread for test.
	 * @param threadCount		the number of threads for test.
	 */
	public LinkedListLoadTest(int loadCount, int threadCount) {
		super(loadCount, threadCount);
		this.listLoad = new LinkedList<String>();
	}
}