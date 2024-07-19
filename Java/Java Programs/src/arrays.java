import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        // int[] numbers = {5, 1, 3, 4, -5, -3, -6, 7};
        // Arrays.sort(numbers);
        // System.out.println(numbers);
        // Arrays.sort(numbers, 3, 7);
        // char[] characters = {'a', 'b', 'g', 'd', 'j', 'x', 'y', 'l'};
        // Arrays.sort(characters);
        // int[] unicodes = {'a', 'z', 'b', 'w', 'c', 'A', 'D', 'Z', 'C'};
        // Arrays.sort(unicodes);

        Scanner n = new Scanner(System.in);

        int num = n.nextInt();

        while (num > 20 || num <= 0) {
            System.out.println("Invalid number, try again.");
            num = n.nextInt();
        }

        int[] numbers = new int[num];
        fillArrayofIntegers(numbers);
        printArrayofIntegers(numbers);

    }

    private static void printArrayofIntegers(int[] numbers) {
        System.out.print("The elements are: ");
        System.out.println(Arrays.toString(numbers));
    }

    private static void fillArrayofIntegers(int[] numbers) {
        Scanner n = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            int num = n.nextInt();
        }
    }
}
