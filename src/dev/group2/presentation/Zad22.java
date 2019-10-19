package dev.group2.presentation;

public class Zad22 {

    public static void main(String[] args) {
        Phone p = new Phone("123");
        MobilePhone m = new MobilePhone("4123");

        p.call(m);
        m.call(p);
    }
}

class Phone {

    final String number;

    Phone(String number) {
        this.number = number;
    }

    public void call(Phone other) {
        System.out.println("Phone.call  " + this.number + "=> " + other.number);
    }
}

class MobilePhone extends Phone {

    MobilePhone(String number) {
        super(number);
    }

    @Override
    public void call(Phone other) {
        System.out.println("MobilePhone.call");
        super.call(other);
    }

    public void sms(Phone other) {
        if (other instanceof MobilePhone) {
            System.out.println("SMS" + this.number + "=>" + other.number);
        }
    }
}

