import java.util.*;
public class Bits {
    public static void main(String args[]) {
        int n = 5;
        int pos = 2;
        int bitmask = 1<<pos;

        //Get binary value

        if((bitmask & n) == 0) {
            System.out.println("bit was zero");
        } else {
            System.out.println("bit was one");
        }
    }
}