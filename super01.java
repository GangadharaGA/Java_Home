class Animal {
    Animal() {
        System.out.println("Animal constructor");
    }

    Animal(String name)
    {
        System.out.println("Animal name is: "+name);
    }
}

class Dog extends Animal {
    Dog() {
        // super(); // Calls the constructor of the superclass (Animal)
        super("cat");
        System.out.println("Dog constructor");
    }
}



public class super01 {
    
    public static void main(String[] args) {
        
        // Animal ani01=new Dog();
        Dog ani01=new Dog();
        // an;
    }
}
