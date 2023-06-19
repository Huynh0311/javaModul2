package PersonManage.ManegerMent;

public interface PersonManage<E> {
    void add(E e);
    void edit(E e);
    void delete(int id);
    void findByName(E e);
    E[] showAllOfficers();
}
