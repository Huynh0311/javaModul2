package Tu_duy_giai_quyet;

import java.util.Scanner;

public class banh_chung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] groupSizes = new int[N];
        for (int i = 0; i < N; i++) {
            groupSizes[i] = scanner.nextInt();
        }

        int minCakes = calculateMinCakes(N, groupSizes);
        System.out.println(minCakes);
    }

    private static int calculateMinCakes(int N, int[] groupSizes) {
        int[] count = new int[5]; // Số lượng nhóm có từ 0 đến 4 thành viên

        // Đếm số lượng nhóm với từng số thành viên
        for (int i = 0; i < N; i++) {
            count[groupSizes[i]]++;
        }

        int minCakes = count[4] + count[3] + count[2] / 2;
        count[1] -= count[3];

        if (count[2] % 2 != 0) {
            minCakes++;
            count[1] -= 2;
        }

        if (count[1] > 0) {
            minCakes += (count[1] + 3) / 4;
        }

        return minCakes;
    }
}

