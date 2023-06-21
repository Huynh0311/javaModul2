package Library_Manage.Model;

public class Book extends Document {
    private String author;
    private int pageNumbers;

    public Book() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageNumbers() {
        return pageNumbers;
    }

    public void setPageNumbers(int pageNumbers) {
        this.pageNumbers = pageNumbers;
    }

    public Book(int id, String namePublisher, int numberOfRelease, String author, int pageNumbers) {
        super(id, namePublisher, numberOfRelease);
        this.author = author;
        this.pageNumbers = pageNumbers;
    }

    @Override
    public String toString() {
        return "Book " + super.toString() +
                ", Tác giả: " + author +
                ", Số trang: " + pageNumbers + " ";
    }
}
