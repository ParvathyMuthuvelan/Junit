package com.junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestLifeCycle {
	
	     static Calculator c;
	    @BeforeClass
	    public static void setup(){
	    	c=new Calculator();
	        System.out.println("@BeforeAll executed");
	    }
	     
	    @Before
	    public void setupThis(){
	        System.out.println("@Before executed");
	    }
	     
	    @Test
	    public void testCalcAdd() 
	    {
	        System.out.println("======TEST ADD EXECUTED=======");
	       assertEquals( 4 , c.add(2, 2));
	    }
	     
	    @Test
	   @Ignore
	    public void testCalcMultiply() 
	    {
	        System.out.println("======TEST Multiply EXECUTED=======");
	       assertEquals( 8 , c.multiply(2, 4));
	    }
	    @Test
	    public void testCalcSubtract() 
	    {
	        System.out.println("======TEST Subtract EXECUTED=======");
	       assertEquals( 0 , c.subtract(2, 2));
	    }
	    @After
	    public void tearThis(){
	        System.out.println("@After executed");
	    }
	     
	    @AfterClass
	    public static void tear(){
	        System.out.println("@AfterAll executed");
	    }
	}

