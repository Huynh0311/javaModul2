package Library_Manage.Model;

public class Document {
    private int id;
    private String namePublisher;
    private int numberOfRelease;

    public Document() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamePublisher() {
        return namePublisher;
    }

    public void setNamePublisher(String namePublisher) {
        this.namePublisher = namePublisher;
    }

    public int getNumberOfRelease() {
        return numberOfRelease;
    }

    public void setNumberOfRelease(int numberOfRelease) {
        this.numberOfRelease = numberOfRelease;
    }

    public Document(int id, String namePublisher, int numberOfRelease) {
        this.id = id;
        this.namePublisher = namePublisher;
        this.numberOfRelease = numberOfRelease;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", Tên Nhà Xuất bản: '" + namePublisher + '\'' +
                ", Số bản phát hành: " + numberOfRelease;
    }
}
