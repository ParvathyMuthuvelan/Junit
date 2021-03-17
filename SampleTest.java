package com.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleTest {

	@Test
	public void testEvenOddNumber() {
		Sample obj = new Sample();
		//assertEquals("9 is not a even number", false, meo.isEvenNumber(9));
		
		assertEquals(false, obj.isEvenNumber(9));
		assertEquals(true, obj.isEvenNumber(10));
	}
//	 @Test(expected = ArithmeticException.class)
//	    public void expectArithmeticException()
//	    {
//	        throw new NullPointerException();
//	    }
//	 
	   // This test case passes because it was expecting NullPointerException
	    @Test(expected = NullPointerException.class)
	    public void expectNullPointerException()
	    {
	        //some code which throw NullPointerException in run time
	        throw new NullPointerException();
	    }
	    @Test(timeout = 1500)
	    public void testLoop() throws InterruptedException 
	    {
//	       while (true)
//	       {
	            Thread.currentThread().sleep(400);
	        //}
	    }
}
