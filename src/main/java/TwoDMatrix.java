/**
 * Problem Description
 * Given a matrix of integers A of size N x M and an integer B.
 * In the given matrix every row and column is sorted in non-decreasing order. Find and return the position of B in the matrix in the given form:
 * If A[i][j] = B then return (i * 1009 + j)
 * If B is not present return -1.
 * <p>
 * Note 1: Rows are numbered from top to bottom and columns are numbered from left to right.
 * Note 2: If there are multiple B in A then return the smallest value of i*1009 +j such that A[i][j]=B.
 * Note 3: Expected time complexity is linear
 * Note 4: Use 1-based indexing
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N, M <= 1000
 * -100000 <= A[i] <= 100000
 * -100000 <= B <= 100000
 * <p>
 * <p>
 * Input Format
 * The first argument given is the integer matrix A.
 * The second argument given is the integer B.
 * <p>
 * <p>
 * Output Format
 * Return the position of B and if it is not present in A return -1 instead.
 * <p>
 * <p>
 * Example Input
 * Input 1:-
 * A = [[1, 2, 3]
 * [4, 5, 6]
 * [7, 8, 9]]
 * B = 2
 * Input 2:-
 * A = [[1, 2]
 * [3, 3]]
 * B = 3
 * <p>
 * <p>
 * Example Output
 * Output 1:-
 * 1011
 * Output 2:-
 * 2019
 */

public class TwoDMatrix {

    public static void main(String[] args) {
        int[][] A =
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        int B = 2;
        int n = A.length;
        int m = A[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A[i][j] == B) {
                    System.out.println(i * 1009 + j);
                }

            }
        }
        System.out.println(-1);
    }
}
