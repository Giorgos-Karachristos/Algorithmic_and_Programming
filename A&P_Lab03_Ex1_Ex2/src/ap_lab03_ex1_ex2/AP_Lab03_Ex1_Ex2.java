package ap_lab03_ex1_ex2;

public class AP_Lab03_Ex1_Ex2 {

    /*Simple and Compound Logical Expressions*/
    public static void main(String[] args) {
        System.out.print("Enter an integer value for a: ");
        int a = ScannerUserInput.getInteger();
        System.out.print("Enter an integer value for b: ");
        int b = ScannerUserInput.getInteger();
        System.out.print("Enter an integer value for c: ");
        int c = ScannerUserInput.getInteger();

        //Exercise 1
        System.out.print("Simple Logical Expression – Αrrangement ");
        if (a < b) {
            if (b < c) {
                System.out.println("a, b, c = " + a + " " + b + " " + c);
            } else if (a < c) {
                System.out.println("a, c, b = " + a + " " + c + " " + b);
            } else {
                System.out.println("c , a, b = " + c + " " + a + " " + b);
            }
        } else {
            if (a < c) {
                System.out.println("b, a, c = " + b + " " + a + " " + c);
            } else {
                if (b < c) {
                    System.out.println("b, c, a = " + b + " " + c + " " + a);
                } else {
                    System.out.println("c, b, a = " + c + " " + b + " " + a);
                }
            }
        }

        //Exercise 2
        System.out.print("Compound Logical Expression with && - Αrrangement: ");
        if (a < b && a < c) {
            if (b < c) {
                System.out.println("a, b, c = " + a + " " + b + " " + c);
            } else {
                System.out.println("a, c, b = " + a + " " + c + " " + b);
            }
        } else if (b < a && b < c) {
            if (a < c) {
                System.out.println("b, a, c = " + b + " " + a + " " + c);
            } else {
                System.out.println("b, c, a = " + b + " " + c + " " + a);
            }
        } else if (c < a && c < b) {
            if (a < b) {
                System.out.println("c , a, b = " + c + " " + a + " " + b);
            } else {
                System.out.println("c, b, a = " + c + " " + b + " " + a);
            }
        } else {
            System.out.println("a, b, c = " + a + " " + b + " " + c);
        }
    }
}
