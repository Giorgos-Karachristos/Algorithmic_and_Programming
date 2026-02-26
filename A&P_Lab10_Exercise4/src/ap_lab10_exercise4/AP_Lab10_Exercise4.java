package ap_lab10_exercise4;

public class AP_Lab10_Exercise4 {

    /*Modify Exercise 3 so that telikosMisthos becomes a private field and create a setTelikosMisthos() method to calculate it*/
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
        yp1.setTelikosMisthos();
        System.out.println("Final salary of employee using getTelikosMisthos(): " + yp1.getTelikosMisthos());

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
        yp2.setTelikosMisthos();
        System.out.println("Final salary of employee using getTelikosMisthos(): " + yp2.getTelikosMisthos());
    }
}
