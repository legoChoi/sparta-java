package week02.array;

public class Arr08 {
    public static void main(String[] args) {
        // 최댓값 구하기
        int[] arr = {3, 2, 1, 5, 1};

        int max = arr[0];

        for (int num: arr) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("최댓값 = " + max);
    }
}
