//1.write a java method to compute the average of three numbers. // use any variable like int,double,float etc.
/*import java.util.*;
public class Question {
   public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input the first number: ");
    float x = sc.nextFloat();
    System.out.print("Inter the secont number: ");
    float y = sc.nextFloat();
    System.out.print("Input the third number: ");
    float z = sc.nextFloat();
    System.out.print("The average value is " + average(x, y, z) + "\n");

   }
   public static float average(float x, float y, float z) {
    return (x + y + z) / 3;
   }
}*/

//2.Write a method named isEven that accept an int arguments is even, or false otherwise.Also write a program to test your method.
/*import java.util.*;
public class Question {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int num;
      System.out.print("Enter as integer: ");
      num = sc.nextInt();
      if(isEven(num)) {
         System.out.println("Number is even");
      } else {
         System.out.println("Number is odd");
      }
   }
   public static boolean isEven(int Number) {
      if (Number % 2 == 0) {
         return true;
      } else {
         return false;
      }
   }
}*/

//3.Write a Java program to check if a number is a palindrome in java?(121 is a palindrome,321 is not).
import java.util.*;
public class Question {
      public static void main(String args[]) {
         System.out.print("Please Enter a number : ");
         Scanner sc = new Scanner(System.in);
         int palindrome = sc.nextInt();

         if(isPalindrome(palindrome)) {
            System.out.println("Number : " + palindrome + " is a palindrome ");
         } else {
            System.out.println("Number : " + palindrome + " is not a palindrome ");
         }
      }

      public static boolean isPalindrome(int number) {
         int palindrome = number;
         int reverse = 0;

         while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;

         }
            //if Origental and the reverse of number is equal means number is palindrome in java
            if (number == reverse) {
               return true;
            }
            return false;
      }
}