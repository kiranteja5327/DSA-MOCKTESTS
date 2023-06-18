/*
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well. You must not use any built-in exponent function or operator. 

 Example 1:
Input: x = 4 Output: 2 Explanation: The square root of 4 is 2, so we return 2.
Example 2:

Input: x = 8 Output: 2 Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
Constraints:

0 <= x <= 231 - 1

 */
public class QUESTION01 {
    public static int mySqrt(int x) 
    {
        if (x == 0 || x == 1) {
            return x;
        }
        
        long left = 1;
        long right = x;
        
        while (left <= right) {
            long mid = left + (right - left) / 2;
            
            if (mid * mid == x) {
                return (int) mid;
            } else if (mid * mid < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return (int) right;
    }
    
    public static void main(String[] args) {
        int x1 = 4;
        int result1 = mySqrt(x1);
        System.out.println(result1);
        
        int x2 = 8;
        int result2 = mySqrt(x2);
        System.out.println(result2);
    }
}
