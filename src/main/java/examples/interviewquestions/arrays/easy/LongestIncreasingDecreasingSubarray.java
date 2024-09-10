package examples.interviewquestions.arrays.easy;

public class LongestIncreasingDecreasingSubarray {
    public static int longestSubarray(int[] nums) {
        if (nums.length == 0) return 0;

        int maxLength = 1;
        int incLength = 1;
        int decLength = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                incLength++;
                decLength = 1;
            } else if (nums[i] < nums[i - 1]) {
                decLength++;
                incLength = 1;
            } else {

                incLength = 1;
                decLength = 1;
            }

            maxLength = Math.max(maxLength, Math.max(incLength, decLength));
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 2, 1, 4, 5};
        System.out.println("Longest strictly increasing or decreasing subarray length: " + longestSubarray(nums));

    }
}
