import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        //Two dimesional Array
        //User input array
        System.out.println("enter 2D array size");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        System.out.println("Number of Rows in Array:" + rows);
        int columns = sc.nextInt();
        System.out.println("Number of columns in Array:" + columns);

        System.out.println("Enter Array elements");

        int twoarray[][] = new int[rows][columns];
        {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    twoarray[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(twoarray[i][j] + " ");
                }
                System.out.print("\n");

            }

        }
    }
}
