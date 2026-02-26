package ap_lab10_exercise5;

public class ypallhlos {

    private static int kodikosEpixeirhshs;
    private int arithmosMitrwou;
    private double basikosMisthos;
    private int oresYperorias;
    private int eidosPtyxiou;

    private double telikosMisthos;

    public ypallhlos() {
    }

    public ypallhlos(double basikosMisthos, int oresYperorias, int eidosPtyxiou) {
        setArithmosMitrwou();
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

    public void setArithmosMitrwou() {
        this.arithmosMitrwou = ClassOfStaticMethods.trexonAM++;
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

    public void setTelikosMisthos() {
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
        this.telikosMisthos = getOresYperorias() * 20 + getBasikosMisthos() + epi;
    }

    public double getTelikosMisthos() {
        return telikosMisthos;
    }
}
