package JavaAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Assignment4 {
	
	public static void characterCount(String inputString)
    {
        // Creating a HashMap containing char
        // as a key and occurrences as  a value
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
 
        // Converting given string to char array
        char[] strArray = inputString.toCharArray();
 
        // checking each char of strArray
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else {
                charCountMap.put(c, 1);
            }
        }
        // Printing the charCountMap
        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
	
	public ArrayList<Integer> reverseArrayList(ArrayList<Integer> alist)
    {
        // Arraylist for storing reversed elements
        ArrayList<Integer> revArrayList = new ArrayList<Integer>();
        for (int i = alist.size() - 1; i >= 0; i--) {
            revArrayList.add(alist.get(i));
        }
        // Return the reversed arraylist
        return revArrayList;
    }
 
    // Iterate through all the elements and print
    public void printElements(ArrayList<Integer> alist)
    {
        for (int i = 0; i < alist.size(); i++) {
            System.out.print(alist.get(i) + " ");
        }
    }

	public static void main(String[] args) {

//		1. Find duplicate characters with their occurrences count using HashMap.
		
		System.out.print("Assignment 4 Exercise 1\n");
		String str = "DevLabs Alliance Training";
        characterCount(str);
		
        
//		2. Reverse an Arraylist.
		
        Assignment4 obj = new Assignment4();
        // Declaring arraylist without any initial size
        ArrayList<Integer> arrayli = new ArrayList<Integer>();
        // Appending elements at the end of the list
        arrayli.add(new Integer(1));
        arrayli.add(new Integer(2));
        arrayli.add(new Integer(3));
        arrayli.add(new Integer(4));
        System.out.print("Assignment 4 Exercise 2\n");
        System.out.print("Elements before reversing:");
        obj.printElements(arrayli);
        arrayli = obj.reverseArrayList(arrayli);
        System.out.print("\nElements after reversing:");
        obj.printElements(arrayli);
        
        
//		3. Check if a particular key exists in HashMap.
		
        try {
            // Create a HashMap
            HashMap<Integer, String> map = new HashMap<>();
  
            // Populate the HashMap
            map.put(1, "DevLabs");
            map.put(2, "AllianceTraining");
            map.put(null, "DevLabsAllianceTraining");
            int keyToBeChecked = 2;
            
            System.out.print("\nAssignment 4 Exercise 3\n");
            // Print the initial HashMap
            System.out.println("HashMap: " + map);
            // Get the iterator over the HashMap
            Iterator<Map.Entry<Integer, String> >
                iterator = map.entrySet().iterator();
            // flag to store result
            boolean isKeyPresent = false;
            // Iterate over the HashMap
            while (iterator.hasNext()) {
                // Get the entry at this iteration
                Map.Entry<Integer, String> entry = iterator.next();
                // Check if this key is the required key
                if (keyToBeChecked == entry.getKey()) {
                    isKeyPresent = true;
                }
            }
            // Print the result
            System.out.println("Does key " + keyToBeChecked + " exists: " + isKeyPresent);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        
//		4. Convert keys of a map to a list.
		
        Map<Integer, String> map = new HashMap<>();
        map.put(10, "orange");
        map.put(20, "blue");
        map.put(30, "white");
        map.put(40, "black");
        map.put(50, "brown");

        System.out.print("Assignment 4 Exercise 4");
        System.out.println("\n1. Export Map Key to List...");
        List<Integer> result = new ArrayList(map.keySet());
        result.forEach(System.out::println);
        System.out.println("2. Export Map Value to List...");        
        List<String> result2 = new ArrayList(map.values());        
        result2.forEach(System.out::println);
		
//		5. Copy all elements of a HashSet to an Object array.

        Set<Integer> hs = new HashSet<Integer>();
        hs.add(15);
        hs.add(71);
        hs.add(82);
        hs.add(89);
        hs.add(91);
        hs.add(93);
        hs.add(97);
        hs.add(99);
        System.out.print("Assignment 4 Exercise 5\n");
        System.out.println("Elements in set = "+hs);
        System.out.println("Copying all elements to an object array");
        Object[] obArr = hs.toArray();
        for (Object ob : obArr)
        System.out.println(ob);
        
//		6. Get highest and lowest value stored in TreeSet
		
        //creating TreeSet object
        TreeSet tSet = new TreeSet();
       
        //add elements to TreeSet
        tSet.add("10");
        tSet.add("15");
        tSet.add("20");
        tSet.add("25");
        tSet.add("30");
        System.out.print("Assignment 4 Exercise 6\n");
        System.out.println("Lowest value Stored in Java TreeSet is : " + tSet.first());      
        System.out.println("Highest value Stored in Java TreeSet is : " + tSet.last());
        
		
//		7. Sort ArrayList of Strings alphabetically.
		
        List<Integer> listofYears = new ArrayList<Integer>(); 
        listofYears.add(2021); 
        listofYears.add(2019); 
        listofYears.add(2018); 
        listofYears.add(2020);
        listofYears.add(2017);
        System.out.print("Assignment 4 Exercise 7\n");
        // print the ArrayList before sorting 
        System.out.println("ArrayList before sorting"); 
        System.out.println(listofYears); 
        // sorting an ArrayList of Integer in ascending order 
        Collections.sort(listofYears); 
        // print the ArrayList after sorting 
        System.out.println("ArrayList after sorting"); 
        System.out.println(listofYears);

        
//		8. Get Set view of keys from HashTable.
		
        //Creating an empty Hashtable
        Hashtable<String, String> hash_t = new Hashtable<String, String>();
  
        // Add mappings into the table
        hash_t.put("DevLabs", "1");
        hash_t.put("Alliance", "2");
        hash_t.put("Training", "3");
  
        // Getting a Set of keys using
        // keySet() method of Hashtable class
        Set hash_set = hash_t.keySet();
        
        System.out.print("Assignment 4 Exercise 8\n");
        System.out.println("Set created from Hashtable Keys contains :");
  
        // Iterating through the Set of keys
        Iterator itr = hash_set.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
		
	}

}
