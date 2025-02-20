package com.jin.javastudy.objectClone;

public class ObjectCloneMain {

    public static void main(String[] args) {

        DrinkItem myDrink = new DrinkItem();
        myDrink.setCola(new Cola("펩시 오리지널", "코카콜라 레몬"));
        myDrink.setMilkTea("버블밀크티");

        DrinkItem yourDrink;

        try {
            yourDrink = (DrinkItem) myDrink.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        yourDrink.getCola().setPepsiCola("펩시 제로");
        System.out.println(myDrink.getCola().getPepsiCola());
    }

}
