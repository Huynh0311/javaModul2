package controler;

import view.MenuCustomer;
import view.MenuRoom;

public class MainMenu {
    private  static MenuRoom menuRoom = new MenuRoom();
    private static MenuCustomer menuCustomer = new MenuCustomer();

    public static void main(String[] args) {
//        menuRoom.showMenuRoom();
        menuCustomer.showMenuCustomer();
    }
}
