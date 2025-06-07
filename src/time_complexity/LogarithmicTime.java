package time_complexity;


/**
 *
    O(logn) – 로그 시간 (이진 탐색)
 *
 */

public class LogarithmicTime {
    public static void main(String[] args) {

        int[] arr = new int[1024];

        for (int i =0; i < arr.length; i++) {
            arr[i] += i;
        }

        int target = 777;

        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if(arr[mid] == target) {
                System.out.println("found");
                return;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else{
                left = mid + 1;
            }
            System.out.println("not found");
        }
    }
}
