import java.util.Arrays;

public class Main {

    // A simple class to hold one test scenario
    static class TestCase {

        String tag;
        int[] nums;
        int target;
        int[] expected;

        TestCase(String tag, int[] nums, int target, int[] expected) {
            this.tag = tag;
            this.nums = nums;
            this.target = target;
            this.expected = expected;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Define testscenarios
        TestCase[] tests = {
            // tag: example1, nums = [2, 7, 11, 15], target =9, output: [0, 1]
            new TestCase(
                "Example 1",
                new int[] { 2, 7, 11, 15 },
                9,
                new int[] { 0, 1 }
            ),
            // tag: example2, nums = [3, 2, 4], target = 6, output :[1, 2]
            new TestCase(
                "Example 2",
                new int[] { 3, 2, 4 },
                6,
                new int[] { 1, 2 }
            ),
            // tag: example3, nums = [3, 3], target = 6, output: [0,1]
            new TestCase(
                "Example 3",
                new int[] { 3, 3 },
                6,
                new int[] { 0, 1 }
            ),
        };

        // Test Runner
        for (TestCase test : tests) {
            int[] actual = solution.twoSum(test.nums, test.target);

            // if ( actual == test.expected ){
            if (Arrays.equals(actual, test.expected)) {
                System.out.println("PASSED: " + test.tag);
            } else {
                System.out.println("FAILED: " + test.tag);
                System.out.println("Input: " + Arrays.toString(test.nums));
                System.out.println("Target: " + test.target);
                System.out.println(
                    "Expected: " + Arrays.toString(test.expected)
                );
                System.out.println("Output: " + Arrays.toString(actual));
            }
        }
    }
}

class Solution {

    public int[] twoSum(int[] nums, int target) {
        // input validation
        // check if array is null
        // check if array meets the constraint (length >= 2)
        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException(
                "Input array must contain at least 2 numbers"
            );
        }
        return naiveApproach(nums, target);
    }

    static int[] naiveApproach(int[] nums, int target) {
        for (int i = 0; i <= nums.length; i++) {
            // check sums ; not use the same number more than once
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    int[] arr = { i, j };
                    return arr;
                }
            }
        }
        return new int[] {};
    }

    static int[] hashmapApproach(int[] nums, int target) {
        return nums;
    }
}
