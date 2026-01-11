package leetcodee.Jan 2026.zigzag-conversion;

class Solution {
    public String convert(String s, int numRows) {
        // Edge case: If only 1 row is requested, or the string is 
        // shorter than the row count, no zigzagging happens.
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        // Initialize a list of StringBuilders for each row
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);

            // If we are at the top or bottom row, flip the direction
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            // Move the pointer up or down
            currentRow += goingDown ? 1 : -1;
        }

        // Combine all rows into a single result string
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}