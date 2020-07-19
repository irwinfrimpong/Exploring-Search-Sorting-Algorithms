
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestSC.
 *
 * @author  (Irwin Frimpong)
 * @version (9/15/18)
 */
public class TestSC
{
    /**
     * Default constructor for test class TestSC
     */
    public TestSC()
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

    // Testing the add to End Method
    @Test
    public void testaddToEndNormal() { 
        // Create an instance of String Container 
        StringContainer sc= new StringContainer(); 
        // Adding the set of strings to the arraylist 
        sc.addToEnd("Manny"); 
        sc.addToEnd("Lily"); 
        sc.addToEnd("Berry"); 
        sc.addToEnd("Thomas");
        sc.addToEnd("Collins");

        String[] theAns = sc.returnArray(); 
        String[] trueAns= new String [] { "Manny", "Lily" , "Berry" , "Thomas" , "Collins" }; 

        // Testing for equality between the two arrays
        assertArrayEquals(theAns, trueAns);

    }

    // @Test
    // public void testaddToEndIBC() { 
    // // Create an instance of String Container 
    // StringContainer sc= new StringContainer(); 
    // // Adding the set of strings to the arraylist
    // sc.addToEnd(4); // Incompatible type error  
    // sc.addToEnd(7); // Incompatible type error
    // }

    // Testing the insertion sort method 
    @Test
    public void testInsertionSortNormal() { 
        // Create an instance of String Container 
        StringContainer sc= new StringContainer(); 
        // Adding the set of strings to the arraylist 
        sc.addToEnd("Manny"); 
        sc.addToEnd("Lily"); 
        sc.addToEnd("Daddy"); 
        sc.addToEnd("Thomas");
        sc.addToEnd("Gollins");

        // Call the insertionSort 
        sc.insertionSort(); 

        String[] theAns = sc.returnArray(); 
        String[] trueAns= new String [] { "Daddy", "Gollins" , "Lily" , "Manny" , "Thomas" };

        // Testing for equality between the two arrays
        assertArrayEquals(theAns, trueAns);   

    }    

    @Test
    public void testInsertionSortBC1() { 
        // Create an instance of String Container 
        StringContainer sc= new StringContainer(); 
        // Adding the set of strings to the arraylist 
        sc.addToEnd("Manny"); 
        sc.addToEnd("Lily"); 
        sc.addToEnd("Daddy"); 
        sc.addToEnd("Thomas");
        sc.addToEnd("Gollins");

        // Boundary Condition 1: Add to the very beginning of the array 
        sc.addToEnd("Ape");

        // Call the insertionSort 
        sc.insertionSort(); 

        String[] theAns = sc.returnArray(); 
        String[] trueAns= new String [] { "Ape","Daddy", "Gollins" , "Lily" , "Manny" , "Thomas" };

        // Testing for equality between the two arrays
        assertArrayEquals(theAns, trueAns);   

    } 

    @Test
    public void testInsertionSortBC2() { 
        // Create an instance of String Container 
        StringContainer sc= new StringContainer(); 
        // Adding the set of strings to the arraylist 
        sc.addToEnd("Manny"); 
        sc.addToEnd("Lily"); 
        sc.addToEnd("Daddy"); 
        sc.addToEnd("Thomas");
        sc.addToEnd("Gollins");

        // Boundary Condition 2: Add to the middle of the array
        sc.addToEnd("Henry");

        // Call the insertionSort 
        sc.insertionSort(); 

        String[] theAns = sc.returnArray(); 
        String[] trueAns= new String [] {"Daddy", "Gollins" ,"Henry", "Lily" , "Manny" , "Thomas" };

        // Testing for equality between the two arrays
        assertArrayEquals(theAns, trueAns);   

    } 

    @Test
    public void testInsertionSortBC3() { 
        // Create an instance of String Container 
        StringContainer sc= new StringContainer(); 
        // Adding the set of strings to the arraylist 
        sc.addToEnd("Manny"); 
        sc.addToEnd("Lily"); 
        sc.addToEnd("Daddy"); 
        sc.addToEnd("Thomas");
        sc.addToEnd("Gollins");

        // Boundary Condition 3: Add to the end of the array
        sc.addToEnd("Zane"); 
        
        sc.insertionSort(); 

        String[] theAns = sc.returnArray(); 
        String[] trueAns= new String [] {"Daddy", "Gollins" ,"Henry", "Lily" , "Manny" , "Thomas","Zane"};

    }
    
    // @Test
    // public void testInsertionSortIBC() { 
        // // Create an instance of String Container 
        // StringContainer sc= new StringContainer(); 
        // // Adding the set of strings to the arraylist 
        // sc.addToEnd("Manny"); 
        // sc.addToEnd("Lily"); 
        // sc.addToEnd("Daddy"); 
        // sc.addToEnd("Thomas");
        // sc.addToEnd("Gollins");

        // // Boundary Condition 4: Add to the end of the array
        // sc.addToEnd(4); 

