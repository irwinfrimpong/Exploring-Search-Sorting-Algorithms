
/**
 * StringContainer class consists of two sorting methods (insertion and bubble
 * sort) as well as two search methods (linear and binary search)

 * @author (Irwin Frimpong)
 * @version (9/11/18)
 */

import java.util.* ;
public class StringContainer
{
    // instance variables - replace the example below with your own
    public ArrayList<String> arr;
    int index ; // Stores the index of the linear sort method 

    /**
     * Constructor for objects of class StringContainer
     */
    public StringContainer()
    {
        // Creating an empty array list
        arr= new ArrayList<String>(); 
    }

    public static void main(String[] args) { 
        StringContainer test = new StringContainer() ; 
        test.run(); 
    } 

    public void run() { 
        addToEnd("Irwin") ;
        addToEnd("Sage") ;
        addToEnd("Ben") ;
        addToEnd("Cathy") ;
        addToEnd("Abby") ;

        bubbleSort(); 

        System.out.println("Result of bubbleSort: " + arr);

        linearSearch("Luis") ;
        System.out.println("Index of Word: " + index ) ; 
//insertionSort(); 
        int i = binarySearch("Lauren"); 
        System.out.println("Index of Word: " + i) ; 

        
    } 

    /**
     * addToEnd method adds new string to the end of the array
     *
     * @param String x
     * @return    arr
     */
    public ArrayList addToEnd (String x)
    {
        arr.add(arr.size(),x); 
        return arr; 
    }

    /**
     * insertionSort method aplhabetically sorts the array of Strings
     *
     * @return    arr
     */
    public ArrayList insertionSort () { 
        for ( int p =1; p < arr.size(); p++) { 
            String temp= arr.get(p); 
            int j = p ; 

            for ( ; j>0 && temp.compareTo(arr.get(j-1)) < 0; j-- ) { 
                arr.set(j,arr.get(j-1)); 

            } 
            arr.set(j,temp); 
        }
        return arr ;

    }

    /**
     * bubbleSort method aplhabetically sorts the array of Strings
     *
     * @return    arr
     */
    public ArrayList bubbleSort() { 
        int pass = 1 ; 
        boolean exchanges; 
        do { 
            exchanges = false; 
            for( int i =0; i<arr.size()-pass; i++) { 
                if(arr.get(i).compareTo(arr.get(i+1)) > 0) { 
                    String temp = arr.get(i); 
                    arr.set(i,arr.get(i+1)); 
                    arr.set(i+1, temp); 
                    exchanges = true; 

                } 
            }
            pass++;
        } while(exchanges) ;
        return arr ;

    }

    /**
     * linearSearch method runs through the array checkng to see if 
     * a particular String 
     * @param String y 
     * @return index
     */
    public int linearSearch(String y ){
        boolean found = false; 
        for ( int i= 0; i<arr.size(); i++) { 
            if (y.equals(arr.get(i))) { 
                index= i ; 
                found = true; 
            } 
        } 
        if ( found != true) { 
            index = -1 ; // -1 is returned if the word is not found in the array list 
        } 
        return index ; 
    }

    /**
     * binarySearch method runs through the array checkng to see if 
     * a particular String 
     * @param String y 
     * @return index
     */
    public int binarySearch(String y ){
        // Sorts the array in alphabetical order
        //insertionSort (); 
        // Declaring Variables Used to refer to indexes in the array list

        int low= 0; // smallest index in arraylist
        int high= arr.size()-1; // largest index of the arraylist 

        // Calculating the mid 
        int mid = 0;
        boolean found = false ;

        while (found == false) { 
            mid = (high + low)/2;
            if (high < low) {  //Not found
                mid = -1;
                break; 
            }
            // Less than 
            if ((arr.get(mid).compareTo(y) <0 )) {
                low = mid +1 ; 
                 
            } 
            // Greater than 
            if((arr.get(mid).compareTo(y)> 0)) { 
                high = mid -1 ;
                
            } 

            if ((arr.get(mid).compareTo(y)== 0)) { 
                found = true; 
                break; 
            }
        }
        return mid; 
        
    }
    
    //Array used for unit testing 
    public String [] returnArray() { 
        String [] sArr= new String[arr.size()] ; 
        for (int i=0; i < arr.size(); i++) {
            sArr[i]= arr.get(i);
        }
        return sArr;
    }
}
