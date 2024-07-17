import java.util.*;

class Solution {
    public static  int findDuplicate(int[] nums) {
        
        for(int n : nums){
            if(nums[Math.abs(n)] < 0){
                return Math.abs(n);
            }else{
                nums[Math.abs(n)] *= -1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums={1,3,4,2,2};
        int res=findDuplicate(nums);
        System.out.println(res);
    }
}