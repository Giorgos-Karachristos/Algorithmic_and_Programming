package ap_lab10_exercise2;

public class ypallhlos {

    private int kodikosEpixeirhshs;
    private int arithmosMitrwou;
    private double basikosMisthos;
    private int oresYperorias;
    private int eidosPtyxiou;

    public ypallhlos(int kodikosEpixeirhshs, int arithmosMitrwou, double basikosMisthos, int oresYperorias, int eidosPtyxiou) {
        this.kodikosEpixeirhshs = kodikosEpixeirhshs;
        this.arithmosMitrwou = arithmosMitrwou;
        this.basikosMisthos = basikosMisthos;
        this.oresYperorias = oresYperorias;
        this.eidosPtyxiou = eidosPtyxiou;
    }

    public int getKodikosEpixeirhshs() {
        return kodikosEpixeirhshs;
    }

    public void setKodikosEpixeirhshs(int kodikosEpixeirhshs) {
        this.kodikosEpixeirhshs = kodikosEpixeirhshs;
    }

    public int getArithmosMitrwou() {
        return arithmosMitrwou;
    }

    public void setArithmosMitrwou(int arithmosMitrwou) {
        this.arithmosMitrwou = arithmosMitrwou;
    }

    public double getBasikosMisthos() {
        return basikosMisthos;
    }

    public void setBasikosMisthos(double basikosMisthos) {
        this.basikosMisthos = basikosMisthos;
    }

    public int getOresYperorias() {
        return oresYperorias;
    }

    public void setOresYperorias(int oresYperorias) {
        this.oresYperorias = oresYperorias;
    }

    public int getEidosPtyxiou() {
        return eidosPtyxiou;
    }

    public void setEidosPtyxiou(int eidosPtyxiou) {
        this.eidosPtyxiou = eidosPtyxiou;
    }

    @Override
    public String toString() {
        return "\nEmployee Details \nCompany Code: " + getKodikosEpixeirhshs()
                + "\nEmployee ID: " + getArithmosMitrwou()
                + "\nBase Salary: " + getBasikosMisthos()
                + "\nOvertime Hours: " + getOresYperorias()
                + "\nDegree Type: " + getEidosPtyxiou();
    }

    public void showTelikosMisthos() {
        int epi;
        switch (getEidosPtyxiou()) {
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
        double tel = getOresYperorias() * 20 + getBasikosMisthos() + epi;
        System.out.println("Final salary of employee using showTelikosMisthos(): " + tel);
    }

    public double returnTelikosMisthos() {
        int epi;
        switch (getEidosPtyxiou()) {
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
        double tel = getOresYperorias() * 20 + getBasikosMisthos() + epi;
        return tel;
    }
}
