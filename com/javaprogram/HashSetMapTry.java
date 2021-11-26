package com.javaprogram;

import java.util.HashMap;
import java.util.HashSet;

public class HashSetMapTry {
	
	public static void main(String[] args) {
		HashSet<Integer> lipstickNumbers = new HashSet<>();
		lipstickNumbers.add(110);
		lipstickNumbers.add(120);
		lipstickNumbers.add(120);
		lipstickNumbers.add(130);
		lipstickNumbers.add(140);
		lipstickNumbers.add(150);
		lipstickNumbers.add(160);
		lipstickNumbers.add(150);
		lipstickNumbers.add(170);

		for (Integer item : lipstickNumbers) {
			System.out.println(item);
		}
		
		HashMap<Integer, String> lipstickColours = new HashMap<>();
		lipstickColours.put(110, "red");
		lipstickColours.put(120, "pink");
		lipstickColours.put(130, "brown");
		lipstickColours.put(140, "peach");
		lipstickColours.put(150, "orange");
		lipstickColours.put(160, "black");
		lipstickColours.put(170, "purple");
		
		for (Integer key : lipstickColours.keySet()) {
			System.out.println("The number of shade "+ lipstickColours.get(key) +" is "+ key);
		}
	}
}
