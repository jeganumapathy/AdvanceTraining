public class Sum2dArray {
    public static void main(String[] args) {
        int A[][] = {{1,2,3},{2,3,4}};
        int n = A.length;
        int sum =0;
        int contribution=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                contribution=(i+1)*(j+1)*(n-i)*(n-j);
                sum = sum + contribution * A[i][j];
            }
        }
        System.out.println(sum);
    }
}
