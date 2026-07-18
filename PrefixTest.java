import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * Test suite for the Prefix class longestCommonPrefix method.
 * Tests various scenarios including edge cases, normal cases, and boundary conditions.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PrefixTest {
    
    private Prefix prefix;
    
    @Before
    public void setUp() {
        prefix = new Prefix();
    }
    
    // ============= Edge Cases =============
    
    @Test
    public void testNullArray() {
        assertEquals("Should return empty string for null array", 
                     "", prefix.longestCommonPrefix(null));
    }
    
    @Test
    public void testEmptyArray() {
        String[] strs = {};
        assertEquals("Should return empty string for empty array", 
                     "", prefix.longestCommonPrefix(strs));
    }
    
    @Test
    public void testSingleString() {
        String[] strs = {"hello"};
        assertEquals("Should return the string itself when array has one element", 
                     "hello", prefix.longestCommonPrefix(strs));
    }
    
    @Test
    public void testSingleEmptyString() {
        String[] strs = {""};
        assertEquals("Should return empty string when array contains one empty string", 
                     "", prefix.longestCommonPrefix(strs));
    }
    
    @Test
    public void testArrayWithEmptyString() {
        String[] strs = {"flower", "", "flight"};
        assertEquals("Should return empty string when array contains an empty string", 
                     "", prefix.longestCommonPrefix(strs));
    }
    
    @Test
    public void testAllEmptyStrings() {
        String[] strs = {"", "", ""};
        assertEquals("Should return empty string when all strings are empty", 
                     "", prefix.longestCommonPrefix(strs));
    }
    
    // ============= No Common Prefix =============
    
    @Test
    public void testNoCommonPrefix() {
        String[] strs = {"dog", "racecar", "car"};
        assertEquals("Should return empty string when no common prefix exists", 
                     "", prefix.longestCommonPrefix(strs));
    }
    
    @Test
    public void testNoCommonPrefixDifferentFirstChar() {
        String[] strs = {"apple", "banana", "cherry"};
        assertEquals("Should return empty string when first characters differ", 
                     "", prefix.longestCommonPrefix(strs));
    }
    
    // ============= Common Prefix Cases =============
    
    @Test
    public void testCommonPrefixBasic() {
        String[] strs = {"flower", "flow", "flight"};
        assertEquals("Should return 'fl' as common prefix", 
                     "fl", prefix.longestCommonPrefix(strs));
    }
    
    @Test
    public void testCommonPrefixLonger() {
        String[] strs = {"interspecies", "interstellar", "interstate"};
        assertEquals("Should return 'inters' as common prefix", 
                     "inters", prefix.longestCommonPrefix(strs));
    }
    
    @Test
    public void testCommonPrefixSingleCharacter() {
        String[] strs = {"apple", "application", "approve"};
        assertEquals("Should return 'app' as common prefix", 
                     "app", prefix.longestCommonPrefix(strs));
    }
    
    @Test
    public void testCommonPrefixOneChar() {
        String[] strs = {"a", "ab", "abc"};
        assertEquals("Should return 'a' as common prefix", 
                     "a", prefix.longestCommonPrefix(strs));
    }
    
    // ============= Identical Strings =============
    
    @Test
    public void testAllIdenticalStrings() {
        String[] strs = {"test", "test", "test"};
        assertEquals("Should return entire string when all strings are identical", 
                     "test", prefix.longestCommonPrefix(strs));
    }
    
    @Test
    public void testTwoIdenticalStrings() {
        String[] strs = {"hello", "hello"};
        assertEquals("Should return entire string when both strings are identical", 
                     "hello", prefix.longestCommonPrefix(strs));
    }
    
    // ============= Length Variations =============
    
    @Test
    public void testDifferentLengthsShortestFirst() {
        String[] strs = {"ab", "abc", "abcd"};
        assertEquals("Should return 'ab' when shortest string is first", 
                     "ab", prefix.longestCommonPrefix(strs));
    }
    
    @Test
    public void testDifferentLengthsShortestMiddle() {
        String[] strs = {"abcd", "ab", "abc"};
        assertEquals("Should return 'ab' when shortest string is in middle", 
                     "ab", prefix.longestCommonPrefix(strs));
    }
    
    @Test
    public void testDifferentLengthsShortestLast() {
        String[] strs = {"abcd", "abc", "ab"};
        assertEquals("Should return 'ab' when shortest string is last", 
                     "ab", prefix.longestCommonPrefix(strs));
    }
    
    @Test
    public void testFirstStringIsPrefix() {
        String[] strs = {"flow", "flower", "flowing"};
        assertEquals("Should return 'flow' when first string is prefix of others", 
                     "flow", prefix.longestCommonPrefix(strs));
    }
    
    @Test
    public void testLastStringIsPrefix() {
        String[] strs = {"flower", "flowing", "flow"};
        assertEquals("Should return 'flow' when last string is prefix of others", 
                     "flow", prefix.longestCommonPrefix(strs));
    }
    
    // ============= Special Characters =============
    
    @Test
    public void testWithNumbers() {
        String[] strs = {"test123", "test456", "test789"};
        assertEquals("Should handle strings with numbers", 
                     "test", prefix.longestCommonPrefix(strs));
    }
    
    @Test
    public void testWithSpaces() {
        String[] strs = {"hello world", "hello there", "hello everyone"};
        assertEquals("Should handle strings with spaces", 
                     "hello ", prefix.longestCommonPrefix(strs));
    }
    
    @Test
    public void testCaseSensitive() {
        String[] strs = {"Flower", "flower", "Flight"};
        assertEquals("Should be case sensitive - no common prefix", 
                     "", prefix.longestCommonPrefix(strs));
    }
    
    @Test
    public void testCaseSensitiveWithCommonPrefix() {
        String[] strs = {"Flower", "Flow", "Flight"};
        assertEquals("Should be case sensitive with common prefix", 
                     "Fl", prefix.longestCommonPrefix(strs));
    }
    
    // ============= Large Arrays =============
    
    @Test
    public void testManyStrings() {
        String[] strs = {"prefix1", "prefix2", "prefix3", "prefix4", "prefix5", 
                        "prefix6", "prefix7", "prefix8", "prefix9", "prefix10"};
        assertEquals("Should handle arrays with many strings", 
                     "prefix", prefix.longestCommonPrefix(strs));
    }
    
    @Test
    public void testLongStrings() {
        String[] strs = {
            "abcdefghijklmnopqrstuvwxyz",
            "abcdefghijklmnopqrstuvwxyz123",
            "abcdefghijklmnopqrstuvwxyz456"
        };
        assertEquals("Should handle long strings", 
                     "abcdefghijklmnopqrstuvwxyz", prefix.longestCommonPrefix(strs));
    }
    
    // ============= Boundary Cases =============
    
    @Test
    public void testTwoStringsNoPrefix() {
        String[] strs = {"abc", "xyz"};
        assertEquals("Should return empty string for two strings with no prefix", 
                     "", prefix.longestCommonPrefix(strs));
    }
    
    @Test
    public void testTwoStringsWithPrefix() {
        String[] strs = {"abc", "abd"};
        assertEquals("Should return 'ab' for two strings", 
                     "ab", prefix.longestCommonPrefix(strs));
    }
    
    @Test
    public void testSingleCharacterStrings() {
        String[] strs = {"a", "a", "a"};
        assertEquals("Should handle single character strings", 
                     "a", prefix.longestCommonPrefix(strs));
    }
    
    @Test
    public void testSingleCharacterStringsDifferent() {
        String[] strs = {"a", "b", "c"};
        assertEquals("Should return empty for different single characters", 
                     "", prefix.longestCommonPrefix(strs));
    }
}