public class minmax {
    public static void main(String[] args) {
        int[] numbers = {3, 1, 2, 5, 4};
        int min = numbers[0];
        int max = numbers[0];
        Max(numbers, max);
        Min(numbers, min);
    }

    public static void Max(int[] numbers, int max) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("The max is: " + max);
    }

    public static void Min(int[] numbers, int min) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("The min is: " + min);
    }
}
