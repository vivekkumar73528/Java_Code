// 1. No 5 to 1
public class Recursion1 {
    public static void printNum(int n) {
        if( n == 0) {
            return;
        }
        System.out.println(n);
        printNum(n-1);

    }
   public static void main(String args[]) {
    int n = 5; // n = 5
    printNum(n);

   }
}

// 2.No 1 to 5
/*public class Recursion1 {
    public static void printNum(int n) {
        if( n == 6) {
            return;
        }
        System.out.println(n);
        printNum(n+1);
    }
    public static void main(String args[]) {
        int n = 1;
        printNum(n);

    }
}*/



