

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Amphibian implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Amphibian is flying!");
    }
    
    @Override
    public void swim() {
        System.out.println("Amphibian is swimming!");
    }
}


public class interfacePract{
    public static void main(String[] args){
        Amphibian b=new Amphibian();
        b.fly();
        b.swim();
    }
}
