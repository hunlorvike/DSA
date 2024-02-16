public class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (str1.equals(str2)) {
            return str1;
        }

        if (str1.length() < str2.length()) {
            return gcdOfStrings(str2, str1);
        }

        if (str1.startsWith(str2)) {
            return gcdOfStrings(str1.substring(str2.length()), str2);
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        String result1 = solution.gcdOfStrings("ABCABC", "ABC");
        System.out.println("Example 1: " + result1); // Output: "ABC"

        // Example 2
        String result2 = solution.gcdOfStrings("ABABAB", "ABAB");
        System.out.println("Example 2: " + result2); // Output: "AB"

        // Example 3
        String result3 = solution.gcdOfStrings("LEET", "CODE");
        System.out.println("Example 3: " + result3); // Output: ""
    }

}
