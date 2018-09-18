# Data Structures
## Recursion
* Base case required to get out
* Not  very efficient, more overhead
    * Stack Overflow (Not the site)
### Recursive Binary Search
* Binary search, but recursive 

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
Output:

0 1 1 2 3 5 8 13 21 34 55 89 144 233 377
```

### Mergesort
* Break array in half
* Sort lower half
* Sort upper half
* Merge together by comparing lowest of each half (if sorting low to high)
* O(Nlog(N))

```Java

```