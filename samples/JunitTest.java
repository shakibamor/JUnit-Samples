 //find the first repeated character in a string 
package samples;

import java.util.HashSet;

public class JunitTest {

	public char firstRepeating(char str[]) 
    { 
        // Creates an empty hashset 
        HashSet<Character> h = new HashSet<>(); 
  
        // Traverse the input array from left to right 
        for (int i=0; i<=str.length-1; i++) 
        { 
            char c = str[i]; 
  
            // If element is already in hash set, update x 
            // and then break 
            if (h.contains(c)) 
                return c; 
  
            else // Else add element to hash set 
                h.add(c); 
        } 
  
        return '\0'; 
    }
	
	public int countSpaces(String str)
	{
		int spaceCount = 0;
		for (char c : str.toCharArray()) {
		    if (c == ' ') {
		         spaceCount++;
		    }
		}
		
		return spaceCount;
	}
	
	public int multiply(int x, int y)
	{
		
		return x*y;
	}
	
	
}
