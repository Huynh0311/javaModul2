package PersonManage.ManegerMent;

import PersonManage.Model.Worker;

public class WorkerManage implements PersonInterface<Worker> {
    private Worker[] workers;
    public static int size = -1;

    public WorkerManage() {
        this.workers = new Worker[100];
    }

    @Override
    public void add(Worker worker) {
        size++;
        workers[size] = worker;
    }

    @Override
    public void edit(int id, Worker worker) {
        int index = findIndexById(id);
        if (index != -1){
            this.workers[index] = worker;
        }
    }

    @Override
    public void delete(int id) {
        int index = findIndexById(id);
        for (int i = 0; i < size -1; i++) {
            this.workers[i] = this.workers[i+1];
        }
        this.workers[size -1] = null;
        size--;
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < size; i++) {
            if (id == this.workers[i].getId()) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String findByName(String name) {
        for (int i = 0; i < size; i++) {
            if(this.workers[i].getName() == name){
                return this.workers[i].getName();
            }
        }
        return null;
    }

    @Override
    public Worker[] showAllOfficers() {
        return this.workers;
    }
}
