//1.How many times "Hello" is printed?
/*public class loops {
    public static void main(String args[]) {
        for(int i=0; i<5; i++) {
            System.out.println("Hello");
            i += 2;
        }
    }
}*/

//2.Write a program that reads a set of integers and then prints the sum of the even and odd integers.
/*import java.util.*;
public class loops {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do{ 
            System.out.println("Enter the number: ");
            number = sc.nextInt();

            if(number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
            System.out.println("Do you want to continue? Press yes for 1 and 0 for no");
            choice = sc.nextInt();
        } while(choice == 1);
        System.out.println("Sum of even number : " + evenSum);
        System.out.println("Sum of odd number : " + oddSum);

    }
}*/

//3.Write a progrom to find the factorial of any number entered by the user.
/*import java.util.*;
public class loops {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num;
        int fact = 1;

        System.out.println("Enter any positive number : ");
        num = sc.nextInt();

        for(int i=1; i<=num; i++) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);
    }
}*/

//4.Write a program to print the multiplication table of n number N, enterad by y the user.
/*import java.util.*;
public class loops {
    public static void printMultiplicationTable(int number) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        for(int i=1; i<=10; i++) {
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
    public static void main(String args[]) {
        printMultiplicationTable(5);
    }
}*/


//5.Write is wrong in the following program?
/*public class loops {
    public static void main(String args[]) {
        for(int i=0; i<=5; i++) {
            //System.out.println("i = " + i);
        }
        System.out.println("i after the loop = " + i);
    }
}*/

