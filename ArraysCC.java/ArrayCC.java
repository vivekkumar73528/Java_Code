/*import java.util.*;
public class ArrayCC {
    public static void printPairs(int numbers[]) {
        int tp = 0;
        for(int i=0; i<numbers.length; i++) {
            int curr = numbers[i];
            for(int j=i+1; j<numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total Pairs = " + tp);
    }
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        printPairs(numbers);
            
    }
}*/

//2. Print SubArrays.
/*import java.util.*;
public class ArrayCC {
    public static void printSubarrays(int numbers[]) {
        int ts = 0;
        for(int i=0; i<numbers.length; i++) {
            int start = i;
            for(int j=i; j<numbers.length; j++) {
                int end = j;
                for(int k=start; k<=end; k++) {
                    System.out.print(numbers[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total Subarrays = " + ts);
    }
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        printSubarrays(numbers);
    }
}*/

//3. MAX OF SubArray.
/*import java.util.*;
public class ArrayCC {
    public static void printSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++) {
            int start = i;
            for(int j=i; j<numbers.length; j++) {
                int end = j;
                currSum = 0;
                for(int k=start; k<=end; k++) {
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("total Subarray = " + maxSum);
    }
    
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        printSubarraySum(numbers);
    }
}*/


//4.Prifix of Sum
/*import java.util.*;
public class ArrayCC {
    public static void printSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        for(int i=1; i<prefix.length; i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i=0; i<numbers.length; i++) {
            int start = i;
            for(int j=0; j<numbers.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[i-1];

                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("total Subarray = " + maxSum);
    }
    public static void main(String args[]) {
        int numbers[] = {1, -2, 6, -1, 3};
        printSubarraySum(numbers);
     
    }
}*/


//5.kadane's Algorithm
/*import java.util.*;
public class ArrayCC {
    public static void kadanes(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=1; i<numbers.length; i++) {
            cs = cs + numbers[i];
            if(cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("our max Subarray sum is : " + ms);
    }
    public static void main(String args[]) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(numbers);
    }
}*/


//6.Trapped Water
/*import java.util.*;
public class ArrayCC {
    public static int trappedRainWater(int height[]) {
    int n = height.length;

    //Calculate left max boundary - array
    int leftMax[] = new int[n];
    leftMax[0] = height[0];
    for(int i=1; i<n; i++) {
        leftMax[i] = Math.max(height[i], leftMax[i-1]); 
    }

    //Calculate right max boundary - array
    int rightMax[] = new int[n];
    rightMax[n-1] = height[n-1];
    for(int i=n-2; i>=0; i--) {
        rightMax[i] = Math.max(height[i], rightMax[i+1]);
    }

    int trappedWater = 0;
    //loop
    for(int i=0; i<n; i++) {
        //waterLevel = min(leftMax boundary, rightmax boundary)
        int waterLevel = Math.min(leftMax[i],rightMax[i]);

        //trapped water = waterLevel - height[i]
        trappedWater += waterLevel - height[i];
    }
    return trappedWater;

    }
    public static void main(String args[]) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
       System.out.println("trpped rain water : " + trappedRainWater(height));
    }
}*/

//7.Buy and Sell stocks
/*import java.util.*;
public class ArrayCC {
    public static int buyAndSellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for(int i=0; i<prices.length; i++) {
            if(buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
   
    public static void main(String args[]) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(buyAndSellStocks(prices));
        
    }
}*/

//8.update marks./* */
/*import java.util.*;
public class ArrayCC {
    public static void update(int marks[]) {
        for(int i=0; i<marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String args[]) {
        int marks[] = {97, 98, 99};
        update(marks);

        //print our marks
        for(int i=0; i<marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}*/


//9.Linear Search
/*import java.util.*;
public class ArrayCC {
    public static int linearSearch(int numbers[], int key) {
         for(int i=0; i< numbers.length; i++) {
            if(numbers[i] == key) {
                return i;
            }
         }
         return -1;
    }
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;

        int index = linearSearch(numbers, key);
        if(index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Key is at index : " + index);
        }
    }
}*/

//10.Largest Array value
/*import java.util.*;
public class ArrayCC {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++) {
            if(largest < numbers[i]) {
                largest = numbers[i];
            }
            if(smallest > numbers[i]) {
                    smallest = numbers[i];
                }
            }
            System.out.println("smallest value is : " + smallest);
            return largest;
        }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = {1, 2, 6, 3, 5};
        System.out.println("largest number is : " + getLargest(numbers));
    }
}*/

//11.Binary Search
/*import java.util.*;
public class ArrayCC {
    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length-1;

        while(start <= end) {
            int mid = (start + end) / 2;

            //comparision
            if(numbers[mid] == key) {
                return mid;
            }
            if(numbers[mid] < key) {
                start = mid+1;
            } else {
                end = mid-1;
            }    
        }
        return -1;
    }
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10, 12};
        int key = 8;
        System.out.println("index for key is : " + binarySearch(numbers, key));
    }
}*/


//12.Reverse an array
import java.util.*;
public class ArrayCC {
    public static void reverse(int numbers[]) {
        int first = 0, last = numbers.length-1;

        while(first < last) {
            //swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        reverse(numbers);

        for(int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}