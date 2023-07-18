import java.util.*;
public class Strings1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String move = "";
        for(int i=0; i<str.length(); i++) {
            if( str.charAt(i) == 'm') {
                move += 'l';
            
        } else {
            move += str.charAt(i);
        }
    }
        System.out.println("move to " + move );

    }

    }