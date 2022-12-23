import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Rotate {


    public static void main(String[] args) {
        int[] A = { 1, 1, 4, 9, 4, 7, 1 };
        int B = 9;
        String a = "interviewbit";
        ArrayList<ArrayList<Integer>> b = new ArrayList<>();
        ArrayList<Integer> temp =new ArrayList<>();
        temp.add(0);
        temp.add(4);
        ArrayList<Integer> temp2 =new ArrayList<>();
        temp2.add(9);
        temp2.add(10);
        b.add(temp);
        b.add(temp2);
        test2(a,b);
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

    public static void timestampcheck(int a){
        if((a&1)==1){
            System.out.println("This is a odd number");
        }else{
            System.out.println("This is a even number");
        }
    }


    public static int  test(int A,int B){
        int binary_number = 0;
        Queue<Integer> binarystring = new LinkedList<Integer>();
        for(int i=0;i<B;i++){
            binarystring.add(0);
        }
        for(int i=0;i<A;i++){
            binarystring.add(1);
        }
        int total = 0;
        int n = binarystring.size();
        for(int i=0;i<n;i++){
            int c  = binarystring.remove();
            System.out.println(c);

            total = total + (int)(c * (Math.pow(2,i)));
        }
        System.out.println(total);
        return total;
    }

    public static ArrayList<Integer> test2(String A, ArrayList<ArrayList<Integer>> B){
        ArrayList<Integer> ANS = new ArrayList();
        String vowels = new String("aeiou");
        int n=B.size();
        for(int i=0;i<n;i++){
            int count =0;
            String s = A.substring(B.get(i).get(0),B.get(i).get(1)+1);
            System.out.println(s);
            for(int j=0;j<vowels.length();j++){
                if(s.contains(""+vowels.charAt(j))){
                    count++;
                }
            }
            ANS.add(count);
        }
        System.out.println(ANS.toString());
        return ANS;
    }
}
