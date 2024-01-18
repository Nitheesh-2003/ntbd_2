import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestAnagramChecker {
    @Test
    public void testAnagramCheckerAnagram(){
        assertEquals(true,Anagram.anagramChecker("silent","listen"));
        assertEquals(true,Anagram.anagramChecker("act","cat"));
    }

    @Test
    public void testAnagramCheckerNonAnagram(){
        assertEquals(false,Anagram.anagramChecker("hello","world"));
        assertEquals(false,Anagram.anagramChecker("java","python"));
    }

    @Test
    public void testAnagramCheckerWithSpaces() {
        assertEquals(true,Anagram.anagramChecker("Astronomer", "Moon starer"));
        assertEquals(true,Anagram.anagramChecker("dormitory", "dirty room"));
    }

    @Test
    public void testAnagramCheckerWithDifferentCases() {
        assertEquals(true,Anagram.anagramChecker("Debit Card", "Bad Credit"));
        assertEquals(true,Anagram.anagramChecker("Race", "Care"));
    }
    
    @Test
    public void testAnagramCheckerWithNumbers() {
        assertEquals(true,Anagram.anagramChecker("12345", "54321"));
        assertEquals(false,Anagram.anagramChecker("123", "3210"));
    }

    @Test
    public void testAnagramCheckerWithEmptyStrings() {
        assertEquals(true,Anagram.anagramChecker("", ""));
    }

    @Test
    public void testAnagramCheckerWithMixedCharacters() {
        assertEquals(true,Anagram.anagramChecker("aBcD", "DCbA"));
        assertEquals(false,Anagram.anagramChecker("abc", "123"));
    }

    @Test
    public void testAnagramCheckerWithSpecialCharacters() {
        assertEquals(true,Anagram.anagramChecker("listen!", "!silent"));
        assertEquals(false,Anagram.anagramChecker("hello", "h@llo"));
    }
}
