package com.yuelchen.ds.queue;

import java.util.concurrent.SynchronousQueue;

/**
 * Inherits QueueLoadTest methods for put and contains methods. 
 * 
 * Load testing is done against Queue object initialized with SynchronousQueue.
 * 
 * @author	yuelchen
 * @version	1.0.0
 * @since	2020-09-12
 */
public class SynchronousQueueLoadTest extends QueueLoadTest {

	/**
	 * Constructor 
	 * 
	 * @param loadCount			the size of iterations per thread for test.
	 * @param threadCount		the number of threads for test.
	 */
	public SynchronousQueueLoadTest(int loadCount, int threadCount) {
		super(loadCount, threadCount);
		this.queueLoad = new SynchronousQueue<String>();
	}
}