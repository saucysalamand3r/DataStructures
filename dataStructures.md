# Data Structures
## Recursion
* Base case required to get out
* Not  very efficient, more overhead
    * Stack Overflow (Not the site)
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
#### Mergesort Implemented in Java:
```Java
import java.util.*;
 
public class MergerSort
{
    public static void main(String[] args)
    {
        //Unsorted array
        Integer[] a = { 2, 6, 3, 5, 1 };
         
        //Call merge sort
        mergeSort(a);
         
        //Check the output which is sorted array
        System.out.println(Arrays.toString(a));
    }
 
    @SuppressWarnings("rawtypes")
    public static Comparable[] mergeSort(Comparable[] list)
    {
        //If list is empty; no need to do anything
        if (list.length <= 1) {
            return list;
        }
         
        //Split the array in half in two parts
        Comparable[] first = new Comparable[list.length / 2];
        Comparable[] second = new Comparable[list.length - first.length];
        System.arraycopy(list, 0, first, 0, first.length);
        System.arraycopy(list, first.length, second, 0, second.length);
         
        //Sort each half recursively
        mergeSort(first);
        mergeSort(second);
         
        //Merge both halves together, overwriting to original array
        merge(first, second, list);
        return list;
    }
     
    @SuppressWarnings({ "rawtypes", "unchecked" })
    private static void merge(Comparable[] first, Comparable[] second, Comparable[] result)
    {
        //Index Position in first array - starting with first element
        int iFirst = 0;
         
        //Index Position in second array - starting with first element
        int iSecond = 0;
         
        //Index Position in merged array - starting with first position
        int iMerged = 0;
         
        //Compare elements at iFirst and iSecond,
        //and move smaller element at iMerged
        while (iFirst < first.length && iSecond < second.length)
        {
            if (first[iFirst].compareTo(second[iSecond]) < 0)
            {
                result[iMerged] = first[iFirst];
                iFirst++;
            }
            else
            {
                result[iMerged] = second[iSecond];
                iSecond++;
            }
            iMerged++;
        }
        //copy remaining elements from both halves - each half will have already sorted elements
        System.arraycopy(first, iFirst, result, iMerged, first.length - iFirst);
        System.arraycopy(second, iSecond, result, iMerged, second.length - iSecond);
    }
}
```
