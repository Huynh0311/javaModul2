package Library_Manage.Manage;

import Library_Manage.Model.Newspaper;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class NewspaperManage implements Management<Newspaper> {
    ArrayList<Newspaper> newspapers = new ArrayList<>();

    @Override
    public void add(Newspaper newspaper) {
        newspapers.add(newspaper);
    }

    @Override
    public void edit(int id, Newspaper newspaper) {
        int index = findIndexById(id);
        if (index != -1) {
            newspapers.set(index, newspaper);
        }
    }

    @Override
    public void delete(int id) {
        int index = findIndexById(id);
        if (index > 0 || index < newspapers.size()) {
            newspapers.remove(index);
        }
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < newspapers.size(); i++) {
            if (newspapers.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public List<Newspaper> findAll() {
        return newspapers;
    }
}
