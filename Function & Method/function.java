//import javax.xml.transform.Source;

//1.Calculate sum.
/*import java.util.*;
public class function {
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a,b);
        System.out.println(sum);
    }
}*/
        

//1. Find Product of a & b.
/*public class function {
    public static int Multiply(int a, int b) {
        int prod = a * b;
        return prod;
    }
    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        int prod = Multiply(a , b);
        System.out.println("a * b = " + prod);
        prod = Multiply(20, 40);
        System.out.println("a * b = " + prod);
    }
}*/

//2.Factorial of a number,n
/*public class function {
    public static int factorial(int n) {
        int f =1;

        for(int i=1; i<=n; i++) {
            f = f * i;
        }
        return f;
    }
    public static void main(String args[]) {
        System.out.println(factorial(3));
    }
}*/


//3.Binomial Coefficient
/*public class function {
    public static int factorial(int n) {
        int f =1;
        
        for(int i=1; i<=n; i++) {
            f = f * i;
        }
        return f;
    }
    public static int binCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }
    public static void main(String args[]) {
        System.out.println(binCoeff(5,2));
    }
}*/



//4.Function Overloding
/*public class function {
    //func to calu sum of 2 int val.
    public static int sum(int a, int b) {
        return a + b;
    }
    //func to calu sum of 3 int val.
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String args[]) {
        System.out.println(sum(5,3));
        System.out.println(sum(5,6,7));
    }
}*/


//5.Using datatype in Function Overloading.
/*public class function {
    //func to calu sum of int val.
    public static int sum(int a, int b) {
        return a + b;
    }
    //func to calu sum of float val.
    public static float sum(float a, float b) {
        return a + b;
    }
    public static void main(String args[]) {
        System.out.println(sum(3,5));
        System.out.println(sum(3.8f, 4.2f));
    }
}*/


//6.Check if a number is Prime or not
/*public class function {
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for(int i=2; i<=n-1; i++) {
            if(n % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
    public static void main(String args[]) {
        System.out.println(isPrime(5));
    }
}*/

//7.Sceond method Check if a number is Prime or not
/*public class function {
    public static boolean isPrime(int n) {
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        System.out.println(isPrime(5));
    }
}*/

//8.Print all Prime in a Range.
/*public class function {
    public static boolean isPrime(int n) {
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void primesInRange(int n) {
        for(int i=2; i<=n; i++) {
            if(isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]) {
        primesInRange(50);
    }
}*/

//9.Convert from Binary to Decimal.
/*public class function {
    public static void binToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum > 0) {
            int lastdigit = binNum % 10;
            decNum = decNum + (int)Math.pow(2, pow);
            pow++;
            binNum = binNum/10;
        }
        System.out.println("binary of " + myNum + " = " + decNum);
    }
    public static void main(String args[]) {
        binToDec(110);
    }
}*/

//10.Convert from decimal to Binary.
/*public class function {
    public static void decToBin(int n) {
        int myNum = n;
        int pow = 0;
        int binNum = 0;

        while(n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            n = n/2;
        }
        System.out.println("binary to" +myNum+ "=" +binNum);
    }
    public static void main(String args[]) {
        decToBin(11);
    }
}*/

/*import java.util.*;
public class function {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Enter the integer : ");
        num = sc.nextInt();

        if(isEven(num)) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
    public static boolean isEven(int number) {
        if(number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}