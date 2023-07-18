// 1. calculate factorial.
public class Recursion3 {
    public static int calufactorial(int n) {
        if( n == 0 || n == 1){
            return 1;
        }
        int fact_nm1 = calufactorial(n-1);
        int fact_n = n * fact_nm1;
        return fact_n;
    }
    public static void main(String args[]) {
        int n = 5;
        int ans = calufactorial(n);
        System.out.println(ans);

    }

}
    


    
    
