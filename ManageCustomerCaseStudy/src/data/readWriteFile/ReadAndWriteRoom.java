package data.readWriteFile;

import model.entity.Room;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteRoom {
    File file = new File("D:\\Code-Gym\\javaMd2\\ManageCustomerCaseStudy\\src\\Data\\File\\Room.csv");

    public void writeFile(List<Room> rooms) {
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            String data = "";
            for (Room room : rooms) {
                data += room.getIdPhong() + "," + room.isStatus() + "," +
                        room.getSquareMeters() + "," + room.getMoneyRoom() + "," + room.getMoneyElectric() + "," +
                        room.getMoneyWater() + "," + room.getMoneyInternet() + "," + room.getMoneyCleaning() + "\n";
            }
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println("Fie không tồn tại hoặc nội dung có lỗi!");
        }
    }

    public List<Room> readFile() {
        List<Room> rooms = new ArrayList<>();
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                rooms.add(new Room(data[0], Boolean.parseBoolean(data[1]), Double.parseDouble(data[2]), Double.parseDouble(data[3]), Double.parseDouble(data[4]), Double.parseDouble(data[5]), Double.parseDouble(data[6]), Double.parseDouble(data[7])));
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("Nội dung không tồn tại hoặc file có lỗi");
        }
        return rooms;
    }
}
