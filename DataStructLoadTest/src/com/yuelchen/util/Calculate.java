package com.yuelchen.util;

/**
 * Utility for calculating time difference. 
 * 
 * @author	yuelchen
 * @version	1.0.0
 * @since	2020-09-04
 */
public class Calculate {
	
	/**
	 * Returns difference between end time and start time in seconds.
	 * 
	 * @param endTimeNanoSec		end time in nanoseconds to be converted.
	 * @param startTimeNanoSec		start time in nanoseconds to be converted. 
	 * 
	 * @return						the difference between end time and start time in seconds.								
	 */
	public static long getDifferenceSeconds(long endTimeNanoSec, long startTimeNanoSec) {
		return getDifferenceMilliSeconds(endTimeNanoSec, startTimeNanoSec) / 1000;
	}
	
	//====================================================================================================
	
	/**
	 * Returns difference between end time and start time in milliseconds.
	 * 
	 * @param endTimeNanoSec		end time in nanoseconds to be converted.
	 * @param startTimeNanoSec		start time in nanoseconds to be converted. 
	 * 
	 * @return						the difference between end time and start time in milliseconds.								
	 */
	public static long getDifferenceMilliSeconds(long endTimeNanoSec, long startTimeNanoSec) {
		return getDifferenceMicroSeconds(endTimeNanoSec, startTimeNanoSec) / 1000;
	}
	
	//====================================================================================================
	
	/**
	 * Returns difference between end time and start time in microseconds.
	 * 
	 * @param endTimeNanoSec		end time in microseconds to be converted.
	 * @param startTimeNanoSec		start time in microseconds to be converted. 
	 * 
	 * @return						the difference between end time and start time in microseconds.								
	 */
	public static long getDifferenceMicroSeconds(long endTimeNanoSec, long startTimeNanoSec) {
		return getDifferenceNanoSeconds(endTimeNanoSec, startTimeNanoSec) / 1000;
	}
	
	//====================================================================================================
	
	/**
	 * Returns difference between end time and start time in nanoseconds.
	 * 
	 * @param endTimeNanoSec		end time in nanoseconds to be converted.
	 * @param startTimeNanoSec		start time in nanoseconds to be converted. 
	 * 
	 * @return						the difference between end time and start time in nanoseconds.								
	 */
	public static long getDifferenceNanoSeconds(long endTimeNanoSec, long startTimeNanoSec) {
		return endTimeNanoSec - startTimeNanoSec;
	}
}