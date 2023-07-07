package controler;

import view.MenuCustomer;
import view.MenuRoom;
import view.MenuStart;

public class MainMenu {
    private  static MenuRoom menuRoom = new MenuRoom();
    private static MenuCustomer menuCustomer = new MenuCustomer();
    private static MenuStart menuStart = new MenuStart();

    public static void main(String[] args) {
//        menuRoom.showMenuRoom();
//        menuCustomer.showMenuCustomer();
        menuStart.showMenuLoginRegister();
    }
}
