package com.sgw.test;
import static org.junit.Assert.*;
import org.junit.Test;
import com.sgw.java.MessageUtil;

public class TestMessageUtil {
	 String message = "Robert";   
     MessageUtil messageUtil = new MessageUtil(message);

     @Test
     public void testPrintMessage() { 
        System.out.println("Inside testPrintMessage()");     
        assertTrue(message.equals(messageUtil.printMessage()));
     }

     @Test
     public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Robert";
        assertTrue(message.equals(messageUtil.salutationMessage()));
     }
}
