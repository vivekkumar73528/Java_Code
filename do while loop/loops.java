//1. Print Hello Guys
/*import java.util.*;
public class loops {
    public static void main(String args[]) {
        int counter = 1;
        do {
            System.out.println("Hello Guys");
            counter++;
        } while(counter <= 10);

    }
}*/

//2. to exit the loop
/*import java.util.*;
public class loops {
    public static void main(String args[]) {
       for(int i=0; i<=5; i++) {
        if(i == 4) {
            break;
        }
        System.out.println(i);
       }
       System.out.println("I am out of the loop.");
    }
}*/

//3. Keep entering numbers till user enters a multiple of 10.
/*import java.util.*;
public class loops {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
         
        do{
            System.out.print("enter your number : ");
            int n = sc.nextInt();
            if(n % 10 == 0) {
                break;
            }
            System.out.println(n);
        } while(true);
    }
}*/

//4. Continue 
/*import java.util.*;
public class loops {
    public static void main(String args[]) {
        for(int i=1; i<=5; i++) {
            if(i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}*/

//5.Display all numbers entered by user except multiples of 10
/*import java.util.*;
public class loops {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("enter your number : ");
            int n = sc.nextInt();
            if(n % 10 == 0) {
                break;
            }
            System.out.println("number was : " + n);
        } while(true);
    }
}*/

//6.Check if a number is prime or not
/*import java.util.*;
public class loops {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 2) {
            System.out.println("n is prime");
        } else {
            boolean isPrime = true;
            for(int i=2; i<=n-1; i++) {
                if(n % i == 0) {
                    isPrime = false;
                }
            }
            if(isPrime == true) {
                System.out.println("n is prime");
            } else {
                System.out.println("n is not prime");
            }
        }
    }
}*/