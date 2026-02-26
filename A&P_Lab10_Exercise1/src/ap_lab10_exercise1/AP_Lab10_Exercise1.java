package ap_lab10_exercise1;

public class AP_Lab10_Exercise1 {

    /*Modify Exercise 3 from Lab 9 so that the employee details are displayed using the toString() method*/
    public static void main(String[] args) {
        int kodikosEpixeirhshs;
        int arithmosMitrwou;
        double basikosMisthos;
        int oresYperorias;
        int eidosPtyxiou;

        System.out.print("Company Code: ");
        kodikosEpixeirhshs = ScannerUserInput.getInteger();
        System.out.print("Employee ID: ");
        arithmosMitrwou = ScannerUserInput.getInteger();
        System.out.print("Base Salary: ");
        basikosMisthos = ScannerUserInput.getDouble();
        System.out.print("Overtime Hours: ");
        oresYperorias = ScannerUserInput.getInteger();
        System.out.print("Degree Type: ");
        eidosPtyxiou = ScannerUserInput.getInteger();

        ypallhlos yp1 = new ypallhlos(kodikosEpixeirhshs, arithmosMitrwou, basikosMisthos, oresYperorias, eidosPtyxiou);

        System.out.println(yp1);
        yp1.showTelikosMisthos();

        System.out.print("\nCompany Code: ");
        kodikosEpixeirhshs = ScannerUserInput.getInteger();
        System.out.print("Employee ID: ");
        arithmosMitrwou = ScannerUserInput.getInteger();
        System.out.print("Base Salary: ");
        basikosMisthos = ScannerUserInput.getDouble();
        System.out.print("Overtime Hours: ");
        oresYperorias = ScannerUserInput.getInteger();
        System.out.print("Degree Type: ");
        eidosPtyxiou = ScannerUserInput.getInteger();

        ypallhlos yp2 = new ypallhlos(kodikosEpixeirhshs, arithmosMitrwou, basikosMisthos, oresYperorias, eidosPtyxiou);

        System.out.println(yp2);
        System.out.println("Final salary of employee using returnTelikosMisthos(): " + yp2.returnTelikosMisthos());
    }
}
