public class sumofrows {
    public static void main(String[] args) {
        int[][] integers = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        columnSum(integers);


    }

    public static void rowSum(int[][] integers) {
        for (int i = 0; i < integers.length; i++) {
            int sum = 0;
            for (int j = 0; j < integers[i].length; j++) {
                sum += integers[i][j];
            }
            System.out.println("The sum of this row is: " + sum);
        }
    }

    public static void columnSum(int[][] integers) {
        for (int i = 0; i < 4; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += integers[j][i];
            }
            System.out.println("The sum of this column is: " + sum);
        }
    }
}
