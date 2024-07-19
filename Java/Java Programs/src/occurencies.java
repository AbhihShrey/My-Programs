import java.util.Scanner;

public class occurencies {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 2, 2, 3, 4, 4, 4};
        Scanner r = new Scanner(System.in);
        System.out.print("Enter a number you would like to search: ");
        int searchElement = r.nextInt();
        searchForOcc(numbers, searchElement);
    }

    public static void searchForOcc(int[] numbers, int searchElement) {
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (searchElement == numbers[i]) {
                count += 1;
            }
        }
        System.out.println("The occurencies of this number are " + count + ".");
    }
}
