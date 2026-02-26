package ap_lab10_exercise6;

public class ClassOfStaticMethods {

    static int trexonAM = 14013;

    static void findMaxSalary(ypallhlos y1, ypallhlos y2) {
        if (y1.getTelikosMisthos() > y2.getTelikosMisthos()) {
            System.out.println(y1);
        } else if (y1.getTelikosMisthos() < y2.getTelikosMisthos()) {
            System.out.println(y2);
        } else {
            System.out.println("Both employees have the same salary");
        }
    }

    static void findMaxSalaryAll(ypallhlos yp[]) {
        int max = 0;
        for (int i = 1; i < yp.length; i++) {
            if (yp[i].getTelikosMisthos() > yp[max].getTelikosMisthos()) {
                max = i;
            }
        }
        System.out.println("\nEmployee with max final salary: " + yp[max]);
    }

    static void setTelikosMisthosAll(ypallhlos yp[]) {
        for (int i = 0; i < yp.length; i++) {
            yp[i].setTelikosMisthos();
            System.out.println("Final salary of employee " + yp[i].getArithmosMitrwou() + ": " + yp[i].getTelikosMisthos());
        }
    }
}
