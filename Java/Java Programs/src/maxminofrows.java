public class maxminofrows {
    public static void main(String[] args) {
        int[][] integers = {{1, 10, 3, 8}, {9, 12, 6, 7}, {5, 2, 11, 4}};
        int row = 0;
        maxOfRows(integers, row);
        System.out.println();
        minOfRows(integers, row);

    }

    public static void maxOfRows(int[][] integers, int row) {
        for (int i = 0; i < integers.length; i++) {
            int max = integers[i][0];
            for (int j = 0; j < integers[i].length; j++) {
                if (integers[i][j] > max) {
                    max = integers[i][j];
                }
            }
            row += 1;
            System.out.println("The max of row " + row + " is: " + max);
        }
    }

    public static void minOfRows(int[][] integers, int row) {
        for (int i = 0; i < integers.length; i++) {
            int min = integers[i][0];
            for (int j = 0; j < integers[i].length; j++) {
                if (integers[i][j] < min) {
                    min = integers[i][j];
                }
            }
            row += 1;
            System.out.println("The min of row " + row + " is: " + min);
        }

    }
}
