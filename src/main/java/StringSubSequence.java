/**
 * You have given a string A having Uppercase English letters.
 * <p>
 * You have to find how many times subsequence "AG" is there in the given string.
 * <p>
 * NOTE: Return the answer modulo 109 + 7 as the answer can be very large.
 */
public class StringSubSequence {

    public static void main(String[] args) {
        String A = "ABCGAG";
        int n = A.length();
        int a_count=0;
        int current=0;
        int mod = (int)Math.pow(10,9)+7;
        for (int i = 0; i <n; i++) {
            int index = A.charAt(i);
            if(index =='A'){
                a_count++;
            } else if (index == 'G') {
                current = (current+a_count)%mod;
            }
        }
        int ans = current%mod;
        System.out.println(ans);

    }
}
