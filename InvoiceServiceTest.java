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
	  
	   @Test
	  public void givenLessDistanceTimeReturnMinFare() {
		    InvoiceGenerator invoiceGenerator =new InvoiceGenerator();
	        double distance = 0.1;
	        int time = 1;
	        double fare = invoiceGenerator.calculateFare(distance,time);
	        
			Assert.assertEquals(5, fare,1);
	    }
	   
	   public void givenMultipleRides_ShouldReturnTotalFare() {
		   InvoiceGenerator invoiceGenerator =new InvoiceGenerator();
		   Ride[] rides = new Ride[]{new Ride(2.0, 5),
				                     new Ride(0.1, 1)
				                     };
		   
		   double fare=invoiceGenerator.calculateFare(rides);
		   Assert.assertEquals(5, fare,1);
		   
	   }
	   
}
