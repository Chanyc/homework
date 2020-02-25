package com.gupao.cyc;

public abstract class PaymentFactory {

    public void init() {
        System.out.println("打开支付软件，卖个小广告");
    }

    protected abstract ILogin createLogin();

    protected abstract IPay createPay();

}
