/**
 * Write a description of class PrefixMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PrefixMain{
    public static void main(String[] args){
        
        Prefix prefix = new Prefix();
        String[] arr1 = {"florence", "flow", "floated", "floop"};
        System.out.println("For the array: " + java.util.Arrays.toString(arr1) +
                            "\nthe longest common prefix is: " + prefix.longestCommonPrefix(arr1));
                            
    }

    
}
