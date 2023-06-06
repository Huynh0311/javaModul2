package Kiem_tra_snt;

public class _20_snt_dau_tien {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        while (count < 20) {
            if(isPrime(number)){
                System.out.println(number);
                count++;
            }
            number++;
        }

    }

    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}

