package ap_lab10_exercise3;

public class AP_Lab10_Exercise3 {

    /*Modify Exercise 2 so that the kodikosEpixeirhshs field becomes static*/
    public static void main(String[] args) {
        int arithmosMitrwou;
        double basikosMisthos;
        int oresYperorias;
        int eidosPtyxiou;

        ypallhlos yp = new ypallhlos();
        System.out.print("Company Code: ");
        yp.setKodikosEpixeirhshs(ScannerUserInput.getInteger());

        System.out.print("\nEmployee ID: ");
        arithmosMitrwou = ScannerUserInput.getInteger();
        System.out.print("Base Salary: ");
        basikosMisthos = ScannerUserInput.getDouble();
        System.out.print("Overtime Hours: ");
        oresYperorias = ScannerUserInput.getInteger();
        System.out.print("Degree Type: ");
        eidosPtyxiou = ScannerUserInput.getInteger();

        ypallhlos yp1 = new ypallhlos(arithmosMitrwou, basikosMisthos, oresYperorias, eidosPtyxiou);

        System.out.println(yp1);
        yp1.showTelikosMisthos();

        System.out.print("Employee ID: ");
        arithmosMitrwou = ScannerUserInput.getInteger();
        System.out.print("Base Salary: ");
        basikosMisthos = ScannerUserInput.getDouble();
        System.out.print("Overtime Hours: ");
        oresYperorias = ScannerUserInput.getInteger();
        System.out.print("Degree Type: ");
        eidosPtyxiou = ScannerUserInput.getInteger();

        ypallhlos yp2 = new ypallhlos(arithmosMitrwou, basikosMisthos, oresYperorias, eidosPtyxiou);

        System.out.println(yp2);
        System.out.println("Final salary of employee using returnTelikosMisthos(): " + yp2.returnTelikosMisthos());
    }
}
