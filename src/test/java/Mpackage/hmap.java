package Mpackage;

import java.util.HashMap;

public class hmap {

	public static void main(String[] args) {
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
		  
        // Mapping string values to int keys
        hash_map.put(10, "Geeks");
        hash_map.put(15, "4");
        hash_map.put(20, "Geeks");
        hash_map.put(25, "Welcomes");
        hash_map.put(30, "You");
  
        // Displaying the HashMap
        System.out.println("Initial Mappings are: " + hash_map);
        System.out.println("The Value is: " + hash_map.get(25));
        
        String returned_value = (String)hash_map.put(20, "All");
        
        // Verifying the returned value
        System.out.println("Returned value is: " + returned_value);

	}

}
