import javax.naming.ldap.SortControl;
import java.util.Timer;

public class BitWiseOperator {

    public static void main(String... args) {
        //performOR(1,2);
        //performAND(9,8);
        //System.out.println(Math.pow(2, 200));
        long time = System.nanoTime();
        System.out.println(time);
        for (int i = 0; i < 1000000000; i++) {
            for (int j = 0; j < 1000000000; j++) {

            }
        }
        System.out.println("Completed in "+(time-System.nanoTime()));
    }

    public static void performOR(int a, int b) {
        System.out.println(a | b);
    }

    public static void performAND(int a, int b) {
        System.out.println(a & b);
    }

}
