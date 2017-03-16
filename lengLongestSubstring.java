/*
 *Given a string, find the length of the longest substring without repeating characters
 * Given "bbbbb", the answer is "b", with the length of 1
 * Given "pwwkew", the answer is "wke", with the length of 3.
 *
 */

import java.util.*;

public class lengLongestSubstring 
{
    //working good.
    public static int mysolution(String s) 
    {
    int start = 0, end = 0, max = 0;
    Set<Character> myset = new HashSet();
    
    while (end < s.length()) 
    {
        if (!myset.contains(s.charAt(end)))//if not duplicate 
        {
            myset.add(s.charAt(end));//add char to sets
            max = Math.max(max, myset.size());//keep max update
            end++;
        } 
        else //keep removing start until removed duplicate
        {
            myset.remove(s.charAt(start));
            start++;
        }
    }
    
    return max;
}
       
    public static void main (String[] args)
    {
        String str = "abcdcd";
        int result;
        result = mysolution(str);
        System.out.println("Result: " + result);
    }
}