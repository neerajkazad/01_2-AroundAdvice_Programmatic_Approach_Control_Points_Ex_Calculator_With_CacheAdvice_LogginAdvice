package com.aa.notes;

public class Notes {
	/**
	 * 
	 * This is the Best Example of When to Use AOP In our Project? You can tell
	 * this is the answer of the one question. IQ: In your project where you
	 * used AOP?
	 * 
	 * So using this application we can tell we are using AOP to Cache the data
	 * and at the same time we are using LoggindAdvice to trace the flow of the
	 * application if we get any exception or error then easily we can get, and
	 * if we explain this example in the interview room the interviewer is
	 * understand the clear picture of AOP and where to use aop and we can give
	 * the IQ Question of above related to AOP!..
	 * 
	 * 
	 * =========================================================================================================
	 * 
	 * Here don’t use HashMap instead we need to use ConcurrentHashMap.
	 * 
	 * HashMapis non-synchronized. Which leads to data-inconsistency in a
	 * multi-threaded environment.
	 * 
	 * HashTable is sysnchronized, it allows only one thread to access the data
	 * and there is a problem with Hashtable bcz it cannot allow to read/write
	 * data by other threads bcz it will locks the entire obj as sysnchronized
	 * hence avoids data inconsistency. But if multiple threads wants read the
	 * data but not for write operation then also Map allows only one thread to
	 * access the Map which will reduces the performance of the application.
	 * Hence to avoid this problem we go for ConcurrentMap.
	 * 
	 * ConcurrentHashMapEntire map obj is not synchronized but each and every
	 * record or Entry is synchronized. That means it allows multiple threads to
	 * access the data from dataMap but it allows only thread for one record in
	 * the map by locking that record to that thread and it will not blocks the
	 * entire obj. It just locks if one of the record accessed by some other
	 * thread and it will allows us to access the data by some other thread.
	 * That means concurren tly multiple threads allows to access only entry
	 * from the Map called as ConcurrentHashMap.
	 */

}
