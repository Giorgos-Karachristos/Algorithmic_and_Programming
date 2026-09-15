package ap_lab09_exercise1;

public class AP_Lab09_Exercise1 {

    /*Creates two Employee objects, reads their details from user input, displays their information, 
    and calculates their final salary based on base salary, overtime, and degree allowance using static methods*/
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
                + "\nBase Salary: " + yp1.basikosMisthos
                + "\nOvertime Hours: " + yp1.oresYperorias
                + "\nDegree Type: " + yp1.eidosPtyxiou);
        showTelikosMisthos(yp1);

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
        System.out.println("Final salary of employee using returnTelikosMisthos(): " + returnTelikosMisthos(yp2));
    }

    public static void showTelikosMisthos(ypallhlos yp1) {
        int epidoma;
        switch (yp1.eidosPtyxiou) {
            case 1:
                epidoma = 300;
                break;
            case 2:
                epidoma = 150;
                break;
            case 3:
                epidoma = 100;
                break;
            case 4:
                epidoma = 50;
                break;
            default:
                epidoma = 0;
                break;
        }
        double tel = yp1.oresYperorias * 20 + yp1.basikosMisthos + epidoma;
        System.out.println("Final salary of employee using showTelikosMisthos(): " + tel);
    }

    public static double returnTelikosMisthos(ypallhlos yp2) {
        int epidoma;
        switch (yp2.eidosPtyxiou) {
            case 1:
                epidoma = 300;
                break;
            case 2:
                epidoma = 150;
                break;
            case 3:
                epidoma = 100;
                break;
            case 4:
                epidoma = 50;
                break;
            default:
                epidoma = 0;
                break;
        }
        return yp2.oresYperorias * 20 + yp2.basikosMisthos + epidoma;
    }
}
