package Town_Manage.Manage;

import java.util.ArrayList;
import java.util.List;

public class Family implements Management<Person> {
    private int idFamily;
    private int numberPerson = 0;
    List<Person> people = new ArrayList<>();

    public Family(int idFamily) {
        this.idFamily = idFamily;
    }

    @Override
    public void add(Person person) {
        people.add(person);
        this.numberPerson++;
    }

    @Override
    public void edit(int id, Person person) {
        int index = FindIndexById(id);
        if(index == -1){
            System.out.println("Không tìm thấy id");
        }else {
            people.set(index, person);
        }

    }

    @Override
    public void delete(int id) {
        int index = FindIndexById(id);
        if(index == -1){
            System.out.println("Không tìm thấy id");
        }else {
            people.remove(index);
            this.numberPerson--;
        }
    }

    @Override
    public int FindIndexById(int id) {
        for (int i = 0; i < this.people.size(); i++) {
            if(people.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }

    @Override
    public List<Person> getAll() {
        return this.people;
    }

    public int getIdFamily() {
        return idFamily;
    }

    public int getNumberPerson() {
        return numberPerson;
    }
}
