package JavaAssignment;

import java.util.Scanner;

public class Assignment3 {
	
	static final int MAX_CHAR = 256;
	
	public static void arithException(){
		
		Scanner sc = new Scanner(System.in);
		try {
			int number = sc.nextInt();
			System.out.println(number%0);
		}catch (ArithmeticException e) {
			System.err.println("Divisible by 0 is not possible" +e.getMessage());
		}finally {
			System.out.println("completed");
		}
		sc.close();
    }
	
	public static void test1() throws Exception {
	      System.out.println("The Exception in test1() method");
	      throw new Exception("thrown from test1() method");
	   }
	public static void test2() throws Throwable {
	      try {
	         test1();
	      } catch(Exception e) {
	         System.out.println("Inside test2() method");
	         throw e;
	      }
	   }

	public static void main(String[] args) throws Throwable {

		
//		1. Write a program to print the occurrence of each character in the String
//		“DevLabs Alliance Training”
		
        int count[] = new int[MAX_CHAR];
        String str = "DevLabs Alliance Training";
        int len = str.length();
 
        System.out.println("Assignment 3 Exercise 1:");
        // Initialize count array index
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;
 
        // Create an array of given String size
        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {
                // If any matches found
                if (str.charAt(i) == ch[j])
                    find++;
            }
            if (find == 1)
                System.out.println("Number of Occurrence of " + str.charAt(i) + " is:" + count[str.charAt(i)]);
        }
	
	
//		2. Write a program to check if a given string is a palindrome or not.
//		Palindrome example: trurt
		
        String string = "trurt";    
        boolean flag = true;    
                
        string = string.toLowerCase();    
        System.out.println("Assignment 3 Exercise 2:");
        for(int i = 0; i < string.length()/2; i++){    
            if(string.charAt(i) != string.charAt(string.length()-i-1)){    
                flag = false;    
                break;    
            }    
        }    
        if(flag)    
            System.out.println("Given string is palindrome");    
        else    
            System.out.println("Given string is not a palindrome");
		
        
//		3. Write a program to check “brown” is present in the string: A brown fox
//		ran away fast
		
        // To break the sentence in words
        String s = "A brown fox ran away fast";
        String word = "brown";
        String []array = s.split(" ");
        
        System.out.println("Assignment 3 Exercise 3:");
        // To temporarily store each individual word
        for ( String temp :array){
            if (temp.compareTo(word) == 0){
            	System.out.print("Yes");
            }
        }
        
        
        
//		4. Write a program to convert String to a character array and character array
//		to String.
		
        String strin = "DevLabs Alliance Training";
 
        char[] arr = strin.toCharArray();
  
        System.out.println("\nAssignment 3 Exercise 4:");
        // Printing array
        for (char c : arr) {
            System.out.println(c);
        }
		
        
//		5. Write a program to throw NumberFormatException and handle it
//		appropriately with a proper message.
//		If you pass invalid input to parseInt(str), this exception will be thrown.
		
        // Declaring an variable which
        // holds the input number entered
        int number;
 
        Scanner sc = new Scanner(System.in);
        System.out.println("Assignment 3 Exercise 5:");
        while (true) {
            // Display message
            System.out.println("Enter any valid Integer: ");
            // Try block to check if any exception occurs
            try { 
                // Parsing user input to integer
                // using the parseInt() method
                number = Integer.parseInt(sc.next());
 
                // Number can be valid or invalid
 
                // If number is valid, print and display the message and number
                System.out.println("You entered: "+ number);
                break;
            }
            // Catch block to handle NumberFormatException
            catch (NumberFormatException e) {
                // Print the message if exception occurred
                System.out.println("NumberFormatException occurred");
            }
        }
        sc.close();
		
        
//		6. Write a program where a method declares that it throws ArithmeticException.
		
        System.out.println("Assignment 3 Exercise 6:");
		System.out.println("Enter a valid integer");
		arithException();


//		7. Write a program with nested try blocks.
		
		System.out.println("Assignment 3 Exercise 7");
		//Parent try block
	     try{
	    	//Child try block1
	         try{
	            System.out.println("Inside block 1");
	            int b = 5/0;
	            System.out.println(b);
	         }
	         catch(ArithmeticException e1){
	            System.out.println("Exception: e1");
	         }
	         //Child try block2
	         try{
	            System.out.println("Inside block 2");
	            int b = 15/0;
	            System.out.println(b);
	         }
	         catch(ArrayIndexOutOfBoundsException e2){
	            System.out.println("Exception: e2");
	         }
	        System.out.println("Just other statement");
	    }
	    catch(ArithmeticException e3){
	    	 System.out.println("Arithmetic Exception");
	         System.out.println("Inside parent try catch block");
	    }
	    catch(ArrayIndexOutOfBoundsException e4){
	    	System.out.println("ArrayIndexOutOfBoundsException");
	         System.out.println("Inside parent try catch block");
	    }
	    catch(Exception e5){
	    	System.out.println("Exception");
	         System.out.println("Inside parent try catch block");
	    }
	    System.out.println("completed");
		
	    
//		8. Write a program to re-throw an exception. (throw inside catch block)
	    
	    System.out.println("Assignment 3 Exercise 8");
	    try {
	         test2();
	      } catch(Exception e) {
	         System.out.println("Caught in main");
	      }
	
	}
		
}

