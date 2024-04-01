import java.util.Arrays;
public class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1;
        
        for (int i = n - 1; i >= 0; i--) {
            digits[i] += carry;
            carry = digits[i] / 10;
            digits[i] %= 10;
        }
        
        if (carry > 0) {
            int[] result = new int[n + 1];
            result[0] = carry;
            System.arraycopy(digits, 0, result, 1, n);
            return result;
        } else {
            return digits;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] digits = {1,9,9};
        int[] result = solution.plusOne(digits);
        System.out.println(Arrays.toString(result)); // Output: [1, 2, 4]
    }
}

