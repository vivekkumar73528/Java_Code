import java.util.*;
public class Bits2 {
    public static void main(String args[]) {
       int n = 5;
       int pos = 2;
       int bitMask = 1<<pos;
       int notBitMask = ~(bitMask);

       //Clear pos bit

       int newNumber = notBitMask & n;
       System.out.println(newNumber);
    }
    
}
