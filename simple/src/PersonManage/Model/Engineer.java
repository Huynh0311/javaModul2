package PersonManage.Model;

public class Engineer extends Officers {
    private String trainingIndustry;

    public Engineer() {

    }

    public String getTrainingIndustry() {
        return trainingIndustry;
    }

    public void setTrainingIndustry(String trainingIndustry) {
        this.trainingIndustry = trainingIndustry;
    }

    public Engineer(int id, String name, int age, int sex, String adress, String trainingIndustry) {
        super(id, name, age, sex, adress);
        this.trainingIndustry = trainingIndustry;
    }
}
