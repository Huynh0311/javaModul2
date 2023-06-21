package Library_Manage.Manage;

import Library_Manage.Model.Book;
import Library_Manage.Model.Magazine;

import java.util.ArrayList;
import java.util.List;

public class MagazineManage implements Management<Magazine>{
    ArrayList<Magazine> magazines = new ArrayList<>();

    @Override
    public void add(Magazine magazine) {
        magazines.add(magazine);
    }

    @Override
    public void edit(int id, Magazine magazine) {
        int index = findIndexById(id);
        if (index != -1) {
            magazines.set(index, magazine);
        }
    }

    @Override
    public void delete(int id) {
        int index = findIndexById(id);
        if (index > 0 || index < magazines.size()) {
            magazines.remove(index);
        }
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < magazines.size(); i++) {
            if (magazines.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public List<Magazine> findAll() {
        return magazines;
    }
}
