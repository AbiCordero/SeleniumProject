package JavaAssignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		//1. Write a program to calculate the factorial of a number using a while loop.
		
				int num=10;
		        long factorial = 1;
		        int i = 1;
		        while(i<=num)
		        {
		        	factorial = factorial * i;
		            i++;
		        }
		        System.out.println("Assignment 1 - Exercise 1: \nFactorial of "+num+" is: "+factorial);
		        
		        
		//2. Write a program to print fibonacci series (10 values).
		        
		        int n1=0,n2=1,n3,j,count=10;    
		        System.out.print("Assignment 1 - Exercise 2: \nWritting fibonacci series:\n"+n1+" "+n2);//printing 0 and 1    
		        for(j=2;j<count;++j)//loop starts from 2 because 0 and 1 are already printed    
		        {    
		         n3=n1+n2;    
		         System.out.print(" "+n3);    
		         n1=n2;    
		         n2=n3;    
		        } 
		        
		        
		//3. Write a program to sort the elements of an array in ascending order.
		        
		        List<String> mobile = new ArrayList<String>();
		        mobile.add("samsung");
		        mobile.add("xiaomi");
		        mobile.add("lg");
		        mobile.add("apple");
		        mobile.add("nokia");
		        mobile.add("motorola");
		        System.out.println("\nAssignment 1 - Exercise 3:");
				System.out.println("Before sorting:");
				System.out.println(mobile);
				System.out.println("After sorting:");
				Collections.sort(mobile);
				System.out.println(mobile);
				
		//4. Write a program to check whether the current year is leap year or not. Users will enter a year value.
				
				int year = 2021;
		    	Scanner scan = new Scanner(System.in);
		    	System.out.println("Assignment 1 - Exercise 4:");
		    	System.out.println("Enter any Year:");
		    	year = scan.nextInt();
		        boolean isLeap = false;
		        if(year % 4 == 0)
		        {
		            if( year % 100 == 0)
		            {
		                if ( year % 400 == 0)
		                    isLeap = true;
		                else
		                    isLeap = false;
		            }
		            else
		                isLeap = true;
		        }
		        else {
		            isLeap = false;
		        }

		        if(isLeap==true)
		            System.out.println(year + " is a Leap Year.");
		        else
		            System.out.println(year + " is not a Leap Year.");
		        
		        scan.close();
		    
				
				
		//5. Write a program to print the first 10 prime numbers.
		        
		        int ct=0,n=0,x=1,y=1; 
		        System.out.println("Assignment 1 - Exercise 5:");
		        System.out.println("The first 10 prime numbers are:");
		        while(n<10)  
		        {  
		        y=1;  
		        ct=0;  
		        while(y<=x)  
		        {  
		        if(x%y==0)  
		        ct++;  
		        y++;   
		        }  
		        if(ct==2)  
		        {  
		        System.out.printf("%d ",x);  
		        n++;  
		        }  
		        x++;  
		        }  

		        
		//6. Write a program to calculate the area of a triangle. Users will enter the values for base and height of the triangle.
		        
		        System.out.println("\nAssignment 1 - Exercise 6:");
		        System.out.println("Enter the base of the Triangle:");
		        double base = scan.nextDouble();

		        System.out.println("Enter the height of the Triangle:");
		        double height = scan.nextDouble();

		        double area = (base* height)/2;
		        System.out.println("Area of Triangle is: " + area);     
		        	        
		        
		//7. Write a program to print the sum of the first 20 natural numbers.
		        System.out.println("\nAssignment 1 - Exercise 7:");
		        int z, natnum = 20, sum = 0;    
			    for(z = 1; z <= natnum; ++z){  
			      sum = sum + z;  
			      }    
			    System.out.println("Sum of First 20 Natural Numbers is = " + sum);
			    
			    
		//8. Write a program to reverse the elements of an array where the array size as well as the array values are entered by the user.
			     
			    System.out.println("\nAssignment 1 - Exercise 8:");
			    int size;
		        System.out.println("Enter the size of the array: ");
		        size=scan.nextInt();
		        int [] array = new int[size];
		        
		        System.out.println("Enter the elements of the array: ");
		        for (int d = 0; d < array.length; d++) { 
		            array[d]=scan.nextInt();
		        }
		        
		        System.out.println("Elements of the array entered: ");
		        for (int d = 0; d < array.length; d++) { 
			        System.out.println(array[d] + " ");
		        }
		        
		        System.out.println("Array in reverse order: ");   
		        for (int d = array.length-1; d >= 0; d--) {  
		            System.out.print(array[d] + " ");  
		        }  
		        scan.close();
		        
		//9. Write a program to print only even numbers till 50.
		        
		        System.out.println("\nAssignment 1 - Exercise 9:");
		        int number=50;  
		        System.out.print("List of even numbers from 1 to "+number+": ");  
		        for (int e=1; e<=number; e++)   
		        {   
		        //if i%2 is equal to zero, the number is even  
		        if (e%2==0){  
		        System.out.print(e + " ");  
		        }  
		        }
		        
		        
		//10. Write a program to print this output using a two-dimensional array.
				
		        System.out.println("\nAssignment 1 - Exercise 10:");
		        InputStreamReader isr=new InputStreamReader(System.in);
		        BufferedReader br=new BufferedReader(isr);
		        System.out.println("Enter the number of rows:");
		        int numb=Integer.parseInt(br.readLine());
		        int a[][]=new int[50][50];
		        
		        int f=0,g=0,sp=numb-1;
		        
		        for(f=0;f<numb;f++)
		        {
		            a[f][f]=a[f][0]=1; // to assign value 1 to the diagonals
		        }
		        for(f=0;f<numb;f++)
		        {
		            for(g=1;g<f;g++)
		            {
		                a[f][g]=a[f-1][g-1]+a[f-1][g];
		            }
		        }
		        for(f=0;f<numb;f++)
		        {
		            for(g=0;g<sp;g++) // loop for printing the spaces
		            {
		                System.out.print(" ");
		            }
		            for(g=0;g<=f;g++)
		            {
		                System.out.print(a[f][g]+" ");
		            }
		            System.out.println();
		            sp--;
		        }
			}
	}


