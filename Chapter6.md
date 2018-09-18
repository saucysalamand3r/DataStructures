# Data Structures
## Recursion
* Base case required to get out
* Not  very efficient, more overhead
    * Stack Overflow (Not the site)
#### Recursion Example in Java:
```java
public class RecursionExample4 {  
    static int n1=0,n2=1,n3=0;      
     static void printFibo(int count){      
        if(count>0){      
             n3 = n1 + n2;      
             n1 = n2;      
             n2 = n3;      
             System.out.print(" "+n3);     
             printFibo(count-1);      
         }      
     }        
  
public static void main(String[] args) {  
    int count=15;      
      System.out.print(n1+" "+n2);//printing 0 and 1      
      printFibo(count-2);//n-2 because 2 numbers are already printed     
}  
}  
// Output:

// 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377
```


### Recursive Binary Search
* Binary search, but recursive 
#### Recursive Binary Search Implemented in Java:
```Java
public static int binarySearch(int intToSearch, int[] sortedArray) {

    int lower = 0;
    int upper = sortedArray.length - 1;

    while (lower <= upper) {

        int mid = lower + (upper - lower) / 2;

        if(intToSearch < sortedArray[mid]) 

            upper = mid - 1;

        else if (intToSearch > sortedArray[mid]) 

            lower = mid + 1;

        else 

            return mid;
    }

    return -1; // Returns -1 if no match is found
}
```

### Mergesort
* Break array in half
* Sort lower half
* Sort upper half
* Merge together by comparing lowest of each half (if sorting low to high)
* O(Nlog(N))
* Requires a second "workspace" array to save while sorting
#### Mergesort Implemented in Java:
```Java
import java.io.*;
import java.util.Arrays;


public class MergeSort {

    public static void main(String[] args) throws IOException{
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        int arraySize = Integer.parseInt(R.readLine());
        int[] inputArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            inputArray[i] = Integer.parseInt(R.readLine());
        }
        mergeSort(inputArray);

        for (int j = 0; j < inputArray.length; j++) {
            System.out.println(inputArray[j]);
        }

    }

    static void mergeSort(int[] A) {
        if (A.length > 1) {
            int q = A.length/2;

//changed range of leftArray from 0-to-q to 0-to-(q-1)
            int[] leftArray = Arrays.copyOfRange(A, 0, q-1);
//changed range of rightArray from q-to-A.length to q-to-(A.length-1)
            int[] rightArray = Arrays.copyOfRange(A,q,A.length-1);

            mergeSort(leftArray);
            mergeSort(rightArray);

            merge(A,leftArray,rightArray);
        }
    }

    static void merge(int[] a, int[] l, int[] r) {
        int totElem = l.length + r.length;
        //int[] a = new int[totElem];
        int i,li,ri;
        i = li = ri = 0;
        while ( i < totElem) {
            if ((li < l.length) && (ri<r.length)) {
                if (l[li] < r[ri]) {
                    a[i] = l[li];
                    i++;
                    li++;
                }
                else {
                    a[i] = r[ri];
                    i++;
                    ri++;
                }
            }
            else {
                if (li >= l.length) {
                    while (ri < r.length) {
                        a[i] = r[ri];
                        i++;
                        ri++;
                    }
                }
                if (ri >= r.length) {
                    while (li < l.length) {
                        a[i] = l[li];
                        li++;
                        i++;
                    }
                }
            }
        }
        //return a;

    }

}
```
