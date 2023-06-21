package Library_Manage.Model;

public class Newspaper extends Document{
    private int DayRelease;

    public Newspaper() {
    }

    public int getDayRelease() {
        return DayRelease;
    }

    public void setDayRelease(int dayRelease) {
        DayRelease = dayRelease;
    }

    public Newspaper(int id, String namePublisher, int numberOfRelease, int dayRelease) {
        super(id, namePublisher, numberOfRelease);
        DayRelease = dayRelease;
    }

    @Override
    public String toString() {
        return "Báo: " + super.toString() +
                " Ngày phát hành: " + DayRelease + " ";
    }
}
