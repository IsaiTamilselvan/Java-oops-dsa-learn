class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int totalSum = 0;
        
        for (int num : arr) {
            totalSum += num;
        }
        
        for (int length = 3; length <= arr.length; length += 2) {
            int currentWindowSum = 0;
            
            for (int i = 0; i < length; i++) {
                currentWindowSum += arr[i];
            }
            totalSum += currentWindowSum;
            
            for (int i = length; i < arr.length; i++) {
                currentWindowSum += arr[i] - arr[i - length];
                totalSum += currentWindowSum;
            }
        }
        
        return totalSum;
    }
}
