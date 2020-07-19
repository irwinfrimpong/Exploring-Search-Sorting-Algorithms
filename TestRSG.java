

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestRSG.
 *
 * @author  (Irwin Frimpong )
 * @version (a version number or a date)
 */
public class TestRSG
{
    /**
     * Default constructor for test class TestRSG
     */
    public TestRSG()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }
    
    // Testing the Random String Generator 
    @Test
    public void testRandomStringGenerator() { 
        int length = 6;
        int seed= 100; 
        // Create an instance of Random String Geneator 
        RandomStringGenerator rsc = new RandomStringGenerator(seed, length); 
        //Generates strings
              
        String test = rsc.nextString(); 
        //We want to test whether the length of string we specified is actually carried out 
        
        int the_length= test.length() ; 
        int tru_length = length; 
        
        // Testing for equality between the two arrays
        assertEquals(the_length, tru_length);   
        
    }
    
    @Test
    public void testRandomStringGeneratorBC() { 
        int length = 0;
        int seed= 100; 
        // Create an instance of Random String Geneator 
        RandomStringGenerator rsc = new RandomStringGenerator(seed, length); 
        //Generates strings
              
        String test = rsc.nextString(); 
        //We want to test whether the length of string we specified is actually carried out 
        
        int the_length= test.length() ; 
        int tru_length = length; 
        
        // Testing for equality between the two arrays
        assertEquals(the_length, tru_length);   
        
    }
    
    @Test
    public void testRandomStringGeneratorIBC() { 
        int length = -2;
        int seed= 100; 
        // Create an instance of Random String Geneator 
        RandomStringGenerator rsc = new RandomStringGenerator(seed, length); 
        //Generates strings
              
        String test = rsc.nextString(); 
        //We want to test whether the length of string we specified is actually carried out 
        
        int the_length= test.length() ; 
        int tru_length = length; 
        
        // Testing for equality between the two arrays
        assertEquals(the_length, tru_length);   
        
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
