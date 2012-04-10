/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softserve.commandoperator;

import com.softserve.server.AbstractSocketThread;
import junit.framework.TestCase;

/**
 *
 * @author Nubaseg
 */
public class GameCommandOperatorTest extends TestCase {
    
    public GameCommandOperatorTest(String testName) {
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
     * Test of operate method, of class GameCommandOperator.
     */
    public void testOperate() {
        System.out.println("operate");
        AbstractSocketThread thread = null;
        GameCommandOperator instance = null;
        instance.operate(thread);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
