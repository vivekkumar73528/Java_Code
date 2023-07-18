//1. Take an array of Strings input from the user & find the cumlative(combind) length of all those strings.
import java.util.*;
public class Strings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String array[] = new String[size];
        int totLength = 0;

        for(int i=0; i<size; i++) {
            array[i] = sc.next();
            totLength += array[i].length();

        }

        System.out.println(totLength);
    }
}
/*Ex:- output : 2 take to string
                hello
                hi
                7(total string character is 7)*/

               