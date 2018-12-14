/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FloralArragment;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author This-PC
 */
public class BillTest {
    
    public BillTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of AddDataToTable method, of class Bill.
     */
    @Test
    public void testAddDataToTable() {
        System.out.println("123");
        System.out.println("AddDataToTable");
        Bill instance = new Bill();
        instance.AddDataToTable();
    }

    /**
     * Test of main method, of class Bill.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Bill.main(args);
    }
    
}
