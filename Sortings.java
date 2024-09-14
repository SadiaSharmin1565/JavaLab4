
package com.mycompany.arrayproblem;
public class Sortings {
    public static void bubble(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void selection(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
    
    public static void merge(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            merge(arr, left, mid);
            merge(arr, mid + 1, right);
            merging(arr, left, mid, right);
        }
    }
    
    public static void merging(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    
    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] arr1 = {85,59,54,48,62,33,90};
        int[] arr2 = {99,56,89,25,12,9,2};
        int[] arr3 = {25,23,18,16,9,7,3,1};
        
        System.out.println("Before Bubble Sort: ");
        print(arr1);
        bubble(arr1);
        System.out.println("After Bubble Sort: ");
        print(arr1);
        
        System.out.println("Before Selection Sort: ");
        print(arr2);
        selection(arr2);
        System.out.println("After Selection Sort: ");
        print(arr2);
        
        System.out.println("Before Merge Sort: ");
        print(arr3);
        merge(arr3, 0, arr3.length - 1);
        System.out.println("After Merge Sort: ");
        print(arr3);
    }
   
  
}

