package com.gupao.cyc;

public class OverseasFactory extends PaymentFactory {

    protected ILogin createLogin() {
        super.init();
        return new OverseasLogin();
    }

    protected IPay createPay() {
        return new OverseasPay();
    }
}
