package Town_Manage.Manage;

import java.util.List;

public interface Management<E> {
     void add(E e);
     void edit(int id, E e);
     void delete(int id);
     int FindIndexById(int id);
     List<E> getAll();
}
