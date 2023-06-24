package Town_Manage.Manage;

import java.util.ArrayList;
import java.util.List;

public class Town implements Management<Family> {
    private int idTown;
    private String NameTown;
    List<Family> town = new ArrayList<>();

    @Override
    public void add(Family family) {
        town.add(family);
    }

    @Override
    public void edit(int id, Family family) {
        int index = FindIndexById(id);
        town.set(index, family);
    }

    @Override
    public void delete(int id) {
        int index = FindIndexById(id);
        town.remove(index);
    }

    @Override
    public int FindIndexById(int id) {
        for (int i = 0; i < town.size(); i++) {
            if(this.town.get(i).getIdFamily() == id){
                return i;
            }
        }
        return -1;
    }

    @Override
    public List<Family> getAll() {
        return this.town;
    }

    public int getIdTown() {
        return idTown;
    }

    public String getNameTown() {
        return NameTown;
    }
}
