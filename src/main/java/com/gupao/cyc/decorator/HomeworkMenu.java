package com.gupao.cyc.decorator;

public class HomeworkMenu extends MenuDecorator {
    public HomeworkMenu(Menu menu) {
        super(menu);
    }

    @Override
    public String MenuName() {
        return super.MenuName() + "+作业";
    }
}
