package com.jin.javastudy.abstractAndInterface.abstractTest;

public class AbstractMain {
    public static void main(String[] args) {
        AbstractChild child = new AbstractChild("grand", "parent", "child");

        int staticField = AbstractGrand.STATIC_FIELD;

        // method
        child.methodA(); // From AbstractGrand
        child.methodB(); // From AbstractGrand
        child.methodC(); // From AbstractParent
        ((AbstractGrand)child).methodB(); // AbstractGrand.methodB

        // field
        String grandField = child.getGrandField();  // grand
        String parentField = child.getParentField();// parent
        String childField = child.getChildField();  // child

        AbstractGrand grandChild = new AbstractChild("grand", "parent", "child");

    }
}
