import java.util.function.BiFunction;
import java.util.function.Function;

public class Recursion {

    /**
     * Assume or trust
     * Main Logic
     * Exit condition
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(sum(2));
        BiFunction<BiFunction, Double, Double> factHelper =
                (f, n) -> (n == 0) ? 1 : n+(double)f.apply(f,n-1);
        Function<Double, Double> fact =
                x -> factHelper.apply(factHelper, x);

    }
    


    public static int sum(int n){
        if(n==1)return 1;
        return sum(n-1)+n;
    }

    public static int fact(int n ){
        if(n==0)return 1;
        return fact(n-1)*n;
    }
    public static int print(int i,int n ){
        if(i==n)return 0;
        System.out.println(i);
        return print(i++,n);
    }

    //implement power function
}
