package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] A = {1,3,5,8,11,4};
        int n = A.length;
        int temp=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if (A[j - 1] > A[i]) {
                    temp = A[j - 1];
                    A[j - 1] = A[i];
                    A[i] = temp;
                }
            }
        }
        Arrays.stream(A).forEach(System.out::println);
        Math.log()
    }
}
