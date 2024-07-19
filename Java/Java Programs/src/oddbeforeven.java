import java.util.Arrays;

public class oddbeforeven {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 5, 7, 9, -2, 3};
        int[] temp = new int[numbers.length];
        int j = 0;
        int k = numbers.length - 1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                temp[j] = numbers[i];
                j++;
            } else {
                temp[k] = numbers[i];
                k--;
            }
        }

        System.out.println(Arrays.toString(temp));

    }
}
