/*
    *Given an integer x, return true if x is a palindrome, and false otherwise.

    *Example 1:

    *Input: x = 121
    *Output: true
    *Explanation: 121 reads as 121 from left to right and from right to left.
    *Example 2:

    *Input: x = -121
    *Output: false
    *Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
    *Example 3:

    *Input: x = 10
    *Output: false
    *Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
    

    *Constraints:

    *-2^31 <= x <= 2^31 - 1
 */

import java.util.ArrayList;

public class PalindromeNumber {

    public static void main(String[] args) {
        int x = 0;
        System.out.println(Solution(x));
    }

    public static boolean Solution(int x) {
        ArrayList<Integer> digits = new ArrayList<>();
        if (x < 0)
            return false;
        while (x > 0) {
            digits.add(x % 10);
            x = x / 10;
        }

        for (int i = 0; i < digits.size(); i++) {
            if (digits.get(i) != digits.get(digits.size() - 1 - i))
                return false;
        }
        return true;
    }

}
