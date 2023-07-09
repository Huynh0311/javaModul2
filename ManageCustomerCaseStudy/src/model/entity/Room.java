package model.entity;

public class Room {
    private boolean status;
    private String idRoom;
    private double squareMeters;
    private double moneyRoom;
    private double moneyElectric;
    private double moneyWater;
    private double moneyInternet;
    private double moneyCleaning;
    private double sumMoneyOneMonth;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(String idRoom) {
        this.idRoom = idRoom;
    }

    public double getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(double squareMeters) {
        this.squareMeters = squareMeters;
    }

    public double getMoneyRoom() {
        return moneyRoom;
    }

    public void setMoneyRoom(double moneyRoom) {
        this.moneyRoom = moneyRoom;
    }

    public double getMoneyElectric() {
        return moneyElectric;
    }

    public void setMoneyElectric(double moneyElectric) {
        this.moneyElectric = moneyElectric;
    }

    public double getMoneyWater() {
        return moneyWater;
    }

    public void setMoneyWater(double moneyWater) {
        this.moneyWater = moneyWater;
    }

    public double getMoneyInternet() {
        return moneyInternet;
    }

    public void setMoneyInternet(double moneyInternet) {
        this.moneyInternet = moneyInternet;
    }

    public double getMoneyCleaning() {
        return moneyCleaning;
    }

    public void setMoneyCleaning(double moneyCleaning) {
        this.moneyCleaning = moneyCleaning;
    }

    public double getSumMoneyOneMonth() {
        return sumMoneyOneMonth;
    }

    public void setSumMoneyOneMonth(double sumMoneyOneMonth) {
        this.sumMoneyOneMonth = sumMoneyOneMonth;
    }

    public Room(String idRoom, boolean status, double squareMeters, double moneyRoom, double moneyElectric, double moneyWater, double moneyInternet, double moneyCleaning) {
        this.idRoom = idRoom;
        this.status = status;
        this.squareMeters = squareMeters;
        this.moneyRoom = moneyRoom;
        this.moneyElectric = moneyElectric;
        this.moneyWater = moneyWater;
        this.moneyInternet = moneyInternet;
        this.moneyCleaning = moneyCleaning;
        this.sumMoneyOneMonth = this.moneyRoom + this.moneyElectric + this.moneyWater + this.moneyInternet + this.moneyCleaning;
    }

    @Override
    public String toString() {
        if (status) {
            return "Mã phòng: " + idRoom + "\n" +
                    "Trạng thái: Đã được thuê" + "\n" +
                    "Diện tích phòng: " + squareMeters + " m2" + "\n" +
                    "Tiền phòng: " + moneyRoom + " đồng / 1 tháng" + "\n" +
                    "Tiền điện: " + moneyElectric + " đồng / 1 số" + "\n" +
                    "Tiền nước: " + moneyWater + " đồng / người" + "\n" +
                    "Tiền mạng: " + moneyInternet + " đồng / người" + "\n" +
                    "Tiền vệ sinh: " + moneyCleaning + " đồng / người." + "\n" +
                    "Tổng tiền trả cho 1 tháng: " + sumMoneyOneMonth;
        } else {
            return "Mã phòng: " + idRoom + "\n" +
                    "Trạng thái: Còn trống" + "\n" +
                    "Diện tích phòng: " + squareMeters + " m2" + "\n" +
                    "Tiền phòng: " + moneyRoom + " đồng / 1 tháng" + "\n" +
                    "Tiền điện: " + moneyElectric + " đồng / 1 số" + "\n" +
                    "Tiền nước: " + moneyWater + " đồng / người" + "\n" +
                    "Tiền mạng: " + moneyInternet + " đồng / người" + "\n" +
                    "Tiền vệ sinh: " + moneyCleaning + " đồng / người." + "\n" +
                    "Tổng tiền trả cho 1 tháng: " + sumMoneyOneMonth;
        }
    }
}
