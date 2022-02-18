package com.thread.poll.example;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.main.java8.FroukJoinPool;
import com.thread.practice.ExcutorServiceThread;

public class CheckThenAct {

    public static final String PRAY = "Mosque";
    public static final int TIMES = 5;

    private static final ExecutorService executorService = Executors.newFixedThreadPool(2);

    public static void main(String[] args) {
	// resolving currency
	Map<String, BigDecimal> offerPray = new ConcurrentHashMap<String, BigDecimal>();
		//new HashMap<>();
	offerPray.put(PRAY, BigDecimal.ZERO);
	//sequentialPrayTime(offerPray);
	 
	concurentPrayTime(offerPray);
	executorService.shutdown();

	try {

	    while (!executorService.awaitTermination(1, TimeUnit.SECONDS)) ;
	    System.out.println("How many TimeS offer  " + offerPray);
		
	    

	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
    }

    private static void concurentPrayTime(Map<String, BigDecimal> offerPray) {
	for (int i = 0; i <= TIMES; i++) {

	    executorService.submit(()-> sequentialPrayTime(offerPray));

	}

    }

    private static  void sequentialPrayTime(Map<String, BigDecimal> offerPray) {
	for (int i = 0; i <= TIMES; i++) {

	    addedPray(offerPray);

	}

    }

    private static   void addedPray(Map<String, BigDecimal> offerPray) {
	
	
	/*while (true){
	    
	    BigDecimal offer = offerPray.get(PRAY);
	    if (offer != null) {
		if(offerPray.replace(PRAY, offer, offer.add(BigDecimal.ONE))){
		    
		    break;
		}
		}*/
	    
	    // By java 8
    
	
	offerPray.computeIfPresent(PRAY, (pray ,time) -> time.add(BigDecimal.ONE));
	    
	
	
	
	

	

    }

}
