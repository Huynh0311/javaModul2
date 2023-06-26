package collection_16;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath){
        try {
            // đọc file theo hướng dẫn
            File file = new File(filePath);
            // kiểm tra nếu file không tồn tại thì ném ra ngoại lệ
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            //Đọc từng dòng của file và tiến hành cộng tổng lại
            BufferedReader bf = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = bf.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bf.close();

            // Hiển thị ra màn hình tổng các số nguyên trong file
            System.out.println("Tổng = " + sum);
        }catch (Exception e){
            // TH file không tồn tại hoặc nội dung file có lỗi thì sẽ hiển thị thông báo lỗi.
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);
    }
}
