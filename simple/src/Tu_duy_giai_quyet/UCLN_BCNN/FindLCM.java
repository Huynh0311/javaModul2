package Tu_duy_giai_quyet.UCLN_BCNN;

public class FindLCM extends FindGCD {
    public static int LCM(int a, int b) {
        return (a * b) / GCD(a, b);
    }

    public static int LCM2(int a, int b) {
        int max = 0;
        if (a > b) {
            max = a;
            for (int i = 1; i < max; i++) {
                if ((max * i) % b == 0) {
                    return max * i;
                }
            }
        }else {
            max = b;
            for (int i = 1; i < max; i++) {
                if ((max * i) % a == 0) {
                    return max * i;
                }
            }
        }
        return max;
    }
}
