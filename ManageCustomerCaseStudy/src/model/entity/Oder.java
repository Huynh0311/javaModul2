package model.entity;

import data.readWriteFile.RAWOder;

import java.util.List;

public class Oder {
    private String idCustomer;
    private String idRoom;
    private String idOder;
    private static int count;
    private String timeStartOder;

    static {
        RAWOder rawOder = new RAWOder();
        List<Oder> oders = rawOder.readFileOder();
        if (!oders.isEmpty())
            count = oders.size();
    }

    public Oder() {
    }

    public Oder(String idCustomer, String idRoom, String timeStartOder) {
        this.idCustomer = idCustomer;
        this.idRoom = idRoom;
        this.idOder = "Bill - " + ++count;
        this.timeStartOder = timeStartOder;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(String idRoom) {
        this.idRoom = idRoom;
    }

    public String getIdOder() {
        return idOder;
    }

    public void setIdOder(String idOder) {
        this.idOder = idOder;
    }

    public String getTimeStartOder() {
        return timeStartOder;
    }

    public void setTimeStartOder(String timeStartOder) {
        this.timeStartOder = timeStartOder;
    }

    @Override
    public String toString() {
        return idOder +
                ", mã khách hàng: " + idCustomer +
                ", mã phòng: " + idRoom +
                ", thời gian bắt đầu thuê: " + timeStartOder;
    }

    public String writeOder() {
        return idCustomer + "," + idRoom + "," + idOder + "," + timeStartOder + "\n";
    }
}
