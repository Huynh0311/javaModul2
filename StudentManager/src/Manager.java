import java.util.List;

public interface Manager<E> {
    void add(E e);
    void edit(String id, E e);
    void delete(String id);
    int findIndexById(String id);
    void search(String name);
    List<E> getAll();
}
