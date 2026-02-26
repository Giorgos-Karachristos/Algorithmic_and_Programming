package ap_lab10_exercise6;

public class AP_Lab10_Exercise6 {

    /*Modify Exercise 5 to create an array of 5 Employee objects and add findMaxSalaryAll() and setTelikosMisthosAll() methods in ClassOfStaticMethods*/
    public static void main(String[] args) {
        ypallhlos ypallhlos = new ypallhlos();
        System.out.print("Company Code: ");
        ypallhlos.setKodikosEpixeirhshs(ScannerUserInput.getInteger());

        ypallhlos yp[] = new ypallhlos[5];

        for (int i = 0; i < yp.length; i++) {
            System.out.print("Base Salary: ");
            double basikosMisthos = ScannerUserInput.getDouble();
            System.out.print("Overtime Hours: ");
            int oresYperorias = ScannerUserInput.getInteger();
            System.out.print("Degree Type: ");
            int eidosPtyxiou = ScannerUserInput.getInteger();

            yp[i] = new ypallhlos(basikosMisthos, oresYperorias, eidosPtyxiou);
        }

        for (int i = 0; i < yp.length; i++) {
            System.out.println(yp[i]);
        }
        System.out.println();
        ClassOfStaticMethods.setTelikosMisthosAll(yp);
        ClassOfStaticMethods.findMaxSalaryAll(yp);
    }
}
