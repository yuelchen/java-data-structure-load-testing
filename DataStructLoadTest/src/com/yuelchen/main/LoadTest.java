package com.yuelchen.main;

import com.yuelchen.load.ConcurrentHashMapLoadTest;
import com.yuelchen.load.HashMapLoadTest;
import com.yuelchen.load.HashtableLoadTest;
import com.yuelchen.load.LinkedHashMapLoadTest;
import com.yuelchen.load.TreeMapLoadTest;

/**
 * Used for invoking load test for different data structures. 
 * 
 * @author	yuelchen
 * @version	1.0.0
 * @since	2020-09-04
 */
public class LoadTest {
	
	/**
	 * Default number of iterations for each load test (per thread)
	 */
	private static int DEFAULT_LOAD_SIZE_PER_THREAD = 10000;
	
	//====================================================================================================
	
	/**
	 * Default number of concurrent threads for each load tests. 
	 */
	private static int DEFAULT_THREAD_SIZE = 5;
	
	//====================================================================================================
	
	/**
	 * Main method. 
	 * 
	 * @param args			arguments passed to main.
	 */
	public static void main(String[] args) {
		
		System.out.println("\nHashMap Load Test: ");
		HashMapLoadTest hashMapTest = new HashMapLoadTest(
				DEFAULT_LOAD_SIZE_PER_THREAD, DEFAULT_THREAD_SIZE);
		hashMapTest.runPutLoadResult();
		hashMapTest.runGetLoadResult();

		System.out.println("\nConcurrentHashMap Load Test: ");
		ConcurrentHashMapLoadTest concurrentHashMapTest = new ConcurrentHashMapLoadTest(
				DEFAULT_LOAD_SIZE_PER_THREAD, DEFAULT_THREAD_SIZE);
		concurrentHashMapTest.runPutLoadResult();
		concurrentHashMapTest.runGetLoadResult();
		
		System.out.println("\nLinkedHashMap Load Test: ");
		LinkedHashMapLoadTest linkedHashMapTest = new LinkedHashMapLoadTest(
				DEFAULT_LOAD_SIZE_PER_THREAD, DEFAULT_THREAD_SIZE);
		linkedHashMapTest.runPutLoadResult();
		linkedHashMapTest.runGetLoadResult();
		
		System.out.println("\nHashtableLoadTest Load Test: ");
		HashtableLoadTest hashtableLoadTest = new HashtableLoadTest(
				DEFAULT_LOAD_SIZE_PER_THREAD, DEFAULT_THREAD_SIZE);
		hashtableLoadTest.runPutLoadResult();
		hashtableLoadTest.runGetLoadResult();	
		
		System.out.println("\nTreeMap Load Test (thread-safe): ");
		TreeMapLoadTest treeMapSafeTest = new TreeMapLoadTest(
				DEFAULT_LOAD_SIZE_PER_THREAD, DEFAULT_THREAD_SIZE, true);
		treeMapSafeTest.runPutLoadResult();
		treeMapSafeTest.runGetLoadResult();
		
		System.out.println("\nTreeMap Load Test (not thread-safe): ");
		TreeMapLoadTest treeMapTest = new TreeMapLoadTest(
				DEFAULT_LOAD_SIZE_PER_THREAD, DEFAULT_THREAD_SIZE, false);
		treeMapTest.runPutLoadResult();
		treeMapTest.runGetLoadResult();
	}
}