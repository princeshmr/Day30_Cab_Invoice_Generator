package com.tdd;

import org.junit.Test;

import junit.framework.Assert;

public class InvoiceServiceTest {
	   @Test
	 public void givenDistanceAndTimeShouldReturnTotalFare() {
	     InvoiceGenerator invoiceGenerator =new InvoiceGenerator();
	     double distance=2.0;
	     int time =5;
	     double fare= invoiceGenerator.calculateFare(distance,time);
	     Assert.assertEquals(25, fare,1);
     }
	  
	  public void givenLessDistanceTimeReturnMinFare() {
		    InvoiceGenerator invoiceGenerator =new InvoiceGenerator();
	        double distance = 0.1;
	        int time = 1;
	        double fare = invoiceGenerator.calculateFare(distance,time);
	        Assert.assertEquals(5, fare, 1);
	    }
	   
}
