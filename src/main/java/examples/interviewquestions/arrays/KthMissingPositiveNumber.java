package examples.interviewquestions.arrays;

public class KthMissingPositiveNumber {

    public static int findKthPositive(int[] arr, int k) {
        int missingCount = 0;
        int current = 1;
        int i = 0;

        while (missingCount < k) {
            if (i < arr.length && arr[i] == current) {
                i++;
            } else {
                missingCount++;
                if (missingCount == k) {
                    return current;
                }
            }
            current++;
        }
        return current;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
        int result = findKthPositive(arr, k);
        System.out.println("The " + k + "th missing positive number is: " + result);
    }
}
