package arrayProgram;

public class Solution {
    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        int target = 9;
        int len = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == target) {
                    System.out.println(arr[i] + "," + arr[j]);
                }
            }
        }
    }
}