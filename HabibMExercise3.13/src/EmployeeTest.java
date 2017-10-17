/*
 * EmployeeTest.java
 */

/**
 *
 * @author Mursalin Habib ,mursalin@gmail.com
 */
public class EmployeeTest {
    
    public static void main(String args[]){
        // Create two Employee objects
	    	//	 Employee #1: Benjamin Bernanke has a monthly salary of 1234.56
	    	//   Employee #2: Paul Volcker has a monthly salary of 2345.67
    		Employee Ben = new Employee("Benjamin","Bernanke",1234.56);
    		Employee Paul = new Employee("Paul","Volcker",2345.67);
        
        // Display the employees' info (including yearly salary)
	    	/* Note that you'll receive slightly different results for the salary displaying via printf and print/println.
	    	 * This is due to the implicit precision and the rounding that is applied.
	    	 * I used println, but you're welcome to use printf if you like: I account for slight variations in the numeric values displayed for the salaries.
	    	 */
    				
    				//Benjamin Bernanke's yearly salary: 14814.72
    				//Paul Volcker's yearly salary: 28148.04
    				//Giving raises...
    				//Benjamin Bernanke's yearly salary: 16296.192000000001
    				//Paul Volcker's yearly salary: 30962.844
    				//Attempting to set a negative salary value...
    				//Benjamin Bernanke's yearly salary: 16296.192000000001
    		System.out.println(Ben.getFirstName() + " " + Ben.getLastName() + "'s yearly salary: " + 12*Ben.getMonthlySalary());
    		System.out.println(Paul.getFirstName() + " " + Paul.getLastName() + "'s yearly salary: " + 12*Paul.getMonthlySalary());
    	       
        System.out.println("Giving raises...");
        // Give each employee a 10% raises.
    		// Be sure to actually apply the raise to the Employee objects: don't just calculate and display a 10% greater salary within this test code 
        Ben.setMonthlySalary(Ben.getMonthlySalary()*1.1);
        Paul.setMonthlySalary(Paul.getMonthlySalary()*1.1);
        System.out.println(Ben.getFirstName() + " " + Ben.getLastName() + "'s yearly salary: " + 12*Ben.getMonthlySalary());
		System.out.println(Paul.getFirstName() + " " + Paul.getLastName() + "'s yearly salary: " + 12*Paul.getMonthlySalary());
	    
        
        
        // Display the employees' info (including yearly salary)
        
        System.out.println("Attempting to set a negative salary value...");
        // Attempt to set Bernanke's salary to a negative value...
        // Display Bernanke's info (including yearly salary)
        System.out.println(Ben.getFirstName() + " " + Ben.getLastName() + "'s yearly salary: " + 12*Ben.getMonthlySalary());
		
    }
    
}
