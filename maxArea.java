/**
Given n non-negative integers a1, a2, ..., an, 
where each represents a point at coordinate (i, ai). 
n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). 
Find two lines, which together with x-axis forms a container, 
such that the container contains the most water.

Key point is when select a area, between (0) point and most right, which has most wide.
Then possible more bigger area, is move smaller (left, or right) to the middle.
increase the level of water.

 */
import java.util.*;

public class maxArea 
{    
    
    private static int mysolution (int[] height)
    {
		int maxA =0;
		int left = 0;
		int right = height.length-1;
		
		// go through all the list
        while (left < right)
		{
			maxA = Math.max(maxA, Math.min(height[left], height[right]) * (right - left)  );
			
			// move smaller to the middle
			if (height[left] < height[right])
			{
				left ++;
			}
			else
			{
				right --;
			}
		}
        return maxA;
        
    }//solution end
    

}