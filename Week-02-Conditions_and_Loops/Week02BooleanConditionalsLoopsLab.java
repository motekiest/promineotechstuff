package com.promineotech;

public class Week02BooleanConditionalsLoopsLab {

	public static void main(String[] args) {
		//
		// BOOLEANS and CONDITIONALS:
		//
		
		// 1. Variable Declaration:
		//		a. Create a variable named age and assign it a value of 14

		int age = 18
				;
		System.out.println(age);
		
		// 2. Print a Boolean Expression:
		//		a. Print the boolean expression age >= 16 to the console and note the results.
		//		a. Change the value of age to 18 and print again.
		boolean compareage = age >= 16;
		System.out.println(compareage);

		int hasLicense = 'N';
		System.out.println(hasLicense);
		
		// 3. Can you drive?
		//		a. Using a conditional, print one of the following:
		//				i. "You can drive" if age is greater than or equal to 16
		//				ii. "You cannot drive" otherwise
		//
		//		a. Change the value of age and rerun to see the result
		if ((age>=16) && (hasLicense == 'Y')) {System.out.println("You can drive");}
		else System.out.println("You cannot drive");
			

		
		// 4. Update Solution to Question 3 as follows:
		//		a. Add a new variable called hasLicense before the conditional.
		//		b. Change the boolean expression in the conditional to additionally 
		//				include the need for hasLicense to be true.
		//		c. Try changing the values of age and hasLicense and note the different results.

		
		
		// 5. Milk?
		//		a. Create two new variables - costOfMilk and thirstLevel
		//		b. Create a new conditional that prints "Milk Please" if costOfMilk is less than 2.50 
		//				or if thirstLevel is greater than 6 and prints "No Thanks" otherwise.
		//		c. Change the values and note the different results.
			double costOfMilk = 2.99;
			double thirstLevel = 5;
				System.out.println(costOfMilk);
				System.out.println(thirstLevel);
			if ((costOfMilk <= 2.5) || (thirstLevel >= 6)) {System.out.println("Milk Please");}
			else System.out.println("No Thanks");

			

	
		
		// 6. Cookie Distribution: 
		//			Note:  You will evenly distribute all of the cookies to the children 
		//					and as the adult you get to keep the remaining cookies for yourself.
		//
		//		a. Create two variables called numberOfCookies and numberOfChildren.
		//		b. Initialize the two variables to integer values.
		//		b. Use a conditional to print the following based on the following conditions:
		//				i. If there are 0 cookies remaining, print "Sad Face"
		//				ii. If there are less than 2 cookies, print "Yes!"
		//				iii. If there are less than 5 cookies, print "Whoohoooo!"
		//				iv. If there are 5 or more cookies, print "Jackpot!"
	
		int numberOfCookies = 45; 
		int numberOfChildren = 8; 
		
		if (numberOfCookies % numberOfChildren >= 5) {System.out.println("Jackpot!");}
		else if (numberOfCookies % numberOfChildren == 0) {System.out.println("Sad Face");}
		else if (numberOfCookies % numberOfChildren <= 2) {System.out.println("Yes!");}
		else if (numberOfCookies % numberOfChildren < 5) {System.out.println("Woohoooo!");}
		
		
		
				
		// 7.  Loyalty Member Program:
		//		a. Create a variable called loyaltyMemberStatus and assign the value "SILVER"
		//		b. Create a variable called loyaltyMemberDiscount and assign the value 0.0
		//		c. Using a switch, set the value of loyaltyMemberDiscount based on 
		//				the following loyaltyMemberStatus scale: 
		//				i. "SILVER" is 0.10
		//				ii. "GOLD" is 0.15
		//				iii. "PLATINUM" is 0.25
		

		
		// 8. Using the Loyalty Member Program variables from Question 7, do the following:
		//		a. Create a variable called billTotal and assign a value
		//		b. Create a variable called adjustedTotal and assign it the billTotal minus 
		//				the loyaltyMemberDiscount percent of the billTotal
		//		c. If the adjustedBillTotal is greater than $500 upgrade the 
		//				loyaltyMemberStatus from SILVER to GOLD or from GOLD to PLATINUM


		
		// 9. Login -- username & password:
		//		a. Create two variables, username and password
		//		b. Create a conditional that prints one of the following:
		//				i. "login successful" if the username is "Tommy123" and the password is "12345"
		//				ii. "access denied" otherwise

		
		
		//
		// LOOPS:
		//
		
		// 10. Write a for loop that prints each number from 0 to 9

		
		
		// 11. Write a for loop that prints each number from 10 to 0 backwards

		
		
		// 12. Write a for loop that prints every other number from 0 to 100

		
		
		// 13. Write a for loop that iterates from 0 to 100 and prints 
		//			"EVEN" if the number is even and "ODD" if it's odd

		
		
		// 14. Write a while loop that starts at 100 and iterates backwards by 1 until it reaches 0
		//			within the loop, divide each number by 3 and print the remainder to the console.

	     System.out.println( "hello world".charAt(0) != 'H');

	        boolean a = true;
	        boolean b = true;
	        boolean c = false;
	        System.out.println((a && b)|| (a && c)|| (b && c));

	        int x = 25;
	        int y = 20;
	        int z = 10;

	        boolean result = x > y && x > z;

	        System.out.println(result);

	        int tokens = 12;
	        int costToPlayArcadeGame = 3;

	        System.out.println( tokens < costToPlayArcadeGame );
	        
	        
	        System.out.println(!false && (true && !true));
	        
	   	        
	        boolean result2 = (a && b) || (c || !b);
	        System.out.println(result2);

	        
	        boolean isAdult = (age >= 18 && age < 65); // evaluates to true
	        if (isAdult) {
	            System.out.println("You qualify for the adult price.");
	        } else {
	            System.out.println("You do not qualify for the adult price.");
	        }
	        
	        
	        int num = 9;
	          boolean result3 = (num % 2 == 0 || num % 5 == 0);
	          if (result3) {
	             System.out.println("The number is either even or a multiple of 5");
	          } else {
	             System.out.println("The number is neither even nor a multiple of 5");
	          }
	          
	          
//	          System.out.println((-2 < -1) || ((10 > 3) && false));
	          
	          
	          double assignment1 = 80;
	          double assignment2 = 88;
	          double sum = assignment1 + assignment2;
	          
	      	if (sum > 150)
	      	    {
	      	    System.out.println("You passed the class."); 
	      	    
	      	}  else { System.out.println("You failed the class.");	
	          
	          
	      	}	
		   
	      	int wins = 4;
	      	int losses = 6;
	      	boolean isFall = true;
	      	
			if ((wins > losses) && isFall) {
			    System.out.println("It's looking good for your team to make the playoffs."); 
			} else if ((wins > losses) && !isFall) {
			    System.out.println("Your favorite team has promise, but it's too early to tell.");
			} else if ((wins < losses) && !isFall) { 
			    System.out.println("It's not looking too good.");
			}
		    
			int counter = 0;
	           for (int w = 1; w < 100; w += 2) {
	               counter++;
	               System.out.println(counter);
	           }
	
	         
	           
	           int base =2;
	           int power = 5;
	           int resultf = 1;
	           for (int i = 1; i <= power; i++) {
	               resultf *= base;}
	           System.out.println(resultf);
	           
	           int g = 0;
	           do{
	               System.out.println("I will print!");
	               g++;
	           } while (g > 1);
	           
	           
	           
	           
	}
}
	

	


