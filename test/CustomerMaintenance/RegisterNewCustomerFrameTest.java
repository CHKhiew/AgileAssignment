/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerMaintenance;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class RegisterNewCustomerFrameTest {
    
    public RegisterNewCustomerFrameTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of formatList method, of class RegisterNewCustomerFrame.
     */
    @Test
    public void testFormatList() {
        System.out.println("formatList");
        RegisterNewCustomerFrame instance = new RegisterNewCustomerFrame();
        String expResult = "";
        String result = instance.formatList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class RegisterNewCustomerFrame.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        RegisterNewCustomerFrame.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
