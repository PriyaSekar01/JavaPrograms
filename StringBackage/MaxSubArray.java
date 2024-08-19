package StringBackage;

public class MaxSubArray {

    int maxSubValue(int[] numbers) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return sum;
    }
}

