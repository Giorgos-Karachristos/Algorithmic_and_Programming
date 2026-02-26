package ap_lab5_ex1_ex2_ex3;

public class AP_Lab5_Ex1_Ex2_Ex3 {

    /*Using while and do-while loops*/
    public static void main(String[] args) {
        //Εxercise 1
        int num;
        do {
            System.out.print("Enter a number: ");
            num = ScannerUserInput.getInteger();
        } while (num < 2 || num > 5);
        System.out.println();
        int i = num;
        while (i < 1000) {
            System.out.println("The power is: " + i);
            i = i * num;
        }
        System.out.println();

        //Εxercise 2
        i = 1;
        int basi = num;
        while (num < 1000) {
            System.out.println("while loop: The " + i + "-th power is: " + num);
            i++;
            num = (int) Math.pow(basi, i);
        }
        num = basi;

        //Εxercise 3
        i = 1;
        System.out.println("\ndo-while loop: The " + i + "-th power is: " + num);
        do {
            i++;
            num = (int) Math.pow(basi, i);
            System.out.println("do-while loop: The " + i + "-th power is: " + num);
        } while (num < 1000);
    }
}
