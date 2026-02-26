package ap_lab10_exercise2;

public class AP_Lab10_Exercise2 {

    /*Modify Exercise 1 so that all fields are private and provide getter and setter methods to access them*/
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
