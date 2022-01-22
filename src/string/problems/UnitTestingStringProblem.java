package stringproblems;

import org.junit.Assert;
import org.junit.Test;



import java.util.*;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.

    }


    @Test
    public void testAnagram() {
        boolean actualResult = stringproblems.Anagram.isAnagram("cat", "tac");
        Assert.assertNotEquals("Test Fail", false, actualResult);
    }

    @Test
    public void testLargestWord() {
        String str = "Human brain is a biological learning machine";
        Map<Integer, String> map = new HashMap<>();
        map = stringproblems.DetermineLargestWord.findTheLargestWord(str);
        String expectedResult = "biological";
        String actualResult = "";
        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            actualResult = entry.getValue();
        }
        Assert.assertEquals("Test fail", expectedResult, actualResult);
    }


    // Test Duplicate Words
    @Test
    public void testDuplicateWord() {
        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        Map<Integer, String> hm= new HashMap<>();
        String expectedResult = hm.put(11, "programming");
        Map<Integer, String> actualResult = stringproblems.DetermineLargestWord.findTheLargestWord(st);
        Assert.assertEquals("Test Fail", expectedResult,actualResult );
    }

    // Test Palindrome
    @Test
    public void testPermutation() {
        Set<String> expectedResult = new HashSet<>(Arrays.asList("bob", "obb", "bbo"));
        Set<String> actualResult = stringproblems.Permutation.getPermutation("bob");
        Assert.assertEquals("Test Fail", expectedResult, actualResult);
    }

    // Test Permutation
    @Test
    public void testPalindrome() {
        boolean actualResult = stringproblems.Palindrome.checkPalindrome("MADAM");
        Assert.assertNotEquals("Test Fail", false, actualResult);
    }


}