        // String[] theAns = sc.returnArray(); 
        // String[] trueAns= new String [] {"Daddy", "Gollins" ,"Henry", "Lily" , "Manny" , "Thomas","Zane"};

    // }
    
    // Testing the Bubble Sort method 
    @Test
    public void testbubbleSortNormal() { 
        // Create an instance of String Container 
        StringContainer sc= new StringContainer(); 
        // Adding the set of strings to the arraylist 
        sc.addToEnd("Manny"); 
        sc.addToEnd("Lily"); 
        sc.addToEnd("Daddy"); 
        sc.addToEnd("Thomas");
        sc.addToEnd("Gollins");

        // Call the bubbleSort 
        sc.bubbleSort(); 

        String[] theAns = sc.returnArray(); 
        String[] trueAns= new String [] { "Daddy", "Gollins" , "Lily" , "Manny" , "Thomas" };

        // Testing for equality between the two arrays
        assertArrayEquals(theAns, trueAns);   

    }    

    @Test
    public void testbubbleSortBC1() { 
        // Create an instance of String Container 
        StringContainer sc= new StringContainer(); 
        // Adding the set of strings to the arraylist 
        sc.addToEnd("Manny"); 
        sc.addToEnd("Lily"); 
        sc.addToEnd("Daddy"); 
        sc.addToEnd("Thomas");
        sc.addToEnd("Gollins");

        // Boundary Condition 1: Add to the very beginning of the array 
        sc.addToEnd("Ape");

        // Call the bubbleSort 
        sc.bubbleSort(); 

        String[] theAns = sc.returnArray(); 
        String[] trueAns= new String [] { "Ape","Daddy", "Gollins" , "Lily" , "Manny" , "Thomas" };

        // Testing for equality between the two arrays
        assertArrayEquals(theAns, trueAns);   

    } 

    @Test
    public void testbubbleSortBC2() { 
        // Create an instance of String Container 
        StringContainer sc= new StringContainer(); 
        // Adding the set of strings to the arraylist 
        sc.addToEnd("Manny"); 
        sc.addToEnd("Lily"); 
        sc.addToEnd("Daddy"); 
        sc.addToEnd("Thomas");
        sc.addToEnd("Gollins");

        // Boundary Condition 2: Add to the middle of the array
        sc.addToEnd("Henry");

        // Call the bubbleSort 
        sc.bubbleSort(); 

        String[] theAns = sc.returnArray(); 
        String[] trueAns= new String [] {"Daddy", "Gollins" ,"Henry", "Lily" , "Manny" , "Thomas" };

        // Testing for equality between the two arrays
        assertArrayEquals(theAns, trueAns);   

    } 

    @Test
    public void testbubbleSortBC3() { 
        // Create an instance of String Container 
        StringContainer sc= new StringContainer(); 
        // Adding the set of strings to the arraylist 
        sc.addToEnd("Manny"); 
        sc.addToEnd("Lily"); 
        sc.addToEnd("Daddy"); 
        sc.addToEnd("Thomas");
        sc.addToEnd("Gollins");

        // Boundary Condition 3: Add to the end of the array
        sc.addToEnd("Zane"); 
        
        sc.bubbleSort(); 
              
        
        String[] theAns = sc.returnArray(); 
        String[] trueAns= new String [] {"Daddy", "Gollins","Lily" , "Manny" , "Thomas","Zane"};
        
        // Testing for equality between the two arrays
        assertArrayEquals(theAns, trueAns);   
    }
    
    // Testiing The Linear Search Method 
    
    @Test
    public void testLinearSearchNormal() { 
        // Create an instance of String Container 
        StringContainer sc= new StringContainer(); 
        // Adding the set of strings to the arraylist 
        sc.addToEnd("Manny"); 
        sc.addToEnd("Lily"); 
        sc.addToEnd("Daddy"); 
        sc.addToEnd("Thomas");
        sc.addToEnd("Gollins");
        sc.addToEnd("Adam");
        
        int the_idx = sc.linearSearch("Lily") ; 
        int tru_idx= 1; 
        
        assertEquals(the_idx,tru_idx); 
    }
    
    @Test
    public void testLinearSearchBC1() { 
        // Create an instance of String Container 
        StringContainer sc= new StringContainer(); 
        // Adding the set of strings to the arraylist 
        sc.addToEnd("Manny"); 
        sc.addToEnd("Lily"); 
        sc.addToEnd("Daddy"); 
        sc.addToEnd("Thomas");
        sc.addToEnd("Gollins");
        sc.addToEnd("Adam");
        
        int the_idx = sc.linearSearch("Manny") ; 
        int tru_idx= 0; 
        
        assertEquals(the_idx,tru_idx); 
    }
    
