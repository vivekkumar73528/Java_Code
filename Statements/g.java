import java.util.*;

import java.util.*;
public class g {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        boolean a = (year % 2) == 0;
        boolean b = (year % 50) != 0;
        boolean c = (year % 100 == 0) && (year % 200 == 0);

        if(a && (b || c)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + "");
        }
    }
}