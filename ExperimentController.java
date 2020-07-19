
/**
 * Write a description of class ExperimentController here.
 *
 * @author (Irwin Frimpong )
 * @version (9/14/18)
 */

import java.util.*; 
import java.util.Scanner ; 
import java.io.PrintWriter;
import java.io.File; 

public class ExperimentController
{
    // instance variables - replace the example below with your own
    private int seed; 
    private int numofi; 

    /**
     * Constructor for objects of class ExperimentController
     */
    public ExperimentController()
    {
        // initialise instance variables
        seed= 500; 
        numofi= 7; 
    }

    public static void main (String[] args) { 
        ExperimentController test = new ExperimentController() ; 
        test.run(); 
    } 

    public void run() { 
        try { 
            // Creating a new instance of Scanner 
            Scanner reader= new Scanner(System.in); 

            // Declaring Variables that will used in commnadline arguements
            String outputname= null; 
            int numofexp = 5; 
            int amount_numofi = 3 ; // This varialble will store the amount of 'numofitems' a user would like to enter

            // Array would hold the actual numerical value of items wanting to be 
            int [] items = new int[amount_numofi]; 

            System.out.print("Enter the name of your outpit file. Be sure to put .csv at the end") ; 
            outputname = reader.next(); // Reads users input
            System.out.print( "\n Your output file name is: " + outputname ); 

            // Populating the items array with the numerical values of numberofitems used in the experimentation 
            System.out.print( "\n Enter your first number of items: " ); 
            items[0] = reader.nextInt();

            System.out.print( "\n Enter your second number of items: " ); 
            items[1] = reader.nextInt();

            System.out.print( "\n Enter your third number of items: " ); 
            items[2] = reader.nextInt();

            System.out.print("\n The number of items you entered are: " + items[0] + " " + items[1] + " " + items[2] );
            System.out.print("\n Please standby. Your Output file is being created" ); 

            //Set up writing to file 
            File file = new File(outputname); // File name should be passed from command line 
            PrintWriter printWriter = new PrintWriter(file); 

            for( int i=0; i < amount_numofi; i++) { 
                for ( int j=0; j<numofexp; j++) { 

                    long t1= timeToInsertionSortUnsorted(items[i],seed);
                    long t2= timeToInsertionSortSorted(items[i], seed);
                    long t3= timeToBubbleSortUnsorted (items[i], seed);
                    long t4= timeToBubbleSortSorted (items[i], seed);
                    long t5= timeToLinearSearchFound (items[i], seed);
                    long t6= timeToLinearSearchNotFound (items[i], seed);
                    long t7= timeToBinarySearchFound (items[i], seed);
                    long t8= timeToBinarySearchNotFound(items[i], seed); 

                    printWriter.println( items[i] + ","+ t1 + "," + t2 + "," + t3 + "," + t4 + "," + t5 + "," + t6 + "," + t7 + "," + t8 ) ; 

                }
            } 
            // Closing the Print Writer 
            printWriter.close();
        }
        catch (Exception e) {
            System.out.println ("Exception occured " + e);

        }
    }
    // }

    /**
     * timeToInsertionSortUnsorted used to calculate time to perform an insertion sort 
     * of an unsorted array list 
     *
     * @param numofi @param seed
     * @return time
     */
    public long timeToInsertionSortUnsorted(int numofi, int seed)
    {
        // Creating an instance of String Container 
        StringContainer demo = new StringContainer();

        // Create an instacne of Random String Class Generator 
        RandomStringGenerator exp1 = new RandomStringGenerator(seed,10); 

        for( int i=0; i<numofi; i++) { 
            demo.addToEnd(exp1.nextString());

            //System.out.println( "Word at index: "+ demo.arr.get(i) ) ; 
        } 
        long t0 = System.currentTimeMillis(); 
        demo.insertionSort(); 
        //System.out.println( "Word at index: "+ demo.arr ) ;
        long t1 = System.currentTimeMillis();

        //Return the time it took for this to take place 
        return t1-t0; 
    } 

    /**
     * timeToInsertionSortSorted used to calculate time to perform an insertion sort 
     * of a sorted array list 
     *
     * @param numofi @param seed
     * @return time
     */
    public long timeToInsertionSortSorted(int numofi, int seed)
    {
        // Creating an instance of String Container
        StringContainer demo = new StringContainer();

        // Create an instacne of Random String Class Generator 
        RandomStringGenerator exp1 = new RandomStringGenerator(seed,10); 

        for( int i=0; i<numofi; i++) { 
            demo.addToEnd(exp1.nextString());
        } 
        // Perform an insertion sort 
        demo.insertionSort();

        long t0= System.currentTimeMillis();
        demo.insertionSort(); 
        long t1= System.currentTimeMillis();

        return t1-t0;         
    }

    /**
     * timeToBubbleSortUnsorted used to calculate time to perform a bubble sort 
     * of an unsorted array list 
     *
     * @param numofi @param seed
     * @return time
     */
    public long timeToBubbleSortUnsorted (int numofi, int seed)
    {
        // Creating an instance of String Container 
        StringContainer demo = new StringContainer();

        // Create an instacne of Random String Class Generator 
        RandomStringGenerator exp1 = new RandomStringGenerator(seed,10); 

        for( int i=0; i<numofi; i++) { 
            demo.addToEnd(exp1.nextString());

            //System.out.println( "Word at index: "+ demo.get(i) ) ; 
        } 
        long t0 = System.currentTimeMillis(); 
        demo.bubbleSort(); 
        long t1 = System.currentTimeMillis();

        //Return the time it took for this to take place 
        return t1-t0; 
    }

