import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SumOfIndex {

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        int[] a_ = {1,2,3,4,5};
        Arrays.stream(a_).forEach(A::add);
        int[][] b_ = {{0,2},{1,4}};
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();

        Arrays.stream(b_).forEach(
                it-> {
                    ArrayList<Integer> temp = new ArrayList<>();
                    Arrays.stream(it).forEach(temp::add);
                    B.add(temp);
                }
        );
        sumOfOddIndex(A,B);
    }

    private static ArrayList<Integer> sumOfOddIndex(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        int sum = 0;
        int n = A.size();
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                sum = sum + A.get(i);
            }
            A.set(i,sum);
        }
        int[] answer = new int[B.size()];
        int L = 0;
        int R = 0;
        for (int i = 0; i < B.size(); i++) {
            L=B.get(i).get(0);
            R=B.get(i).get(1);
            answer[i]=A.get(R)-(L!=0?A.get(L-1):0);

        }
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.stream(answer).forEach(result::add);
        return result;
    }


}
