package com.cbfacademy;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
    int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
       int index = search(arr, 7);
       System.out.println(index);
    }

    public static int search(int[] arr,int searchValue){
    // do until the pointers low and high meet each other.
    Arrays.sort(arr);
    int low = 0;
    int high = arr.length -1;

       while(low<=high){
        // mid = (low + high)/2
       int mid  = (low + high)/2;
      // if (x == arr[mid])
         if(searchValue == arr[mid]){
        //   return mid
         return mid;
        // else if (x > arr[mid]) // x is on the right side
         }else if(searchValue > arr[mid]){
           return  low = mid + 1;
        //     low = mid + 1
          }else{ // x is on the left side
        //     high = mid - 1
          return high = mid - 1;
         }
    
    }
    return -1;
                         
    }
}


