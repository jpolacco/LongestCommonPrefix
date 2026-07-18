
/**
 * Write a description of class sdfdsf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Prefix
{
    public String longestCommonPrefix(String[] strs) {
        // Handle edge case
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // Compare character by character at each position
        for (int i = 0; i < strs[0].length(); i++) {
            char currentChar = strs[0].charAt(i);
            
            // Check this character against all other strings
            for (int j = 1; j < strs.length; j++) {
                // If we've reached the end of a string OR characters don't match
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                    return strs[0].substring(0, i);
                }
            }
        }
        
        // If we get here, the entire first string is the common prefix
        return strs[0];
    }
}