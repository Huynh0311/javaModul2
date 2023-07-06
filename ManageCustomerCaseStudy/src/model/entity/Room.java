package model.entity;

public class Room {
    private boolean status;
    private String idPhong;
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

    public String getIdPhong() {
        return idPhong;
    }

    public void setIdPhong(String idPhong) {
        this.idPhong = idPhong;
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

    public Room(String idPhong, boolean status, double squareMeters, double moneyRoom, double moneyElectric, double moneyWater, double moneyInternet, double moneyCleaning) {
        this.idPhong = idPhong;
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
            return "Mã phòng: " + idPhong +
                    ", Trạng thái: Đã được thuê" +
                    ", Diện tích phòng: " + squareMeters +
                    ", Tiền phòng: " + moneyRoom +
                    ", Tiền điện: " + moneyElectric + " đồng / 1 số" +
                    ", Tiền nước: " + moneyWater + " đồng / người" +
                    ", Tiền mạng: " + moneyInternet + " đồng / người" +
                    ", Tiền vệ sinh: " + moneyCleaning + " đồng / người." +
                    ", Tổng tiền trả cho 1 tháng: " + sumMoneyOneMonth;
        } else {
            return "Mã phòng: " + idPhong +
                    ", Trạng thái: Còn trống" +
                    ", Diện tích phòng: " + squareMeters +
                    ", Tiền phòng: " + moneyRoom +
                    ", Tiền điện: " + moneyElectric + " đồng / 1 số" +
                    ", Tiền nước: " + moneyWater + " đồng / người" +
                    ", Tiền mạng: " + moneyInternet + " đồng / người" +
                    ", Tiền vệ sinh: " + moneyCleaning + " đồng / người." +
                    ", Tổng tiền trả cho 1 tháng: " + sumMoneyOneMonth;
        }
    }
}
