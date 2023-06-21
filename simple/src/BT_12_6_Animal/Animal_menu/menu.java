package BT_12_6_Animal.Animal_menu;

import java.util.Scanner;

public class  menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int id, birth;
        String name, type, color, eyeColor;
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1 Thêm động vật");
            System.out.println("2 Xóa động vật");
            System.out.println("3 Sửa động vật");
            System.out.println("4 Tìm kiếm");
            System.out.println("5 Hiển thị tất cả");
            System.out.println("6 Hiển thị tất cả mèo");
            System.out.println("7 Kiểm tra mèo có bệnh hay không");
            System.out.println("0. Exit");
            System.out.println("Nhập số: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1 Thêm chó");
                    System.out.println("2 Thêm mèo");
                    System.out.println("3 Thêm chim");
                    int choiceAnimal = input.nextInt();
                    switch (choiceAnimal) {
                        case 1:
                            System.out.println("Nhập id");
                            id = input.nextInt();

                            System.out.println("Nhập tên");
                            input.nextLine();
                            name = input.nextLine();

                            System.out.println("Nhập năm sinh");
                            birth = input.nextInt();

                            System.out.println("Nhập màu lông");
                            input.nextLine();
                            color = input.nextLine();

                            System.out.println("Nhập loài chó");
                            type = input.nextLine();
                            break;
                        case 2:
                            System.out.println("Nhập id");
                            id = input.nextInt();

                            System.out.println("Nhập tên");
                            input.nextLine();
                            name = input.nextLine();

                            System.out.println("Nhập năm sinh");
                            birth = input.nextInt();

                            System.out.println("Nhập màu mắt");
                            input.nextLine();
                            eyeColor = input.nextLine();

                            System.out.println("Nhập loại mèo");
                            type = input.nextLine();

                            System.out.println("Nhập tình trạng");
                            type = input.nextLine();
                            break;

                        case 3:
                            System.out.println("Nhập id");
                            id = input.nextInt();

                            System.out.println("Nhập tên");
                            input.nextLine();
                            name = input.nextLine();

                            System.out.println("Nhập năm sinh");
                            birth = input.nextInt();

                            System.out.println("Nhập Mỏ(ngắn hoặc dài");
                            input.nextLine();
                            eyeColor = input.nextLine();

                            System.out.println("Nhập Mỏ(ngắn hoặc dài");
                            input.nextLine();
                            eyeColor = input.nextLine();

                            System.out.println("Nhập loại chim");
                            type = input.nextLine();
                            break;

                    }
                    break;
                case 2:
                    System.out.println("Nhập id");
                    id = input.nextInt();
                case 3:
                    System.out.println("Nhập id");
                    id = input.nextInt();
                case 4:
                    System.out.println("Nhập id");
                    id = input.nextInt();
            }
        }
    }
}
