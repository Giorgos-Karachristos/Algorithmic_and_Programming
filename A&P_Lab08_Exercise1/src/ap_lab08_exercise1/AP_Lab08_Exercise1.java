package ap_lab08_exercise1;

public class AP_Lab08_Exercise1 {

    /*Creates a 10×10 two-dimensional array filled with random integers, displays it, 
    calculates and prints the average of each row and column, and computes the sum of the elements in both diagonals*/
    public static void main(String[] args) {
        int my2DArray[][] = fillPin();
        showPin2D(my2DArray);
        System.out.println("\nThe elements of the avgLine[] array are:");
        showPin1D(findMeanLine(my2DArray));
        System.out.println("\nThe elements of the avgCol[] array are:");
        showPin1D(findMeanCol(my2DArray));
        System.out.println("\nThe sum of the elements of the two diagonals is: " + findDSum(my2DArray));
    }

    static int[][] fillPin() {
        int my2DArray[][] = new int[10][10];
        for (int i = 0; i < my2DArray.length; i++) {
            for (int j = 0; j < my2DArray[i].length; j++) {
                my2DArray[i][j] = (int) (Math.random() * 10) + 1;
            }
        }
        return my2DArray;
    }

    static void showPin2D(int my2DArray[][]) {
        System.out.println("The elements of the array my2DArray[][] are: \n");
        for (int i = 0; i < my2DArray.length; i++) {
            for (int j = 0; j < my2DArray[i].length; j++) {
                System.out.print(my2DArray[i][j]);
                if (j != 9) {
                    System.out.print(",");
                }
            }
            System.out.println();
        }
    }

    static double[] findMeanLine(int my2DArray[][]) {
        double avgLine[] = new double[my2DArray.length];
        int sum;
        for (int i = 0; i < my2DArray.length; i++) {
            sum = 0;
            for (int j = 0; j < my2DArray[i].length; j++) {
                sum += my2DArray[i][j];
            }
            avgLine[i] = (double) sum / my2DArray.length;
        }
        return avgLine;
    }

    static double[] findMeanCol(int my2DArray[][]) {
        double avgCol[] = new double[my2DArray.length];
        int sum;
        for (int j = 0; j < my2DArray.length; j++) {
            sum = 0;
            for (int i = 0; i < my2DArray[j].length; i++) {
                sum += my2DArray[i][j];
            }
            avgCol[j] = (double) sum / my2DArray.length;
        }
        return avgCol;
    }

    static void showPin1D(double pin[]) {
        for (int i = 0; i < pin.length; i++) {
            System.out.print(pin[i]);
            if (i != pin.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    static int findDSum(int my2DArray[][]) {
        int sum = 0;
        for (int i = 0; i < my2DArray.length; i++) {
            sum += my2DArray[i][i];
            for (int j = 0; j < my2DArray[i].length; j++) {
                if (i + j == my2DArray.length - 1) {
                    sum += my2DArray[i][j];
                }
            }
        }
        return sum;
    }
}
