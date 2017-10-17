/*
 * CommissionCalculator.java
 */

/**
 *
 * @author Mursalin Habib, mursalin@gmail.com
 */

import java.util.Scanner;

public class CommissionCalculator {
    
    public static void main(String args[]) {
    		// Initialize a Scanner to read input from the command line
    	
    		Scanner sc = new Scanner(System.in);
    		double currentCompensation = 200;
    		int itemChoice =  100;
    		double itemPrice;
    		
    	
	    	/* Note that we'll be doing this at least once and most likely multiple times...
	    	 * Prompt the user with a menu of the four items and their values (this information is included in the problem statement)
	    	 */
    		do {
	    		System.out.println("Item\tValue");
	    		System.out.println("1\t$239.99");
	        System.out.println("2\t$129.75");
	        System.out.println("3\t$99.95");
	        System.out.println("4\t$350.89");
	        System.out.println("Current compensation: $"+currentCompensation);
	        System.out.println("Please select an item from the list above (or enter 0 to exit):");
	        
	        	itemChoice = sc.nextInt();
	        
	        if(itemChoice==1){
	        		itemPrice = 239.99;
	        		currentCompensation += itemPrice * 0.09;
	        	}else if(itemChoice==2){
	        		itemPrice = 129.75;
	        		currentCompensation += itemPrice * 0.09;
	        	
	        }else if(itemChoice==3){
	        		itemPrice = 99.95;
	        		currentCompensation += itemPrice * 0.09;
	        	
	        }else if(itemChoice==4) {
	        		itemPrice = 350.89;
	        		currentCompensation += itemPrice * 0.09;
	        }else if(itemChoice==0){
	        		itemPrice = 0;
	        }else {
	        		System.out.println("ERROR: Invalid input!");
	        	}
	        //System.out.println("Current Compensation: $"+currentCompensation);
	        
	        
	        
    		}while(itemChoice!= 0);
    		System.out.println("Total earnings: $"+currentCompensation);
    		
	    	/* Display the user's current compensation
	    	 * 
	    	 * Prompt and take input from the user (you may assume that they will only enter int values)
	    	 * They'll enter an item number (1 - 4) to record its sale or 0 to exit
	    	 * 
	    	 * NOTE: THE USER DOES NOT ENTER PRICES DIRECTLY... THEY ENTER ITEM NUMBERS TO INDICATE WHAT WAS SOLD
	    	 * NOTE: THE USER MAY ENTER THE SAME ITEM NUMBRER MULTIPLE TIMES
	    	 * 
	    	 * If the user provides invalid input (a value other than 0 - 4) display "ERROR: Invalid input!" and prompt them again
	    	 */
	    	
	    	/* After the user enters 0, display the salesperson's earnings in the format "Total earnings: $NNN.NN" and exit
	    	 * For example, if the salesperson sold two item 3s this week the final output would be "Total earnings: $217.99"
	    	 */
    }
    
}

/*

Use the supplied .java file(s) as the basis of your solution to the assignment. Note that, for the purposes of this course, all classes are defined within the default package (in other words, they do not explicitly specify a package).

This assignment must be submitted as a .zip file containing only your solution's .java files named following the convention LastnameFirstInitialExercise#.zip where the '#' is the Exercise number.
For example, my submission for this assignment would be named DukeGExercise4.19.zip). There should be no directories within the zip file.

Ensure that your program's output follows the format of the sample that follows. Consistent formatting, naming, spelling, etc. is necessary to support the automated testing. *Slight* rounding errors in the numeric values will be accounted for. Note that the test suite may provide different inputs when validating your solution.

Sample program (CommissionCalculator) console (System.out) output:
Item	Value
1	$239.99
2	$129.75
3	$99.95
4	$350.89
Current compensation: $200.00
Please select an item from the list above (or enter 0 to exit): -7
ERROR: Invalid input!
Item	Value
1	$239.99
2	$129.75
3	$99.95
4	$350.89
Current compensation: $200.00
Please select an item from the list above (or enter 0 to exit): 3
Item	Value
1	$239.99
2	$129.75
3	$99.95
4	$350.89
Current compensation: $209.00
Please select an item from the list above (or enter 0 to exit): 3
Item	Value
1	$239.99
2	$129.75
3	$99.95
4	$350.89
Current compensation: $217.99
Please select an item from the list above (or enter 0 to exit): 0
Total earnings: $217.99

*/