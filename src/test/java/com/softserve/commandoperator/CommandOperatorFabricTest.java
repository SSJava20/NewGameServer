/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.commandoperator;

import junit.framework.TestCase;

/**
 *
 * @author Nubaseg
 */
public class CommandOperatorFabricTest extends TestCase {
    
    public CommandOperatorFabricTest(String testName) {
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
     * Test of getInstance method, of class CommandOperatorFabric.
     */
    public void testGetInstance() {
        System.out.println("getInstance");
        String command = "";
        CommandOperator expResult = null;
        CommandOperator result = CommandOperatorFabric.getInstance(command);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
