import java.util.*;
public class Bits1 {
    
    public static void main(String args[]) {
        int n = 5;
        int pos = 1;
        int bitmask = 1<<pos;

        //set binary value

        int newNumber = bitmask | n;
        System.out.println(newNumber);
    }
}

