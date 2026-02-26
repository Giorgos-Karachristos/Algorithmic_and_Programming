package ap_lab10_exercise5;

public class ClassOfStaticMethods {

    static int trexonAM = 14013;

    static void findMaxSalary(ypallhlos y1, ypallhlos y2) {
        if (y1.getTelikosMisthos() > y2.getTelikosMisthos()) {
            System.out.println(y1);
        } else if (y1.getTelikosMisthos() < y2.getTelikosMisthos()){
            System.out.println(y2);
        } else {
            System.out.println("Both employees have the same salary");
        }
    }
}
