import java.io.IOException;
import java.util.*;

/**
 * //continous part of the array
 * Total sub array of N is n(n+1)/2
 * Brute force
 * TC O(n^3)
 *
 * Prefix sum Array
 * ps[i]=ps[i-1]+A[i]
 * TC O(n^2)
 */
public class MaxSubArraySum {
    public static void main(String[] args) throws IOException {
        Object[] arr = {new Integer(6),new String("test")};
       // Arrays.sort(arr);
        ArrayDeque<Integer> a = new ArrayDeque<>();
        a.offer(18);
        a.offer(5);
        a.push(13);
        //System.out.println(a.poll() +"-"+a.poll());
        Set ha = new HashSet();
        ha.add("one");
        ha.add("two");
        ha.add("three");
        ha.add("four");
        ha.add("one");
        ha.add("four");
        List li = new ArrayList();
        li.add("one");
        li.add("two");
        li.add("three");
        ha.retainAll(li);
        // System.out.println("Size "+li.size()+ha.size());
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(2);
        ts.add(3);
        ts.add(7);
        ts.add(5);
        SortedSet ss = ts.subSet(1,7);
        ss.add(4);
        ss.add(6);
        //System.out.println(ss);
        Set<data> has = new HashSet();
        has.add(new data(4));
        has.add(new data(2));
        has.add(new data(4));
        has.add(new data(1));
        has.add(new data(2));

    }
    public static class  data{
        int d ;
        public data(int d){
            this.d =d;
        }

        public boolean equals(Object obj) {
            return true;
        }

        public int hashCode() {
            return 1;
        }
    }
}
