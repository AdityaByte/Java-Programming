package com.java.staticThings;

/* Static :
 * - Static keyword is primarily used for memory management.
 * - It can be applied to variables, methods, blocks, and nested classes.
 * - The main concept behind static is that it belongs to the class rather
 *      than instances of the class.
 * - this and super cannot be used in static context.
 * - Static method cannot use non static data member or call non-static method directly.
 * #imp - Before any instance is created static variables are initialized.
 * - Use Case : Static things are mainly used in utility classes.
 */

class Student {

    // Only one instance is being created for this variable cause it is static.
    // and this belongs to the class rather than any instance.
    // Note : If this variable is not static then every time you create an object a copy of this variable is being created to the object.
    // Every object share this means it is a common property of every object.
    public static int count = 0;

    private int id;
    private String name;
    private int age;

    public Student() {
        count++;
    }

    // For accessing all these getters and setters method we have to create an instance of the class.
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // We can directly call it using the Class reference.
    public static void getCount() {
        System.out.println("Total student : " + count);
    }

    // Static block - These are used for the initialization of the static variables cause they
    // are loaded first in the memory.
    // These are used for static initialization one time setup task.
    static {
        System.out.println("Hello world");
    }
    
}


public class Main {

    // That's why the main method is static so that jvm calls it without creating an instances of the class.
    public static void main(String[] args) {
        // Student student1 = new Student();
        // Student student2 = new Student();
        // Student student3 = new Student();
        // Student student4 = new Student();

        // Student student5 = new Student();

        Student.getCount(); 

        //sum(1,4); // Non-static methods cannot be call from a static context.
    }

    public int sum(int a, int b) {
        return a + b;
    }
}
