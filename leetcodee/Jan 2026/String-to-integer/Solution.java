package leetcodee.Jan 2026.String-to-integer;

class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) return 0;

        int n = s.length();
        int i = 0;

        // 1. Skip leading whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        if (i == n) return 0;

        // 2. Check for sign
        int sign = 1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // 3. Convert digits and handle overflow
        int result = 0;
        while (i < n) {
            char curr = s.charAt(i);
            if (curr < '0' || curr > '9') break;

            int digit = curr - '0';

            // Check for overflow: 
            // Integer.MAX_VALUE / 10 is 214748364
            if (result > Integer.MAX_VALUE / 10 || 
               (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
}
