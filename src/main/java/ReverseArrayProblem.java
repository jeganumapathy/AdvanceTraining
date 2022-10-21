import java.util.Arrays;

public class ReverseArrayProblem {

    public static void main(String[] args) {
        int[] A = {1, 1, 4, 9, 4, 7, 1};//[1, 7, 4, 9, 4, 1, 1]
        int B = 2;
        //Arrays.stream(rotate(A, B)).forEach(System.out::print);
        int[] A_ = {1, -2, 5, 2, -1, 6};
        int[] B_ = {5, 2, -1};
        int[] C_ = {-2, -1, 6};
        int[] D_ = {1, -2, 5, 2};
        int[] E_ = {6};
        System.out.println("is Subarray"+isSubArray(A_,B_));;

    }

    static boolean isSubArray(int A[], int B[]
                              ) {
        int n=A.length;
        int m=B.length;
        // Two pointers to traverse the arrays
        int i = 0, j = 0;

        // Traverse both arrays simultaneously
        while (i < n && j < m) {

            // If element matches
            // increment both pointers
            if (A[i] == B[j]) {

                i++;
                j++;

                // If array B is completely
                // traversed
                if (j == m)
                    return true;
            }

            // If not,
            // increment i and reset j
            else {
                i = i - j + 1;
                j = 0;
            }
        }
        return false;
    }


    public static int[] rotate(int[] A, int B) {
        int n = A.length;
        if (B > n) {
            B = B % n;
        }
        if (B == n || B == 0) {
            return A;
        }
        solve(A, 0, n - 1);
        solve(A, 0, B - 1);
        solve(A, B, n - 1);
        return A;

    }

    public static int[] solve(int[] A, int B, int C) {
        int start = B;
        int end = C;
        int result[] = new int[A.length];
        if (start == end) {
            result[start] = A[start];
            return result;
        }
        while (start < end) {
            swap(start, end, A);
            start++;
            end--;
        }
        return A;
    }

    public static void swap(int a, int b, int[] A) {
        int temp = A[a];
        A[a] = A[b];
        A[b] = temp;
    }

}
