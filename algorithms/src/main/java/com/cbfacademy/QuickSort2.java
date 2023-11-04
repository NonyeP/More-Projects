package com.cbfacademy;

import java.util.Arrays;

public class QuickSort2 {
    
    public static void main(String[] args) {
        int[] data = { 8, 7, 2, 1, 0, 9, 6 };
        System.out.println("Unsorted Array");
        System.out.println(Arrays.toString(data));

        QuickSort2.quickSort(data, 0, data.length - 1);

        System.out.println("Sorted Array in Ascending Order ");
        System.out.println(Arrays.toString(data));
    }

    public static void quickSort(int[] arr, int startIndex, int endIndex) {

        if (startIndex < endIndex) {

            // Partition the array and get the index of the pivot element
            int pivotIndex = partition(arr, startIndex, endIndex);

            // Recursively sort the subarrays on either side of the pivot
            quickSort(arr, startIndex, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, endIndex);
        }
    }

    public static int partition(int[] arr, int startIndex, int endIndex) {

        // Choose the rightmost element as the pivot
        int pivot = arr[endIndex];

        // pointer for greater element
        // Initialise the index of the element representing the boundary of the lower sub-array
        int boundaryIndex = startIndex - 1;

        //transverse through all elements and compare with pivot
        for (int currentIndex = startIndex; currentIndex < endIndex ; currentIndex++) {
            if (arr[currentIndex] <= pivot) {

                // if element smaller than pivot is found
                // swap it with the greater element pointed by boundary index
                // Increment the boundary of the lower sub-array
                boundaryIndex = boundaryIndex + 1;

                // Move the current element into the lower sub-array
                swap(arr, boundaryIndex, currentIndex);
            }

        }
        // Move the pivot value between the lower and upper sub-arrays

        swap(arr, (boundaryIndex + 1), endIndex);

        // Return the index of the pivot element
        return (boundaryIndex + 1);

    }

    public static void swap(int[] arr, int boundaryIndex, int currentIndex) {
//        temp = arr[leftIndex]
        int temp = arr[boundaryIndex];

//        arr[leftIndex] = arr[rightIndex]
        arr[boundaryIndex]=arr[currentIndex];
//        arr[rightIndex] = temp

        arr[currentIndex] = temp;
    }
}





//    quickSort(arr, beg, end)
//    if(beg < end)
//    pivotIndex = partition(arr,beg, end)
//    quickSort(arr, beg, pivotIndex)
//    quickSort(arr, pivotIndex + 1, end)
//
//    partition(arr, beg, end)
//    set end as pivotIndex
//    pIndex = beg - 1
//            for i = beg to end-1
//            if arr[i] < pivot
//    swap arr[i] and arr[pIndex]
//    pIndex++
//    swap pivot and arr[pIndex+1]
//            return pIndex + 1


