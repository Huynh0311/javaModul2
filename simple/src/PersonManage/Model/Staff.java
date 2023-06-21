package PersonManage.Model;

public class Staff extends Officers {
    private String Job;

    public Staff() {

    }

    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        Job = job;
    }

    public Staff(int id, String name, int age, int sex, String adress, String job) {
        super(id, name, age, sex, adress);
        Job = job;
    }
}
