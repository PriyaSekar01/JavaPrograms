package StringBackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AlternateSorting {

    int[] alternateSorting(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int[] result = new int[n];
        int start = 0;
        int end = n - 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                result[i] = arr[end];
                end--;
            } else {
                result[i] = arr[start];
                start++;
            }
        }
        return result;


    }

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        AlternateSorting sorter = new AlternateSorting();
        int[] sortedArray = sorter.alternateSorting(arr);
        System.out.println("Array after alternate sorting:");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }
}
