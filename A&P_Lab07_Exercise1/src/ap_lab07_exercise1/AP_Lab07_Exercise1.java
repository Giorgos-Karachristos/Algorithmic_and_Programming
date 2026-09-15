package ap_lab07_exercise1;

public class AP_Lab07_Exercise1 {

    /*Creates an array of 10 random integers, displays its elements,
    finds and prints the positions of the maximum and minimum values, counts how many elements are above the average, 
    and swaps two adjacent random elements before displaying the updated array*/
    public static void main(String[] args) {
        int n = 10;
        int pin[] = fillPin(n);
        showPin(pin);
        int pos = findThesiMax(pin);
        System.out.println("The maximum element of the array is " + pin[pos] + " at position " + (pos + 1));
        pos = findThesiMin(pin);
        System.out.println("The minimum element of the array is " + pin[pos] + " at position " + (pos + 1));
        System.out.println("The number of elements in the array above the average is " + countAVG(pin));
        int index = (int) (Math.random() * (pin.length - 1));
        System.out.println("Swapping pin[index]=pin[" + index + "] and pin[index+1]=pin[" + (index + 1) + "]");
        swapPin(pin, index);
        showPin(pin);
    }

    static int[] fillPin(int n) {
        int pin[] = new int[n];
        for (int i = 0; i < n; i++) {
            pin[i] = (int) (Math.random() * 11);
        }
        return pin;
    }

    static void showPin(int pin[]) {
        System.out.print("The elements of the array are: ");
        for (int i = 0; i < pin.length; i++) {
            System.out.print(pin[i]);
            if (i != pin.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    static int findThesiMax(int pin[]) {
        int imax = 0;
        int max = pin[imax];
        for (int i = 1; i < pin.length; i++) {
            if (pin[i] > max) {
                max = pin[i];
                imax = i;
            }
        }
        return imax;
    }

    static int findThesiMin(int pin[]) {
        int imin = 0;
        int min = pin[imin];
        for (int i = 1; i < pin.length; i++) {
            if (pin[i] < min) {
                min = pin[i];
                imin = i;
            }
        }
        return imin;
    }

    static int countAVG(int pin[]) {
        int i;
        int sum = 0;
        for (i = 0; i < pin.length; i++) {
            sum += pin[i];
        }
        double mo = (double) sum / pin.length;
        int pl = 0;
        for (i = 0; i < pin.length; i++) {
            if (pin[i] > mo) {
                pl++;
            }
        }
        return pl;
    }

    static void swapPin(int pin[], int index) {
        int temp = pin[index];
        pin[index] = pin[index + 1];
        pin[index + 1] = temp;
    }
}
