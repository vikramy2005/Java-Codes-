abstract class Animal {
    abstract void sound(); 

    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
class Bird extends Animal{
    void sound (){
    System.out.println("tweet");    
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.eat();
         Bird b = new Bird();
        b.sound();
        b.eat();
    }
}