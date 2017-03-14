/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.
*/
import java.util.*;

public class twosum 
{ 
        
    //This method use two for loop. O(n) is n2.
    private static int[] mysolution1 (int[] nums, int target)
    {
        int[] result = {-1, -1};
        for(int i =0; i < nums.length-1; i++)
        {
            for (int j=i+1; j < nums.length; j++)
            {
                if (nums[i] + nums[j] == target)
                {
                    result[0] =i;
                    result[1] =j;
                   break;
                }
            }
        }
        return result;        
    }//solution1 end.

    //This method sort list first. then use binary search. O(n) is nlog(n).
    private static int[] mysolution2(int[] nums, int target)
    {
        int[] result = {-1, -1};
        //copy original
        int[] original = new int[nums.length];
        for (int m=0; m<nums.length; m++)
        {
            original[m] = nums[m];
        }
                
        Arrays.sort(original);
        int i, j, sum;
        int find1 =-1;
        int find2 =-1;
        
        i = 0;// one pointer to start
        j = original.length-1;// another pointer to end
        
        while(i<=j)
        {
            sum = original[i] + original[j];         
            if (sum == target)//find target
            {
                find1 = original[i];//samller one
               find2 = original[j];
                 break;
            }
            else if (sum < target)
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        
        for (int m=0; m<nums.length; m++)
        {
            if (find1 == nums[m] || find2 == nums[m])
            {
                if (result[0] == -1)
                {
                    result[0] = m;      
                }
                else
                {
                    result[1] = m;  
                    break;
                }
            }

        }
        
        return result;        
    }//solution2 end.    
    
    
    public static void main (String[] args) 
        {
            int[] list = {3,3};
            int[] myresult = mysolution2(list, 6);            

            System.out.println("");

            System.out.println("Result: " + myresult[0] + " " + myresult[1]);           

        }
}
            
          
