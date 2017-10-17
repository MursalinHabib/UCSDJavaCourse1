/*
 * SmallestInt.java
 */

/**
 *
 * @author Mursalin Habib, mursalin@gmail.com
 */
import java.util.Scanner;

public class SmallestInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
    		Scanner sc = new Scanner(System.in);
    		int howManyInt = 0;
    		int smallest = Integer.MAX_VALUE;
    		int newNumber;
    		
    	    // Initialize a Scanner to read input from the command line
        // You may assume that only int values will be supplied as input for this assignment
    	
	    	/* Prompt the user and validate their input to ensure they've entered a positive (greater than zero) integer. Discard/ignore any other data.
	    	 * Note that we'll be doing this at least once and most likely multiple times...
	    	 */
    		
    		do {
    			System.out.println("How many integers shall we compare? (Enter a positive integer):");
    			howManyInt = sc.nextInt();
    			if (howManyInt <= 0) {
    				// Display the following text in the event of an invalid input
    				System.out.println("Invalid input!");
    			}
    		}while(howManyInt<=0);
    		
    		
        		
        	// Display the following text in the event of an invalid input
        //	System.out.println("Invalid input!");


        /* Read in the candidates for smallest integer
         * We know in advance how many times we need to iterate by the time we get here... why not use a for loop?
         */
        for(int ii = 1; ii<=howManyInt ; ii++ ) {    // Fill in the blanks! Seriously, fill them in! As currently written this will loop forever
        	
        		// Prompt as follows
            	System.out.print("Enter value " + ii + ": ");
            	newNumber = sc.nextInt();
            	
            	if (newNumber<smallest) {
            		smallest = newNumber;
            	}

        }
        
        /* At this point we know the smallest int entered... display it already!
         * Note that I used a local variable named "smallest" to keep track of the smallest int. If you name yours anything else you'll need to update the line below.
         * Note also that I didn't indicate where you should declare smallest... that's up to you/part of the assignment.
         */
        System.out.println("The smallest number entered was: " + smallest);
    }
    
}


/*
Use the supplied .java file(s) as the basis of your solution to the assignment. Note that, for the purposes of this course, all classes are defined within the default package (in other words, they do not explicitly specify a package).



This assignment must be submitted as a .zip file containing only your solution's .java files named following the convention LastnameFirstInitialExercise#.zip where the '#' is the Exercise number.
For example, my submission for this assignment would be named DukeGExercise5.11.zip). There should be no directories within the zip file.


With regard to sample output: the program's output will vary based on its input, but the text and formatting is expected to conform to the example provided below.



Expected test program (SmallestInt.java) console (System.out) output:

How many integers shall we compare? (Enter a positive integer): -13
Invalid input!
How many integers shall we compare? (Enter a positive integer): 3
Enter value 1: 55
Enter value 2: 4321
Enter value 3: -13
The smallest number entered was: -13

*/
