package ap_lab9_exercise2;

public class AP_Lab9_Exercise2 {

    /*Modify Exercise 1 so that the methods calculating the final salary become instance methods of the Employee class instead of static methods*/
    public static void main(String[] args) {
        ypallhlos yp1 = new ypallhlos();
        System.out.print("Company Code: ");
        yp1.kodikosEpixeirhshs = ScannerUserInput.getInteger();
        System.out.print("Employee ID: ");
        yp1.arithmosMitrwou = ScannerUserInput.getInteger();
        System.out.print("Base Salary: ");
        yp1.basikosMisthos = ScannerUserInput.getDouble();
        System.out.print("Overtime Hours: ");
        yp1.oresYperorias = ScannerUserInput.getInteger();
        System.out.print("Degree Type: ");
        yp1.eidosPtyxiou = ScannerUserInput.getInteger();

        System.out.println("\nEmployee 1 Details\nCompany Code: " + yp1.kodikosEpixeirhshs
                + "\nEmployee ID: " + yp1.arithmosMitrwou
                + "\nBase Salary:" + yp1.basikosMisthos
                + "\nOvertime Hours: " + yp1.oresYperorias
                + "\nDegree Type: " + yp1.eidosPtyxiou);
        yp1.showTelikosMisthos();

        ypallhlos yp2 = new ypallhlos();
        System.out.print("\nCompany Code: ");
        yp2.kodikosEpixeirhshs = ScannerUserInput.getInteger();
        System.out.print("Employee ID: ");
        yp2.arithmosMitrwou = ScannerUserInput.getInteger();
        System.out.print("Base Salary: ");
        yp2.basikosMisthos = ScannerUserInput.getDouble();
        System.out.print("Overtime Hours: ");
        yp2.oresYperorias = ScannerUserInput.getInteger();
        System.out.print("Degree Type: ");
        yp2.eidosPtyxiou = ScannerUserInput.getInteger();
        
        System.out.println("\nEmployee 2 Details\nCompany Code: " + yp2.kodikosEpixeirhshs
                + "\nEmployee ID: " + yp2.arithmosMitrwou
                + "\nBase Salary: " + yp2.basikosMisthos
                + "\nOvertime Hours: " + yp2.oresYperorias
                + "\nDegree Type: " + yp2.eidosPtyxiou);
        System.out.println("Final salary of employee using returnTelikosMisthos(): " + yp2.returnTelikosMisthos());
    }
}
