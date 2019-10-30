package com.spirecoder;

public class BinarySearch {
    private int search(int[] arr, int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return search(arr, l, mid - 1, x);
            return search(arr, mid + 1, r, x);
        }

        return -1;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] arr = {1, 12, 23, 38, 43, 49, 80, 99};
        int n = arr.length;
        int x = 80;
        int result = binarySearch.search(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }

}
