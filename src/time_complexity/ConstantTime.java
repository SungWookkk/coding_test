package time_complexity;

public class ConstantTime {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};         // 배열 5개짜리 생성
        int x = arr[2];                      // 인덱스 2의 값을 꺼내는 작업 → 항상 한 번만 실행
        System.out.println(x);              // 결과 출력
    }
}
