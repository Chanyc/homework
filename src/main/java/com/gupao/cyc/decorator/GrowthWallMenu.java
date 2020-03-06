package com.gupao.cyc.decorator;

public class GrowthWallMenu extends MenuDecorator {
    public GrowthWallMenu(Menu menu) {
        super(menu);
    }

    @Override
    public String MenuName() {
        return super.MenuName() + "+成长墙";
    }
}
