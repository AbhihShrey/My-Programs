import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {
        int counter = 0;
        int[] integers = {1, 3, 5, 6, 7, 9, 12};
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the element you are looking for: ");
        int searchElement = r.nextInt();
        // for (int i = 0; i < integers.length; i++) {
        // if (searchElement == integers[i]) {
        // counter += 1;
        // }
        // }
        // if (counter == 0) {
        // System.out.println("This element is not in the list.");
        // }
        binarySearch(integers, searchElement);
    }

    public static void binarySearch(int[] integers, int searchElement) {
        int left = 0;
        int right = integers.length - 1;

        while (left <= right) {
            int mid = (right + left) / 2;

            if (searchElement == integers[mid]) {
                System.out.println("The element was found at: index: " + mid);
                return;
            } else if (searchElement < integers[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        System.out.println("Element not found.");
    }
}
