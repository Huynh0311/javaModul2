package PersonManage.Model;

public class Worker extends Officers {
    private int places;

    public Worker(String name, int age, int sex, String address, int places) {

    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }
    public Worker(int id, String name, int age, int sex, String adress, int places) {
        super(id, name, age, sex, adress);
        this.places = places;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "places=" + places +
                '}';
    }
}