    /**
     * timeToBubbleSortSorted used to calculate time to perform a bubble sort 
     * of a sorted array list 
     *
     * @param numofi @param seed
     * @return time
     */
    public long timeToBubbleSortSorted (int numofi, int seed)
    {
        // Creating an instance of String Container
        StringContainer demo = new StringContainer();

        // Create an instacne of Random String Class Generator 
        RandomStringGenerator exp1 = new RandomStringGenerator(seed,10); 

        for( int i=0; i<numofi; i++) { 
            demo.addToEnd(exp1.nextString());
        } 
        // Perform an insertion sort 
        demo.insertionSort();

        long t0= System.currentTimeMillis();
        demo.bubbleSort(); 
        long t1= System.currentTimeMillis();

        return t1-t0;
    }

    // Time to Linear Search Found 
    /**
     * timeToLinearSearchFound used to calculate time to perform a linear search
     * of anarray list 
     *
     * @param numofi @param seed
     * @return time
     */
    public long timeToLinearSearchFound (int numofi, int seed)
    {
        // Creating an instance of String Container
        StringContainer demo = new StringContainer();

        // Create an instacne of Random String Class Generator 
        RandomStringGenerator exp1 = new RandomStringGenerator(seed,10); 
        // Query Size
        int q = (int)(numofi*0.03)  ;

        for( int i=0; i<numofi; i++) { 
            demo.addToEnd(exp1.nextString());
        } 

        
        long t0= System.currentTimeMillis();
        for( int j=0; j< q; j++) { 
            int inbounds= exp1.random.nextInt(numofi)+1;
            demo.linearSearch(demo.arr.get(inbounds)); // Giving linear search a string that is alreay present in the randomly generated array list of strings
            //System.out.println(" Word: " + demo.arr.get(inbounds)); 
        } 
        long t1 = System.currentTimeMillis();

        return t1 -t0; 
    }

    /**
     * timeToLinearSearchFound used to calculate time to perform a linear search
     * of anarray list with a word not in the array list
     *
     * @param numofi @param seed
     * @return time
     */
    public long timeToLinearSearchNotFound (int numofi, int seed)
    {
        // Creating an instance of String Container
        StringContainer demo = new StringContainer();

        // Create an instacne of Random String Class Generator 
        RandomStringGenerator exp1 = new RandomStringGenerator(seed,10); 
        // Query Size
        int q = (int)(numofi*0.03) ;

        for( int i=0; i<numofi; i++) { 
            demo.addToEnd(exp1.nextString());
        } 

        long t0= System.currentTimeMillis();
        for( int j=0; j< q; j++) { 
            demo.linearSearch(exp1.nextString());
            //System.out.println(" Word: " + exp1.nextString() + demo.arr ); 
        } 
        long t1 = System.currentTimeMillis();

        return t1-t0; 
    }

    /**
     * timeToBinarySearchFound used to calculate time to perform a binary search
     * of an array list 
     *
     * @param numofi @param seed
     * @return time
     */
    public long timeToBinarySearchFound (int numofi, int seed)
    {
        // Creating an instance of String Container
        StringContainer demo = new StringContainer();

        // Create an instacne of Random String Class Generator 
        RandomStringGenerator exp1 = new RandomStringGenerator(seed,10); 
        // Query Size
        int q = (int)(numofi*0.03) ;

        for( int i=0; i<numofi; i++) { 
            demo.addToEnd(exp1.nextString());
        } 
        demo.insertionSort(); 
        long t0= System.currentTimeMillis();
        for( int j=0; j< q; j++) { 
            int inbounds= exp1.random.nextInt(numofi)+1;
            demo.binarySearch(demo.arr.get(inbounds));
            //System.out.println(" Word: " + exp1.nextString() + demo.arr ); 
        } 

        long t1 = System.currentTimeMillis();
        return t1-t0; 
    }

    /**
     * timeToLinearSearchFound used to calculate time to perform a binary search
     * of an array list with a word not in the arraylist
     *
     * @param numofi @param seed
     * @return time
     */
    public long timeToBinarySearchNotFound (int numofi, int seed)
    {
        // Creating an instance of String Container
        StringContainer demo = new StringContainer();

        // Create an instacne of Random String Class Generator 
        RandomStringGenerator exp1 = new RandomStringGenerator(seed,10); 
        // Query Size
        int q = (int)(numofi*0.03) ;

        for( int i=0; i<numofi; i++) { 
            demo.addToEnd(exp1.nextString());
        } 
        demo.insertionSort(); 
        long t0= System.currentTimeMillis();
        for( int j=0; j< q; j++) { 
            demo.binarySearch(exp1.nextString());
            //System.out.println(" Word: " + exp1.nextString()); 
        } 
        long t1 = System.currentTimeMillis();

        return t1 -t0; 

    }

} 

