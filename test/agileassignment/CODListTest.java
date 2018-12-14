/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agileassignment;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JeffryWong
 */
public class CODListTest {

    CODList test;

    public CODListTest() {
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        test = new CODList("Consumer", "Desmond", "Sungai Way", "Cash", "Moon", "Roses", "Sun", "Mars", 1, 1, 1, 1, 15.00, 15.00, 14.00, 10.00, 54.00);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getCustType method, of class CODList.
     */
    @Test
    public void testGetCustType() {
        System.out.println("getCustType");
        CODList instance = new CODList();
        String expResult = "Consumer";
        String result = instance.getCustType();
        assertEquals(expResult, test.getCustType());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setCustType method, of class CODList.
     */
    @Test
    public void testSetCustType() {
        System.out.println("setCustType");
        test.setCustType("Consumer");
        assertEquals("Consumer", test.getCustType());
    }

    /**
     * Test of getName method, of class CODList.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        CODList instance = new CODList();
        String expResult = "Desmond";
        String result = instance.getName();
        assertEquals(expResult, test.getName());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setName method, of class CODList.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String Name = "Desmond";
        assertEquals("Desmond", test.getName());
    }

    /**
     * Test of getAddress method, of class CODList.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        CODList instance = new CODList();
        String expResult = "Sungai Way";
        String result = instance.getAddress();
        assertEquals(expResult, test.getAddress());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setAddress method, of class CODList.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String Address = "Sungai Way";
        assertEquals("Sungai Way", test.getAddress());
    }

    /**
     * Test of getPaymentMethod method, of class CODList.
     */
    @Test
    public void testGetPaymentMethod() {
        System.out.println("getPaymentMethod");
        CODList instance = new CODList();
        String expResult = "Cash";
        String result = instance.getPaymentMethod();
        assertEquals(expResult, test.getPaymentMethod());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPaymentMethod method, of class CODList.
     */
    @Test
    public void testSetPaymentMethod() {
        System.out.println("setPaymentMethod");
        String PaymentMethod = "Cash";
        assertEquals("Cash", test.getPaymentMethod());

    }

    /**
     * Test of getItemSelected1 method, of class CODList.
     */
    @Test
    public void testGetItemSelected1() {
        System.out.println("getItemSelected1");
        CODList instance = new CODList();
        String expResult = "Moon";
        String result = instance.getItemSelected1();
        assertEquals(expResult, test.getItemSelected1());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setItemSelected1 method, of class CODList.
     */
    @Test
    public void testSetItemSelected1() {
        System.out.println("setItemSelected1");
        String ItemSelected1 = "Moon";
        assertEquals("Moon", test.getItemSelected1());
    }

    /**
     * Test of getItemSelected2 method, of class CODList.
     */
    @Test
    public void testGetItemSelected2() {
        System.out.println("getItemSelected2");
        CODList instance = new CODList();
        String expResult = "Roses";
        String result = instance.getItemSelected2();
        assertEquals(expResult, test.getItemSelected2());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setItemSelected2 method, of class CODList.
     */
    @Test
    public void testSetItemSelected2() {
        System.out.println("setItemSelected2");
        String ItemSelected2 = "Roses";
        assertEquals("Roses", test.getItemSelected2());
    }

    /**
     * Test of getItemSelected3 method, of class CODList.
     */
    @Test
    public void testGetItemSelected3() {
        System.out.println("getItemSelected3");
        CODList instance = new CODList();
        String expResult = "Sun";
        String result = instance.getItemSelected3();
        assertEquals(expResult, test.getItemSelected3());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setItemSelected3 method, of class CODList.
     */
    @Test
    public void testSetItemSelected3() {
        System.out.println("setItemSelected3");
        String ItemSelected3 = "Sun";
        assertEquals("Sun", test.getItemSelected3());
    }

    /**
     * Test of getItemSelected4 method, of class CODList.
     */
    @Test
    public void testGetItemSelected4() {
        System.out.println("getItemSelected4");
        CODList instance = new CODList();
        String expResult = "Mars";
        String result = instance.getItemSelected4();
        assertEquals(expResult, test.getItemSelected4());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setItemSelected4 method, of class CODList.
     */
    @Test
    public void testSetItemSelected4() {
        System.out.println("setItemSelected4");
        String ItemSelected4 = "Mars";
        assertEquals("Mars", test.getItemSelected4());
    }

    /**
     * Test of getItemQuan1 method, of class CODList.
     */
    @Test
    public void testGetItemQuan1() {
        System.out.println("getItemQuan1");
        CODList instance = new CODList();
        int expResult = 1;
        int result = instance.getItemQuan1();
        assertEquals(expResult, test.getItemQuan1());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setItemQuan1 method, of class CODList.
     */
    @Test
    public void testSetItemQuan1() {
        System.out.println("setItemQuan1");
        int ItemQuan1 = 1;
        assertEquals(1, test.getItemQuan1());
    }

    /**
     * Test of getItemQuan2 method, of class CODList.
     */
    @Test
    public void testGetItemQuan2() {
        System.out.println("getItemQuan2");
        CODList instance = new CODList();
        int expResult = 1;
        int result = instance.getItemQuan2();
        assertEquals(expResult, test.getItemQuan2());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setItemQuan2 method, of class CODList.
     */
    @Test
    public void testSetItemQuan2() {
        System.out.println("setItemQuan2");
        int ItemQuan2 = 1;
        assertEquals(1, test.getItemQuan2());
    }

    /**
     * Test of getItemQuan3 method, of class CODList.
     */
    @Test
    public void testGetItemQuan3() {
        System.out.println("getItemQuan3");
        CODList instance = new CODList();
        int expResult = 1;
        int result = instance.getItemQuan3();
        assertEquals(expResult, test.getItemQuan3());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setItemQuan3 method, of class CODList.
     */
    @Test
    public void testSetItemQuan3() {
        System.out.println("setItemQuan3");
        int ItemQuan3 = 1;
        assertEquals(1, test.getItemQuan3());

    }

    /**
     * Test of getItemQuan4 method, of class CODList.
     */
    @Test
    public void testGetItemQuan4() {
        System.out.println("getItemQuan4");
        CODList instance = new CODList();
        int expResult = 1;
        int result = instance.getItemQuan4();
        assertEquals(expResult, test.getItemQuan4());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setItemQuan4 method, of class CODList.
     */
    @Test
    public void testSetItemQuan4() {
        System.out.println("setItemQuan4");
        int ItemQuan4 = 1;
        assertEquals(1, test.getItemQuan4());

    }

    /**
     * Test of getItemTPrice1 method, of class CODList.
     */
    @Test
    public void testGetItemTPrice1() {
        System.out.println("getItemTPrice1");
        CODList instance = new CODList();
        double expResult = 15.0;
        double result = instance.getItemTPrice1();
        assertEquals(expResult, test.getItemTPrice1(), 0.1);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setItemTPrice1 method, of class CODList.
     */
    @Test
    public void testSetItemTPrice1() {
        System.out.println("setItemTPrice1");
        test.setItemTPrice1(15.0);
        assertEquals(15.0, test.getItemTPrice1(), 0.1);
    }

    /**
     * Test of getItemTPrice2 method, of class CODList.
     */
    @Test
    public void testGetItemTPrice2() {
        System.out.println("getItemTPrice2");
        CODList instance = new CODList();
        double expResult = 15.0;
        double result = instance.getItemTPrice2();
        assertEquals(expResult, test.getItemTPrice2(), 0.1);
        // TODO review the generated test code and remove the default call to fail.
   
    }

    /**
     * Test of setItemTPrice2 method, of class CODList.
     */
    @Test
    public void testSetItemTPrice2() {
        System.out.println("setItemTPrice2");
        test.setItemTPrice2(15.0);
        assertEquals(15.0, test.getItemTPrice2(), 0.1);
    }

    /**
     * Test of getItemTPrice3 method, of class CODList.
     */
    @Test
    public void testGetItemTPrice3() {
        System.out.println("getItemTPrice3");
        CODList instance = new CODList();
        double expResult = 14.0;
        double result = instance.getItemTPrice3();
        assertEquals(expResult, test.getItemTPrice3(), 0.1);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setItemTPrice3 method, of class CODList.
     */
    @Test
    public void testSetItemTPrice3() {
        System.out.println("setItemTPrice3");
        test.setItemTPrice3(14.0);
        assertEquals(14.0, test.getItemTPrice3(), 0.1);
    }

    /**
     * Test of getItemTPrice4 method, of class CODList.
     */
    @Test
    public void testGetItemTPrice4() {
        System.out.println("getItemTPrice4");
        CODList instance = new CODList();
        double expResult = 10.0;
        double result = instance.getItemTPrice4();
        assertEquals(expResult, test.getItemTPrice4(), 0.1);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setItemTPrice4 method, of class CODList.
     */
    @Test
    public void testSetItemTPrice4() {
        System.out.println("setItemTPrice4");
        test.setItemTPrice4(10.0);
        assertEquals(10.0, test.getItemTPrice4(), 0.1);
    }

    /**
     * Test of getTotalPrice method, of class CODList.
     */
    @Test
    public void testGetTotalPrice() {
        System.out.println("getTotalPrice");
        CODList instance = new CODList();
        double expResult = 54.0;
        double result = instance.getTotalPrice();
        assertEquals(expResult, test.getTotalPrice(), 0.1);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setTotalPrice method, of class CODList.
     */
    @Test
    public void testSetTotalPrice() {
        System.out.println("setTotalPrice");
        test.setTotalPrice(54.0);
        assertEquals(54.0, test.getTotalPrice(), 0.1);
    }

}
