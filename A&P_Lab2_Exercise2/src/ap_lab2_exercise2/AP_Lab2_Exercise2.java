package ap_lab2_exercise2;

public class AP_Lab2_Exercise2 {

    /*Integer Division and Remainder*/
    public static void main(String[] args) {
        int n = 1589;
        int cm = n * 80;
        System.out.println("Distance in centimeter = " + cm + " cm");
        System.out.println("Distance in kilometers = " + (cm / 100000) + " km");
        System.out.println("Distance in metres = " + ((cm % 100000) / 100) + " m");
        System.out.println("Distance in centimeter = " + (cm % 100) + " cm");
    }
}
