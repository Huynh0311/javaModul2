package Library_Manage.Model;

public class Magazine extends Document {
    private int numberRelease;
    private int monthRelease;

    public Magazine() {
    }

    public int getNumberRelease() {
        return numberRelease;
    }

    public void setNumberRelease(int numberRelease) {
        this.numberRelease = numberRelease;
    }

    public int getMonthRelease() {
        return monthRelease;
    }

    public void setMonthRelease(int monthRelease) {
        this.monthRelease = monthRelease;
    }

    public Magazine(int id, String namePublisher, int numberOfRelease, int numberRelease, int monthRelease) {
        super(id, namePublisher, numberOfRelease);
        this.numberRelease = numberRelease;
        this.monthRelease = monthRelease;
    }

    @Override
    public String toString() {
        return "Tạp chí: " + super.toString() +
                ", số phát hành: " + numberRelease +
                ", tháng phát hành: " + monthRelease + " ";
    }
}
