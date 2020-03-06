package com.gupao.cyc.decorator;

public class MenuDecorator implements Menu {

    private Menu menu;

    public MenuDecorator(Menu menu) {
        this.menu = menu;
    }

    public String MenuName() {
        return this.menu.MenuName();
    }

}
