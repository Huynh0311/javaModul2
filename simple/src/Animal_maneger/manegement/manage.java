package Animal_maneger.manegement;

public interface manage<E> {
    void add(E e);
    void delete(int id);
    void edit(int id, E e);
    E findById(int Id);
    int findIndexById(int id);
    E[] showAll();
}
