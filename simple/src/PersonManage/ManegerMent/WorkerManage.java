package PersonManage.ManegerMent;

import PersonManage.Model.Worker;

public class WorkerInterface implements PersonInterface<Worker> {
    private Worker[] workers;
    public static int size = -1;

    public WorkerInterface() {
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
    public void findByName(Worker worker) {

    }

    @Override
    public Worker[] showAllOfficers() {
        return this.workers;
    }
}
