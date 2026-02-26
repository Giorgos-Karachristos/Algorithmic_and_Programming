package ap_lab10_exercise1;

public class ypallhlos {

    int kodikosEpixeirhshs;
    int arithmosMitrwou;
    double basikosMisthos;
    int oresYperorias;
    int eidosPtyxiou;

    public ypallhlos(int kodikosEpixeirhshs, int arithmosMitrwou, double basikosMisthos, int oresYperorias, int eidosPtyxiou) {
        this.kodikosEpixeirhshs = kodikosEpixeirhshs;
        this.arithmosMitrwou = arithmosMitrwou;
        this.basikosMisthos = basikosMisthos;
        this.oresYperorias = oresYperorias;
        this.eidosPtyxiou = eidosPtyxiou;
    }

    @Override
    public String toString() {
        return "\nEmployee Details \nCompany Code: " + kodikosEpixeirhshs
                + "\nEmployee ID: " + arithmosMitrwou
                + "\nBase Salary: " + basikosMisthos
                + "\nOvertime Hours: " + oresYperorias
                + "\nDegree Type: " + eidosPtyxiou;
    }

    public void showTelikosMisthos() {
        int epi;
        switch (eidosPtyxiou) {
            case 1:
                epi = 300;
                break;
            case 2:
                epi = 150;
                break;
            case 3:
                epi = 100;
                break;
            case 4:
                epi = 50;
                break;
            default:
                epi = 0;
                break;
        }
        double tel = oresYperorias * 20 + basikosMisthos + epi;
        System.out.println("Final salary of employee using showTelikosMisthos(): " + tel);
    }

    public double returnTelikosMisthos() {
        int epi;
        switch (eidosPtyxiou) {
            case 1:
                epi = 300;
                break;
            case 2:
                epi = 150;
                break;
            case 3:
                epi = 100;
                break;
            case 4:
                epi = 50;
                break;
            default:
                epi = 0;
                break;
        }
        double tel = oresYperorias * 20 + basikosMisthos + epi;
        return tel;
    }
}
