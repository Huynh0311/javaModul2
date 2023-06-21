package Tu_duy_giai_quyet.UCLN_BCNN;

import java.util.Scanner;

public class FindGCD {
    public static int GCD(int a, int b){
        if (b == 0){
            return a;
        }
        return GCD(b, a % b);
    }
}
