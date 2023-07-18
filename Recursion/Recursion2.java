// 2. Print sum of first n natural numbers
public class Recursion2 {
    public static void printSum(int i,int n,int sum) {
        if(n == i) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i+1,n,sum);
       // System.out.println(i); when we want to print our stack i value
       
    }
   
    public static void main(String args[]) {
        printSum(1, 5, 0);
      
        
    }
    
}
