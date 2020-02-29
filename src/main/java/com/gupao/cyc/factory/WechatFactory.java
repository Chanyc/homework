package com.gupao.cyc.factory;

public class WechatFactory extends PaymentFactory {

    protected ILogin createLogin() {
        super.init();
        return new WechatLogin();
    }

    protected IPay createPay() {
        return new WechatPay();
    }
}
