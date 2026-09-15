package ap_lab09_exercise2;

public class ypallhlos {

    int kodikosEpixeirhshs;
    int arithmosMitrwou;
    double basikosMisthos;
    int oresYperorias;
    int eidosPtyxiou;

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
