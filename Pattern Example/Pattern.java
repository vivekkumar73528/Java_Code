//1. Print solid rectangle.
/*import java.util.*;
public class Pattern {
    public static void main(String args[]) {
        int n = 4;
        int m = 5;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

//2. Print rectangle.
/*import java.util.*;
public class Pattern {
    public static void main(String args[]) {
       int n = 4;
       int m = 4;
       for(int i=0; i<n; i++) {
        for(int j=0; j<m; j++) {
            if(i == 0 || i == n-1 || j == 0 || j == m-1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
       }
    }
}*/

//3. Half pyramid
/*import java.util.*;
public class Pattern {
    public static void main(String args[]) {
        for(int i=0; i<=5; i++ ) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

//4.half pyramid with Number
/*import java.util.*;
public class Pattern {
    public static void main(String args[]) {
        int n = 5;
        for(int i=0; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}*/

//5. inverted half pyramid with number
/*import java.util.*;
public class Pattern {
    public static void main(String args[]) {
        int n = 5;
        for(int i=0; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}*/

//6.Floyd's triangle
/* import java.util.*;
public class Pattern {
    public static void main(String args[]) {
        int n = 5;
        int number = 1;
        for(int i=0; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}*/

//6.Print squire star
/*import java.util.*;
public class Pattern {
    public static void main(String args[]) {
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

//.6 Remove number and print star.
/*import java.util.*;
public class Pattern {
    public static void main(String args[]) {
        for(int i=1; i<=20; i++) {
            if(i == 17) {
                System.out.print("*");
            } else {
                System.out.print(i);
            }
        }
        
    }
}*/

//7.Remove single number.
/*import java.util.*;
public class Pattern {
    public static void main(String args[]) {
        for(int i=1; i<=20; i++) {
            if(i == 17) {
                continue;
            }
            System.out.println(i);
        }
    }
}*/

//8.break the number and print if condition.
 /*import java.util.*;
 public class Pattern {
    public static void main(String args[]) {
        for(int i=1; i<=20; i++) {
            System.out.println(i);
            if(i == 13) {
                System.out.println("oops sorry");
                break;
            }
        }
    }
 }*/

 //9.Remove the number.
 /*import java.util.*;
 public class Pattern {
    public static void main(String args[]) {
        for(int i=1; i<=20; i++) {
            if(i == 17) {
                continue;
            }
            System.out.println(i);
        }
    }
 }*/

 //10.Print the number 100 to 4.
/*import java.util.*;
public class Pattern {
    public static void main(String args[]) {
        for(int i=100; i>=4; i=i-4) {
            System.out.println(i + " ");
        }
    }
}*/

//11.
/*import java.util.*;
public class Pattern {
    public static void main(String args[]) {
        for(int i=1; i<=4; i++) {
            for(int j=1; j<=4; j++) {                          
                if(i == j) {                                   
                    System.out.print("-");                     
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}*/

//12. Print Character.
/*import java.util.*;
public class Pattern {
    public static void main(String args[]) {
        int n = 4;
        char ch = 'A';

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}*/


/*public class Pattern {
    public static void hollow_ractangle(int totRows, int totCols) {
        for(int i=1; i<=totRows; i++) {
            for(int j=1; j<=totCols; j++) {
                if(i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        hollow_ractangle(10, 7);

    }
}*/

/*public class Pattern {
    public static void diamond(int n) {
        //1st half
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        diamond(7);

    }
}*/

/*public class Pattern {
    public static void inverted_roted_half_pyramid(int n) {
        for(int i=1; i<=n; i++) {
            //space
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        inverted_roted_half_pyramid(7);

    }
}*/

/*public class Pattern {
    public static void inverted_half_pyramid_withnumber(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        inverted_half_pyramid_withnumber(5);

    }
}*/

/*public class Pattern {
    public static void floyd_triangle(int n) {
        int count = 1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        floyd_triangle(5);
    }
}*/

/*public class Pattern {
    public static void floyed(int n) {
        //int count = 1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j + " ");//count + " ");
              //  count++;

            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        floyed(5);

    }
}*/


public class Pattern {
    public static void butterfly(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    }
    public static void main(String args[]) {
        butterfly(7);

    }
}