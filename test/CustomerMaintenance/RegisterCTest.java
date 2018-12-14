/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerMaintenance;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class RegisterCTest {
    
    RegisterC rc;
    
    public RegisterCTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        rc = new RegisterC("AAA", "980314-01-1111", 01234567, "NONE", "18 Jalan Kilang", "AAA@gmail,com", "Male", "Consumer");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCustomerList method, of class RegisterC.
     */
    @Test
    public void testGetCustomerList() {
        System.out.println("getCustomerList");
        RegisterC instance = new RegisterC();
        List<RegisterC> expResult = null;
        List<RegisterC> result = instance.getCustomerList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomerList method, of class RegisterC.
     *///
    @Test
    public void testSetCustomerList() {
        System.out.println("setCustomerList");
        List<RegisterC> customerList = null;
        RegisterC instance = new RegisterC();
        instance.setCustomerList(customerList);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNextID method, of class RegisterC.
     */
    @Test
    public void testGetNextID() {
        System.out.println("getNextID");
        int expResult = 0;
        int result = RegisterC.getNextID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNextID method, of class RegisterC.
     */
    @Test
    public void testSetNextID() {
        System.out.println("setNextID");
        int nextID = 0;
        RegisterC.setNextID(nextID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class RegisterC.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        RegisterC instance = new RegisterC();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class RegisterC.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        RegisterC instance = new RegisterC();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class RegisterC.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        RegisterC instance = new RegisterC();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class RegisterC.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        RegisterC instance = new RegisterC();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getIc method, of class RegisterC.
     */
    @Test
    public void testGetIc() {
        System.out.println("getIc");
        RegisterC instance = new RegisterC();
        String expResult = "";
        String result = instance.getIc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIc method, of class RegisterC.
     */
    @Test
    public void testSetIc() {
        System.out.println("setIc");
        String ic = "";
        RegisterC instance = new RegisterC();
        instance.setIc(ic);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContactNumber method, of class RegisterC.
     */
    @Test
    public void testGetContactNumber() {
        System.out.println("getContactNumber");
        RegisterC instance = new RegisterC();
        int expResult = 0;
        int result = instance.getContactNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContactNumber method, of class RegisterC.
     */
    @Test
    public void testSetContactNumber() {
        System.out.println("setContactNumber");
        int contactNumber = 0;
        RegisterC instance = new RegisterC();
        instance.setContactNumber(contactNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompanyName method, of class RegisterC.
     */
    @Test
    public void testGetCompanyName() {
        System.out.println("getCompanyName");
        RegisterC instance = new RegisterC();
        String expResult = "";
        String result = instance.getCompanyName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCompanyName method, of class RegisterC.
     */
    @Test
    public void testSetCompanyName() {
        System.out.println("setCompanyName");
        String companyName = "";
        RegisterC instance = new RegisterC();
        instance.setCompanyName(companyName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmailAddress method, of class RegisterC.
     */
    @Test
    public void testGetEmailAddress() {
        System.out.println("getEmailAddress");
        RegisterC instance = new RegisterC();
        String expResult = "";
        String result = instance.getEmailAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmailAddress method, of class RegisterC.
     */
    @Test
    public void testSetEmailAddress() {
        System.out.println("setEmailAddress");
        String emailAddress = "";
        RegisterC instance = new RegisterC();
        instance.setEmailAddress(emailAddress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMailingAddress method, of class RegisterC.
     */
    @Test
    public void testGetMailingAddress() {
        System.out.println("getMailingAddress");
        RegisterC instance = new RegisterC();
        String expResult = "";
        String result = instance.getMailingAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMailingAddress method, of class RegisterC.
     */
    @Test
    public void testSetMailingAddress() {
        System.out.println("setMailingAddress");
        String mailingAddress = "";
        RegisterC instance = new RegisterC();
        instance.setMailingAddress(mailingAddress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGender method, of class RegisterC.
     */
    @Test
    public void testGetGender() {
        System.out.println("getGender");
        RegisterC instance = new RegisterC();
        String expResult = "";
        String result = instance.getGender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGender method, of class RegisterC.
     */
    @Test
    public void testSetGender() {
        System.out.println("setGender");
        String gender = "";
        RegisterC instance = new RegisterC();
        instance.setGender(gender);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class RegisterC.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        RegisterC instance = new RegisterC();
        String expResult = "";
        String result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class RegisterC.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = "";
        RegisterC instance = new RegisterC();
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class RegisterC.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        RegisterC instance = new RegisterC();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class RegisterC.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        RegisterC instance = new RegisterC();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class RegisterC.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        RegisterC instance = new RegisterC();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
