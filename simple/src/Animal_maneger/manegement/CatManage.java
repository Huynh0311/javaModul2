package Animal_maneger.manegement;


import Animal_maneger.model.Cat;

public class CatManage implements manage<Cat> {
    private Cat[] cats;
    public static int size = 0;

    public CatManage() {
        this.cats = new Cat[100];
    }

    @Override
    public void add(Cat cat) {
        this.cats[size] = cat;
        size++;
    }

    @Override
    public void delete(int id) {
        int index = findIndexById(id);
        for (int i = 0; i < size; i++) {
            this.cats[index] = this.cats[index+1];
        }
        this.cats[size - 1] = null;
        size--;
    }

    @Override
    public void edit(int id, Cat cat) {
        int index = findIndexById(id);
        if(index == -1){
            System.out.println("Không tìm thấy");
        }else {
            this.cats[index] = cat;
        }
    }

    @Override
    public Cat findById(int Id) {
        return null;
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < size - 1; i++) {
            if(this.cats[i].getId() == id){
                return i;
            }
        }
        return -1;
    }

    @Override
    public Cat[] showAll() {
        return this.cats;
    }
}
