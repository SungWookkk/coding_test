package time_complexity;

import java.util.Arrays;

public class NLogNTime {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9, 3};
        mergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] a, int left, int right) {
        if (right - left < 2) return;
        int mid = (left + right) / 2;
        mergeSort(a, left, mid);
        mergeSort(a, mid, right);
        merge(a, left, mid, right);
    }

    public static void merge(int[] a, int left, int mid, int right) {
        int temp[] = new int[right - left];
        int i = left, j = mid, k = 0;
        while (i < mid && j < right) {
            if(a[i] <= a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
            while (i < mid) temp[k++] = a[i++];
            while (j < right) temp[k++] = a[j++];
        }
        System.arraycopy(temp, 0, a, left, temp.length);
    }

}
