package com.client;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class, loader = AnnotationConfigContextLoader.class)
public class SpringJunitTest {
 
    @Autowired
    private SampleService sampleService;
 
 
    @Test
    public void testSampleService() {
        assertEquals("class com.client.SampleService",this.sampleService.getClass().toString());
    }
 
    @Test
    public void testSampleAdd() {
      
    	 assertEquals(15,SampleService.add(2,3));
    }
 
    
    
}
