import java.util.ArrayList;
import java.util.Collections;

public class SortingProblem {

    /**
     * Given an integer array A of size N. You can remove any element from the array in one operation.
     * The cost of this operation is the sum of all elements in the array present before this operation.
     *
     * Find the minimum cost to remove all elements from the array.
     */
    public static int minCost(ArrayList<Integer> A){
        int n = A.size();
        if(n==0){
            return 0;
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=A.get(i);
        }
        Collections.sort(A);
        int ans=0;
        int diff=0;
        for(int i=n-1;i>=0;i--){
            ans+=(sum-diff);
            diff+=A.get(i);
        }
        return ans;
    }
}
