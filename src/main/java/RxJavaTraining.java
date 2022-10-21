import io.reactivex.rxjava3.core.*;
import io.reactivex.rxjava3.core.Observable;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.BiFunction;

public class RxJavaTraining {


    public static int solve(int D[]) {
        int A = -1,B =1,C=20;
        int result;
        int r = (int) Math.pow(A,B);
        result = r%C;
        return result;
    }


    public static ArrayList<Integer> solveTwoSum(int arr[],int target){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for (int j = i+1;j<arr.length; j++) {
                if(arr[i]+arr[j]==target){
                    result.add(i);
                    result.add(j);
                    return result;
                }
            }
        }
        return null;
    }

    public static int[] methodTwo(int arr[], int target ){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                return new int[] { map.get(complement), i };
            }else {
                map.put(arr[i],i);
            }
        }
        return new int[]{};
    }

    public static void flatmapObs(){
        String[] array = {"a","b","c"};
        Observable.fromArray(array).map(String::toUpperCase).subscribe(System.out::println);
        BiFunction<Integer,Integer,Double> mathPowerAnd = Math::pow;
        mathPowerAnd.apply(3,2);
        System.out.println("-----"+calculate( 3, 2, 2, Math::pow,(a3, a4) -> (a3 % a4)));
    }

    public static <R> R calculate(double a , double b, double c, BiFunction<Double, Double, Double> func,
                                 BiFunction<Double, Double, R> func2){
        double r1 = func.apply(a, b);
        return  func2.apply(r1,c);
    }
    /*Sort a binary tree in Linear Time*/
    public static void sortBinaryInLinearTime(){
        //Take input of Array
        int[] A = {0,1,0,1,1,1,1,1};
        Arrays.sort(A);
        Arrays.stream(A).forEach(System.out::println);
    }

        public static int solve(long A) {
            int result =0;
            int m = (int) (A/2);
            if(A==0 || A==1){
                return 0;
            }
            for(int i=1;i<=m;i++){
                if(A%i==0){
                    return 0;
                }
            }
            return 1;
    }


    public static void main(String[] args) throws InterruptedException {
        int arrray[] = {74, 9, 51, 51, 75, 0, 35, 89, 96, 77};
        int arrray2[] = {-15, -45, 43, 23, -63, 69, 35, 19, 37, -52};
        solve(23);
/*
        flatmapObs();
        sortBinaryInLinearTime();
*/
        //System.out.println(solve(arrray2));
/*
        int arr[] = {4 ,2 ,2 ,7 ,1};
        System.out.println(solveTwoSum(arr,9));
        System.out.println();
        Arrays.stream(methodTwo(arr,9)).forEach(System.out::println);
*/

        //Operator are intermediate function which does object tracking function
        /*String[] stringarray = {"array"};
        Observable.just("Create using just").subscribe(System.out::println);
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Created using fromIterable ");
        Observable.fromIterable(strings).subscribe(System.out::println);
        Observable.fromArray(stringarray).map(String::toUpperCase).subscribe(item -> System.out.println("Created using From "+ item));
        Observable.create((ObservableOnSubscribe<String>) emitter -> {
            emitter.onNext("Created form create method");
        }).subscribe(it -> System.out.println(""+it));*/

    }
}
