package Animal_maneger.model;

public class Cat extends Animal{
    private String type;
    private boolean isSick;
    public Cat(String name, String type, boolean isSick) {
        super(name);
        this.isSick = isSick;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isSick() {
        return isSick;
    }

    public void setSick(boolean sick) {
        isSick = sick;
    }

    @Override
    public String toString() {
        return "Cat id : " + super.getId() + " loại: " + this.type + " tình tạng : " + this.isSick;
    }
}
