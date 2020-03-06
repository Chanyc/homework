package com.gupao.cyc.decorator;

public class Test {

    public static void main(String[] args) {
        Menu menu;
        menu = new BaseMenu();
        menu = new HomeworkMenu(menu);
        menu = new GrowthWallMenu(menu);
        menu = new QuestionBankMenu(menu);

        System.out.println(menu.MenuName());
    }

}
