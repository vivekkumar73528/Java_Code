import java.util.*;
public class practic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a : ");
        int a = sc.nextInt();
        System.out.println("enter b : ");
        int b = sc.nextInt();
        System.out.println("enter c : ");
        int c = sc.nextInt();
        System.out.println("enter Operator : ");
        char Operator = sc.next().charAt(0);

        switch(Operator) {
            case '+' : System.out.println((a+b) != (a+c));
                     break;
            case '-' : System.out.println((a-b) != (a-c));
                     break;
            case '*' : System.out.println((a*b) != (a*c));
                     break;
            case '/' : System.out.println((a/b) != (a/c));
                     break;
            case '%' : System.out.println((a%b) != (a%c));   
                     break;
            default : System.out.println("Without calculater");
                     break;         
                                                      
        }

    }
    
}
