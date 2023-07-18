import java.util.*;
public class ternary {
    public static void main(String args[]) {
        int number = 6;

        //ternary operator
        String type = ((number%2) == 0) ? "even" : "odd";
        System.out.println(type);
    }

}