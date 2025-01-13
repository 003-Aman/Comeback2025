public class Solution {
    public String reverseWords(String s) {
        // Step 1: Trim leading and trailing spaces
        s = s.trim();
        
        // Step 2: Use a StringBuilder to construct the result string
        StringBuilder result = new StringBuilder();
        
        // Step 3: Split the string by spaces, handling multiple spaces
        int i = 0;
        while (i < s.length()) {
            // Skip spaces
            while (i < s.length() && s.charAt(i) == ' ') i++;
            // If we've reached the end of the string, break the loop
            if (i >= s.length()) break;
            
            // Find the end of the current word
            int j = i + 1;
            while (j < s.length() && s.charAt(j) != ' ') j++;
            
            // Reverse the current word
            for (int k = j - 1; k >= i; k--) {
                result.append(s.charAt(k));
            }
            
            // Append a space if not at the end of the string
            if (j < s.length()) result.append(' ');
            
            // Move i to the next word
            i = j;
        }
        
        // Convert StringBuilder to String and return
        return result.toString();
    }
}
