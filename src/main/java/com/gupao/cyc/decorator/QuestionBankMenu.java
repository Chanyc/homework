package com.gupao.cyc.decorator;

public class QuestionBankMenu extends MenuDecorator {
    public QuestionBankMenu(Menu menu) {
        super(menu);
    }

    @Override
    public String MenuName() {
        return super.MenuName() + "+题库";
    }
}
