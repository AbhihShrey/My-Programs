import java.util.Arrays;

public class sumaverageproduct {
    public static void main(String[] args) {
        int[] numbers = {1, 2, -3, 5, 7};
        System.out.println("The list is: " + Arrays.toString(numbers));
        product(numbers);
        sum(numbers);
        average(numbers);
    }

    public static void product(int[] numbers) {
        int multiply = 1;

        for (int i = 0; i < numbers.length; i++) {
            multiply *= numbers[i];
        }
        System.out.println("Product: " + multiply);

    }

    public static void sum(int[] numbers) {
        int add = 0;

        for (int i = 0; i < numbers.length; i++) {
            add += numbers[i];
        }
        System.out.println("Sum: " + add);
    }

    public static void average(int[] numbers) {
        float avg = 0;

        for (int i = 0; i < numbers.length; i++) {
            avg += numbers[i];
        }
        float answer = avg / numbers.length;
        System.out.println("Average: " + answer);
    }

}
