package ap_lab03_exercise3;

public class AP_Lab03_Exercise3 {

    /*Calculate the Body Mass Index (BMI) for people over 18 and 
    display the corresponding weight category*/
    public static void main(String[] args) {
        System.out.print("Enter age: ");
        int age = ScannerUserInput.getInteger();
        System.out.print("Enter weight (kg): ");
        int weight = ScannerUserInput.getInteger();
        System.out.print("Enter height (cm): ");
        int height = ScannerUserInput.getInteger();

        if (age > 18) {
            double metra = (double) height / 100;
            double bmi = weight / (metra * metra);
            System.out.print("BMI = " + bmi + ", ");

            if (bmi < 18.5) {
                System.out.println("Underweight");
            } else if (bmi < 25) {
                System.out.println("Normal weight");
            } else if (bmi < 30) {
                System.out.println("Overweight");
            } else {
                System.out.println("Obese");
            }
        } else {
            System.out.println("BMI is not valid for this age");
        }
    }
}
