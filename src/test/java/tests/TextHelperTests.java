package tests;

import org.example.helpers.TextHelper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Tests for TextHelper class.
 */
public class TextHelperTests {
    private final TextHelper textHelper = new TextHelper();

    @Test
    public void testAnagramTrue() {
        assertTrue(textHelper.isAnagram("listen", "silent"), "Expected true for anagrams");
    }

    @Test
    public void testAnagramTrue2() {
        assertTrue(textHelper.isAnagram("anagram", "nagaram"), "Expected true for anagrams");
    }

    @Test
    public void testAnagramTrueCaseSensitivity() {
        assertTrue(textHelper.isAnagram("Listen", "Silent"), "Expected true for anagrams with different cases");
    }

    @Test
    public void testAnagramWithWhiteSpaces() {
        assertTrue(textHelper.isAnagram("conversation", "voices rant on"), "Expected true for anagrams with white spaces");
    }

    @Test
    public void testAnagram_WithNumbers() {
        assertTrue(textHelper.isAnagram("12345", "54321"), "Expected true for anagrams with numbers");
    }

    @Test
    public void testAnagramFalse() {
        assertFalse(textHelper.isAnagram("hello", "world"), "Expected false for non-anagrams");
    }

    @Test
    public void testAnagramFalse2() {
        assertFalse(textHelper.isAnagram("rat", "car"), "Expected false for non-anagrams");
    }

    @Test
    public void testAnagramEmptyStrings() {
        assertFalse(textHelper.isAnagram("", ""), "Expected false for empty strings");
    }

    @Test
    public void testAnagramDifferentLengths() {
        assertFalse(textHelper.isAnagram("abc", "abcd"), "Expected false for strings of different lengths");
    }

    @Test
    public void testAnagramNullInput1() {
        assertFalse(textHelper.isAnagram(null, "test"), "Expected false for null input");
    }

    @Test
    public void testAnagramNullInput2() {
        assertFalse(textHelper.isAnagram("test", null), "Expected false for null input");
    }
}
