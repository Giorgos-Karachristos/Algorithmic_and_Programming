package ap_lab04_exercise3;

public class AP_Lab04_Exercise3 {

    /*Calculate the final tax based on income and deductions*/
    public static void main(String[] args) {
        System.out.print("Enter income amount: ");
        int posoEisodhmatos = ScannerUserInput.getInteger();

        System.out.print("Enter number of properties: ");
        int arithmosAkinhtwn = ScannerUserInput.getInteger();

        System.out.print("Enter tax discount: ");
        int ekptoshApoForo = ScannerUserInput.getInteger();

        System.out.print("Enter income deduction: ");
        int ekptoshApoEisodhma = ScannerUserInput.getInteger();

        System.out.println("\nIncome: " + posoEisodhmatos
                + "\nNumber of properties: " + arithmosAkinhtwn
                + "\nTax discount: " + ekptoshApoForo
                + "\nIncome deduction: " + ekptoshApoEisodhma);

        int aforologhtoEisodhma;
        switch (arithmosAkinhtwn) {
            case 0:
                aforologhtoEisodhma = 12000;
                break;
            case 1:
                aforologhtoEisodhma = 10000;
                break;
            case 2:
                aforologhtoEisodhma = 8000;
                break;
            case 3:
                aforologhtoEisodhma = 5000;
                break;
            default:
                aforologhtoEisodhma = 0;
        }
        System.out.println("Tax-free income: " + aforologhtoEisodhma);

        int forologhteoEisodhma = posoEisodhmatos - ekptoshApoEisodhma - aforologhtoEisodhma;
        System.out.println("Taxable income: " + forologhteoEisodhma);

        double forosPouAnalogei = forologhteoEisodhma * 0.3;
        System.out.println("Tax due: " + forosPouAnalogei);

        double telikoPosoForou = forosPouAnalogei - ekptoshApoForo;
        System.out.println("Final tax amount: " + telikoPosoForou);
    }
}
