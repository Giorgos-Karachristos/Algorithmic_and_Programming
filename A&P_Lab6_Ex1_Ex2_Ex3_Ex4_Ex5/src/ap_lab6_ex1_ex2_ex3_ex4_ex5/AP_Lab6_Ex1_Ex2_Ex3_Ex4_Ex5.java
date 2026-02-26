package ap_lab6_ex1_ex2_ex3_ex4_ex5;

public class AP_Lab6_Ex1_Ex2_Ex3_Ex4_Ex5 {

    /*Validate user input to calculate a number’s factorial using if, switch, and methods, 
    and then checks whether another user-entered number is prime using loops and method calls*/
    public static void main(String[] args) {
        //Εxercise 1
        int num, npar, i;
        do {
            System.out.print("Enter an integer from 0 to 10: ");
            num = ScannerUserInput.getInteger();
        } while (num < 0 || num > 10);
        if (num == 0 || num == 1) {
            npar = 1;
        } else {
            npar = 1;
            for (i = 2; i <= num; i++) {
                npar = npar * i;
            }
        }
        System.out.println("if: The factorial value is: " + npar);

        //Εxercise 2
        switch (num) {
            case 0, 1:
                npar = 1;
                break;
            default: {
                npar = 1;
                for (i = 2; i <= num; i++) {
                    npar = npar * i;
                }
            }
        }
        System.out.println("switch: The factorial value is: " + npar);

        //Εxercise 4
        System.out.println("Call to method findParagontiko1 - main(): The factorial value is: " + findParagontiko1(num));

        //Εxercise 5
        System.out.println("Call to method findParagontiko2 - StaticMethods: The factorial value is: " + StaticMethods.findParagontiko2(num) + "\n");


        //Εxercise 3
        do {
            System.out.print("Enter an integer from 2 to 100: ");
            num = ScannerUserInput.getInteger();
        } while (num < 2 || num > 100);
        boolean protos = true;
        for (i = 2; i <= (num / 2); i++) {
            if (num % i == 0) {
                protos = false;
            }
        }
        if (protos) {
            System.out.println("The number " + num + " is prime");
        } else {
            System.out.println("The number " + num + " is not prime");
        }
        System.out.println("The variable <<protos>> has value: " + protos);

        //Εxercise 4
        protos = isProtos1(num);
        if (protos) {
            System.out.println("Call to method isProtos1 - main(): The number " + num + " is prime");
        } else {
            System.out.println("Call to method isProtos1 - main(): The number " + num + " is not prime");
        }
        System.out.println("The variable <<protos>> has value: " + protos);

        //Εxercise 5
        protos = StaticMethods.isProtos2(num);
        if (protos) {
            System.out.println("Call to method isProtos2 - StaticMethods: The number " + num + " is prime");
        } else {
            System.out.println("Call to method isProtos2 - StaticMethods: The number " + num + " is not prime");
        }
        System.out.println("The variable <<protos>> has value: " + protos);
    }

    //Εxercise 4
    static int findParagontiko1(int num) {
        int npar;
        if (num == 0 || num == 1) {
            npar = 1;
        } else {
            npar = 1;
            for (int i = 2; i <= num; i++) {
                npar = npar * i;
            }
        }
        return npar;
    }

    static boolean isProtos1(int num) {
        boolean protos = true;
        for (int i = 2; i <= (num / 2); i++) {
            if (num % i == 0) {
                protos = false;
            }
        }
        return protos;
    }
}
