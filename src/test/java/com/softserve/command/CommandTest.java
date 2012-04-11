/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.command;

import junit.framework.TestCase;

/**
 *
 * @author Nubaseg
 */
public class CommandTest extends TestCase {
    
    public CommandTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of getStringData method, of class Command.
     */
    public void testGetStringData() {
        System.out.println("getStringData");
        Command instance = null;
        String expResult = "";
        String result = instance.getStringData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deserialize method, of class Command.
     */
    public void testDeserialize() {
        System.out.println("deserialize");
        String s = "";
        Command expResult = null;
        Command result = Command.deserialize(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of serialize method, of class Command.
     */
    public void testSerialize() {
        System.out.println("serialize");
        Command instance = null;
        String expResult = "";
        String result = instance.serialize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class Command.
     */
    public void testGetType() {
        System.out.println("getType");
        Command instance = null;
        int expResult = 0;
        int result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
