package com.yuelchen.ds.queue;

import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.yuelchen.util.Calculate;

public abstract class QueueLoadTest {
	
	/**
	 * Given load count, default value is 10000.
	 */
	protected int loadCount = 10000;
	
	//====================================================================================================
	
	/**
	 * Given thread count, default value is 5.
	 */
	protected int threadCount = 5;
	
	//====================================================================================================
	
	/**
	 * Uninitialized queue of Strings; to be initialized by sub-classes.
	 */
	protected Queue<String> queueLoad;
	
	//====================================================================================================
	
	/**
	 * Constructor
	 * 
	 * @param loadCount			the size of iterations per thread for test.
	 * @param threadCount		the number of threads for test.
	 */
	protected QueueLoadTest(int loadCount, int threadCount) {
		this.loadCount = loadCount;
		this.threadCount = threadCount;
	}
	
	//====================================================================================================
	
	/**
	 * Executes Contains mapping request against loadCount x threadCount.
	 */
	public void runContainLoadResult() {
		try {
			//store start time (nano seconds) and initialize executor thread count
			long executorStartTime = System.nanoTime();
			ExecutorService executor = Executors.newFixedThreadPool(threadCount);
	
			//for each thread, initialize a new thread to perform load
			for(int thread = 0; thread < threadCount; thread++) {
				executor.execute(new Runnable() {
					
					//runnable method which executes get random number 
					public void run() {
						long threadStartTime = System.nanoTime();
						for(int load = 0; load < loadCount; load++) {
							//generate random number and makes get call
							String randomNumber = String.valueOf(
									Math.ceil(Math.random() * loadCount));
							queueLoad.contains(randomNumber);
						}						
						
						//output time it took for thread to complete load
						long threadEndTime = System.nanoTime();
						long difference = Calculate.getDifferenceMilliSeconds(
								threadEndTime, threadStartTime);
						System.out.println(String.format("\t- Thread process completed "
								+ "a load of '%d' contain operations in '%d ms'", 
								loadCount, difference));
					}
				});
			}
			
			//shutdown executor after completion of all threads
			executor.shutdown();
			executor.awaitTermination(Long.MAX_VALUE, TimeUnit.MINUTES);
			
			//output time it took for executor to complete and shutdown
			long executorEndTime = System.nanoTime();
			long difference = Calculate.getDifferenceMilliSeconds(
					executorEndTime, executorStartTime);
			System.out.println(String.format("Executor terminated for contain load of '%d' and "
					+ "'%d' threads in '%d ms'", loadCount, threadCount, difference));
			
		} catch(InterruptedException e) {
			System.out.println(String.format("Unable to complete contain load test due to "
					+ "InterruptedException with message '%s'; caused by '%s'",
					e.getMessage(), e.getCause().toString()));
		}
	}
	
	//====================================================================================================
	
	/**
	 * Executes PUT mapping request against loadCount x threadCount.
	 */
	public void runPutLoadResult() {
		try {
			//store start time (nano seconds) and initialize executor thread count
			long executorStartTime = System.nanoTime();
			ExecutorService executor = Executors.newFixedThreadPool(threadCount);
	
			//for each thread, initialize a new thread to perform load
			for(int thread = 0; thread < threadCount; thread++) {
				executor.execute(new Runnable() {
					
					//runnable method which executes get random number 
					public void run() {
						long threadStartTime = System.nanoTime();
						for(int load = 0; load < loadCount; load++) {
							//generate random number and makes get call
							String randomNumber = String.valueOf(
									Math.ceil(Math.random() * loadCount));
							queueLoad.add(randomNumber);
						}						
						
						//output time it took for thread to complete load
						long threadEndTime = System.nanoTime();
						long difference = Calculate.getDifferenceMilliSeconds(
								threadEndTime, threadStartTime);
						System.out.println(String.format("\t- Thread process completed "
								+ "a load of '%d' put operations in '%d ms'", 
								loadCount, difference));
					}
					
				});
			}
			
			//shutdown executor after completion of all threads
			executor.shutdown();
			executor.awaitTermination(Long.MAX_VALUE, TimeUnit.MINUTES);
			
			//output time it took for executor to complete and shutdown
			long executorEndTime = System.nanoTime();
			long difference = Calculate.getDifferenceMilliSeconds(
					executorEndTime, executorStartTime);
			System.out.println(String.format("Executor terminated for put load of '%d' and "
					+ "'%d' threads in '%d ms'", loadCount, threadCount, difference));
			
		} catch(InterruptedException e) {
			System.out.println(String.format("Unable to complete put load test due to "
					+ "InterruptedException with message '%s'; caused by '%s'",
					e.getMessage(), e.getCause().toString()));
		}
	}
}
