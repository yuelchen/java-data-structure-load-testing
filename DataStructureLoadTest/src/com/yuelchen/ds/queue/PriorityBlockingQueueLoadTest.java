package com.yuelchen.ds.queue;

import java.util.concurrent.PriorityBlockingQueue;

/**
 * Inherits QueueLoadTest methods for put and contains methods. 
 * 
 * Load testing is done against Queue object initialized with PriorityBlockingQueue.
 * 
 * @author	yuelchen
 * @version	1.0.0
 * @since	2020-09-12
 */
public class PriorityBlockingQueueLoadTest extends QueueLoadTest {

	/**
	 * Constructor 
	 * 
	 * @param loadCount			the size of iterations per thread for test.
	 * @param threadCount		the number of threads for test.
	 */
	protected PriorityBlockingQueueLoadTest(int loadCount, int threadCount) {
		super(loadCount, threadCount);
		this.queueLoad = new PriorityBlockingQueue<String>();
	}
}
