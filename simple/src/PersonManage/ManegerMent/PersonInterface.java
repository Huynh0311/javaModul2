package PersonManage.ManegerMent;

public interface PersonInterface<E> {
    void add(E e);
    void edit(int id, E e);
    void delete(int id);
    int findIndexById(int id);
    String findByName(String name);
    E[] showAllOfficers();
}
