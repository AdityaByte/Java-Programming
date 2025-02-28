package com.java.OOPs.classinfo.innerClass;

// Learning about nested classes in java.
// Nested classes are the class inside a class are nested class.
// Nested classes can be static as well as we can apply any access specifier to it.

class DemoClass {

    class NormalClass {
        public void method1() {
            System.out.println("This is the class1 method");
        }
    }

    public class PublicClass {}

    public class ProtectedClass {}

    public class PrivateClass {}

    static class StaticClass {
        void method1() {
            System.out.println("This is the static class method.");
        }
    }

}

public class NestedClass {
    public static void main(String[] args) {
        // Syntax : OuterClass.InnerClass objectName = new OuterClass().new InnerClass();
        DemoClass.NormalClass nc = new DemoClass().new NormalClass();
    }
}

