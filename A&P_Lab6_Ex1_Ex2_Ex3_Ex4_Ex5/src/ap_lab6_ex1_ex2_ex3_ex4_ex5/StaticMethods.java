package ap_lab6_ex1_ex2_ex3_ex4_ex5;

public class StaticMethods {

    //Εxercise 5
    static int findParagontiko2(int num) {
        int npar;
        if (num == 0 || num == 1) {
            npar = 1;
        } else {
            npar = 1;
            for (int i = 2; i <= num; i++) {
                npar = npar * i;
            }
        }
        return npar;
    }

    static boolean isProtos2(int num) {
        boolean protos = true;
        for (int i = 2; i <= (num / 2); i++) {
            if (num % i == 0) {
                protos = false;
            }
        }
        return protos;
    }
}
