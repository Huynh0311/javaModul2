package data.readWriteFile;

import model.entity.Customer;
import model.entity.Oder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RAWOder {
    File fileOder = new File("D:\\Code-Gym\\javaMd2\\ManageCustomerCaseStudy\\src\\data\\file\\Oder.csv");

    public void writeFileOder(List<Oder> oders) {
        try {
            if (!fileOder.exists()) {
                throw new FileNotFoundException();
            }
            String data = "";
            for (Oder oder : oders) {
                data += oder.writeOder();
            }
            FileWriter fileWriter = new FileWriter(fileOder);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("File không tồn tại hoặc nội dung có lỗi 1");
        }
    }

    public List<Oder> readFileOder() {
        List<Oder> oders = new ArrayList<>();
        try {
            if (!fileOder.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(fileOder);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                Oder oder = new Oder();
                oder.setIdCustomer(Integer.parseInt(data[0]));
                oder.setIdRoom(data[1]);
                oder.setStatus(Boolean.parseBoolean(data[3]));
                oder.setTimeStartOder(data[4]);
                oder.setTimeOder(data[5]);
                oder.setIdOder(data[2]);
                oders.add(oder);
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("File không tồn tại hoặc nội dung có lỗi 1");
        }
        return oders;
    }
}
