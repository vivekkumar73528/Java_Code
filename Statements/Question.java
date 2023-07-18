/*import java.util.*;
public class Question {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
 
       if(x > 0) {
        System.out.println("x is greater than 0");
       } else {
        System.out.println("x is less then 0");
       }
    }
}*/

/*import java.util.*;
public class Question {
    public static void main(String args[]) {
        double temp = 103.5;

        if(temp > 100) {
            System.out.println("You have a fever");
        } else {
            System.out.println("You don't have fever");
        }
    }
}*/

/*import java.util.*;
public class Question {
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     System.out.print("enter week number (1-7) : ");
     int number = sc.nextInt();

     switch(number) {
        case 1 : System.out.println("Sunday");
               break;
        case 2 : System.out.println("Monday");
               break;
        case 3 : System.out.println("Tuesday");
               break;
        case 4 : System.out.println("Wednesday");
               break;
        case 5 : System.out.println("Thrusday");
               break;
        case 6 : System.out.println("Friday");
               break;
        case 7 : System.out.println("Saturday");
               break;
        default : System.out.println("enter Invalid number of week (1-7)");                                                 
     }
    }
}*/

/*public class Question {
    public static void main(String args[]) {
        int a = 63, b = 36;

        boolean x = (a < b) ? true : false ;
        System.out.println(x);

        int y = (a > b) ? a : b;
        System.out.println(y);
    }
}*/

import java.util.*;
public class Question {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the year: ");
        int year = sc.nextInt();

        boolean a = (year % 4) == 0;
        boolean b = (year % 100) != 0;
        boolean c = (year % 100 == 0) && (year % 400 == 0);

        if(a && (b || c)) {
            System.out.println(year + " is a year leep");
        } else {
            System.out.println(year + " is not a year leep");
        }

    }
}