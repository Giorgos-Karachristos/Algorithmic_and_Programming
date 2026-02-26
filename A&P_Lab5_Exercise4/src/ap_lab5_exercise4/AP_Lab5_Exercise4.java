package ap_lab5_exercise4;

public class AP_Lab5_Exercise4 {

    /*Assign people to classrooms based on user-entered capacities, 
    calculate the required supervisors for each, and then print total classrooms, supervisors, and seats*/
    public static void main(String[] args) {
        int atoma = 100;
        int plithos = 0;
        int aithoyses = 0;
        int thesis = 0;
        int epitirites;
        do {
            System.out.print("Enter classroom capacity: ");
            int xoritikotita = ScannerUserInput.getInteger();
            if (xoritikotita <= 15) {
                epitirites = 1;
            } else if (xoritikotita <= 23) {
                epitirites = 2;
            } else {
                epitirites = 3;
            }
            atoma -= xoritikotita;
            System.out.println("Required " + epitirites + " supervisors");
            plithos += epitirites;
            aithoyses++;
            thesis += xoritikotita;
        } while (atoma > 0);
        System.out.println("Total classrooms: " + aithoyses + ", Total supervisors: " + plithos + ", Total seats: " + thesis);
    }
}
