/*import java.util.*;
public class Strings3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("apna college");
        System.out.println(sb);
    }
}*/

/*import java.util.*;
public class Strings3 {
    public static void main(String args[]) {
        StringBuilder sc = new StringBuilder("vivek");
        //set char
        System.out.println(sc.charAt(2));
    }

}*/

/*import java.util.*;
public class Strings3 {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("move");
        //get char
        sb.setCharAt(0 , 'l');
        System.out.println(sb);
    }

}*/

/*import java.util.*;
public class Strings3 {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("tony");
        //Insert 
        sb.insert(0 , 'M');
        System.out.println(sb);

        
    }
}*/

/*import java.util.*;
public class Strings3 {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("tony");
        //delete
        sb.delete(1,4);
        System.out.println(sb);
    }
}*/

/*import java.util.*;
public class Strings3 {
    public static void main(String args[]) {
        StringBuilder ab = new StringBuilder("Tony");
        //appent use for adding something for end
        ab.append(" Stark");
        System.out.println(ab);
    }
}*/

/*import java.util.*;
public class Strings3 {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("tony");
        sb.append("stark");
        System.out.println(sb);
        System.out.println(sb.length());
        
    }
}*/

/*import java.util.*;
public class Strings3 {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("tony");
        for(int i=0; i<sb.length()/2; i++) {
            int front = i;
            int back = sb.length()-i-1;
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);
    }
}*/
        
