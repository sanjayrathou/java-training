package OOPS;
import java.util.*;
class Solution {
    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }else digits[i]=0;
        }
        int ans[]=new int[digits.length+1];
        Arrays.fill(ans,0);
        ans[0]=1;
        return ans;
    }

    public static void main(String[] args) {
        int[]  arr  = {9,9,9};
        Solution.plusOne(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }
}