package time_complexity;

public class LinearTime {
    public static void main(String[] args) {
        int[] arr = new int[100];

        for(int i = 0; i < arr.length; i++){
            arr[i] = i+ 1;
        }
        int sum = 0;
        for (int i : arr) {
            sum += i;
            
        }
        System.out.println(sum);
    }
}
