package array;

//https://www.hackerrank.com/challenges/2d-array/
public class HourglassSum {
    static int hourglassSum(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr[0].length - 2; j++) {
                int sum = arr[i + 1][j + 1];
                for (int k = j; k < j + 3; k++)
                    sum += arr[i][k] + arr[i + 2][k];
                if (sum > maxSum) maxSum = sum;
            }
        }
        return maxSum;
    }
}