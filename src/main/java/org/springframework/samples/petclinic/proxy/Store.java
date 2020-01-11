package org.springframework.samples.petclinic.proxy;

public class Store {

    Payment payment;

    //생성자를 통한 의존성 주입
    //store 클래스는 payment 없이는 동작 할 수 없다. 강제성성
   public Store(Payment payment) {
        this.payment = payment;
    }

    public void buySomething(int amount){
        payment.pay(100);
    }

}
