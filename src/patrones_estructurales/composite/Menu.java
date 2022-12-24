package patrones_estructurales.composite;

import java.util.ArrayList;

public class Menu implements IMenu{

    private ArrayList<IMenu> menus;

    public Menu() {}

    public Menu(ArrayList<IMenu> menus) {
        this.menus = menus;
    }

    @Override
    public boolean open() {
        System.out.println("Open!!");
        return true;
    }

    @Override
    public boolean close() {
        System.out.println("Close!!");
        return true;
    }

    public void addMenu(IMenu menu){
        this.menus.add(menu);
    }

    public IMenu getMenu(int pos){
        return this.menus.get(pos);
    }
}
