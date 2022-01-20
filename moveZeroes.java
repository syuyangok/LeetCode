package edu.gatech.dp;

/**
 * @author : Yuyang Sun
 * @date: 1/20/2022, Thu
 **/
// Given int array, move all 0 to end.
//leetcode 283

public class moveZeroes {

    public void solution(int[] nums) {
        //find lenth
        int n = nums.length;


        //move non-zero char to left
        int front =0;
        int back = 0;
        for (back = 0; back <n; back++){
            // find first zero position
            while (nums[front] != 0) {
                if (front == n-1) break;
                front++;
            }
            //find not zero, move to first 0
            if(nums[back] !=0 && back > front){
                //move to front position
                nums[front] = nums[back];
                nums[back] = 0;
            }


        }


        //set rest to zero
    }
    public static void main(String[] args) {

    }
}
