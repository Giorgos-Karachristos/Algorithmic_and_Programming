package ap_lab2_exercise1;

public class AP_Lab2_Exercise1 {

    /*Data Types, Integer Division, and Type Casting*/
    public static void main(String[] args) {
        double dsum, dmo;

        //byte
        byte b1 = 6;
        byte b2 = 5;
        byte bsum = (byte) (b1 + b2);
        dmo = (double) bsum / 2;
        System.out.println("byte b1 = " + b1 + ", b2 = " + b2 + ", bsum = " + bsum + ", dmo = " + dmo);
        dsum = b1 + b2;
        dmo = dsum / 2;
        System.out.println("byte b1 = " + b1 + ", b2 = " + b2 + ", dsum = " + dsum + ", dmo = " + dmo);

        //short
        short s1 = 6;
        short s2 = 5;
        short ssum = (short) (s1 + s2);
        dmo = (double) ssum / 2;
        System.out.println("short s1 = " + s1 + ", s2 = " + s2 + ", ssum = " + ssum + ", dmo = " + dmo);
        dsum = s1 + s2;
        dmo = dsum / 2;
        System.out.println("short s1 = " + s1 + ", s2 = " + s2 + ", dsum = " + dsum + ", dmo = " + dmo);

        //int
        int i1 = 6;
        int i2 = 5;
        int isum = i1 + i2;
        dmo = (double) isum / 2;
        System.out.println("int i1 = " + i1 + ", i2 = " + i2 + ", isum = " + isum + ", dmo = " + dmo);
        dsum = i1 + i2;
        dmo = dsum / 2;
        System.out.println("int i1 = " + i1 + ", i2 = " + i2 + ", dsum = " + dsum + ", dmo = " + dmo);

        //long
        long l1 = 6;
        long l2 = 5;
        long lsum = l1 + l2;
        dmo = (double) lsum / 2;
        System.out.println("long l1 = " + l1 + ", l2 = " + l2 + ", lsum = " + lsum + ", dmo = " + dmo);
        dsum = l1 + l2;
        dmo = dsum / 2;
        System.out.println("long l1 = " + l1 + ", l2 = " + l2 + ", dsum = " + dsum + ", dmo = " + dmo);

        //float
        float f1 = 6.0f;
        float f2 = 5.0f;
        float fsum = f1 + f2;
        dmo = (double) fsum / 2;
        System.out.println("float f1 = " + f1 + ", f2 = " + f2 + ", fsum = " + fsum + ", dmo = " + dmo);
        dsum = f1 + f2;
        dmo = dsum / 2;
        System.out.println("float f1 = " + f1 + ", f2 = " + f2 + ", dsum = " + dsum + ", dmo = " + dmo);

        //double
        double d1 = 6;
        double d2 = 5;
        dsum = d1 + d2;
        dmo = dsum / 2;
        System.out.println("double d1 = " + d1 + ", d2 = " + d2 + ", dsum = " + dsum + ", dmo = " + dmo);
    }
}
