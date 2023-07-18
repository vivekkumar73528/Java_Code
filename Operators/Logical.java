import java.util.*;

public class Logical {
    public static void main(String args[]) {
        // 1.Logical AND
        /*
         * System.out.println((3>2) && (5>0)); // T && T
         * System.out.println((3>1) && (5>6)); // T && F
         * System.out.println((3>5) && (5>3)); // F && T
         * System.out.println((3>4) && (5>6)); // F && F
         */

        // 2.Logical OR
        /*
         * System.out.println((3>2) || (5>0)); // T || T
         * System.out.println((3>1) || (5>6)); // T || F
         * System.out.println((3>5) || (5>3)); // F || T
         * System.out.println((3>4) || (5>6)); // F || F
         */

        // 3.Logical NOT
        System.out.println(!(3 > 2)); // T ! F
        System.out.println(!(3 > 4)); // F ! T

    }
}