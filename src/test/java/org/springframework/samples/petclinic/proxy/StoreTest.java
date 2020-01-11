package org.springframework.samples.petclinic.proxy;

import org.junit.jupiter.api.Test;

class StoreTest {

    @Test
    public void testPay(){
        //CashPerf를 추가함으로써 기존 코드를 건드리지 않고도 추가 테스트가 가능
        Payment cashPerf = new CashPerf();
        Store store = new Store(cashPerf);
        store.buySomething(100);
    }
}
