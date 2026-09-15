package ap_lab09_exercise3;

public class AP_Lab09_Exercise3 {

    /*Modify Exercise 2 so that the employee fields are initialized using a full constructor*/
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

        System.out.println("\nEmployee 1 Details\nCompany Code: " + yp1.kodikosEpixeirhshs
                + "\nEmployee ID: " + yp1.arithmosMitrwou
                + "\nBase Salary: " + yp1.basikosMisthos
                + "\nOvertime Hours: " + yp1.oresYperorias
                + "\nDegree Type: " + yp1.eidosPtyxiou);
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

        System.out.println("\nEmployee 2 Details\nCompany Code: " + yp2.kodikosEpixeirhshs
                + "\nEmployee ID: " + yp2.arithmosMitrwou
                + "\nBase Salary: " + yp2.basikosMisthos
                + "\nOvertime Hours: " + yp2.oresYperorias
                + "\nDegree Type: " + yp2.eidosPtyxiou);
        System.out.println("Final salary of employee using returnTelikosMisthos(): " + yp2.returnTelikosMisthos());
    }
}
