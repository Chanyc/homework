package com.gupao.cyc.factory;

public class Test {

    public static void main(String[] args) {
        PaymentFactory factory = new WechatFactory();
        factory.createLogin().login();
        factory.createPay().pay();
    }

}
