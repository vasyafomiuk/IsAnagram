package org.example.helpers;

import java.util.Arrays;

public class TextHelper {

    /**
     * Checks if two strings are anagrams of each other.
     * Strings should be exact same length and contain the same characters. White spaces are ignored.
     *
     * @param s first string
     * @param t second string
     * @return true if the strings are anagrams, false otherwise
     */
    public boolean isAnagram(String s, String t) {
        if (this.isEmpty(s) || this.isEmpty(t)){
            return false;
        }

        char[] sChars = s.toLowerCase().replaceAll("\\s+", "").toCharArray();
        char[] tChars = t.toLowerCase().replaceAll("\\s+", "").toCharArray();

        if (sChars.length != tChars.length) {
            return false;
        }

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }

    public boolean isEmpty(String s) {
        return s == null || s.isEmpty();
    }
}
