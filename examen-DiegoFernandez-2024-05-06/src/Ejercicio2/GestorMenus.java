package ejercicio2;

import java.util.ArrayList;

public class GestorMenus {
    private ArrayList<Menu> menus;

    public GestorMenus() {
        this.menus = new ArrayList<>();
    }

    public void anadirMenu(Menu menu) {
        this.menus.add(menu);
    }

    public ArrayList<Menu> obtenerTodosLosMenus() {
        return this.menus;
    }

    public Menu obtenerMenuPorCodigo(int codigo) {
        for (Menu menu : this.menus) {
            if (menu.getCodigo() == codigo) {
                return menu;
            }
        }
        return null;
    }
}
