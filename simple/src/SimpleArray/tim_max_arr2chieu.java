package SimpleArray;

public class tim_max_arr2chieu {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,10,6},
                {7,8,9}
        };
        System.out.println("max trong mảng trên là: "+ findMax(arr));
    }

    public static int findMax(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++){
                if(arr[i][j] > max) max = arr[i][j];
            }
        }
        return max;
    }
}
