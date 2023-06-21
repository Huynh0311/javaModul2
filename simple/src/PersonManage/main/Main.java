package PersonManage.main;

import PersonManage.ManegerMent.WorkerManage;
import PersonManage.Menu.Menu;
import PersonManage.Model.Worker;

public class Main {
    public static void main(String[] args) {
//        WorkerManage workerManage = new WorkerManage();
//        Worker worker1 = new Worker(0,"Name1", 23, 0, "Ha Noi", 1);
//        workerManage.add(worker1);
//        System.out.println(worker1.toString());

        Menu menu = new Menu();
        menu.showMainMenu();
    }
}