      @Test
    public void testLinearSearchBC2() { 
        // Create an instance of String Container 
        StringContainer sc= new StringContainer(); 
        // Adding the set of strings to the arraylist 
        sc.addToEnd("Manny"); 
        sc.addToEnd("Lily"); 
        sc.addToEnd("Daddy"); 
        sc.addToEnd("Thomas");
        sc.addToEnd("Gollins");
        sc.addToEnd("Adam");
        
        int the_idx = sc.linearSearch("Thomas") ; 
        int tru_idx= 3; 
        
        assertEquals(the_idx,tru_idx); 
    }
    
      @Test
    public void testLinearSearchBC3() { 
        // Create an instance of String Container 
        StringContainer sc= new StringContainer(); 
        // Adding the set of strings to the arraylist 
        sc.addToEnd("Manny"); 
        sc.addToEnd("Lily"); 
        sc.addToEnd("Daddy"); 
        sc.addToEnd("Thomas");
        sc.addToEnd("Gollins");
        sc.addToEnd("Adam");
        
        int the_idx = sc.linearSearch("Adam") ; 
        int tru_idx= 5; 
        
        assertEquals(the_idx,tru_idx); 
    }
    
    @Test
    public void testLinearSearchIBC() { 
        // Create an instance of String Container 
        StringContainer sc= new StringContainer(); 
        // Adding the set of strings to the arraylist 
        sc.addToEnd("Manny"); 
        sc.addToEnd("Lily"); 
        sc.addToEnd("Daddy"); 
        sc.addToEnd("Thomas");
        sc.addToEnd("Gollins");
        sc.addToEnd("Adam");
        
        int the_idx = sc.linearSearch("Ruth") ; 
        int tru_idx= -1; 
        
        assertEquals(the_idx,tru_idx); 
    }
    
    // Testiing The Binary Search Method 
    
    @Test
    public void testBinarySearchNormal() { 
        // Create an instance of String Container 
        StringContainer sc= new StringContainer(); 
        // Adding the set of strings to the arraylist 
        sc.addToEnd("Manny"); 
        sc.addToEnd("Lily"); 
        sc.addToEnd("Daddy"); 
        sc.addToEnd("Thomas");
        sc.addToEnd("Gollins");
        sc.addToEnd("Adam");
        
        // Binary Search works on a sorted array list
         sc.insertionSort(); 
        int the_mid = sc.binarySearch("Daddy") ; 
        int tru_mid= 1; 
        
        assertEquals(the_mid,tru_mid); 
    }
    
    @Test
    public void testBinarySearchBC1() { 
        // Create an instance of String Container 
        StringContainer sc= new StringContainer(); 
        // Adding the set of strings to the arraylist 
        sc.addToEnd("Manny"); 
        sc.addToEnd("Lily"); 
        sc.addToEnd("Daddy"); 
        sc.addToEnd("Thomas");
        sc.addToEnd("Gollins");
        sc.addToEnd("Adam");
        
        // Binary Search works on a sorted array list
         sc.insertionSort(); 
        
        int the_mid = sc.binarySearch("Adam") ; 
        int tru_mid= 0; 
        
        assertEquals(the_mid,tru_mid); 
    }
    
    @Test
    public void testBinarySearchBC2() { 
        // Create an instance of String Container 
        StringContainer sc= new StringContainer(); 
        // Adding the set of strings to the arraylist 
        sc.addToEnd("Manny"); 
        sc.addToEnd("Lily"); 
        sc.addToEnd("Daddy"); 
        sc.addToEnd("Thomas");
        sc.addToEnd("Gollins");
        sc.addToEnd("Adam");
        
        // Binary Search works on a sorted array list
         sc.insertionSort(); 
        int the_mid = sc.binarySearch("Lily") ; 
        int tru_mid= 3; 
        
        assertEquals(the_mid,tru_mid); 
    }
    
    @Test
    public void testBinarySearchBC3() { 
        // Create an instance of String Container 
        StringContainer sc= new StringContainer(); 
        // Adding the set of strings to the arraylist 
        sc.addToEnd("Manny"); 
        sc.addToEnd("Lily"); 
        sc.addToEnd("Daddy"); 
        sc.addToEnd("Thomas");
        sc.addToEnd("Gollins");
        sc.addToEnd("Adam");
        
        // Binary Search works on a sorted array list
         sc.insertionSort(); 
        
        int the_mid = sc.binarySearch("Thomas") ; 
        int tru_mid= 5; 
        
        assertEquals(the_mid,tru_mid); 
    }
    
    @Test
    public void testBinarySearchIBC() { 
        // Create an instance of String Container 
        StringContainer sc= new StringContainer(); 
        // Adding the set of strings to the arraylist 
        sc.addToEnd("Manny"); 
        sc.addToEnd("Lily"); 
        sc.addToEnd("Daddy"); 
        sc.addToEnd("Thomas");
        sc.addToEnd("Gollins");
        sc.addToEnd("Adam");
        
        int the_mid = sc.binarySearch("Terry") ; 
        int tru_mid= -1; 
        
        assertEquals(the_mid,tru_mid); 
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
