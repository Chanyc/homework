package com.gupao.cyc;

public class AliFactory extends PaymentFactory {

    protected ILogin createLogin() {
        super.init();
        return new AliLogin();
    }

    protected IPay createPay() {
        return new AliPay();
    }
}
