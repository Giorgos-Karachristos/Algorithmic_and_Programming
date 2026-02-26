package ap_lab10_exercise5;

public class AP_Lab10_Exercise5 {

    /*Modify Exercise 4 by adding the ClassOfStaticMethods class with a static trexonAM field and a findMaxSalary() method that compares two Employee objects*/
    public static void main(String[] args) {
        double basikosMisthos;
        int oresYperorias;
        int eidosPtyxiou;

        ypallhlos yp = new ypallhlos();
        System.out.print("Company Code: ");
        yp.setKodikosEpixeirhshs(ScannerUserInput.getInteger());

        System.out.print("Base Salary: ");
        basikosMisthos = ScannerUserInput.getDouble();
        System.out.print("Overtime Hours: ");
        oresYperorias = ScannerUserInput.getInteger();
        System.out.print("Degree Type: ");
        eidosPtyxiou = ScannerUserInput.getInteger();

        ypallhlos yp1 = new ypallhlos(basikosMisthos, oresYperorias, eidosPtyxiou);

        System.out.println(yp1);
        yp1.setTelikosMisthos();
        System.out.println("Final salary of employee using getTelikosMisthos(): " + yp1.getTelikosMisthos());

        System.out.print("Base Salary: ");
        basikosMisthos = ScannerUserInput.getDouble();
        System.out.print("Overtime Hours: ");
        oresYperorias = ScannerUserInput.getInteger();
        System.out.print("Degree Type: ");
        eidosPtyxiou = ScannerUserInput.getInteger();

        ypallhlos yp2 = new ypallhlos(basikosMisthos, oresYperorias, eidosPtyxiou);

        System.out.println(yp2);
        yp2.setTelikosMisthos();
        System.out.println("Final salary of employee using getTelikosMisthos(): " + yp2.getTelikosMisthos());

        System.out.println("\nEmployee with max finaly salary: ");
        ClassOfStaticMethods.findMaxSalary(yp1, yp2);
    }
}
