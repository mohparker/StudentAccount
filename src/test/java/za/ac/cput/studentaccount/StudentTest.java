/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.studentaccount;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 27630
 */
public class StudentTest
{
     private Student student;
     private StudentTest studentaccount1;
     private StudentTest studentaccount2;
     private StudentTest studentaccount3;
    
    
    @BeforeClass
    public static void setUpClass() throws Exception
    {
        
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
  
    @Before
    public void setUp()
    {
        studentaccount1 = new StudentTest();
        studentaccount2 = new StudentTest();
        studentaccount3 = studentaccount1;
    }

    @After
    public void tearDown() throws Exception
    {
        
    }
        @Test
        public void testEquality (){ //Testing for equality between two instances
            assertEquals(studentaccount1, studentaccount3);
   
        }
        
         @Test
        public void testIdentity (){ //Testing for object identity between two instances
          assertSame(studentaccount1, studentaccount3);
            
        }
       
         @Test(enabled = false)
          public void testDisplayStudentName1() { //This method if the method going tpo fail or not when entering the wrong string name
            this.student = new Student();
            
            String studentName = student.displayStudentName1("Chuma", "Nxazonke");
            assertEquals("ChumaNxazonke", studentName);
  
        }
        
        @Test(timeout = 300)
	        public void testwithTmeout() throws InterruptedException { //This method will pass if the execution of the test method finishes within the time-out 300
		    Thread.sleep(200);
		    System.out.println("Timeout method executed");
	}
     
    /**
     * Test of getName method, of class Student.
     */
    @Test
   @Ignore
    public void testGetName() {
        System.out.println("getName");
        student.setName("Chuma");
        String expResult = "";
        String result = student.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setName method, of class Student.
     */
    @Test
    @Ignore
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Student instance = new Student();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSurname method, of class Student.
     */
    @Test
    @Ignore
    public void testGetSurname() {
        System.out.println("getSurname");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getSurname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSurname method, of class Student.
     */
    @Test
    @Ignore
    public void testSetSurname() {
        System.out.println("setSurname");
        String surname = "";
        Student instance = new Student();
        instance.setSurname(surname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDepartment method, of class Student.
     */
    @Test
    @Ignore
    public void testGetDepartment() {
        System.out.println("getDepartment");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getDepartment();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDepartment method, of class Student.
     */
    @Test
    @Ignore
    public void testSetDepartment() {
        System.out.println("setDepartment");
        String department = "";
        Student instance = new Student();
        instance.setDepartment(department);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Student.
     */
    @Test
    @Ignore
    public void testToString() {
        System.out.println("toString");
        Student instance = new Student();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayStudentName method, of class Student.
     */
    @Test
    @Ignore
    public void testDisplayStudentName() {
        System.out.println("displayStudentName");
        String a = "";
        String b = "";
        Student instance = new Student();
        String expResult = "";
        String result = instance.displayStudentName1(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
    }  
    
}
