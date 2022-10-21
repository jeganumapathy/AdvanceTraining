import java.util.Arrays;

public class Rotate {


    public static void main(String[] args) {
        int[] A = { 1, 1, 4, 9, 4, 7, 1 };
        int B = 9;
    }

    public static int[] reverse(int[] A,int si,int sj){
        int start = si;
        int end = sj;
        if(start == end){
            return A;
        }
        while(start<end){
            swap(start,end,A);
            start++;
            end++;
        }
        return A;
    }
    public static  void swap(int x,int y,int[] A){
        int temp = A[x];
        A[x]=A[y];
        A[y]= temp;
    }
}
