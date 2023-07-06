package model.entity;

import data.readWriteFile.RAWOder;

import java.util.List;

public class Oder {
    private int idCustomer;
    private String idRoom;
    private String idOder;
    private static int count;
    private boolean status;
    private String timeStartOder;
    private String timeOder;

    static {
        RAWOder rawOder = new RAWOder();
        List<Oder> oders = rawOder.readFileOder();
        if(!oders.isEmpty())
            count = oders.size();
    }

    public Oder() {
    }

    public Oder(int idCustomer, String idRoom, boolean status, String timeStartOder, String timeOder) {
        this.idCustomer = idCustomer;
        this.idRoom = idRoom;
        this.idOder = "Bill - " + ++count;
        this.status = status;
        this.timeStartOder = timeStartOder;
        this.timeOder = timeOder;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTimeStartOder() {
        return timeStartOder;
    }

    public void setTimeStartOder(String timeStartOder) {
        this.timeStartOder = timeStartOder;
    }

    public String getTimeOder() {
        return timeOder;
    }

    public void setTimeOder(String timeOder) {
        this.timeOder = timeOder;
    }

    @Override
    public String toString() {
        return  "idCustomer: " + idCustomer +
                ", idRoom: " + idRoom +
                ", idOder: " + idOder +
                ", Status:" + status +
                ", timeStartOder " + timeStartOder +
                ", timeOder='" + timeOder;
    }

    public String writeOder() {
        return  idCustomer + "," + idRoom + "," + idOder + "," + status + "," + timeStartOder + "," + timeOder + "\n";
    }
}
