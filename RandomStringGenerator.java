
/**
 * RandomStringGenerator generates random strings of fixed length
 *
 * @author (Irwin )
 * @version (9/12/18)
 */
import java.util.*;

public class RandomStringGenerator
{
    // instance variables - replace the example below with your own
    private int seed; 
    private int length; 
    String s ;// Globalize the string value of chars
    Random random;

    /**
     * Constructor for objects of class RandomStringGenerator
     */
    public RandomStringGenerator(int seed, int length)
    {
        this.seed= seed; // Seed passed into constructor is set the private globally defined seed outside the constructor
        this.length = length; // Length pased into constructor is set the private globally defined length outside the constructor;
        random= new Random(seed); 
    }

    public static void main(String [] args) { 
        RandomStringGenerator test= new RandomStringGenerator(2000,6); // Insert your seed and num of values here 
        test.run(); 
    }

    public void run(){ 
        nextString(); 
        System.out.println("The Word of the String is: " + s ); 

    } 

    /**
     * nextString() returns a random string with the correct 
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String nextString()
    {

        // Creating the array that will hold the random integer values 
        char [] c= new char [length] ; 
        int min = 97 ; 
        int max = 122; 

        //int counter= 0 ; // Use to keep track of whether or not the entire array is filles up with only lowercase random characters 

        // Popoulating the array with random integers
        //for(int i=0; counter < length-1 ; i++) { 
        //int val = random.nextInt(seed); 
        // If statement to check if the value generated is between 97 & 122 
        // (ASCII corresponding to lowercase a -z ) 
        //if ((val >= 97) && (val <= 122)) {
        //  c[counter]= (char)val; // We convert the interger value to a char
        // counter++;
        // System.out.println("Counter: " + counter + " " + c[counter] + " " + val );
        // } 
        
        // More efficient way of getting random ints between the range 
        for (int i=0; i < length; i++) { 
            int val = random.nextInt(((max-min)+1))+ min; 
            //System.out.println("val: " + val ); 
            c[i] = (char)val; 
        }

        // Converting the character array to a String 
        s  = new String(c);
        return s;

    } 

}
