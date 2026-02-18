interface Animal {
    void sound(); // abstract method
}

class Dog implements Animal {
    public void sound () {
        System.out.println("Woof");
    }
}
class TestInterface {
public static void main(String args[]) {
    Dog dogObject = new Dog();
    dogObject.sound();
}
}
