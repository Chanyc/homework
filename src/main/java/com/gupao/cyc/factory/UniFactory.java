package com.gupao.cyc.factory;

public class UniFactory extends PaymentFactory {

    @Override
    protected ILogin createLogin() {
        super.init();
        return new UniLogin();
    }

    @Override
    protected IPay createPay() {
        return new UniPay();
    }
}
