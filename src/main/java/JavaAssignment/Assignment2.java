package JavaAssignment;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {

//		1. Java Program to Calculate average of numbers using Array
//		Example:
//		values [] = 1, 2, 3, 4, 5
//		average = 3
		
		System.out.println("Assignment 2 - Exercise 1");
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int length = array.length;
		int sum = 0;
		
		for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
		
		System.out.println("Elements of the array: ");
        for (int i = 0; i < array.length; i++) { 
	        System.out.println(array[i] + " ");
        }
        
		double average = sum / length;
		System.out.println("Average of array : "+average);
		
		
//		2. Find all the odd numbers from 79 to 187
		
		System.out.println("Assignment 2 - Exercise 2");
		int number=187;  
		System.out.print("List of odd numbers from 79 to "+number+": ");  
		for (int i=79; i<=number; i++){   
			if (i%2!=0){  
			System.out.print(i + " ");  
			}  
		} 
		
		
//		3. Is 13 a prime number?
		
		int m=0,flag=0;      
		int n=13;    
		m=n/2;
		System.out.println("\nAssignment 2 - Exercise 3");
		if(n==0||n==1){  
		   System.out.println(n+" is not prime number");      
		}else{  
		for(int i=2;i<=m;i++){      
		   if(n%i==0){      
		   System.out.println(n+" is not prime number");      
		   flag=1;      
		   break;      
		   }      
		}      
		if(flag==0){ 
		   System.out.println(n+" is prime number"); 
		   }  
		}  
		
		
//		4. Find the sum of digits
//		Example:
//		int n = 1234;
//		output: 10
		
		System.out.println("Assignment 2 - Exercise 4");
		int numb, digit, suma = 0;  
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number: ");  
		numb = sc.nextInt();  
		while(numb > 0){     
		digit = numb % 10;  
		suma = suma + digit;   
		numb = numb / 10;  
		}    
		System.out.println("Sum of Digits: "+suma); 
		sc.close();
		
//		5. Reverse a number 123
		
		System.out.println("Assignment 2 - Exercise 5");
		int numbe = 123, reverse = 0;  
		System.out.println("The given number is: 123");
		while(numbe != 0)   
		{  
		int remainder = numbe % 10;  
		reverse = reverse * 10 + remainder;  
		numbe = numbe/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);
		
		
//		6. Find the duplicates in an array 12, 32, 12, 45, 65, 93, 0, 23, 45, 6
		
		int [] arr = new int [] {12, 32, 12, 45, 65, 93, 0, 23, 45, 6};   
		System.out.println("Assignment 2 - Exercise 6");
        System.out.println("Duplicate elements in given array: 12, 32, 12, 45, 65, 93, 0, 23, 45, 6");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
        
	}

}

