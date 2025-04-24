/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package part_1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RC_Student_lab
 */
public class RegistrationTest {
    
    public RegistrationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Registration.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Registration.main(args);

    }

    /**
     * Test of storeLoginCredentials method, of class Registration.
     */
    @Test
    public void testStoreLoginCredentials() {
        System.out.println("storeLoginCredentials");
        String username = "";
        String password = "";
        Registration instance = new Registration();
      

    }

    /**
     * Test of checkLoginCredentials method, of class Registration.
     */
    @Test
    public void testCheckLoginCredentials() {
        System.out.println("checkLoginCredentials");
        String username = "";
        String password = "";
        Registration instance = new Registration();
        boolean expResult = true;
        boolean result = instance.checkLoginCredentials(username, password);

    }
    @Test 
    public void testCheckUserName(){
        System.out.println("checkUserName");
        String username = "Kyl_";
        boolean expResult = true;

    }
}
