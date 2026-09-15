package ap_lab04_ex1_ex2;

public class AP_Lab04_Ex1_Ex2 {

    /*Conversion from if-else to switch and vice versa*/
    public static void main(String[] args) {
        //Exercise 1
        System.out.print("Enter an integer for the month: ");
        int month = ScannerUserInput.getInteger();
        String monthString;
        if (month == 1) {
            monthString = "January";
        } else if (month == 2) {
            monthString = "February";
        } else if (month == 3) {
            monthString = "March";
        } else if (month == 4) {
            monthString = "April";
        } else if (month == 5) {
            monthString = "May";
        } else if (month == 6) {
            monthString = "June";
        } else if (month == 7) {
            monthString = "July";
        } else if (month == 8) {
            monthString = "August";
        } else if (month == 9) {
            monthString = "September";
        } else if (month == 10) {
            monthString = "October";
        } else if (month == 11) {
            monthString = "November";
        } else if (month == 12) {
            monthString = "December";
        } else {
            monthString = "Invalid month";
        }
        System.out.println("Month: " + monthString);

        //Exercise 2
        System.out.print("Enter a non-negative integer for x: ");
        int x = ScannerUserInput.getInteger();
        switch (x) {
            case 0 ->
                System.out.println("x = 0");
            case 1, 3, 5 ->
                System.out.println("x = odd number");
            case 2, 4 ->
                System.out.println("x = even number");
            default ->
                System.out.println(" x > 5");
        }
    }
}
