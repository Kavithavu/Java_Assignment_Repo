/*find the frequency of each character in the string
using hashMap
using frequency method
 */

package CollectionStage1Assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import org.apache.commons.math3.stat.Frequency;

public class FreqOfCharInStringUsingHashMap {

	public static void main(String[] args) {

		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for(int i = 0; i < str.length(); i++){
			char c = str.charAt(i);
			// For space or tab skip the process
			if(((c == ' ') || (c == '\t'))){
				continue;
			}
			// if character is already there in the map
			// increment the count
			if(charMap.containsKey(c)){
				charMap.put(c, charMap.get(c) + 1);
			}else{
				// If new character put that character in the map
				// with the value as 1
				charMap.put(c, 1);
			}
		}
		// Displaying the map values
		Set<Map.Entry<Character, Integer>> numSet = charMap.entrySet();
		for(Map.Entry<Character, Integer> m : numSet){
			System.out.println(m.getKey() + " - " + m.getValue());
		}
	}
	
	
}
