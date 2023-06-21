package Library_Manage.Manage;

import Library_Manage.Model.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookManage implements Management<Book> {
    ArrayList<Book> books = new ArrayList<>();

    @Override
    public void add(Book book) {
        books.add(book);
    }

    @Override
   public void edit(int id, Book book) {
        int index = findIndexById(id);
        if (index != -1) {
            books.set(index, book);
        }
    }

    @Override
    public void delete(int id) {
        int index = findIndexById(id);
        if (index > 0 || index < books.size()) {
            books.remove(index);
        }
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public List<Book> findAll() {
            return books;
    }
}
